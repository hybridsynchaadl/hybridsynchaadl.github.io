/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getName <em>Name</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProposition()
 * @model
 * @generated
 */
public interface Proposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProposition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProposition_Expression()
   * @model containment="true"
   * @generated
   */
  PSExpression getExpression();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(PSExpression value);

} // Proposition
