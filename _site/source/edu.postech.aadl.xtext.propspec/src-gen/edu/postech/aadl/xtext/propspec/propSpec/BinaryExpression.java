/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends PSExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getBinaryExpression_Left()
   * @model containment="true"
   * @generated
   */
  PSExpression getLeft();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PSExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getBinaryExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getBinaryExpression_Right()
   * @model containment="true"
   * @generated
   */
  PSExpression getRight();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PSExpression value);

} // BinaryExpression
