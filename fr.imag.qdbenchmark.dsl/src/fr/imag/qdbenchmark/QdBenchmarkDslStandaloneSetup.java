
package fr.imag.qdbenchmark;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QdBenchmarkDslStandaloneSetup extends QdBenchmarkDslStandaloneSetupGenerated{

	public static void doSetup() {
		new QdBenchmarkDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

