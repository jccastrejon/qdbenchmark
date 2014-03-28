/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage
 * @generated
 */
public interface QdBenchmarkDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QdBenchmarkDslFactory eINSTANCE = fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QdBenchmarkDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema</em>'.
   * @generated
   */
  Schema createSchema();

  /**
   * Returns a new object of class '<em>Quality Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quality Specification</em>'.
   * @generated
   */
  QualitySpecification createQualitySpecification();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Set </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set </em>'.
   * @generated
   */
  Set_ createSet_();

  /**
   * Returns a new object of class '<em>Struct </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct </em>'.
   * @generated
   */
  Struct_ createStruct_();

  /**
   * Returns a new object of class '<em>Relationship </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship </em>'.
   * @generated
   */
  Relationship_ createRelationship_();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QdBenchmarkDslPackage getQdBenchmarkDslPackage();

} //QdBenchmarkDslFactory
