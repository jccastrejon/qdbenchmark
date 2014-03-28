/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl.impl;

import fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage;
import fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.QualitySpecificationImpl#getSubCharacteristics <em>Sub Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitySpecificationImpl extends MinimalEObjectImpl.Container implements QualitySpecification
{
  /**
   * The default value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristic()
   * @generated
   * @ordered
   */
  protected static final String CHARACTERISTIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristic()
   * @generated
   * @ordered
   */
  protected String characteristic = CHARACTERISTIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubCharacteristics() <em>Sub Characteristics</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubCharacteristics()
   * @generated
   * @ordered
   */
  protected EList<String> subCharacteristics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualitySpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QdBenchmarkDslPackage.Literals.QUALITY_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCharacteristic()
  {
    return characteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacteristic(String newCharacteristic)
  {
    String oldCharacteristic = characteristic;
    characteristic = newCharacteristic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QdBenchmarkDslPackage.QUALITY_SPECIFICATION__CHARACTERISTIC, oldCharacteristic, characteristic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSubCharacteristics()
  {
    if (subCharacteristics == null)
    {
      subCharacteristics = new EDataTypeEList<String>(String.class, this, QdBenchmarkDslPackage.QUALITY_SPECIFICATION__SUB_CHARACTERISTICS);
    }
    return subCharacteristics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__CHARACTERISTIC:
        return getCharacteristic();
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__SUB_CHARACTERISTICS:
        return getSubCharacteristics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__CHARACTERISTIC:
        setCharacteristic((String)newValue);
        return;
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__SUB_CHARACTERISTICS:
        getSubCharacteristics().clear();
        getSubCharacteristics().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__CHARACTERISTIC:
        setCharacteristic(CHARACTERISTIC_EDEFAULT);
        return;
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__SUB_CHARACTERISTICS:
        getSubCharacteristics().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__CHARACTERISTIC:
        return CHARACTERISTIC_EDEFAULT == null ? characteristic != null : !CHARACTERISTIC_EDEFAULT.equals(characteristic);
      case QdBenchmarkDslPackage.QUALITY_SPECIFICATION__SUB_CHARACTERISTICS:
        return subCharacteristics != null && !subCharacteristics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (characteristic: ");
    result.append(characteristic);
    result.append(", subCharacteristics: ");
    result.append(subCharacteristics);
    result.append(')');
    return result.toString();
  }

} //QualitySpecificationImpl
