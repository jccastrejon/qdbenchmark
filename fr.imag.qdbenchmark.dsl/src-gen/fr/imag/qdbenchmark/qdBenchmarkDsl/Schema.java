/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getName <em>Name</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSchema_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.qdbenchmark.qdBenchmarkDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSchema_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // Schema
