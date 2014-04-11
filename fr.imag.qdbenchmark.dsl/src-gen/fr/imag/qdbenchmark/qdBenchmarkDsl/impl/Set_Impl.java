/**
 */
package fr.imag.qdbenchmark.qdBenchmarkDsl.impl;

import fr.imag.qdbenchmark.qdBenchmarkDsl.Entity;
import fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage;
import fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Set_;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl#getQualitySpecifications <em>Quality Specifications</em>}</li>
 *   <li>{@link fr.imag.qdbenchmark.qdBenchmarkDsl.impl.Set_Impl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Set_Impl extends EntityImpl implements Set_
{
  /**
   * The default value of the '{@link #getDataModel() <em>Data Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataModel()
   * @generated
   * @ordered
   */
  protected static final String DATA_MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataModel() <em>Data Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataModel()
   * @generated
   * @ordered
   */
  protected String dataModel = DATA_MODEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getQualitySpecifications() <em>Quality Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualitySpecifications()
   * @generated
   * @ordered
   */
  protected EList<QualitySpecification> qualitySpecifications;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Set_Impl()
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
    return QdBenchmarkDslPackage.Literals.SET_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDataModel()
  {
    return dataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataModel(String newDataModel)
  {
    String oldDataModel = dataModel;
    dataModel = newDataModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QdBenchmarkDslPackage.SET___DATA_MODEL, oldDataModel, dataModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualitySpecification> getQualitySpecifications()
  {
    if (qualitySpecifications == null)
    {
      qualitySpecifications = new EObjectContainmentEList<QualitySpecification>(QualitySpecification.class, this, QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS);
    }
    return qualitySpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, QdBenchmarkDslPackage.SET___ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS:
        return ((InternalEList<?>)getQualitySpecifications()).basicRemove(otherEnd, msgs);
      case QdBenchmarkDslPackage.SET___ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QdBenchmarkDslPackage.SET___DATA_MODEL:
        return getDataModel();
      case QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS:
        return getQualitySpecifications();
      case QdBenchmarkDslPackage.SET___ENTITIES:
        return getEntities();
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
      case QdBenchmarkDslPackage.SET___DATA_MODEL:
        setDataModel((String)newValue);
        return;
      case QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS:
        getQualitySpecifications().clear();
        getQualitySpecifications().addAll((Collection<? extends QualitySpecification>)newValue);
        return;
      case QdBenchmarkDslPackage.SET___ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
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
      case QdBenchmarkDslPackage.SET___DATA_MODEL:
        setDataModel(DATA_MODEL_EDEFAULT);
        return;
      case QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS:
        getQualitySpecifications().clear();
        return;
      case QdBenchmarkDslPackage.SET___ENTITIES:
        getEntities().clear();
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
      case QdBenchmarkDslPackage.SET___DATA_MODEL:
        return DATA_MODEL_EDEFAULT == null ? dataModel != null : !DATA_MODEL_EDEFAULT.equals(dataModel);
      case QdBenchmarkDslPackage.SET___QUALITY_SPECIFICATIONS:
        return qualitySpecifications != null && !qualitySpecifications.isEmpty();
      case QdBenchmarkDslPackage.SET___ENTITIES:
        return entities != null && !entities.isEmpty();
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
    result.append(" (dataModel: ");
    result.append(dataModel);
    result.append(')');
    return result.toString();
  }

} //Set_Impl
