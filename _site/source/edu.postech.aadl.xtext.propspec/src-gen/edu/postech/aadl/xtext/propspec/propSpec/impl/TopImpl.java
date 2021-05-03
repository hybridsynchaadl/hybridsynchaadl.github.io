/**
 */
package edu.postech.aadl.xtext.propspec.propSpec.impl;

import edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage;
import edu.postech.aadl.xtext.propspec.propSpec.Property;
import edu.postech.aadl.xtext.propspec.propSpec.Proposition;
import edu.postech.aadl.xtext.propspec.propSpec.Top;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.ComponentClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl#getModel <em>Model</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl#getPath <em>Path</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl#getProposition <em>Proposition</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopImpl extends MinimalEObjectImpl.Container implements Top
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
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected ComponentClassifier model;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getProposition() <em>Proposition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProposition()
   * @generated
   * @ordered
   */
  protected EList<Proposition> proposition;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopImpl()
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
    return PropSpecPackage.Literals.TOP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.TOP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentClassifier getModel()
  {
    if (model != null && ((EObject)model).eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (ComponentClassifier)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropSpecPackage.TOP__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentClassifier basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModel(ComponentClassifier newModel)
  {
    ComponentClassifier oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.TOP__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropSpecPackage.TOP__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Proposition> getProposition()
  {
    if (proposition == null)
    {
      proposition = new EObjectContainmentEList<Proposition>(Proposition.class, this, PropSpecPackage.TOP__PROPOSITION);
    }
    return proposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Property> getProperty()
  {
    if (property == null)
    {
      property = new EObjectContainmentEList<Property>(Property.class, this, PropSpecPackage.TOP__PROPERTY);
    }
    return property;
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
      case PropSpecPackage.TOP__PROPOSITION:
        return ((InternalEList<?>)getProposition()).basicRemove(otherEnd, msgs);
      case PropSpecPackage.TOP__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
      case PropSpecPackage.TOP__NAME:
        return getName();
      case PropSpecPackage.TOP__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case PropSpecPackage.TOP__PATH:
        return getPath();
      case PropSpecPackage.TOP__PROPOSITION:
        return getProposition();
      case PropSpecPackage.TOP__PROPERTY:
        return getProperty();
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
      case PropSpecPackage.TOP__NAME:
        setName((String)newValue);
        return;
      case PropSpecPackage.TOP__MODEL:
        setModel((ComponentClassifier)newValue);
        return;
      case PropSpecPackage.TOP__PATH:
        setPath((String)newValue);
        return;
      case PropSpecPackage.TOP__PROPOSITION:
        getProposition().clear();
        getProposition().addAll((Collection<? extends Proposition>)newValue);
        return;
      case PropSpecPackage.TOP__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
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
      case PropSpecPackage.TOP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PropSpecPackage.TOP__MODEL:
        setModel((ComponentClassifier)null);
        return;
      case PropSpecPackage.TOP__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case PropSpecPackage.TOP__PROPOSITION:
        getProposition().clear();
        return;
      case PropSpecPackage.TOP__PROPERTY:
        getProperty().clear();
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
      case PropSpecPackage.TOP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PropSpecPackage.TOP__MODEL:
        return model != null;
      case PropSpecPackage.TOP__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case PropSpecPackage.TOP__PROPOSITION:
        return proposition != null && !proposition.isEmpty();
      case PropSpecPackage.TOP__PROPERTY:
        return property != null && !property.isEmpty();
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
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //TopImpl
