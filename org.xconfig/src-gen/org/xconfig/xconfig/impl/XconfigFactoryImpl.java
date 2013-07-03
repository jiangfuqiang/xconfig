/**
 */
package org.xconfig.xconfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xconfig.xconfig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XconfigFactoryImpl extends EFactoryImpl implements XconfigFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XconfigFactory init()
  {
    try
    {
      XconfigFactory theXconfigFactory = (XconfigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xconfig.org/Xconfig"); 
      if (theXconfigFactory != null)
      {
        return theXconfigFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XconfigFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XconfigFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XconfigPackage.MODEL: return createModel();
      case XconfigPackage.XML_CONFIG: return createXmlConfig();
      case XconfigPackage.CONFIG_ELEMENT: return createConfigElement();
      case XconfigPackage.CONFIG_ELEMENT_TYPE: return createConfigElementType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XmlConfig createXmlConfig()
  {
    XmlConfigImpl xmlConfig = new XmlConfigImpl();
    return xmlConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigElement createConfigElement()
  {
    ConfigElementImpl configElement = new ConfigElementImpl();
    return configElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigElementType createConfigElementType()
  {
    ConfigElementTypeImpl configElementType = new ConfigElementTypeImpl();
    return configElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XconfigPackage getXconfigPackage()
  {
    return (XconfigPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XconfigPackage getPackage()
  {
    return XconfigPackage.eINSTANCE;
  }

} //XconfigFactoryImpl
