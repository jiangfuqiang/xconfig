/**
 */
package org.xconfig.xconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xconfig.xconfig.XmlConfig#getName <em>Name</em>}</li>
 *   <li>{@link org.xconfig.xconfig.XmlConfig#getConfigElements <em>Config Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xconfig.xconfig.XconfigPackage#getXmlConfig()
 * @model
 * @generated
 */
public interface XmlConfig extends EObject
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
   * @see org.xconfig.xconfig.XconfigPackage#getXmlConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xconfig.xconfig.XmlConfig#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Config Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xconfig.xconfig.ConfigElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Elements</em>' containment reference list.
   * @see org.xconfig.xconfig.XconfigPackage#getXmlConfig_ConfigElements()
   * @model containment="true"
   * @generated
   */
  EList<ConfigElement> getConfigElements();

} // XmlConfig
