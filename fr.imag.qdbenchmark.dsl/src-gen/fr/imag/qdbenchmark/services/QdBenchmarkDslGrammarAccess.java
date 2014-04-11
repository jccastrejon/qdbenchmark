/*
* generated by Xtext
*/
package fr.imag.qdbenchmark.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QdBenchmarkDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SchemaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Schema");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_1_1_0 = (RuleCall)cAttributesAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cEntitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntitiesEntityParserRuleCall_2_0 = (RuleCall)cEntitiesAssignment_2.eContents().get(0);
		
		//Schema:
		//	name=ID ("[" attributes+=Attribute* "]")? entities+=Entity*;
		public ParserRule getRule() { return rule; }

		//name=ID ("[" attributes+=Attribute* "]")? entities+=Entity*
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//("[" attributes+=Attribute* "]")?
		public Group getGroup_1() { return cGroup_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_1_1() { return cAttributesAssignment_1_1; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_1_1_0() { return cAttributesAttributeParserRuleCall_1_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_2() { return cEntitiesAssignment_2; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_2_0() { return cEntitiesEntityParserRuleCall_2_0; }
	}

	public class DataModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataModel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cKeyValueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cGraphKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDocumentKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cColumnFamilyKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cRelationalKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//DataModel:
		//	"KeyValue" | "Graph" | "Document" | "Column-Family" | "Relational";
		public ParserRule getRule() { return rule; }

		//"KeyValue" | "Graph" | "Document" | "Column-Family" | "Relational"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"KeyValue"
		public Keyword getKeyValueKeyword_0() { return cKeyValueKeyword_0; }

		//"Graph"
		public Keyword getGraphKeyword_1() { return cGraphKeyword_1; }

		//"Document"
		public Keyword getDocumentKeyword_2() { return cDocumentKeyword_2; }

		//"Column-Family"
		public Keyword getColumnFamilyKeyword_3() { return cColumnFamilyKeyword_3; }

		//"Relational"
		public Keyword getRelationalKeyword_4() { return cRelationalKeyword_4; }
	}

	public class QualityCharacteristicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualityCharacteristic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQualityCharacteristicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cReliabilityKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cPerformanceEfficiencyKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//QualityCharacteristic:
		//	"QualityCharacteristic" ("Reliability" | "PerformanceEfficiency");
		public ParserRule getRule() { return rule; }

		//"QualityCharacteristic" ("Reliability" | "PerformanceEfficiency")
		public Group getGroup() { return cGroup; }

		//"QualityCharacteristic"
		public Keyword getQualityCharacteristicKeyword_0() { return cQualityCharacteristicKeyword_0; }

		//"Reliability" | "PerformanceEfficiency"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"Reliability"
		public Keyword getReliabilityKeyword_1_0() { return cReliabilityKeyword_1_0; }

		//"PerformanceEfficiency"
		public Keyword getPerformanceEfficiencyKeyword_1_1() { return cPerformanceEfficiencyKeyword_1_1; }
	}

	public class QualitySubCharacteristicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualitySubCharacteristic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQualitySubCharacteristicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cMaturityKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cAvailabilityKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Keyword cFaultToleranceKeyword_1_2 = (Keyword)cAlternatives_1.eContents().get(2);
		private final Keyword cRecoverabilityKeyword_1_3 = (Keyword)cAlternatives_1.eContents().get(3);
		private final Keyword cTimeBehaviourKeyword_1_4 = (Keyword)cAlternatives_1.eContents().get(4);
		private final Keyword cResourceUtilisationKeyword_1_5 = (Keyword)cAlternatives_1.eContents().get(5);
		
		//QualitySubCharacteristic:
		//	"QualitySubCharacteristic" ("Maturity" | "Availability" | "FaultTolerance" | "Recoverability" | "TimeBehaviour" |
		//	"ResourceUtilisation");
		public ParserRule getRule() { return rule; }

		//"QualitySubCharacteristic" ("Maturity" | "Availability" | "FaultTolerance" | "Recoverability" | "TimeBehaviour" |
		//"ResourceUtilisation")
		public Group getGroup() { return cGroup; }

		//"QualitySubCharacteristic"
		public Keyword getQualitySubCharacteristicKeyword_0() { return cQualitySubCharacteristicKeyword_0; }

		//"Maturity" | "Availability" | "FaultTolerance" | "Recoverability" | "TimeBehaviour" | "ResourceUtilisation"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"Maturity"
		public Keyword getMaturityKeyword_1_0() { return cMaturityKeyword_1_0; }

		//"Availability"
		public Keyword getAvailabilityKeyword_1_1() { return cAvailabilityKeyword_1_1; }

		//"FaultTolerance"
		public Keyword getFaultToleranceKeyword_1_2() { return cFaultToleranceKeyword_1_2; }

		//"Recoverability"
		public Keyword getRecoverabilityKeyword_1_3() { return cRecoverabilityKeyword_1_3; }

		//"TimeBehaviour"
		public Keyword getTimeBehaviourKeyword_1_4() { return cTimeBehaviourKeyword_1_4; }

		//"ResourceUtilisation"
		public Keyword getResourceUtilisationKeyword_1_5() { return cResourceUtilisationKeyword_1_5; }
	}

	public class QualitySpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualitySpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCharacteristicAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCharacteristicQualityCharacteristicParserRuleCall_0_0 = (RuleCall)cCharacteristicAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSubCharacteristicsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0 = (RuleCall)cSubCharacteristicsAssignment_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//QualitySpecification:
		//	characteristic=QualityCharacteristic ("{" subCharacteristics+=QualitySubCharacteristic* "}")?;
		public ParserRule getRule() { return rule; }

		//characteristic=QualityCharacteristic ("{" subCharacteristics+=QualitySubCharacteristic* "}")?
		public Group getGroup() { return cGroup; }

		//characteristic=QualityCharacteristic
		public Assignment getCharacteristicAssignment_0() { return cCharacteristicAssignment_0; }

		//QualityCharacteristic
		public RuleCall getCharacteristicQualityCharacteristicParserRuleCall_0_0() { return cCharacteristicQualityCharacteristicParserRuleCall_0_0; }

		//("{" subCharacteristics+=QualitySubCharacteristic* "}")?
		public Group getGroup_1() { return cGroup_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }

		//subCharacteristics+=QualitySubCharacteristic*
		public Assignment getSubCharacteristicsAssignment_1_1() { return cSubCharacteristicsAssignment_1_1; }

		//QualitySubCharacteristic
		public RuleCall getSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0() { return cSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_1_2() { return cRightCurlyBracketKeyword_1_2; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSet_ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStruct_ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRelationship_ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Entity:
		//	Set_ | Struct_ | Relationship_;
		public ParserRule getRule() { return rule; }

		//Set_ | Struct_ | Relationship_
		public Alternatives getAlternatives() { return cAlternatives; }

		//Set_
		public RuleCall getSet_ParserRuleCall_0() { return cSet_ParserRuleCall_0; }

		//Struct_
		public RuleCall getStruct_ParserRuleCall_1() { return cStruct_ParserRuleCall_1; }

		//Relationship_
		public RuleCall getRelationship_ParserRuleCall_2() { return cRelationship_ParserRuleCall_2; }
	}

	public class Set_Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Set_");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLessThanSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDataModelAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDataModelDataModelParserRuleCall_2_1_0 = (RuleCall)cDataModelAssignment_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNumberSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cQualitySpecificationsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0 = (RuleCall)cQualitySpecificationsAssignment_3_1.eContents().get(0);
		private final Keyword cNumberSignKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftSquareBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAttributesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_4_1_0 = (RuleCall)cAttributesAssignment_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEntitiesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_5_1_0 = (RuleCall)cEntitiesAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Set_:
		//	"Set" name=ID ("<" dataModel=DataModel ">")? ("#" qualitySpecifications+=QualitySpecification* "#")? ("["
		//	attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?;
		public ParserRule getRule() { return rule; }

		//"Set" name=ID ("<" dataModel=DataModel ">")? ("#" qualitySpecifications+=QualitySpecification* "#")? ("["
		//attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?
		public Group getGroup() { return cGroup; }

		//"Set"
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("<" dataModel=DataModel ">")?
		public Group getGroup_2() { return cGroup_2; }

		//"<"
		public Keyword getLessThanSignKeyword_2_0() { return cLessThanSignKeyword_2_0; }

		//dataModel=DataModel
		public Assignment getDataModelAssignment_2_1() { return cDataModelAssignment_2_1; }

		//DataModel
		public RuleCall getDataModelDataModelParserRuleCall_2_1_0() { return cDataModelDataModelParserRuleCall_2_1_0; }

		//">"
		public Keyword getGreaterThanSignKeyword_2_2() { return cGreaterThanSignKeyword_2_2; }

		//("#" qualitySpecifications+=QualitySpecification* "#")?
		public Group getGroup_3() { return cGroup_3; }

		//"#"
		public Keyword getNumberSignKeyword_3_0() { return cNumberSignKeyword_3_0; }

		//qualitySpecifications+=QualitySpecification*
		public Assignment getQualitySpecificationsAssignment_3_1() { return cQualitySpecificationsAssignment_3_1; }

		//QualitySpecification
		public RuleCall getQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0() { return cQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0; }

		//"#"
		public Keyword getNumberSignKeyword_3_2() { return cNumberSignKeyword_3_2; }

		//("[" attributes+=Attribute* "]")?
		public Group getGroup_4() { return cGroup_4; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4_0() { return cLeftSquareBracketKeyword_4_0; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_4_1() { return cAttributesAssignment_4_1; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_4_1_0() { return cAttributesAttributeParserRuleCall_4_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4_2() { return cRightSquareBracketKeyword_4_2; }

		//("{" entities+=Entity* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_0() { return cLeftCurlyBracketKeyword_5_0; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_5_1() { return cEntitiesAssignment_5_1; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_5_1_0() { return cEntitiesEntityParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_2() { return cRightCurlyBracketKeyword_5_2; }

		//","?
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }
	}

	public class Struct_Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Struct_");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStructKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEntitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_3_1_0 = (RuleCall)cEntitiesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Struct_:
		//	"Struct" name=ID ("[" attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?;
		public ParserRule getRule() { return rule; }

		//"Struct" name=ID ("[" attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?
		public Group getGroup() { return cGroup; }

		//"Struct"
		public Keyword getStructKeyword_0() { return cStructKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("[" attributes+=Attribute* "]")?
		public Group getGroup_2() { return cGroup_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_1_0() { return cAttributesAttributeParserRuleCall_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }

		//("{" entities+=Entity* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_3_1() { return cEntitiesAssignment_3_1; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_3_1_0() { return cEntitiesEntityParserRuleCall_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_2() { return cRightCurlyBracketKeyword_3_2; }

		//","?
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}

	public class Relationship_Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Relationship_");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationshipKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cStartKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cStartAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final RuleCall cStartIDTerminalRuleCall_3_3_0 = (RuleCall)cStartAssignment_3_3.eContents().get(0);
		private final Keyword cEndKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cEqualsSignKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Assignment cEndAssignment_3_6 = (Assignment)cGroup_3.eContents().get(6);
		private final RuleCall cEndIDTerminalRuleCall_3_6_0 = (RuleCall)cEndAssignment_3_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_7 = (Keyword)cGroup_3.eContents().get(7);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Relationship_:
		//	"Relationship" name=ID ("[" attributes+=Attribute* "]")? ("{" "start" "=" start=ID "end" "=" end=ID "}")? ","?;
		public ParserRule getRule() { return rule; }

		//"Relationship" name=ID ("[" attributes+=Attribute* "]")? ("{" "start" "=" start=ID "end" "=" end=ID "}")? ","?
		public Group getGroup() { return cGroup; }

		//"Relationship"
		public Keyword getRelationshipKeyword_0() { return cRelationshipKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("[" attributes+=Attribute* "]")?
		public Group getGroup_2() { return cGroup_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_1_0() { return cAttributesAttributeParserRuleCall_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }

		//("{" "start" "=" start=ID "end" "=" end=ID "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }

		//"start"
		public Keyword getStartKeyword_3_1() { return cStartKeyword_3_1; }

		//"="
		public Keyword getEqualsSignKeyword_3_2() { return cEqualsSignKeyword_3_2; }

		//start=ID
		public Assignment getStartAssignment_3_3() { return cStartAssignment_3_3; }

		//ID
		public RuleCall getStartIDTerminalRuleCall_3_3_0() { return cStartIDTerminalRuleCall_3_3_0; }

		//"end"
		public Keyword getEndKeyword_3_4() { return cEndKeyword_3_4; }

		//"="
		public Keyword getEqualsSignKeyword_3_5() { return cEqualsSignKeyword_3_5; }

		//end=ID
		public Assignment getEndAssignment_3_6() { return cEndAssignment_3_6; }

		//ID
		public RuleCall getEndIDTerminalRuleCall_3_6_0() { return cEndIDTerminalRuleCall_3_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_7() { return cRightCurlyBracketKeyword_3_7; }

		//","?
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Attribute:
		//	name=ID ("=" value=STRING)? ","?;
		public ParserRule getRule() { return rule; }

		//name=ID ("=" value=STRING)? ","?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//("=" value=STRING)?
		public Group getGroup_1() { return cGroup_1; }

		//"="
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }

		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }

		//","?
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
	}
	
	
	private SchemaElements pSchema;
	private DataModelElements pDataModel;
	private QualityCharacteristicElements pQualityCharacteristic;
	private QualitySubCharacteristicElements pQualitySubCharacteristic;
	private QualitySpecificationElements pQualitySpecification;
	private EntityElements pEntity;
	private Set_Elements pSet_;
	private Struct_Elements pStruct_;
	private Relationship_Elements pRelationship_;
	private AttributeElements pAttribute;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public QdBenchmarkDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imag.qdbenchmark.QdBenchmarkDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Schema:
	//	name=ID ("[" attributes+=Attribute* "]")? entities+=Entity*;
	public SchemaElements getSchemaAccess() {
		return (pSchema != null) ? pSchema : (pSchema = new SchemaElements());
	}
	
	public ParserRule getSchemaRule() {
		return getSchemaAccess().getRule();
	}

	//DataModel:
	//	"KeyValue" | "Graph" | "Document" | "Column-Family" | "Relational";
	public DataModelElements getDataModelAccess() {
		return (pDataModel != null) ? pDataModel : (pDataModel = new DataModelElements());
	}
	
	public ParserRule getDataModelRule() {
		return getDataModelAccess().getRule();
	}

	//QualityCharacteristic:
	//	"QualityCharacteristic" ("Reliability" | "PerformanceEfficiency");
	public QualityCharacteristicElements getQualityCharacteristicAccess() {
		return (pQualityCharacteristic != null) ? pQualityCharacteristic : (pQualityCharacteristic = new QualityCharacteristicElements());
	}
	
	public ParserRule getQualityCharacteristicRule() {
		return getQualityCharacteristicAccess().getRule();
	}

	//QualitySubCharacteristic:
	//	"QualitySubCharacteristic" ("Maturity" | "Availability" | "FaultTolerance" | "Recoverability" | "TimeBehaviour" |
	//	"ResourceUtilisation");
	public QualitySubCharacteristicElements getQualitySubCharacteristicAccess() {
		return (pQualitySubCharacteristic != null) ? pQualitySubCharacteristic : (pQualitySubCharacteristic = new QualitySubCharacteristicElements());
	}
	
	public ParserRule getQualitySubCharacteristicRule() {
		return getQualitySubCharacteristicAccess().getRule();
	}

	//QualitySpecification:
	//	characteristic=QualityCharacteristic ("{" subCharacteristics+=QualitySubCharacteristic* "}")?;
	public QualitySpecificationElements getQualitySpecificationAccess() {
		return (pQualitySpecification != null) ? pQualitySpecification : (pQualitySpecification = new QualitySpecificationElements());
	}
	
	public ParserRule getQualitySpecificationRule() {
		return getQualitySpecificationAccess().getRule();
	}

	//Entity:
	//	Set_ | Struct_ | Relationship_;
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Set_:
	//	"Set" name=ID ("<" dataModel=DataModel ">")? ("#" qualitySpecifications+=QualitySpecification* "#")? ("["
	//	attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?;
	public Set_Elements getSet_Access() {
		return (pSet_ != null) ? pSet_ : (pSet_ = new Set_Elements());
	}
	
	public ParserRule getSet_Rule() {
		return getSet_Access().getRule();
	}

	//Struct_:
	//	"Struct" name=ID ("[" attributes+=Attribute* "]")? ("{" entities+=Entity* "}")? ","?;
	public Struct_Elements getStruct_Access() {
		return (pStruct_ != null) ? pStruct_ : (pStruct_ = new Struct_Elements());
	}
	
	public ParserRule getStruct_Rule() {
		return getStruct_Access().getRule();
	}

	//Relationship_:
	//	"Relationship" name=ID ("[" attributes+=Attribute* "]")? ("{" "start" "=" start=ID "end" "=" end=ID "}")? ","?;
	public Relationship_Elements getRelationship_Access() {
		return (pRelationship_ != null) ? pRelationship_ : (pRelationship_ = new Relationship_Elements());
	}
	
	public ParserRule getRelationship_Rule() {
		return getRelationship_Access().getRule();
	}

	//Attribute:
	//	name=ID ("=" value=STRING)? ","?;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
