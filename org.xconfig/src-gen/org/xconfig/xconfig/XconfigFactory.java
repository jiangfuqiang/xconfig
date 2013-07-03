/**
 */
package org.xconfig.xconfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xconfig.xconfig.XconfigPackage
 * @generated
 */
public interface XconfigFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XconfigFactory eINSTANCE = org.xconfig.xconfig.impl.XconfigFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Xml Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Config</em>'.
   * @generated
   */
  XmlConfig createXmlConfig();

  /**
   * Returns a new object of class '<em>Config Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Element</em>'.
   * @generated
   */
  ConfigElement createConfigElement();

  /**
   * Returns a new object of class '<em>Config Element Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Element Type</em>'.
   * @generated
   */
  ConfigElementType createConfigElementType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XconfigPackage getXconfigPackage();

} //XconfigFactory
