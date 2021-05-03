/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Value#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends PSExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Element)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getValue_Value()
   * @model containment="true"
   * @generated
   */
  Element getValue();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Value#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Element value);

} // Value
