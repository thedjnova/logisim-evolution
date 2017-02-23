/*
 * generated by Xtext
 */
package com.cburch.logisim.statemachine.serializer;

import com.cburch.logisim.statemachine.fSMDSL.AndExpr;
import com.cburch.logisim.statemachine.fSMDSL.Command;
import com.cburch.logisim.statemachine.fSMDSL.CommandList;
import com.cburch.logisim.statemachine.fSMDSL.CommandStmt;
import com.cburch.logisim.statemachine.fSMDSL.Constant;
import com.cburch.logisim.statemachine.fSMDSL.DefaultPredicate;
import com.cburch.logisim.statemachine.fSMDSL.FSM;
import com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage;
import com.cburch.logisim.statemachine.fSMDSL.InputPort;
import com.cburch.logisim.statemachine.fSMDSL.LayoutInfo;
import com.cburch.logisim.statemachine.fSMDSL.NotExpr;
import com.cburch.logisim.statemachine.fSMDSL.OrExpr;
import com.cburch.logisim.statemachine.fSMDSL.OutputPort;
import com.cburch.logisim.statemachine.fSMDSL.PortRef;
import com.cburch.logisim.statemachine.fSMDSL.PredicateStmt;
import com.cburch.logisim.statemachine.fSMDSL.State;
import com.cburch.logisim.statemachine.fSMDSL.Transition;
import com.cburch.logisim.statemachine.services.FSMDSLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FSMDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FSMDSLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FSMDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FSMDSLPackage.AND_EXPR:
				sequence_And_Cmp(context, (AndExpr) semanticObject); 
				return; 
			case FSMDSLPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case FSMDSLPackage.COMMAND_LIST:
				sequence_CommandList(context, (CommandList) semanticObject); 
				return; 
			case FSMDSLPackage.COMMAND_STMT:
				sequence_CommandStmt(context, (CommandStmt) semanticObject); 
				return; 
			case FSMDSLPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case FSMDSLPackage.DEFAULT_PREDICATE:
				sequence_Default(context, (DefaultPredicate) semanticObject); 
				return; 
			case FSMDSLPackage.FSM:
				sequence_FSM(context, (FSM) semanticObject); 
				return; 
			case FSMDSLPackage.INPUT_PORT:
				if(context == grammarAccess.getFSMElementRule() ||
				   context == grammarAccess.getInputRule()) {
					sequence_Input(context, (InputPort) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getShortInputRule()) {
					sequence_ShortInput(context, (InputPort) semanticObject); 
					return; 
				}
				else break;
			case FSMDSLPackage.LAYOUT_INFO:
				sequence_LayoutInfo(context, (LayoutInfo) semanticObject); 
				return; 
			case FSMDSLPackage.NOT_EXPR:
				sequence_Not(context, (NotExpr) semanticObject); 
				return; 
			case FSMDSLPackage.OR_EXPR:
				sequence_Or(context, (OrExpr) semanticObject); 
				return; 
			case FSMDSLPackage.OUTPUT_PORT:
				if(context == grammarAccess.getFSMElementRule() ||
				   context == grammarAccess.getOutputRule()) {
					sequence_Output(context, (OutputPort) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getShortOutputRule()) {
					sequence_ShortOutput(context, (OutputPort) semanticObject); 
					return; 
				}
				else break;
			case FSMDSLPackage.PORT_REF:
				sequence_Ref(context, (PortRef) semanticObject); 
				return; 
			case FSMDSLPackage.PREDICATE_STMT:
				sequence_PredicateStmt(context, (PredicateStmt) semanticObject); 
				return; 
			case FSMDSLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case FSMDSLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((args+=And_AndExpr_1_0 args+=Cmp) | (args+=Cmp_AndExpr_1_0 (op='==' | op='/=') args+=Primary))
	 */
	protected void sequence_And_Cmp(EObject context, AndExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((layout=LayoutInfo commands+=Command*)?)
	 */
	protected void sequence_CommandList(EObject context, CommandList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         in+=ShortInput 
	 *         in+=ShortInput* 
	 *         out+=ShortOutput 
	 *         out+=ShortOutput* 
	 *         commands+=Command 
	 *         commands+=Command*
	 *     )
	 */
	protected void sequence_CommandStmt(EObject context, CommandStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[OutputPort|ID] value=Or)
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FSMDSLPackage.Literals.COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FSMDSLPackage.Literals.COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, FSMDSLPackage.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FSMDSLPackage.Literals.COMMAND__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommandAccess().getNameOutputPortIDTerminalRuleCall_0_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommandAccess().getValueOrParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BIN
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FSMDSLPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FSMDSLPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getValueBINTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {DefaultPredicate}
	 */
	protected void sequence_Default(EObject context, DefaultPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         layout=LayoutInfo 
	 *         (in+=Input | out+=Output)+ 
	 *         width=INT? 
	 *         start=[State|ID]? 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_FSM(EObject context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT? layout=LayoutInfo)
	 */
	protected void sequence_Input(EObject context, InputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((x=INT y=INT (width=INT height=INT)?)?)
	 */
	protected void sequence_LayoutInfo(EObject context, LayoutInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     args+=Primary
	 */
	protected void sequence_Not(EObject context, NotExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=Or_OrExpr_1_0 args+=And)
	 */
	protected void sequence_Or(EObject context, OrExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT? layout=LayoutInfo)
	 */
	protected void sequence_Output(EObject context, OutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (in+=ShortInput in+=ShortInput* predicate=Predicate)
	 */
	protected void sequence_PredicateStmt(EObject context, PredicateStmt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (port=[Port|ID] (ub=INT? lb=INT)?)
	 */
	protected void sequence_Ref(EObject context, PortRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT)
	 */
	protected void sequence_ShortInput(EObject context, InputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT)
	 */
	protected void sequence_ShortOutput(EObject context, OutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         code=BIN? 
	 *         layout=LayoutInfo 
	 *         code=BIN? 
	 *         commandList=CommandList 
	 *         transition+=Transition*
	 *     )
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=[State|ID]? dst=[State|ID] predicate=Predicate? layout=LayoutInfo)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
