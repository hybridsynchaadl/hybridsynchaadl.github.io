/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getName <em>Name</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getInitCond <em>Init Cond</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getGoalCond <em>Goal Cond</em>}</li>
 *   <li>{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Init Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Cond</em>' containment reference.
   * @see #setInitCond(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProperty_InitCond()
   * @model containment="true"
   * @generated
   */
  PSExpression getInitCond();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getInitCond <em>Init Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Cond</em>' containment reference.
   * @see #getInitCond()
   * @generated
   */
  void setInitCond(PSExpression value);

  /**
   * Returns the value of the '<em><b>Goal Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Cond</em>' containment reference.
   * @see #setGoalCond(PSExpression)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProperty_GoalCond()
   * @model containment="true"
   * @generated
   */
  PSExpression getGoalCond();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getGoalCond <em>Goal Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal Cond</em>' containment reference.
   * @see #getGoalCond()
   * @generated
   */
  void setGoalCond(PSExpression value);

  /**
   * Returns the value of the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' attribute.
   * @see #setBound(long)
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage#getProperty_Bound()
   * @model dataType="org.osate.aadl2.Integer"
   * @generated
   */
  long getBound();

  /**
   * Sets the value of the '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getBound <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' attribute.
   * @see #getBound()
   * @generated
   */
  void setBound(long value);

} // Property
