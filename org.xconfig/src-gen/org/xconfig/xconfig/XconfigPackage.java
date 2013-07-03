/**
 */
package org.xconfig.xconfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xconfig.xconfig.XconfigFactory
 * @model kind="package"
 * @generated
 */
public interface XconfigPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xconfig";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xconfig.org/Xconfig";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xconfig";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XconfigPackage eINSTANCE = org.xconfig.xconfig.impl.XconfigPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xconfig.xconfig.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xconfig.xconfig.impl.ModelImpl
   * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Xmls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__XMLS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xconfig.xconfig.impl.XmlConfigImpl <em>Xml Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xconfig.xconfig.impl.XmlConfigImpl
   * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getXmlConfig()
   * @generated
   */
  int XML_CONFIG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONFIG__NAME = 0;

  /**
   * The feature id for the '<em><b>Config Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONFIG__CONFIG_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Xml Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_CONFIG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xconfig.xconfig.impl.ConfigElementImpl <em>Config Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xconfig.xconfig.impl.ConfigElementImpl
   * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getConfigElement()
   * @generated
   */
  int CONFIG_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_ELEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Config Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xconfig.xconfig.impl.ConfigElementTypeImpl <em>Config Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xconfig.xconfig.impl.ConfigElementTypeImpl
   * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getConfigElementType()
   * @generated
   */
  int CONFIG_ELEMENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_ELEMENT_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Config Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_ELEMENT_TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xconfig.xconfig.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xconfig.xconfig.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xconfig.xconfig.Model#getXmls <em>Xmls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xmls</em>'.
   * @see org.xconfig.xconfig.Model#getXmls()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Xmls();

  /**
   * Returns the meta object for class '{@link org.xconfig.xconfig.XmlConfig <em>Xml Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Config</em>'.
   * @see org.xconfig.xconfig.XmlConfig
   * @generated
   */
  EClass getXmlConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xconfig.xconfig.XmlConfig#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xconfig.xconfig.XmlConfig#getName()
   * @see #getXmlConfig()
   * @generated
   */
  EAttribute getXmlConfig_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xconfig.xconfig.XmlConfig#getConfigElements <em>Config Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config Elements</em>'.
   * @see org.xconfig.xconfig.XmlConfig#getConfigElements()
   * @see #getXmlConfig()
   * @generated
   */
  EReference getXmlConfig_ConfigElements();

  /**
   * Returns the meta object for class '{@link org.xconfig.xconfig.ConfigElement <em>Config Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Element</em>'.
   * @see org.xconfig.xconfig.ConfigElement
   * @generated
   */
  EClass getConfigElement();

  /**
   * Returns the meta object for the attribute '{@link org.xconfig.xconfig.ConfigElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xconfig.xconfig.ConfigElement#getName()
   * @see #getConfigElement()
   * @generated
   */
  EAttribute getConfigElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xconfig.xconfig.ConfigElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xconfig.xconfig.ConfigElement#getType()
   * @see #getConfigElement()
   * @generated
   */
  EReference getConfigElement_Type();

  /**
   * Returns the meta object for class '{@link org.xconfig.xconfig.ConfigElementType <em>Config Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Element Type</em>'.
   * @see org.xconfig.xconfig.ConfigElementType
   * @generated
   */
  EClass getConfigElementType();

  /**
   * Returns the meta object for the attribute '{@link org.xconfig.xconfig.ConfigElementType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xconfig.xconfig.ConfigElementType#getType()
   * @see #getConfigElementType()
   * @generated
   */
  EAttribute getConfigElementType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XconfigFactory getXconfigFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xconfig.xconfig.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xconfig.xconfig.impl.ModelImpl
     * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Xmls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__XMLS = eINSTANCE.getModel_Xmls();

    /**
     * The meta object literal for the '{@link org.xconfig.xconfig.impl.XmlConfigImpl <em>Xml Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xconfig.xconfig.impl.XmlConfigImpl
     * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getXmlConfig()
     * @generated
     */
    EClass XML_CONFIG = eINSTANCE.getXmlConfig();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_CONFIG__NAME = eINSTANCE.getXmlConfig_Name();

    /**
     * The meta object literal for the '<em><b>Config Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_CONFIG__CONFIG_ELEMENTS = eINSTANCE.getXmlConfig_ConfigElements();

    /**
     * The meta object literal for the '{@link org.xconfig.xconfig.impl.ConfigElementImpl <em>Config Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xconfig.xconfig.impl.ConfigElementImpl
     * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getConfigElement()
     * @generated
     */
    EClass CONFIG_ELEMENT = eINSTANCE.getConfigElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_ELEMENT__NAME = eINSTANCE.getConfigElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_ELEMENT__TYPE = eINSTANCE.getConfigElement_Type();

    /**
     * The meta object literal for the '{@link org.xconfig.xconfig.impl.ConfigElementTypeImpl <em>Config Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xconfig.xconfig.impl.ConfigElementTypeImpl
     * @see org.xconfig.xconfig.impl.XconfigPackageImpl#getConfigElementType()
     * @generated
     */
    EClass CONFIG_ELEMENT_TYPE = eINSTANCE.getConfigElementType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG_ELEMENT_TYPE__TYPE = eINSTANCE.getConfigElementType_Type();

  }

} //XconfigPackage
