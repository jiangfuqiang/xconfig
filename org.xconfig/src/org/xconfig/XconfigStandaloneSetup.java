
package org.xconfig;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XconfigStandaloneSetup extends XconfigStandaloneSetupGenerated{

	public static void doSetup() {
		new XconfigStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

