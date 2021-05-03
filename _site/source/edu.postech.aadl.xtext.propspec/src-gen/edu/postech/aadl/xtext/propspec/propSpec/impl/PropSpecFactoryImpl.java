/**
 */
package edu.postech.aadl.xtext.propspec.propSpec.impl;

import edu.postech.aadl.xtext.propspec.propSpec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropSpecFactoryImpl extends EFactoryImpl implements PropSpecFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropSpecFactory init()
  {
    try
    {
      PropSpecFactory thePropSpecFactory = (PropSpecFactory)EPackage.Registry.INSTANCE.getEFactory(PropSpecPackage.eNS_URI);
      if (thePropSpecFactory != null)
      {
        return thePropSpecFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PropSpecFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropSpecFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PropSpecPackage.TOP: return createTop();
      case PropSpecPackage.PROPERTY: return createProperty();
      case PropSpecPackage.REACHABILITY: return createReachability();
      case PropSpecPackage.INVARIANT: return createInvariant();
      case PropSpecPackage.PROPOSITION: return createProposition();
      case PropSpecPackage.MODE: return createMode();
      case PropSpecPackage.SYMBOLIC: return createSYMBOLIC();
      case PropSpecPackage.RANDOM: return createRANDOM();
      case PropSpecPackage.PS_EXPRESSION: return createPSExpression();
      case PropSpecPackage.PROP_REF: return createPropRef();
      case PropSpecPackage.SCOPED_EXPRESSION: return createScopedExpression();
      case PropSpecPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case PropSpecPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case PropSpecPackage.VALUE: return createValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Top createTop()
  {
    TopImpl top = new TopImpl();
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reachability createReachability()
  {
    ReachabilityImpl reachability = new ReachabilityImpl();
    return reachability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Invariant createInvariant()
  {
    InvariantImpl invariant = new InvariantImpl();
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition createProposition()
  {
    PropositionImpl proposition = new PropositionImpl();
    return proposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SYMBOLIC createSYMBOLIC()
  {
    SYMBOLICImpl symbolic = new SYMBOLICImpl();
    return symbolic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RANDOM createRANDOM()
  {
    RANDOMImpl random = new RANDOMImpl();
    return random;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSExpression createPSExpression()
  {
    PSExpressionImpl psExpression = new PSExpressionImpl();
    return psExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropRef createPropRef()
  {
    PropRefImpl propRef = new PropRefImpl();
    return propRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScopedExpression createScopedExpression()
  {
    ScopedExpressionImpl scopedExpression = new ScopedExpressionImpl();
    return scopedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropSpecPackage getPropSpecPackage()
  {
    return (PropSpecPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PropSpecPackage getPackage()
  {
    return PropSpecPackage.eINSTANCE;
  }

} //PropSpecFactoryImpl
