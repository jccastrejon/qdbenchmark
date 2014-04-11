package fr.imag.qdbenchmark.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Attribute;
import fr.imag.qdbenchmark.qdBenchmarkDsl.QdBenchmarkDslPackage;
import fr.imag.qdbenchmark.qdBenchmarkDsl.QualitySpecification;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Relationship_;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Schema;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Set_;
import fr.imag.qdbenchmark.qdBenchmarkDsl.Struct_;
import fr.imag.qdbenchmark.services.QdBenchmarkDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class QdBenchmarkDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QdBenchmarkDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QdBenchmarkDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QdBenchmarkDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case QdBenchmarkDslPackage.QUALITY_SPECIFICATION:
				if(context == grammarAccess.getQualitySpecificationRule()) {
					sequence_QualitySpecification(context, (QualitySpecification) semanticObject); 
					return; 
				}
				else break;
			case QdBenchmarkDslPackage.RELATIONSHIP_:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getRelationship_Rule()) {
					sequence_Relationship_(context, (Relationship_) semanticObject); 
					return; 
				}
				else break;
			case QdBenchmarkDslPackage.SCHEMA:
				if(context == grammarAccess.getSchemaRule()) {
					sequence_Schema(context, (Schema) semanticObject); 
					return; 
				}
				else break;
			case QdBenchmarkDslPackage.SET_:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getSet_Rule()) {
					sequence_Set_(context, (Set_) semanticObject); 
					return; 
				}
				else break;
			case QdBenchmarkDslPackage.STRUCT_:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getStruct_Rule()) {
					sequence_Struct_(context, (Struct_) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (characteristic=QualityCharacteristic subCharacteristics+=QualitySubCharacteristic*)
	 */
	protected void sequence_QualitySpecification(EObject context, QualitySpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute* (start=ID end=ID)?)
	 */
	protected void sequence_Relationship_(EObject context, Relationship_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute* entities+=Entity*)
	 */
	protected void sequence_Schema(EObject context, Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dataModel=DataModel? qualitySpecifications+=QualitySpecification* attributes+=Attribute* entities+=Entity*)
	 */
	protected void sequence_Set_(EObject context, Set_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute* entities+=Entity*)
	 */
	protected void sequence_Struct_(EObject context, Struct_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
