/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getSubCharacteristics <em>Sub Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getQualitySpecification()
 * @model
 * @generated
 */
public interface QualitySpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Characteristic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characteristic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic</em>' attribute.
   * @see #setCharacteristic(String)
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getQualitySpecification_Characteristic()
   * @model
   * @generated
   */
  String getCharacteristic();

  /**
   * Sets the value of the '{@link fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification#getCharacteristic <em>Characteristic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characteristic</em>' attribute.
   * @see #getCharacteristic()
   * @generated
   */
  void setCharacteristic(String value);

  /**
   * Returns the value of the '<em><b>Sub Characteristics</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Characteristics</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Characteristics</em>' attribute list.
   * @see fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage#getQualitySpecification_SubCharacteristics()
   * @model unique="false"
   * @generated
   */
  EList<String> getSubCharacteristics();

} // QualitySpecification
