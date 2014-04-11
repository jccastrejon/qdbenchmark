/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl;

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
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslFactory
 * @model kind="package"
 * @generated
 */
public interface QdBenchmarkDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qdBenchmarkDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.imag.fr/qdbenchmark/QdBenchmarkDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qdBenchmarkDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QdBenchmarkDslPackage eINSTANCE = fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.SchemaImpl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__ENTITIES = 2;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl <em>Quality Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getQualitySpecification()
   * @generated
   */
  int QUALITY_SPECIFICATION = 1;

  /**
   * The feature id for the '<em><b>Characteristic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_SPECIFICATION__CHARACTERISTIC = 0;

  /**
   * The feature id for the '<em><b>Sub Characteristics</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_SPECIFICATION__SUB_CHARACTERISTICS = 1;

  /**
   * The number of structural features of the '<em>Quality Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.EntityImpl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl <em>Set </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getSet_()
   * @generated
   */
  int SET_ = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET___NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET___ATTRIBUTES = ENTITY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Data Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET___DATA_MODEL = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quality Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET___QUALITY_SPECIFICATIONS = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET___ENTITIES = ENTITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Set </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Struct_Impl <em>Struct </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Struct_Impl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getStruct_()
   * @generated
   */
  int STRUCT_ = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT___NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT___ATTRIBUTES = ENTITY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT___ENTITIES = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Relationship_Impl <em>Relationship </em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Relationship_Impl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getRelationship_()
   * @generated
   */
  int RELATIONSHIP_ = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP___NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP___ATTRIBUTES = ENTITY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP___START = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP___END = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relationship </em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.AttributeImpl
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getName()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getAttributes()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getEntities()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Entities();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification <em>Quality Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quality Specification</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification
   * @generated
   */
  EClass getQualitySpecification();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getCharacteristic <em>Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Characteristic</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getCharacteristic()
   * @see #getQualitySpecification()
   * @generated
   */
  EAttribute getQualitySpecification_Characteristic();

  /**
   * Returns the meta object for the attribute list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getSubCharacteristics <em>Sub Characteristics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sub Characteristics</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getSubCharacteristics()
   * @see #getQualitySpecification()
   * @generated
   */
  EAttribute getQualitySpecification_SubCharacteristics();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_ <em>Set </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set </em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Set_
   * @generated
   */
  EClass getSet_();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getDataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Model</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getDataModel()
   * @see #getSet_()
   * @generated
   */
  EAttribute getSet__DataModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getQualitySpecifications <em>Quality Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quality Specifications</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getQualitySpecifications()
   * @see #getSet_()
   * @generated
   */
  EReference getSet__QualitySpecifications();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getEntities()
   * @see #getSet_()
   * @generated
   */
  EReference getSet__Entities();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_ <em>Struct </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct </em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_
   * @generated
   */
  EClass getStruct_();

  /**
   * Returns the meta object for the containment reference list '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_#getEntities()
   * @see #getStruct_()
   * @generated
   */
  EReference getStruct__Entities();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_ <em>Relationship </em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship </em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_
   * @generated
   */
  EClass getRelationship_();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_#getStart()
   * @see #getRelationship_()
   * @generated
   */
  EAttribute getRelationship__Start();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_#getEnd()
   * @see #getRelationship_()
   * @generated
   */
  EAttribute getRelationship__End();

  /**
   * Returns the meta object for class '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QdBenchmarkDslFactory getQdBenchmarkDslFactory();

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
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.SchemaImpl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__ATTRIBUTES = eINSTANCE.getSchema_Attributes();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__ENTITIES = eINSTANCE.getSchema_Entities();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl <em>Quality Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getQualitySpecification()
     * @generated
     */
    EClass QUALITY_SPECIFICATION = eINSTANCE.getQualitySpecification();

    /**
     * The meta object literal for the '<em><b>Characteristic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITY_SPECIFICATION__CHARACTERISTIC = eINSTANCE.getQualitySpecification_Characteristic();

    /**
     * The meta object literal for the '<em><b>Sub Characteristics</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITY_SPECIFICATION__SUB_CHARACTERISTICS = eINSTANCE.getQualitySpecification_SubCharacteristics();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.EntityImpl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl <em>Set </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getSet_()
     * @generated
     */
    EClass SET_ = eINSTANCE.getSet_();

    /**
     * The meta object literal for the '<em><b>Data Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET___DATA_MODEL = eINSTANCE.getSet__DataModel();

    /**
     * The meta object literal for the '<em><b>Quality Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET___QUALITY_SPECIFICATIONS = eINSTANCE.getSet__QualitySpecifications();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET___ENTITIES = eINSTANCE.getSet__Entities();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Struct_Impl <em>Struct </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Struct_Impl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getStruct_()
     * @generated
     */
    EClass STRUCT_ = eINSTANCE.getStruct_();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT___ENTITIES = eINSTANCE.getStruct__Entities();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Relationship_Impl <em>Relationship </em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Relationship_Impl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getRelationship_()
     * @generated
     */
    EClass RELATIONSHIP_ = eINSTANCE.getRelationship_();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP___START = eINSTANCE.getRelationship__Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP___END = eINSTANCE.getRelationship__End();

    /**
     * The meta object literal for the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.AttributeImpl
     * @see fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

  }

} //QdBenchmarkDslPackage
