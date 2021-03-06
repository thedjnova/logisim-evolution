/**
 */
package com.cburch.logisim.statemachine.fSMDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.OrExpr#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage#getOrExpr()
 * @model
 * @generated
 */
public interface OrExpr extends BoolExpr
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link com.cburch.logisim.statemachine.fSMDSL.BoolExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage#getOrExpr_Args()
   * @model containment="true"
   * @generated
   */
  EList<BoolExpr> getArgs();

} // OrExpr
