/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.osate.aadl2.ContainedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getPath <em>Path</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getScopedExpression()
 * @model
 * @generated
 */
public interface ScopedExpression extends PSExpression
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(ContainedNamedElement)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getScopedExpression_Path()
   * @model containment="true"
   * @generated
   */
  ContainedNamedElement getPath();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(ContainedNamedElement value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getScopedExpression_Expression()
   * @model containment="true"
   * @generated
   */
  PSExpression getExpression();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(PSExpression value);

} // ScopedExpression
