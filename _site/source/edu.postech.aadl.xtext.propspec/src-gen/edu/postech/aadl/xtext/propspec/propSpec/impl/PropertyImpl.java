/**
 */
package edu.postech.aadl.xtext.propspec.propSpec.impl;

import edu.postech.aadl.xtext.propspec.propSpec.PSExpression;
import edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage;
import edu.postech.aadl.xtext.propspec.propSpec.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl#getInitCond <em>Init Cond</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl#getGoalCond <em>Goal Cond</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
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
   * The cached value of the '{@link #getInitCond() <em>Init Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitCond()
   * @generated
   * @ordered
   */
  protected PSExpression initCond;

  /**
   * The cached value of the '{@link #getGoalCond() <em>Goal Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalCond()
   * @generated
   * @ordered
   */
  protected PSExpression goalCond;

  /**
   * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected static final long BOUND_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected long bound = BOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return PropSpecPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSExpression getInitCond()
  {
    return initCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitCond(PSExpression newInitCond, NotificationChain msgs)
  {
    PSExpression oldInitCond = initCond;
    initCond = newInitCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__INIT_COND, oldInitCond, newInitCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitCond(PSExpression newInitCond)
  {
    if (newInitCond != initCond)
    {
      NotificationChain msgs = null;
      if (initCond != null)
        msgs = ((InternalEObject)initCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropSpecPackage.PROPERTY__INIT_COND, null, msgs);
      if (newInitCond != null)
        msgs = ((InternalEObject)newInitCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropSpecPackage.PROPERTY__INIT_COND, null, msgs);
      msgs = basicSetInitCond(newInitCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__INIT_COND, newInitCond, newInitCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSExpression getGoalCond()
  {
    return goalCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoalCond(PSExpression newGoalCond, NotificationChain msgs)
  {
    PSExpression oldGoalCond = goalCond;
    goalCond = newGoalCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__GOAL_COND, oldGoalCond, newGoalCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGoalCond(PSExpression newGoalCond)
  {
    if (newGoalCond != goalCond)
    {
      NotificationChain msgs = null;
      if (goalCond != null)
        msgs = ((InternalEObject)goalCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropSpecPackage.PROPERTY__GOAL_COND, null, msgs);
      if (newGoalCond != null)
        msgs = ((InternalEObject)newGoalCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropSpecPackage.PROPERTY__GOAL_COND, null, msgs);
      msgs = basicSetGoalCond(newGoalCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__GOAL_COND, newGoalCond, newGoalCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBound(long newBound)
  {
    long oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.PROPERTY__BOUND, oldBound, bound));
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
      case PropSpecPackage.PROPERTY__INIT_COND:
        return basicSetInitCond(null, msgs);
      case PropSpecPackage.PROPERTY__GOAL_COND:
        return basicSetGoalCond(null, msgs);
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
      case PropSpecPackage.PROPERTY__NAME:
        return getName();
      case PropSpecPackage.PROPERTY__INIT_COND:
        return getInitCond();
      case PropSpecPackage.PROPERTY__GOAL_COND:
        return getGoalCond();
      case PropSpecPackage.PROPERTY__BOUND:
        return getBound();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PropSpecPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case PropSpecPackage.PROPERTY__INIT_COND:
        setInitCond((PSExpression)newValue);
        return;
      case PropSpecPackage.PROPERTY__GOAL_COND:
        setGoalCond((PSExpression)newValue);
        return;
      case PropSpecPackage.PROPERTY__BOUND:
        setBound((Long)newValue);
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
      case PropSpecPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PropSpecPackage.PROPERTY__INIT_COND:
        setInitCond((PSExpression)null);
        return;
      case PropSpecPackage.PROPERTY__GOAL_COND:
        setGoalCond((PSExpression)null);
        return;
      case PropSpecPackage.PROPERTY__BOUND:
        setBound(BOUND_EDEFAULT);
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
      case PropSpecPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PropSpecPackage.PROPERTY__INIT_COND:
        return initCond != null;
      case PropSpecPackage.PROPERTY__GOAL_COND:
        return goalCond != null;
      case PropSpecPackage.PROPERTY__BOUND:
        return bound != BOUND_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", bound: ");
    result.append(bound);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
