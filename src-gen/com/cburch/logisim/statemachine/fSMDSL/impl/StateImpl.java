/**
 */
package com.cburch.logisim.statemachine.fSMDSL.impl;

import com.cburch.logisim.statemachine.fSMDSL.CommandList;
import com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage;
import com.cburch.logisim.statemachine.fSMDSL.State;
import com.cburch.logisim.statemachine.fSMDSL.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.impl.StateImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.impl.StateImpl#getCommandList <em>Command List</em>}</li>
 *   <li>{@link com.cburch.logisim.statemachine.fSMDSL.impl.StateImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends FSMElementImpl implements State
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected String code = CODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommandList() <em>Command List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandList()
   * @generated
   * @ordered
   */
  protected CommandList commandList;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FSMDSLPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMDSLPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(String newCode)
  {
    String oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMDSLPackage.STATE__CODE, oldCode, code));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandList getCommandList()
  {
    return commandList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommandList(CommandList newCommandList, NotificationChain msgs)
  {
    CommandList oldCommandList = commandList;
    commandList = newCommandList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FSMDSLPackage.STATE__COMMAND_LIST, oldCommandList, newCommandList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandList(CommandList newCommandList)
  {
    if (newCommandList != commandList)
    {
      NotificationChain msgs = null;
      if (commandList != null)
        msgs = ((InternalEObject)commandList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FSMDSLPackage.STATE__COMMAND_LIST, null, msgs);
      if (newCommandList != null)
        msgs = ((InternalEObject)newCommandList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FSMDSLPackage.STATE__COMMAND_LIST, null, msgs);
      msgs = basicSetCommandList(newCommandList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FSMDSLPackage.STATE__COMMAND_LIST, newCommandList, newCommandList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransition()
  {
    if (transition == null)
    {
      transition = new EObjectContainmentEList<Transition>(Transition.class, this, FSMDSLPackage.STATE__TRANSITION);
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FSMDSLPackage.STATE__COMMAND_LIST:
        return basicSetCommandList(null, msgs);
      case FSMDSLPackage.STATE__TRANSITION:
        return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FSMDSLPackage.STATE__NAME:
        return getName();
      case FSMDSLPackage.STATE__CODE:
        return getCode();
      case FSMDSLPackage.STATE__COMMAND_LIST:
        return getCommandList();
      case FSMDSLPackage.STATE__TRANSITION:
        return getTransition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FSMDSLPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case FSMDSLPackage.STATE__CODE:
        setCode((String)newValue);
        return;
      case FSMDSLPackage.STATE__COMMAND_LIST:
        setCommandList((CommandList)newValue);
        return;
      case FSMDSLPackage.STATE__TRANSITION:
        getTransition().clear();
        getTransition().addAll((Collection<? extends Transition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FSMDSLPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FSMDSLPackage.STATE__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case FSMDSLPackage.STATE__COMMAND_LIST:
        setCommandList((CommandList)null);
        return;
      case FSMDSLPackage.STATE__TRANSITION:
        getTransition().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FSMDSLPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FSMDSLPackage.STATE__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
      case FSMDSLPackage.STATE__COMMAND_LIST:
        return commandList != null;
      case FSMDSLPackage.STATE__TRANSITION:
        return transition != null && !transition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //StateImpl
