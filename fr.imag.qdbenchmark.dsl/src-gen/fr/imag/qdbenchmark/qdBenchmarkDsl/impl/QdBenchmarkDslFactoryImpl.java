/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl.impl;

import fr.imag.qdbenchmark.qdBenchmarkDsl.*;

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
public class QdBenchmarkDslFactoryImpl extends EFactoryImpl implements QdBenchmarkDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QdBenchmarkDslFactory init()
  {
    try
    {
      QdBenchmarkDslFactory theQdBenchmarkDslFactory = (QdBenchmarkDslFactory)EPackage.Registry.INSTANCE.getEFactory(QdBenchmarkDslPackage.eNS_URI);
      if (theQdBenchmarkDslFactory != null)
      {
        return theQdBenchmarkDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QdBenchmarkDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QdBenchmarkDslFactoryImpl()
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
      case QdBenchmarkDslPackage.SCHEMA: return createSchema();
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION: return createQualitySpecification();
      case QdBenchmarkDslPackage.ENTITY: return createEntity();
      case QdBenchmarkDslPackage.SET_: return createSet_();
      case QdBenchmarkDslPackage.STRUCT_: return createStruct_();
      case QdBenchmarkDslPackage.RELATIONSHIP_: return createRelationship_();
      case QdBenchmarkDslPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema createSchema()
  {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitySpecification createQualitySpecification()
  {
    QualitySpecificationImpl qualitySpecification = new QualitySpecificationImpl();
    return qualitySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set_ createSet_()
  {
    Set_Impl set_ = new Set_Impl();
    return set_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct_ createStruct_()
  {
    Struct_Impl struct_ = new Struct_Impl();
    return struct_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship_ createRelationship_()
  {
    Relationship_Impl relationship_ = new Relationship_Impl();
    return relationship_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QdBenchmarkDslPackage getQdBenchmarkDslPackage()
  {
    return (QdBenchmarkDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QdBenchmarkDslPackage getPackage()
  {
    return QdBenchmarkDslPackage.eINSTANCE;
  }

} //QdBenchmarkDslFactoryImpl
