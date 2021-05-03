/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prop Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.PropRef#getDef <em>Def</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getPropRef()
 * @model
 * @generated
 */
public interface PropRef extends PSExpression
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' reference.
   * @see #setDef(Proposition)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getPropRef_Def()
   * @model
   * @generated
   */
  Proposition getDef();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.PropRef#getDef <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' reference.
   * @see #getDef()
   * @generated
   */
  void setDef(Proposition value);

} // PropRef
