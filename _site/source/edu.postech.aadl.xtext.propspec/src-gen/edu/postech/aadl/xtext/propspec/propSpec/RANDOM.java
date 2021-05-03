/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RANDOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.RANDOM#getSeed <em>Seed</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getRANDOM()
 * @model
 * @generated
 */
public interface RANDOM extends Mode
{
  /**
   * Returns the value of the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seed</em>' attribute.
   * @see #setSeed(long)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getRANDOM_Seed()
   * @model dataType="org.osate.aadl2.Integer"
   * @generated
   */
  long getSeed();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.RANDOM#getSeed <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seed</em>' attribute.
   * @see #getSeed()
   * @generated
   */
  void setSeed(long value);

} // RANDOM
