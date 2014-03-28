/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getEntities <em>Entities</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getQualitySpecifications <em>Quality Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSet_()
 * @model
 * @generated
 */
public interface Set_ extends Entity
{
  /**
   * Returns the value of the '<em><b>Data Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Model</em>' attribute.
   * @see #setDataModel(String)
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSet__DataModel()
   * @model
   * @generated
   */
  String getDataModel();

  /**
   * Sets the value of the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.Set_#getDataModel <em>Data Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Model</em>' attribute.
   * @see #getDataModel()
   * @generated
   */
  void setDataModel(String value);

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
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSet__Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Quality Specifications</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quality Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quality Specifications</em>' containment reference list.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getSet__QualitySpecifications()
   * @model containment="true"
   * @generated
   */
  EList<QualitySpecification> getQualitySpecifications();

} // Set_
