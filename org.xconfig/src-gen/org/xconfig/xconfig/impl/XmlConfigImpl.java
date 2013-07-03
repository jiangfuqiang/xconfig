/**
 */
package org.xconfig.xconfig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xconfig.xconfig.ConfigElement;
import org.xconfig.xconfig.XconfigPackage;
import org.xconfig.xconfig.XmlConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xconfig.xconfig.impl.XmlConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xconfig.xconfig.impl.XmlConfigImpl#getConfigElements <em>Config Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlConfigImpl extends MinimalEObjectImpl.Container implements XmlConfig
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConfigElements() <em>Config Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigElements()
   * @generated
   * @ordered
   */
  protected EList<ConfigElement> configElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XmlConfigImpl()
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
    return XconfigPackage.Literals.XML_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XconfigPackage.XML_CONFIG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigElement> getConfigElements()
  {
    if (configElements == null)
    {
      configElements = new EObjectContainmentEList<ConfigElement>(ConfigElement.class, this, XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS);
    }
    return configElements;
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
      case XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS:
        return ((InternalEList<?>)getConfigElements()).basicRemove(otherEnd, msgs);
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
      case XconfigPackage.XML_CONFIG__NAME:
        return getName();
      case XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS:
        return getConfigElements();
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
      case XconfigPackage.XML_CONFIG__NAME:
        setName((String)newValue);
        return;
      case XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS:
        getConfigElements().clear();
        getConfigElements().addAll((Collection<? extends ConfigElement>)newValue);
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
      case XconfigPackage.XML_CONFIG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS:
        getConfigElements().clear();
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
      case XconfigPackage.XML_CONFIG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XconfigPackage.XML_CONFIG__CONFIG_ELEMENTS:
        return configElements != null && !configElements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //XmlConfigImpl
