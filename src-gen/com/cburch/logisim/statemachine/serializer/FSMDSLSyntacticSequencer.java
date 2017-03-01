/*
 * generated by Xtext
 */
package com.cburch.logisim.statemachine.serializer;

import com.cburch.logisim.statemachine.services.FSMDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FSMDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FSMDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_State___TransitionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_Transition_GotoKeyword_0_1_or_HyphenMinusGreaterThanSignKeyword_0_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FSMDSLGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_State___TransitionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateAccess().getTransitionsKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_3()));
		match_Transition_GotoKeyword_0_1_or_HyphenMinusGreaterThanSignKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransitionAccess().getGotoKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_State___TransitionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_State___TransitionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transition_GotoKeyword_0_1_or_HyphenMinusGreaterThanSignKeyword_0_0_1.equals(syntax))
				emit_Transition_GotoKeyword_0_1_or_HyphenMinusGreaterThanSignKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '/' args+=Primary
	 *     (rule start) (ambiguity) port=[Port|ID]
	 *     (rule start) (ambiguity) value=BIN
	 *     (rule start) (ambiguity) {AndExpr.args+=}
	 *     (rule start) (ambiguity) {OrExpr.args+=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {AndExpr.args+=}
	 *     (rule start) (ambiguity) {OrExpr.args+=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('transitions' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     commandList=CommandList (ambiguity) '}' (rule end)
	 */
	protected void emit_State___TransitionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '->' | 'goto'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) dst=[State|ID]
	 */
	protected void emit_Transition_GotoKeyword_0_1_or_HyphenMinusGreaterThanSignKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}