package fr.imag.qdbenchmark.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractQdBenchmarkDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage.eINSTANCE);
		return result;
	}

}
