/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ComponentClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getName <em>Name</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getModel <em>Model</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getPath <em>Path</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getProposition <em>Proposition</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop()
 * @model
 * @generated
 */
public interface Top extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(ComponentClassifier)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop_Model()
   * @model
   * @generated
   */
  ComponentClassifier getModel();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(ComponentClassifier value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Proposition</b></em>' containment reference list.
   * The list contents are of type {@link edu.postech.aadl.xtext.propspec.propSpec.Proposition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proposition</em>' containment reference list.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop_Proposition()
   * @model containment="true"
   * @generated
   */
  EList<Proposition> getProposition();

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link edu.postech.aadl.xtext.propspec.propSpec.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getTop_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

} // Top
