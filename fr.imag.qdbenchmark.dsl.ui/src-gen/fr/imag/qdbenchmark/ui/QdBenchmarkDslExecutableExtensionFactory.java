/*
 * generated by Xtext
 */
package fr.imag.qdbenchmark.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.imag.qdbenchmark.ui.internal.QdBenchmarkDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class QdBenchmarkDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return QdBenchmarkDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return QdBenchmarkDslActivator.getInstance().getInjector(QdBenchmarkDslActivator.FR_IMAG_QDBENCHMARK_QDBENCHMARKDSL);
	}
	
}
