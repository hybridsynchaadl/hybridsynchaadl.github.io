/**
 */
package edu.postech.aadl.xtext.propspec.propSpec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecFactory
 * @model kind="package"
 * @generated
 */
public interface PropSpecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "propSpec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.postech.edu/aadl/xtext/propspec/PropSpec";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "propSpec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PropSpecPackage eINSTANCE = edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl <em>Top</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getTop()
   * @generated
   */
  int TOP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP__NAME = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP__MODEL = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP__PATH = 2;

  /**
   * The feature id for the '<em><b>Proposition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP__PROPOSITION = 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP__PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Top</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Init Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__INIT_COND = 1;

  /**
   * The feature id for the '<em><b>Goal Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__GOAL_COND = 2;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__BOUND = 3;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ReachabilityImpl <em>Reachability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ReachabilityImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getReachability()
   * @generated
   */
  int REACHABILITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Init Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__INIT_COND = PROPERTY__INIT_COND;

  /**
   * The feature id for the '<em><b>Goal Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__GOAL_COND = PROPERTY__GOAL_COND;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__BOUND = PROPERTY__BOUND;

  /**
   * The number of structural features of the '<em>Reachability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.InvariantImpl <em>Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.InvariantImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getInvariant()
   * @generated
   */
  int INVARIANT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Init Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__INIT_COND = PROPERTY__INIT_COND;

  /**
   * The feature id for the '<em><b>Goal Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__GOAL_COND = PROPERTY__GOAL_COND;

  /**
   * The feature id for the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT__BOUND = PROPERTY__BOUND;

  /**
   * The number of structural features of the '<em>Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropositionImpl <em>Proposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropositionImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getProposition()
   * @generated
   */
  int PROPOSITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Proposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ModeImpl <em>Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ModeImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getMode()
   * @generated
   */
  int MODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__NAME = 0;

  /**
   * The number of structural features of the '<em>Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.SYMBOLICImpl <em>SYMBOLIC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.SYMBOLICImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getSYMBOLIC()
   * @generated
   */
  int SYMBOLIC = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC__NAME = MODE__NAME;

  /**
   * The number of structural features of the '<em>SYMBOLIC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_FEATURE_COUNT = MODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.RANDOMImpl <em>RANDOM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.RANDOMImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getRANDOM()
   * @generated
   */
  int RANDOM = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM__NAME = MODE__NAME;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM__SEED = MODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RANDOM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FEATURE_COUNT = MODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PSExpressionImpl <em>PS Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PSExpressionImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getPSExpression()
   * @generated
   */
  int PS_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>PS Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PS_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropRefImpl <em>Prop Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropRefImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getPropRef()
   * @generated
   */
  int PROP_REF = 9;

  /**
   * The feature id for the '<em><b>Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROP_REF__DEF = PS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prop Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROP_REF_FEATURE_COUNT = PS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ScopedExpressionImpl <em>Scoped Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ScopedExpressionImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getScopedExpression()
   * @generated
   */
  int SCOPED_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPED_EXPRESSION__PATH = PS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPED_EXPRESSION__EXPRESSION = PS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scoped Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPED_EXPRESSION_FEATURE_COUNT = PS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.BinaryExpressionImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__LEFT = PS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__OP = PS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__RIGHT = PS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = PS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.UnaryExpressionImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OP = PS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__CHILD = PS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = PS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ValueImpl
   * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getValue()
   * @generated
   */
  int VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = PS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = PS_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Top <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top
   * @generated
   */
  EClass getTop();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top#getName()
   * @see #getTop()
   * @generated
   */
  EAttribute getTop_Name();

  /**
   * Returns the meta object for the reference '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top#getModel()
   * @see #getTop()
   * @generated
   */
  EReference getTop_Model();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top#getPath()
   * @see #getTop()
   * @generated
   */
  EAttribute getTop_Path();

  /**
   * Returns the meta object for the containment reference list '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getProposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proposition</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top#getProposition()
   * @see #getTop()
   * @generated
   */
  EReference getTop_Proposition();

  /**
   * Returns the meta object for the containment reference list '{@link edu.postech.aadl.xtext.propspec.propSpec.Top#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top#getProperty()
   * @see #getTop()
   * @generated
   */
  EReference getTop_Property();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getInitCond <em>Init Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Cond</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property#getInitCond()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_InitCond();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getGoalCond <em>Goal Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goal Cond</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property#getGoalCond()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_GoalCond();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Property#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bound</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property#getBound()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Bound();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Reachability <em>Reachability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reachability</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Reachability
   * @generated
   */
  EClass getReachability();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Invariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Invariant
   * @generated
   */
  EClass getInvariant();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Proposition
   * @generated
   */
  EClass getProposition();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Proposition#getName()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Proposition#getExpression()
   * @see #getProposition()
   * @generated
   */
  EReference getProposition_Expression();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Mode
   * @generated
   */
  EClass getMode();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.Mode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Mode#getName()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Name();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.SYMBOLIC <em>SYMBOLIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SYMBOLIC</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.SYMBOLIC
   * @generated
   */
  EClass getSYMBOLIC();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.RANDOM <em>RANDOM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RANDOM</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.RANDOM
   * @generated
   */
  EClass getRANDOM();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.RANDOM#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.RANDOM#getSeed()
   * @see #getRANDOM()
   * @generated
   */
  EAttribute getRANDOM_Seed();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.PSExpression <em>PS Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PS Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PSExpression
   * @generated
   */
  EClass getPSExpression();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.PropRef <em>Prop Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prop Ref</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropRef
   * @generated
   */
  EClass getPropRef();

  /**
   * Returns the meta object for the reference '{@link edu.postech.aadl.xtext.propspec.propSpec.PropRef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropRef#getDef()
   * @see #getPropRef()
   * @generated
   */
  EReference getPropRef_Def();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression <em>Scoped Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scoped Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression
   * @generated
   */
  EClass getScopedExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getPath()
   * @see #getScopedExpression()
   * @generated
   */
  EReference getScopedExpression_Path();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression#getExpression()
   * @see #getScopedExpression()
   * @generated
   */
  EReference getScopedExpression_Expression();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getLeft()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getOp()
   * @see #getBinaryExpression()
   * @generated
   */
  EAttribute getBinaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression#getRight()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getOp()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression#getChild()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Child();

  /**
   * Returns the meta object for class '{@link edu.postech.aadl.xtext.propspec.propSpec.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link edu.postech.aadl.xtext.propspec.propSpec.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PropSpecFactory getPropSpecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl <em>Top</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.TopImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getTop()
     * @generated
     */
    EClass TOP = eINSTANCE.getTop();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP__NAME = eINSTANCE.getTop_Name();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP__MODEL = eINSTANCE.getTop_Model();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP__PATH = eINSTANCE.getTop_Path();

    /**
     * The meta object literal for the '<em><b>Proposition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP__PROPOSITION = eINSTANCE.getTop_Proposition();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP__PROPERTY = eINSTANCE.getTop_Property();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropertyImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Init Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__INIT_COND = eINSTANCE.getProperty_InitCond();

    /**
     * The meta object literal for the '<em><b>Goal Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__GOAL_COND = eINSTANCE.getProperty_GoalCond();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__BOUND = eINSTANCE.getProperty_Bound();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ReachabilityImpl <em>Reachability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ReachabilityImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getReachability()
     * @generated
     */
    EClass REACHABILITY = eINSTANCE.getReachability();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.InvariantImpl <em>Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.InvariantImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getInvariant()
     * @generated
     */
    EClass INVARIANT = eINSTANCE.getInvariant();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropositionImpl <em>Proposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropositionImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getProposition()
     * @generated
     */
    EClass PROPOSITION = eINSTANCE.getProposition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSITION__NAME = eINSTANCE.getProposition_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPOSITION__EXPRESSION = eINSTANCE.getProposition_Expression();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ModeImpl <em>Mode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ModeImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getMode()
     * @generated
     */
    EClass MODE = eINSTANCE.getMode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__NAME = eINSTANCE.getMode_Name();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.SYMBOLICImpl <em>SYMBOLIC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.SYMBOLICImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getSYMBOLIC()
     * @generated
     */
    EClass SYMBOLIC = eINSTANCE.getSYMBOLIC();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.RANDOMImpl <em>RANDOM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.RANDOMImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getRANDOM()
     * @generated
     */
    EClass RANDOM = eINSTANCE.getRANDOM();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM__SEED = eINSTANCE.getRANDOM_Seed();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PSExpressionImpl <em>PS Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PSExpressionImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getPSExpression()
     * @generated
     */
    EClass PS_EXPRESSION = eINSTANCE.getPSExpression();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.PropRefImpl <em>Prop Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropRefImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getPropRef()
     * @generated
     */
    EClass PROP_REF = eINSTANCE.getPropRef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROP_REF__DEF = eINSTANCE.getPropRef_Def();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ScopedExpressionImpl <em>Scoped Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ScopedExpressionImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getScopedExpression()
     * @generated
     */
    EClass SCOPED_EXPRESSION = eINSTANCE.getScopedExpression();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPED_EXPRESSION__PATH = eINSTANCE.getScopedExpression_Path();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPED_EXPRESSION__EXPRESSION = eINSTANCE.getScopedExpression_Expression();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.BinaryExpressionImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPRESSION__OP = eINSTANCE.getBinaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.UnaryExpressionImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__CHILD = eINSTANCE.getUnaryExpression_Child();

    /**
     * The meta object literal for the '{@link edu.postech.aadl.xtext.propspec.propSpec.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.ValueImpl
     * @see edu.postech.aadl.xtext.propspec.propSpec.impl.PropSpecPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__VALUE = eINSTANCE.getValue_Value();

  }

} //PropSpecPackage
