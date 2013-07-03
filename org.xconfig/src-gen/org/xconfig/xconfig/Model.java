/**
 */
package org.xconfig.xconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xconfig.xconfig.Model#getXmls <em>Xmls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xconfig.xconfig.XconfigPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Xmls</b></em>' containment reference list.
   * The list contents are of type {@link org.xconfig.xconfig.XmlConfig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xmls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xmls</em>' containment reference list.
   * @see org.xconfig.xconfig.XconfigPackage#getModel_Xmls()
   * @model containment="true"
   * @generated
   */
  EList<XmlConfig> getXmls();

} // Model
