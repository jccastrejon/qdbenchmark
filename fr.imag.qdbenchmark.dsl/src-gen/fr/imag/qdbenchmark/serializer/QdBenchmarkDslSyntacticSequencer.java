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
	protected AbstractElementAlias match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Set____LeftCurlyBracketKeyword_4_0_CommaKeyword_4_2_RightCurlyBracketKeyword_4_4__q;
	protected AbstractElementAlias match_Set____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QdBenchmarkDslGrammarAccess) access;
		match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2()));
		match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_1_2()));
		match_Set____LeftCurlyBracketKeyword_4_0_CommaKeyword_4_2_RightCurlyBracketKeyword_4_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSet_Access().getCommaKeyword_4_2()), new TokenAlias(false, false, grammarAccess.getSet_Access().getRightCurlyBracketKeyword_4_4()));
		match_Set____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSet_Access().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getSet_Access().getRightSquareBracketKeyword_2_2()));
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
			if(match_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Relationship____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q.equals(syntax))
				emit_Schema___LeftSquareBracketKeyword_1_0_RightSquareBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set____LeftCurlyBracketKeyword_4_0_CommaKeyword_4_2_RightCurlyBracketKeyword_4_4__q.equals(syntax))
				emit_Set____LeftCurlyBracketKeyword_4_0_CommaKeyword_4_2_RightCurlyBracketKeyword_4_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Set____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Set____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Struct____LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Struct____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	 *     ('{' ',' '}')?
	 */
	protected void emit_Set____LeftCurlyBracketKeyword_4_0_CommaKeyword_4_2_RightCurlyBracketKeyword_4_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Set____LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
