/**
 */
package org.xconfig.xconfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xconfig.xconfig.ConfigElement#getName <em>Name</em>}</li>
 *   <li>{@link org.xconfig.xconfig.ConfigElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xconfig.xconfig.XconfigPackage#getConfigElement()
 * @model
 * @generated
 */
public interface ConfigElement extends EObject
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
   * @see org.xconfig.xconfig.XconfigPackage#getConfigElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xconfig.xconfig.ConfigElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ConfigElementType)
   * @see org.xconfig.xconfig.XconfigPackage#getConfigElement_Type()
   * @model containment="true"
   * @generated
   */
  ConfigElementType getType();

  /**
   * Sets the value of the '{@link org.xconfig.xconfig.ConfigElement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ConfigElementType value);

} // ConfigElement
