/*
* generated by Xtext
*/
package fr.imag.qdbenchmark;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class QdBenchmarkDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.imag.qdbenchmark.ui.internal.QdBenchmarkDslActivator.getInstance().getInjector("fr.imag.qdbenchmark.QdBenchmarkDsl");
	}
	
}
