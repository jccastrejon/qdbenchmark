package fr.imag.qdbenchmark.serializer;

import com.google.inject.Inject;
import fr.imag.qdbenchmark.services.QdBenchmarkDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QdBenchmarkDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QdBenchmarkDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_CommaKeyword_2_q;
	protected AbstractElementAlias match_QualitySpecification___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Relationship__CommaKeyword_4_q;
	protected AbstractElementAlias match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Set__CommaKeyword_6_q;
	protected AbstractElementAlias match_Set____LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Set____LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q;
	protected AbstractElementAlias match_Set____NumberSignKeyword_3_0_NumberSignKeyword_3_2__q;
	protected AbstractElementAlias match_Struct__CommaKeyword_4_q;
	protected AbstractElementAlias match_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QdBenchmarkDslGrammarAccess) access;
		match_Attribute_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getCommaKeyword_2());
		match_QualitySpecification___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_1_2()));
		match_Relationship__CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getRelationship_Access().getCommaKeyword_4());
		match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2()));
		match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_1_2()));
		match_Set__CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getSet_Access().getCommaKeyword_6());
		match_Set____LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getSet_Access().getRightCurlyBracketKeyword_5_2()));
		match_Set____LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSet_Access().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSet_Access().getRightSquareBracketKeyword_4_2()));
		match_Set____NumberSignKeyword_3_0_NumberSignKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSet_Access().getNumberSignKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSet_Access().getNumberSignKeyword_3_2()));
		match_Struct__CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getStruct_Access().getCommaKeyword_4());
		match_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2()));
		match_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Attribute_CommaKeyword_2_q.equals(syntax))
				emit_Attribute_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QualitySpecification___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_QualitySpecification___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Relationship__CommaKeyword_4_q.equals(syntax))
				emit_Relationship__CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set__CommaKeyword_6_q.equals(syntax))
				emit_Set__CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set____LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Set____LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set____LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q.equals(syntax))
				emit_Set____LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set____NumberSignKeyword_3_0_NumberSignKeyword_3_2__q.equals(syntax))
				emit_Set____NumberSignKeyword_3_0_NumberSignKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct__CommaKeyword_4_q.equals(syntax))
				emit_Struct__CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Attribute_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_QualitySpecification___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Relationship__CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Set__CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Set____LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Set____LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('#' '#')?
	 */
	protected void emit_Set____NumberSignKeyword_3_0_NumberSignKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Struct__CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
