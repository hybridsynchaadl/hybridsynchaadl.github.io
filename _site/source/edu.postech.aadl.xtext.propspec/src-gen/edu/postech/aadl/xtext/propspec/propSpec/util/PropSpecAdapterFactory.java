/**
 */
package edu.postech.aadl.xtext.propspec.propSpec.util;

import edu.postech.aadl.xtext.propspec.propSpec.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.postech.aadl.xtext.propspec.propSpec.PropSpecPackage
 * @generated
 */
public class PropSpecAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PropSpecPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropSpecAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PropSpecPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropSpecSwitch<Adapter> modelSwitch =
    new PropSpecSwitch<Adapter>()
    {
      @Override
      public Adapter caseTop(Top object)
      {
        return createTopAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseReachability(Reachability object)
      {
        return createReachabilityAdapter();
      }
      @Override
      public Adapter caseInvariant(Invariant object)
      {
        return createInvariantAdapter();
      }
      @Override
      public Adapter caseProposition(Proposition object)
      {
        return createPropositionAdapter();
      }
      @Override
      public Adapter caseMode(Mode object)
      {
        return createModeAdapter();
      }
      @Override
      public Adapter caseSYMBOLIC(SYMBOLIC object)
      {
        return createSYMBOLICAdapter();
      }
      @Override
      public Adapter caseRANDOM(RANDOM object)
      {
        return createRANDOMAdapter();
      }
      @Override
      public Adapter casePSExpression(PSExpression object)
      {
        return createPSExpressionAdapter();
      }
      @Override
      public Adapter casePropRef(PropRef object)
      {
        return createPropRefAdapter();
      }
      @Override
      public Adapter caseScopedExpression(ScopedExpression object)
      {
        return createScopedExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryExpression(BinaryExpression object)
      {
        return createBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Top <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Top
   * @generated
   */
  public Adapter createTopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Reachability <em>Reachability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Reachability
   * @generated
   */
  public Adapter createReachabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Invariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Invariant
   * @generated
   */
  public Adapter createInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Proposition
   * @generated
   */
  public Adapter createPropositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Mode
   * @generated
   */
  public Adapter createModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.SYMBOLIC <em>SYMBOLIC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.SYMBOLIC
   * @generated
   */
  public Adapter createSYMBOLICAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.RANDOM <em>RANDOM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.RANDOM
   * @generated
   */
  public Adapter createRANDOMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.PSExpression <em>PS Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PSExpression
   * @generated
   */
  public Adapter createPSExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.PropRef <em>Prop Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.PropRef
   * @generated
   */
  public Adapter createPropRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression <em>Scoped Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.ScopedExpression
   * @generated
   */
  public Adapter createScopedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.postech.aadl.xtext.propspec.propSpec.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.postech.aadl.xtext.propspec.propSpec.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PropSpecAdapterFactory
