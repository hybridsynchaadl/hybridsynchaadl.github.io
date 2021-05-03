/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends PSExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getUnaryExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getUnaryExpression_Child()
   * @model containment="true"
   * @generated
   */
  PSExpression getChild();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(PSExpression value);

} // UnaryExpression
