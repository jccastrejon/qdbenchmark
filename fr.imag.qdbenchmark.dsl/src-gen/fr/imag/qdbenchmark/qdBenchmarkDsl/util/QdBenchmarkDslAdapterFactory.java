/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl.util;

import fr.imag.qdbenchmark.qdBenchmarkDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage
 * @generated
 */
public class QdBenchmarkDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QdBenchmarkDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QdBenchmarkDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QdBenchmarkDslPackage.eINSTANCE;
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
  protected QdBenchmarkDslSwitch<Adapter> modelSwitch =
    new QdBenchmarkDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseSchema(Schema object)
      {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseQualitySpecification(QualitySpecification object)
      {
        return createQualitySpecificationAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseSet_(Set_ object)
      {
        return createSet_Adapter();
      }
      @Override
      public Adapter caseStruct_(Struct_ object)
      {
        return createStruct_Adapter();
      }
      @Override
      public Adapter caseRelationship_(Relationship_ object)
      {
        return createRelationship_Adapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Schema
   * @generated
   */
  public Adapter createSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification <em>Quality Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification
   * @generated
   */
  public Adapter createQualitySpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_ <em>Set </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Set_
   * @generated
   */
  public Adapter createSet_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_ <em>Struct </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_
   * @generated
   */
  public Adapter createStruct_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_ <em>Relationship </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_
   * @generated
   */
  public Adapter createRelationship_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
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

} //QdBenchmarkDslAdapterFactory
