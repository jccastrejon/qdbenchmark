package fr.imag.qdbenchmark.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.imag.qdbenchmark.services.QdBenchmarkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQdBenchmarkDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KeyValue'", "'Graph'", "'Document'", "'Column-Family'", "'Relational'", "'Reliability'", "'PerformanceEfficiency'", "'Maturity'", "'Availability'", "'FaultTolerance'", "'Recoverability'", "'TimeBehaviour'", "'ResourceUtilisation'", "'['", "']'", "'QualityCharacteristic'", "'QualitySubCharacteristic'", "'{'", "'}'", "'Set'", "','", "'<'", "'>'", "'#'", "'Struct'", "'Relationship'", "'start'", "'='", "'end'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQdBenchmarkDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQdBenchmarkDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQdBenchmarkDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g"; }


     
     	private QdBenchmarkDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QdBenchmarkDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSchema"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:60:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:61:1: ( ruleSchema EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:62:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema61);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:69:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:73:2: ( ( ( rule__Schema__Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:74:1: ( ( rule__Schema__Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:74:1: ( ( rule__Schema__Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:75:1: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:76:1: ( rule__Schema__Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:76:2: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_rule__Schema__Group__0_in_ruleSchema94);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleDataModel"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:88:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:89:1: ( ruleDataModel EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:90:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel121);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:97:1: ruleDataModel : ( ( rule__DataModel__Alternatives ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:101:2: ( ( ( rule__DataModel__Alternatives ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:102:1: ( ( rule__DataModel__Alternatives ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:102:1: ( ( rule__DataModel__Alternatives ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:103:1: ( rule__DataModel__Alternatives )
            {
             before(grammarAccess.getDataModelAccess().getAlternatives()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:104:1: ( rule__DataModel__Alternatives )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:104:2: rule__DataModel__Alternatives
            {
            pushFollow(FOLLOW_rule__DataModel__Alternatives_in_ruleDataModel154);
            rule__DataModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleQualityCharacteristic"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:116:1: entryRuleQualityCharacteristic : ruleQualityCharacteristic EOF ;
    public final void entryRuleQualityCharacteristic() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:117:1: ( ruleQualityCharacteristic EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:118:1: ruleQualityCharacteristic EOF
            {
             before(grammarAccess.getQualityCharacteristicRule()); 
            pushFollow(FOLLOW_ruleQualityCharacteristic_in_entryRuleQualityCharacteristic181);
            ruleQualityCharacteristic();

            state._fsp--;

             after(grammarAccess.getQualityCharacteristicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityCharacteristic188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualityCharacteristic"


    // $ANTLR start "ruleQualityCharacteristic"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:125:1: ruleQualityCharacteristic : ( ( rule__QualityCharacteristic__Group__0 ) ) ;
    public final void ruleQualityCharacteristic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:129:2: ( ( ( rule__QualityCharacteristic__Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:130:1: ( ( rule__QualityCharacteristic__Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:130:1: ( ( rule__QualityCharacteristic__Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:131:1: ( rule__QualityCharacteristic__Group__0 )
            {
             before(grammarAccess.getQualityCharacteristicAccess().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:132:1: ( rule__QualityCharacteristic__Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:132:2: rule__QualityCharacteristic__Group__0
            {
            pushFollow(FOLLOW_rule__QualityCharacteristic__Group__0_in_ruleQualityCharacteristic214);
            rule__QualityCharacteristic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualityCharacteristicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityCharacteristic"


    // $ANTLR start "entryRuleQualitySubCharacteristic"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:144:1: entryRuleQualitySubCharacteristic : ruleQualitySubCharacteristic EOF ;
    public final void entryRuleQualitySubCharacteristic() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:145:1: ( ruleQualitySubCharacteristic EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:146:1: ruleQualitySubCharacteristic EOF
            {
             before(grammarAccess.getQualitySubCharacteristicRule()); 
            pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_entryRuleQualitySubCharacteristic241);
            ruleQualitySubCharacteristic();

            state._fsp--;

             after(grammarAccess.getQualitySubCharacteristicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitySubCharacteristic248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualitySubCharacteristic"


    // $ANTLR start "ruleQualitySubCharacteristic"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:153:1: ruleQualitySubCharacteristic : ( ( rule__QualitySubCharacteristic__Group__0 ) ) ;
    public final void ruleQualitySubCharacteristic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:157:2: ( ( ( rule__QualitySubCharacteristic__Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:158:1: ( ( rule__QualitySubCharacteristic__Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:158:1: ( ( rule__QualitySubCharacteristic__Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:159:1: ( rule__QualitySubCharacteristic__Group__0 )
            {
             before(grammarAccess.getQualitySubCharacteristicAccess().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:160:1: ( rule__QualitySubCharacteristic__Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:160:2: rule__QualitySubCharacteristic__Group__0
            {
            pushFollow(FOLLOW_rule__QualitySubCharacteristic__Group__0_in_ruleQualitySubCharacteristic274);
            rule__QualitySubCharacteristic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualitySubCharacteristicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualitySubCharacteristic"


    // $ANTLR start "entryRuleQualitySpecification"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:172:1: entryRuleQualitySpecification : ruleQualitySpecification EOF ;
    public final void entryRuleQualitySpecification() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:173:1: ( ruleQualitySpecification EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:174:1: ruleQualitySpecification EOF
            {
             before(grammarAccess.getQualitySpecificationRule()); 
            pushFollow(FOLLOW_ruleQualitySpecification_in_entryRuleQualitySpecification301);
            ruleQualitySpecification();

            state._fsp--;

             after(grammarAccess.getQualitySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitySpecification308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualitySpecification"


    // $ANTLR start "ruleQualitySpecification"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:181:1: ruleQualitySpecification : ( ( rule__QualitySpecification__Group__0 ) ) ;
    public final void ruleQualitySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:185:2: ( ( ( rule__QualitySpecification__Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:186:1: ( ( rule__QualitySpecification__Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:186:1: ( ( rule__QualitySpecification__Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:187:1: ( rule__QualitySpecification__Group__0 )
            {
             before(grammarAccess.getQualitySpecificationAccess().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:188:1: ( rule__QualitySpecification__Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:188:2: rule__QualitySpecification__Group__0
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__0_in_ruleQualitySpecification334);
            rule__QualitySpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualitySpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualitySpecification"


    // $ANTLR start "entryRuleEntity"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:200:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:201:1: ( ruleEntity EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:202:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity361);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:209:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:213:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:214:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:214:1: ( ( rule__Entity__Alternatives ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:215:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:216:1: ( rule__Entity__Alternatives )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:216:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity394);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSet_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:228:1: entryRuleSet_ : ruleSet_ EOF ;
    public final void entryRuleSet_() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:229:1: ( ruleSet_ EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:230:1: ruleSet_ EOF
            {
             before(grammarAccess.getSet_Rule()); 
            pushFollow(FOLLOW_ruleSet__in_entryRuleSet_421);
            ruleSet_();

            state._fsp--;

             after(grammarAccess.getSet_Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet_428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet_"


    // $ANTLR start "ruleSet_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:237:1: ruleSet_ : ( ( rule__Set___Group__0 ) ) ;
    public final void ruleSet_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:241:2: ( ( ( rule__Set___Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:242:1: ( ( rule__Set___Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:242:1: ( ( rule__Set___Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:243:1: ( rule__Set___Group__0 )
            {
             before(grammarAccess.getSet_Access().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:244:1: ( rule__Set___Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:244:2: rule__Set___Group__0
            {
            pushFollow(FOLLOW_rule__Set___Group__0_in_ruleSet_454);
            rule__Set___Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSet_Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet_"


    // $ANTLR start "entryRuleStruct_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:256:1: entryRuleStruct_ : ruleStruct_ EOF ;
    public final void entryRuleStruct_() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:257:1: ( ruleStruct_ EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:258:1: ruleStruct_ EOF
            {
             before(grammarAccess.getStruct_Rule()); 
            pushFollow(FOLLOW_ruleStruct__in_entryRuleStruct_481);
            ruleStruct_();

            state._fsp--;

             after(grammarAccess.getStruct_Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct_488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStruct_"


    // $ANTLR start "ruleStruct_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:265:1: ruleStruct_ : ( ( rule__Struct___Group__0 ) ) ;
    public final void ruleStruct_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:269:2: ( ( ( rule__Struct___Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:270:1: ( ( rule__Struct___Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:270:1: ( ( rule__Struct___Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:271:1: ( rule__Struct___Group__0 )
            {
             before(grammarAccess.getStruct_Access().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:272:1: ( rule__Struct___Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:272:2: rule__Struct___Group__0
            {
            pushFollow(FOLLOW_rule__Struct___Group__0_in_ruleStruct_514);
            rule__Struct___Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStruct_Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStruct_"


    // $ANTLR start "entryRuleRelationship_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:284:1: entryRuleRelationship_ : ruleRelationship_ EOF ;
    public final void entryRuleRelationship_() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:285:1: ( ruleRelationship_ EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:286:1: ruleRelationship_ EOF
            {
             before(grammarAccess.getRelationship_Rule()); 
            pushFollow(FOLLOW_ruleRelationship__in_entryRuleRelationship_541);
            ruleRelationship_();

            state._fsp--;

             after(grammarAccess.getRelationship_Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship_548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship_"


    // $ANTLR start "ruleRelationship_"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:293:1: ruleRelationship_ : ( ( rule__Relationship___Group__0 ) ) ;
    public final void ruleRelationship_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:297:2: ( ( ( rule__Relationship___Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:298:1: ( ( rule__Relationship___Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:298:1: ( ( rule__Relationship___Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:299:1: ( rule__Relationship___Group__0 )
            {
             before(grammarAccess.getRelationship_Access().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:300:1: ( rule__Relationship___Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:300:2: rule__Relationship___Group__0
            {
            pushFollow(FOLLOW_rule__Relationship___Group__0_in_ruleRelationship_574);
            rule__Relationship___Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationship_Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship_"


    // $ANTLR start "entryRuleAttribute"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:312:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:313:1: ( ruleAttribute EOF )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:314:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute601);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:321:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:325:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:327:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:328:1: ( rule__Attribute__Group__0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:328:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute634);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__DataModel__Alternatives"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:340:1: rule__DataModel__Alternatives : ( ( 'KeyValue' ) | ( 'Graph' ) | ( 'Document' ) | ( 'Column-Family' ) | ( 'Relational' ) );
    public final void rule__DataModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:344:1: ( ( 'KeyValue' ) | ( 'Graph' ) | ( 'Document' ) | ( 'Column-Family' ) | ( 'Relational' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:345:1: ( 'KeyValue' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:345:1: ( 'KeyValue' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:346:1: 'KeyValue'
                    {
                     before(grammarAccess.getDataModelAccess().getKeyValueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__DataModel__Alternatives671); 
                     after(grammarAccess.getDataModelAccess().getKeyValueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:353:6: ( 'Graph' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:353:6: ( 'Graph' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:354:1: 'Graph'
                    {
                     before(grammarAccess.getDataModelAccess().getGraphKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__DataModel__Alternatives691); 
                     after(grammarAccess.getDataModelAccess().getGraphKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:361:6: ( 'Document' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:361:6: ( 'Document' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:362:1: 'Document'
                    {
                     before(grammarAccess.getDataModelAccess().getDocumentKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__DataModel__Alternatives711); 
                     after(grammarAccess.getDataModelAccess().getDocumentKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:369:6: ( 'Column-Family' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:369:6: ( 'Column-Family' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:370:1: 'Column-Family'
                    {
                     before(grammarAccess.getDataModelAccess().getColumnFamilyKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__DataModel__Alternatives731); 
                     after(grammarAccess.getDataModelAccess().getColumnFamilyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:377:6: ( 'Relational' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:377:6: ( 'Relational' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:378:1: 'Relational'
                    {
                     before(grammarAccess.getDataModelAccess().getRelationalKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__DataModel__Alternatives751); 
                     after(grammarAccess.getDataModelAccess().getRelationalKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Alternatives"


    // $ANTLR start "rule__QualityCharacteristic__Alternatives_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:390:1: rule__QualityCharacteristic__Alternatives_1 : ( ( 'Reliability' ) | ( 'PerformanceEfficiency' ) );
    public final void rule__QualityCharacteristic__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:394:1: ( ( 'Reliability' ) | ( 'PerformanceEfficiency' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:395:1: ( 'Reliability' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:395:1: ( 'Reliability' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:396:1: 'Reliability'
                    {
                     before(grammarAccess.getQualityCharacteristicAccess().getReliabilityKeyword_1_0()); 
                    match(input,16,FOLLOW_16_in_rule__QualityCharacteristic__Alternatives_1786); 
                     after(grammarAccess.getQualityCharacteristicAccess().getReliabilityKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:403:6: ( 'PerformanceEfficiency' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:403:6: ( 'PerformanceEfficiency' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:404:1: 'PerformanceEfficiency'
                    {
                     before(grammarAccess.getQualityCharacteristicAccess().getPerformanceEfficiencyKeyword_1_1()); 
                    match(input,17,FOLLOW_17_in_rule__QualityCharacteristic__Alternatives_1806); 
                     after(grammarAccess.getQualityCharacteristicAccess().getPerformanceEfficiencyKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityCharacteristic__Alternatives_1"


    // $ANTLR start "rule__QualitySubCharacteristic__Alternatives_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:416:1: rule__QualitySubCharacteristic__Alternatives_1 : ( ( 'Maturity' ) | ( 'Availability' ) | ( 'FaultTolerance' ) | ( 'Recoverability' ) | ( 'TimeBehaviour' ) | ( 'ResourceUtilisation' ) );
    public final void rule__QualitySubCharacteristic__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:420:1: ( ( 'Maturity' ) | ( 'Availability' ) | ( 'FaultTolerance' ) | ( 'Recoverability' ) | ( 'TimeBehaviour' ) | ( 'ResourceUtilisation' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:421:1: ( 'Maturity' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:421:1: ( 'Maturity' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:422:1: 'Maturity'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getMaturityKeyword_1_0()); 
                    match(input,18,FOLLOW_18_in_rule__QualitySubCharacteristic__Alternatives_1841); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getMaturityKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:429:6: ( 'Availability' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:429:6: ( 'Availability' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:430:1: 'Availability'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getAvailabilityKeyword_1_1()); 
                    match(input,19,FOLLOW_19_in_rule__QualitySubCharacteristic__Alternatives_1861); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getAvailabilityKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:437:6: ( 'FaultTolerance' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:437:6: ( 'FaultTolerance' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:438:1: 'FaultTolerance'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getFaultToleranceKeyword_1_2()); 
                    match(input,20,FOLLOW_20_in_rule__QualitySubCharacteristic__Alternatives_1881); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getFaultToleranceKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:445:6: ( 'Recoverability' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:445:6: ( 'Recoverability' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:446:1: 'Recoverability'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getRecoverabilityKeyword_1_3()); 
                    match(input,21,FOLLOW_21_in_rule__QualitySubCharacteristic__Alternatives_1901); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getRecoverabilityKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:453:6: ( 'TimeBehaviour' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:453:6: ( 'TimeBehaviour' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:454:1: 'TimeBehaviour'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getTimeBehaviourKeyword_1_4()); 
                    match(input,22,FOLLOW_22_in_rule__QualitySubCharacteristic__Alternatives_1921); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getTimeBehaviourKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:461:6: ( 'ResourceUtilisation' )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:461:6: ( 'ResourceUtilisation' )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:462:1: 'ResourceUtilisation'
                    {
                     before(grammarAccess.getQualitySubCharacteristicAccess().getResourceUtilisationKeyword_1_5()); 
                    match(input,23,FOLLOW_23_in_rule__QualitySubCharacteristic__Alternatives_1941); 
                     after(grammarAccess.getQualitySubCharacteristicAccess().getResourceUtilisationKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySubCharacteristic__Alternatives_1"


    // $ANTLR start "rule__Entity__Alternatives"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:474:1: rule__Entity__Alternatives : ( ( ruleSet_ ) | ( ruleStruct_ ) | ( ruleRelationship_ ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:478:1: ( ( ruleSet_ ) | ( ruleStruct_ ) | ( ruleRelationship_ ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:479:1: ( ruleSet_ )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:479:1: ( ruleSet_ )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:480:1: ruleSet_
                    {
                     before(grammarAccess.getEntityAccess().getSet_ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSet__in_rule__Entity__Alternatives975);
                    ruleSet_();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getSet_ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:485:6: ( ruleStruct_ )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:485:6: ( ruleStruct_ )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:486:1: ruleStruct_
                    {
                     before(grammarAccess.getEntityAccess().getStruct_ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStruct__in_rule__Entity__Alternatives992);
                    ruleStruct_();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getStruct_ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:491:6: ( ruleRelationship_ )
                    {
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:491:6: ( ruleRelationship_ )
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:492:1: ruleRelationship_
                    {
                     before(grammarAccess.getEntityAccess().getRelationship_ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRelationship__in_rule__Entity__Alternatives1009);
                    ruleRelationship_();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getRelationship_ParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Schema__Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:504:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:508:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:509:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__01039);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__01042);
            rule__Schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:516:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__NameAssignment_0 ) ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:520:1: ( ( ( rule__Schema__NameAssignment_0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:521:1: ( ( rule__Schema__NameAssignment_0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:521:1: ( ( rule__Schema__NameAssignment_0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:522:1: ( rule__Schema__NameAssignment_0 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_0()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:523:1: ( rule__Schema__NameAssignment_0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:523:2: rule__Schema__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Schema__NameAssignment_0_in_rule__Schema__Group__0__Impl1069);
            rule__Schema__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:533:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:537:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:538:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__11099);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__11102);
            rule__Schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:545:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__Group_1__0 )? ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:549:1: ( ( ( rule__Schema__Group_1__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:550:1: ( ( rule__Schema__Group_1__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:550:1: ( ( rule__Schema__Group_1__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:551:1: ( rule__Schema__Group_1__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:552:1: ( rule__Schema__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:552:2: rule__Schema__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Schema__Group_1__0_in_rule__Schema__Group__1__Impl1129);
                    rule__Schema__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:562:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:566:1: ( rule__Schema__Group__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:567:2: rule__Schema__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__21160);
            rule__Schema__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:573:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__EntitiesAssignment_2 )* ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:577:1: ( ( ( rule__Schema__EntitiesAssignment_2 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:578:1: ( ( rule__Schema__EntitiesAssignment_2 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:578:1: ( ( rule__Schema__EntitiesAssignment_2 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:579:1: ( rule__Schema__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getSchemaAccess().getEntitiesAssignment_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:580:1: ( rule__Schema__EntitiesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==30||(LA6_0>=35 && LA6_0<=36)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:580:2: rule__Schema__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Schema__EntitiesAssignment_2_in_rule__Schema__Group__2__Impl1187);
            	    rule__Schema__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group_1__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:596:1: rule__Schema__Group_1__0 : rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1 ;
    public final void rule__Schema__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:600:1: ( rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:601:2: rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1
            {
            pushFollow(FOLLOW_rule__Schema__Group_1__0__Impl_in_rule__Schema__Group_1__01224);
            rule__Schema__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group_1__1_in_rule__Schema__Group_1__01227);
            rule__Schema__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__0"


    // $ANTLR start "rule__Schema__Group_1__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:608:1: rule__Schema__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Schema__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:612:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:613:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:613:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:614:1: '['
            {
             before(grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Schema__Group_1__0__Impl1255); 
             after(grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__0__Impl"


    // $ANTLR start "rule__Schema__Group_1__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:627:1: rule__Schema__Group_1__1 : rule__Schema__Group_1__1__Impl rule__Schema__Group_1__2 ;
    public final void rule__Schema__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:631:1: ( rule__Schema__Group_1__1__Impl rule__Schema__Group_1__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:632:2: rule__Schema__Group_1__1__Impl rule__Schema__Group_1__2
            {
            pushFollow(FOLLOW_rule__Schema__Group_1__1__Impl_in_rule__Schema__Group_1__11286);
            rule__Schema__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Schema__Group_1__2_in_rule__Schema__Group_1__11289);
            rule__Schema__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__1"


    // $ANTLR start "rule__Schema__Group_1__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:639:1: rule__Schema__Group_1__1__Impl : ( ( rule__Schema__AttributesAssignment_1_1 )* ) ;
    public final void rule__Schema__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:643:1: ( ( ( rule__Schema__AttributesAssignment_1_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:644:1: ( ( rule__Schema__AttributesAssignment_1_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:644:1: ( ( rule__Schema__AttributesAssignment_1_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:645:1: ( rule__Schema__AttributesAssignment_1_1 )*
            {
             before(grammarAccess.getSchemaAccess().getAttributesAssignment_1_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:646:1: ( rule__Schema__AttributesAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:646:2: rule__Schema__AttributesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Schema__AttributesAssignment_1_1_in_rule__Schema__Group_1__1__Impl1316);
            	    rule__Schema__AttributesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getAttributesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__1__Impl"


    // $ANTLR start "rule__Schema__Group_1__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:656:1: rule__Schema__Group_1__2 : rule__Schema__Group_1__2__Impl ;
    public final void rule__Schema__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:660:1: ( rule__Schema__Group_1__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:661:2: rule__Schema__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Schema__Group_1__2__Impl_in_rule__Schema__Group_1__21347);
            rule__Schema__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__2"


    // $ANTLR start "rule__Schema__Group_1__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:667:1: rule__Schema__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Schema__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:671:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:672:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:672:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:673:1: ']'
            {
             before(grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__Schema__Group_1__2__Impl1375); 
             after(grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__2__Impl"


    // $ANTLR start "rule__QualityCharacteristic__Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:692:1: rule__QualityCharacteristic__Group__0 : rule__QualityCharacteristic__Group__0__Impl rule__QualityCharacteristic__Group__1 ;
    public final void rule__QualityCharacteristic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:696:1: ( rule__QualityCharacteristic__Group__0__Impl rule__QualityCharacteristic__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:697:2: rule__QualityCharacteristic__Group__0__Impl rule__QualityCharacteristic__Group__1
            {
            pushFollow(FOLLOW_rule__QualityCharacteristic__Group__0__Impl_in_rule__QualityCharacteristic__Group__01412);
            rule__QualityCharacteristic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualityCharacteristic__Group__1_in_rule__QualityCharacteristic__Group__01415);
            rule__QualityCharacteristic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityCharacteristic__Group__0"


    // $ANTLR start "rule__QualityCharacteristic__Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:704:1: rule__QualityCharacteristic__Group__0__Impl : ( 'QualityCharacteristic' ) ;
    public final void rule__QualityCharacteristic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:708:1: ( ( 'QualityCharacteristic' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:709:1: ( 'QualityCharacteristic' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:709:1: ( 'QualityCharacteristic' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:710:1: 'QualityCharacteristic'
            {
             before(grammarAccess.getQualityCharacteristicAccess().getQualityCharacteristicKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__QualityCharacteristic__Group__0__Impl1443); 
             after(grammarAccess.getQualityCharacteristicAccess().getQualityCharacteristicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityCharacteristic__Group__0__Impl"


    // $ANTLR start "rule__QualityCharacteristic__Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:723:1: rule__QualityCharacteristic__Group__1 : rule__QualityCharacteristic__Group__1__Impl ;
    public final void rule__QualityCharacteristic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:727:1: ( rule__QualityCharacteristic__Group__1__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:728:2: rule__QualityCharacteristic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualityCharacteristic__Group__1__Impl_in_rule__QualityCharacteristic__Group__11474);
            rule__QualityCharacteristic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityCharacteristic__Group__1"


    // $ANTLR start "rule__QualityCharacteristic__Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:734:1: rule__QualityCharacteristic__Group__1__Impl : ( ( rule__QualityCharacteristic__Alternatives_1 ) ) ;
    public final void rule__QualityCharacteristic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:738:1: ( ( ( rule__QualityCharacteristic__Alternatives_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:739:1: ( ( rule__QualityCharacteristic__Alternatives_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:739:1: ( ( rule__QualityCharacteristic__Alternatives_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:740:1: ( rule__QualityCharacteristic__Alternatives_1 )
            {
             before(grammarAccess.getQualityCharacteristicAccess().getAlternatives_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:741:1: ( rule__QualityCharacteristic__Alternatives_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:741:2: rule__QualityCharacteristic__Alternatives_1
            {
            pushFollow(FOLLOW_rule__QualityCharacteristic__Alternatives_1_in_rule__QualityCharacteristic__Group__1__Impl1501);
            rule__QualityCharacteristic__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityCharacteristicAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityCharacteristic__Group__1__Impl"


    // $ANTLR start "rule__QualitySubCharacteristic__Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:755:1: rule__QualitySubCharacteristic__Group__0 : rule__QualitySubCharacteristic__Group__0__Impl rule__QualitySubCharacteristic__Group__1 ;
    public final void rule__QualitySubCharacteristic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:759:1: ( rule__QualitySubCharacteristic__Group__0__Impl rule__QualitySubCharacteristic__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:760:2: rule__QualitySubCharacteristic__Group__0__Impl rule__QualitySubCharacteristic__Group__1
            {
            pushFollow(FOLLOW_rule__QualitySubCharacteristic__Group__0__Impl_in_rule__QualitySubCharacteristic__Group__01535);
            rule__QualitySubCharacteristic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySubCharacteristic__Group__1_in_rule__QualitySubCharacteristic__Group__01538);
            rule__QualitySubCharacteristic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySubCharacteristic__Group__0"


    // $ANTLR start "rule__QualitySubCharacteristic__Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:767:1: rule__QualitySubCharacteristic__Group__0__Impl : ( 'QualitySubCharacteristic' ) ;
    public final void rule__QualitySubCharacteristic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:771:1: ( ( 'QualitySubCharacteristic' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:772:1: ( 'QualitySubCharacteristic' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:772:1: ( 'QualitySubCharacteristic' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:773:1: 'QualitySubCharacteristic'
            {
             before(grammarAccess.getQualitySubCharacteristicAccess().getQualitySubCharacteristicKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__QualitySubCharacteristic__Group__0__Impl1566); 
             after(grammarAccess.getQualitySubCharacteristicAccess().getQualitySubCharacteristicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySubCharacteristic__Group__0__Impl"


    // $ANTLR start "rule__QualitySubCharacteristic__Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:786:1: rule__QualitySubCharacteristic__Group__1 : rule__QualitySubCharacteristic__Group__1__Impl ;
    public final void rule__QualitySubCharacteristic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:790:1: ( rule__QualitySubCharacteristic__Group__1__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:791:2: rule__QualitySubCharacteristic__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualitySubCharacteristic__Group__1__Impl_in_rule__QualitySubCharacteristic__Group__11597);
            rule__QualitySubCharacteristic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySubCharacteristic__Group__1"


    // $ANTLR start "rule__QualitySubCharacteristic__Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:797:1: rule__QualitySubCharacteristic__Group__1__Impl : ( ( rule__QualitySubCharacteristic__Alternatives_1 ) ) ;
    public final void rule__QualitySubCharacteristic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:801:1: ( ( ( rule__QualitySubCharacteristic__Alternatives_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:802:1: ( ( rule__QualitySubCharacteristic__Alternatives_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:802:1: ( ( rule__QualitySubCharacteristic__Alternatives_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:803:1: ( rule__QualitySubCharacteristic__Alternatives_1 )
            {
             before(grammarAccess.getQualitySubCharacteristicAccess().getAlternatives_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:804:1: ( rule__QualitySubCharacteristic__Alternatives_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:804:2: rule__QualitySubCharacteristic__Alternatives_1
            {
            pushFollow(FOLLOW_rule__QualitySubCharacteristic__Alternatives_1_in_rule__QualitySubCharacteristic__Group__1__Impl1624);
            rule__QualitySubCharacteristic__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getQualitySubCharacteristicAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySubCharacteristic__Group__1__Impl"


    // $ANTLR start "rule__QualitySpecification__Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:818:1: rule__QualitySpecification__Group__0 : rule__QualitySpecification__Group__0__Impl rule__QualitySpecification__Group__1 ;
    public final void rule__QualitySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:822:1: ( rule__QualitySpecification__Group__0__Impl rule__QualitySpecification__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:823:2: rule__QualitySpecification__Group__0__Impl rule__QualitySpecification__Group__1
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__0__Impl_in_rule__QualitySpecification__Group__01658);
            rule__QualitySpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySpecification__Group__1_in_rule__QualitySpecification__Group__01661);
            rule__QualitySpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group__0"


    // $ANTLR start "rule__QualitySpecification__Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:830:1: rule__QualitySpecification__Group__0__Impl : ( ( rule__QualitySpecification__CharacteristicAssignment_0 ) ) ;
    public final void rule__QualitySpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:834:1: ( ( ( rule__QualitySpecification__CharacteristicAssignment_0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:835:1: ( ( rule__QualitySpecification__CharacteristicAssignment_0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:835:1: ( ( rule__QualitySpecification__CharacteristicAssignment_0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:836:1: ( rule__QualitySpecification__CharacteristicAssignment_0 )
            {
             before(grammarAccess.getQualitySpecificationAccess().getCharacteristicAssignment_0()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:837:1: ( rule__QualitySpecification__CharacteristicAssignment_0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:837:2: rule__QualitySpecification__CharacteristicAssignment_0
            {
            pushFollow(FOLLOW_rule__QualitySpecification__CharacteristicAssignment_0_in_rule__QualitySpecification__Group__0__Impl1688);
            rule__QualitySpecification__CharacteristicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualitySpecificationAccess().getCharacteristicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group__0__Impl"


    // $ANTLR start "rule__QualitySpecification__Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:847:1: rule__QualitySpecification__Group__1 : rule__QualitySpecification__Group__1__Impl ;
    public final void rule__QualitySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:851:1: ( rule__QualitySpecification__Group__1__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:852:2: rule__QualitySpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__1__Impl_in_rule__QualitySpecification__Group__11718);
            rule__QualitySpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group__1"


    // $ANTLR start "rule__QualitySpecification__Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:858:1: rule__QualitySpecification__Group__1__Impl : ( ( rule__QualitySpecification__Group_1__0 )? ) ;
    public final void rule__QualitySpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:862:1: ( ( ( rule__QualitySpecification__Group_1__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:863:1: ( ( rule__QualitySpecification__Group_1__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:863:1: ( ( rule__QualitySpecification__Group_1__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:864:1: ( rule__QualitySpecification__Group_1__0 )?
            {
             before(grammarAccess.getQualitySpecificationAccess().getGroup_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:865:1: ( rule__QualitySpecification__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:865:2: rule__QualitySpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualitySpecification__Group_1__0_in_rule__QualitySpecification__Group__1__Impl1745);
                    rule__QualitySpecification__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualitySpecificationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group__1__Impl"


    // $ANTLR start "rule__QualitySpecification__Group_1__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:879:1: rule__QualitySpecification__Group_1__0 : rule__QualitySpecification__Group_1__0__Impl rule__QualitySpecification__Group_1__1 ;
    public final void rule__QualitySpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:883:1: ( rule__QualitySpecification__Group_1__0__Impl rule__QualitySpecification__Group_1__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:884:2: rule__QualitySpecification__Group_1__0__Impl rule__QualitySpecification__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group_1__0__Impl_in_rule__QualitySpecification__Group_1__01780);
            rule__QualitySpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySpecification__Group_1__1_in_rule__QualitySpecification__Group_1__01783);
            rule__QualitySpecification__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__0"


    // $ANTLR start "rule__QualitySpecification__Group_1__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:891:1: rule__QualitySpecification__Group_1__0__Impl : ( '{' ) ;
    public final void rule__QualitySpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:895:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:896:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:896:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:897:1: '{'
            {
             before(grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualitySpecification__Group_1__0__Impl1811); 
             after(grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__0__Impl"


    // $ANTLR start "rule__QualitySpecification__Group_1__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:910:1: rule__QualitySpecification__Group_1__1 : rule__QualitySpecification__Group_1__1__Impl rule__QualitySpecification__Group_1__2 ;
    public final void rule__QualitySpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:914:1: ( rule__QualitySpecification__Group_1__1__Impl rule__QualitySpecification__Group_1__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:915:2: rule__QualitySpecification__Group_1__1__Impl rule__QualitySpecification__Group_1__2
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group_1__1__Impl_in_rule__QualitySpecification__Group_1__11842);
            rule__QualitySpecification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySpecification__Group_1__2_in_rule__QualitySpecification__Group_1__11845);
            rule__QualitySpecification__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__1"


    // $ANTLR start "rule__QualitySpecification__Group_1__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:922:1: rule__QualitySpecification__Group_1__1__Impl : ( ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )* ) ;
    public final void rule__QualitySpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:926:1: ( ( ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:927:1: ( ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:927:1: ( ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:928:1: ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )*
            {
             before(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsAssignment_1_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:929:1: ( rule__QualitySpecification__SubCharacteristicsAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:929:2: rule__QualitySpecification__SubCharacteristicsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__QualitySpecification__SubCharacteristicsAssignment_1_1_in_rule__QualitySpecification__Group_1__1__Impl1872);
            	    rule__QualitySpecification__SubCharacteristicsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__1__Impl"


    // $ANTLR start "rule__QualitySpecification__Group_1__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:939:1: rule__QualitySpecification__Group_1__2 : rule__QualitySpecification__Group_1__2__Impl ;
    public final void rule__QualitySpecification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:943:1: ( rule__QualitySpecification__Group_1__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:944:2: rule__QualitySpecification__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group_1__2__Impl_in_rule__QualitySpecification__Group_1__21903);
            rule__QualitySpecification__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__2"


    // $ANTLR start "rule__QualitySpecification__Group_1__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:950:1: rule__QualitySpecification__Group_1__2__Impl : ( '}' ) ;
    public final void rule__QualitySpecification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:954:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:955:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:955:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:956:1: '}'
            {
             before(grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,29,FOLLOW_29_in_rule__QualitySpecification__Group_1__2__Impl1931); 
             after(grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__Group_1__2__Impl"


    // $ANTLR start "rule__Set___Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:975:1: rule__Set___Group__0 : rule__Set___Group__0__Impl rule__Set___Group__1 ;
    public final void rule__Set___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:979:1: ( rule__Set___Group__0__Impl rule__Set___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:980:2: rule__Set___Group__0__Impl rule__Set___Group__1
            {
            pushFollow(FOLLOW_rule__Set___Group__0__Impl_in_rule__Set___Group__01968);
            rule__Set___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__1_in_rule__Set___Group__01971);
            rule__Set___Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__0"


    // $ANTLR start "rule__Set___Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:987:1: rule__Set___Group__0__Impl : ( 'Set' ) ;
    public final void rule__Set___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:991:1: ( ( 'Set' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:992:1: ( 'Set' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:992:1: ( 'Set' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:993:1: 'Set'
            {
             before(grammarAccess.getSet_Access().getSetKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Set___Group__0__Impl1999); 
             after(grammarAccess.getSet_Access().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__0__Impl"


    // $ANTLR start "rule__Set___Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1006:1: rule__Set___Group__1 : rule__Set___Group__1__Impl rule__Set___Group__2 ;
    public final void rule__Set___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1010:1: ( rule__Set___Group__1__Impl rule__Set___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1011:2: rule__Set___Group__1__Impl rule__Set___Group__2
            {
            pushFollow(FOLLOW_rule__Set___Group__1__Impl_in_rule__Set___Group__12030);
            rule__Set___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__2_in_rule__Set___Group__12033);
            rule__Set___Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__1"


    // $ANTLR start "rule__Set___Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1018:1: rule__Set___Group__1__Impl : ( ( rule__Set___NameAssignment_1 ) ) ;
    public final void rule__Set___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1022:1: ( ( ( rule__Set___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1023:1: ( ( rule__Set___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1023:1: ( ( rule__Set___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1024:1: ( rule__Set___NameAssignment_1 )
            {
             before(grammarAccess.getSet_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1025:1: ( rule__Set___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1025:2: rule__Set___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Set___NameAssignment_1_in_rule__Set___Group__1__Impl2060);
            rule__Set___NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSet_Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__1__Impl"


    // $ANTLR start "rule__Set___Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1035:1: rule__Set___Group__2 : rule__Set___Group__2__Impl rule__Set___Group__3 ;
    public final void rule__Set___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1039:1: ( rule__Set___Group__2__Impl rule__Set___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1040:2: rule__Set___Group__2__Impl rule__Set___Group__3
            {
            pushFollow(FOLLOW_rule__Set___Group__2__Impl_in_rule__Set___Group__22090);
            rule__Set___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__3_in_rule__Set___Group__22093);
            rule__Set___Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__2"


    // $ANTLR start "rule__Set___Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1047:1: rule__Set___Group__2__Impl : ( ( rule__Set___Group_2__0 )? ) ;
    public final void rule__Set___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1051:1: ( ( ( rule__Set___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1052:1: ( ( rule__Set___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1052:1: ( ( rule__Set___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1053:1: ( rule__Set___Group_2__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1054:1: ( rule__Set___Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1054:2: rule__Set___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_2__0_in_rule__Set___Group__2__Impl2120);
                    rule__Set___Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSet_Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__2__Impl"


    // $ANTLR start "rule__Set___Group__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1064:1: rule__Set___Group__3 : rule__Set___Group__3__Impl rule__Set___Group__4 ;
    public final void rule__Set___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1068:1: ( rule__Set___Group__3__Impl rule__Set___Group__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1069:2: rule__Set___Group__3__Impl rule__Set___Group__4
            {
            pushFollow(FOLLOW_rule__Set___Group__3__Impl_in_rule__Set___Group__32151);
            rule__Set___Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__4_in_rule__Set___Group__32154);
            rule__Set___Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__3"


    // $ANTLR start "rule__Set___Group__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1076:1: rule__Set___Group__3__Impl : ( ( rule__Set___Group_3__0 )? ) ;
    public final void rule__Set___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1080:1: ( ( ( rule__Set___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1081:1: ( ( rule__Set___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1081:1: ( ( rule__Set___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1082:1: ( rule__Set___Group_3__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1083:1: ( rule__Set___Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1083:2: rule__Set___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_3__0_in_rule__Set___Group__3__Impl2181);
                    rule__Set___Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSet_Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__3__Impl"


    // $ANTLR start "rule__Set___Group__4"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1093:1: rule__Set___Group__4 : rule__Set___Group__4__Impl rule__Set___Group__5 ;
    public final void rule__Set___Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1097:1: ( rule__Set___Group__4__Impl rule__Set___Group__5 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1098:2: rule__Set___Group__4__Impl rule__Set___Group__5
            {
            pushFollow(FOLLOW_rule__Set___Group__4__Impl_in_rule__Set___Group__42212);
            rule__Set___Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__5_in_rule__Set___Group__42215);
            rule__Set___Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__4"


    // $ANTLR start "rule__Set___Group__4__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1105:1: rule__Set___Group__4__Impl : ( ( rule__Set___Group_4__0 )? ) ;
    public final void rule__Set___Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1109:1: ( ( ( rule__Set___Group_4__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1110:1: ( ( rule__Set___Group_4__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1110:1: ( ( rule__Set___Group_4__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1111:1: ( rule__Set___Group_4__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_4()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1112:1: ( rule__Set___Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1112:2: rule__Set___Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_4__0_in_rule__Set___Group__4__Impl2242);
                    rule__Set___Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSet_Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__4__Impl"


    // $ANTLR start "rule__Set___Group__5"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1122:1: rule__Set___Group__5 : rule__Set___Group__5__Impl rule__Set___Group__6 ;
    public final void rule__Set___Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1126:1: ( rule__Set___Group__5__Impl rule__Set___Group__6 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1127:2: rule__Set___Group__5__Impl rule__Set___Group__6
            {
            pushFollow(FOLLOW_rule__Set___Group__5__Impl_in_rule__Set___Group__52273);
            rule__Set___Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__6_in_rule__Set___Group__52276);
            rule__Set___Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__5"


    // $ANTLR start "rule__Set___Group__5__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1134:1: rule__Set___Group__5__Impl : ( ( rule__Set___Group_5__0 )? ) ;
    public final void rule__Set___Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1138:1: ( ( ( rule__Set___Group_5__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1139:1: ( ( rule__Set___Group_5__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1139:1: ( ( rule__Set___Group_5__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1140:1: ( rule__Set___Group_5__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_5()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1141:1: ( rule__Set___Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1141:2: rule__Set___Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_5__0_in_rule__Set___Group__5__Impl2303);
                    rule__Set___Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSet_Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__5__Impl"


    // $ANTLR start "rule__Set___Group__6"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1151:1: rule__Set___Group__6 : rule__Set___Group__6__Impl ;
    public final void rule__Set___Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1155:1: ( rule__Set___Group__6__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1156:2: rule__Set___Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group__6__Impl_in_rule__Set___Group__62334);
            rule__Set___Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__6"


    // $ANTLR start "rule__Set___Group__6__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1162:1: rule__Set___Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Set___Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1166:1: ( ( ( ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1167:1: ( ( ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1167:1: ( ( ',' )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1168:1: ( ',' )?
            {
             before(grammarAccess.getSet_Access().getCommaKeyword_6()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1169:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1170:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Set___Group__6__Impl2363); 

                    }
                    break;

            }

             after(grammarAccess.getSet_Access().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group__6__Impl"


    // $ANTLR start "rule__Set___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1195:1: rule__Set___Group_2__0 : rule__Set___Group_2__0__Impl rule__Set___Group_2__1 ;
    public final void rule__Set___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1199:1: ( rule__Set___Group_2__0__Impl rule__Set___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1200:2: rule__Set___Group_2__0__Impl rule__Set___Group_2__1
            {
            pushFollow(FOLLOW_rule__Set___Group_2__0__Impl_in_rule__Set___Group_2__02410);
            rule__Set___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_2__1_in_rule__Set___Group_2__02413);
            rule__Set___Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__0"


    // $ANTLR start "rule__Set___Group_2__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1207:1: rule__Set___Group_2__0__Impl : ( '<' ) ;
    public final void rule__Set___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1211:1: ( ( '<' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1212:1: ( '<' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1212:1: ( '<' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1213:1: '<'
            {
             before(grammarAccess.getSet_Access().getLessThanSignKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Set___Group_2__0__Impl2441); 
             after(grammarAccess.getSet_Access().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__0__Impl"


    // $ANTLR start "rule__Set___Group_2__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1226:1: rule__Set___Group_2__1 : rule__Set___Group_2__1__Impl rule__Set___Group_2__2 ;
    public final void rule__Set___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1230:1: ( rule__Set___Group_2__1__Impl rule__Set___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1231:2: rule__Set___Group_2__1__Impl rule__Set___Group_2__2
            {
            pushFollow(FOLLOW_rule__Set___Group_2__1__Impl_in_rule__Set___Group_2__12472);
            rule__Set___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_2__2_in_rule__Set___Group_2__12475);
            rule__Set___Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__1"


    // $ANTLR start "rule__Set___Group_2__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1238:1: rule__Set___Group_2__1__Impl : ( ( rule__Set___DataModelAssignment_2_1 ) ) ;
    public final void rule__Set___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1242:1: ( ( ( rule__Set___DataModelAssignment_2_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1243:1: ( ( rule__Set___DataModelAssignment_2_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1243:1: ( ( rule__Set___DataModelAssignment_2_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1244:1: ( rule__Set___DataModelAssignment_2_1 )
            {
             before(grammarAccess.getSet_Access().getDataModelAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1245:1: ( rule__Set___DataModelAssignment_2_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1245:2: rule__Set___DataModelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Set___DataModelAssignment_2_1_in_rule__Set___Group_2__1__Impl2502);
            rule__Set___DataModelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSet_Access().getDataModelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__1__Impl"


    // $ANTLR start "rule__Set___Group_2__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1255:1: rule__Set___Group_2__2 : rule__Set___Group_2__2__Impl ;
    public final void rule__Set___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1259:1: ( rule__Set___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1260:2: rule__Set___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_2__2__Impl_in_rule__Set___Group_2__22532);
            rule__Set___Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__2"


    // $ANTLR start "rule__Set___Group_2__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1266:1: rule__Set___Group_2__2__Impl : ( '>' ) ;
    public final void rule__Set___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1270:1: ( ( '>' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1271:1: ( '>' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1271:1: ( '>' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1272:1: '>'
            {
             before(grammarAccess.getSet_Access().getGreaterThanSignKeyword_2_2()); 
            match(input,33,FOLLOW_33_in_rule__Set___Group_2__2__Impl2560); 
             after(grammarAccess.getSet_Access().getGreaterThanSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_2__2__Impl"


    // $ANTLR start "rule__Set___Group_3__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1291:1: rule__Set___Group_3__0 : rule__Set___Group_3__0__Impl rule__Set___Group_3__1 ;
    public final void rule__Set___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1295:1: ( rule__Set___Group_3__0__Impl rule__Set___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1296:2: rule__Set___Group_3__0__Impl rule__Set___Group_3__1
            {
            pushFollow(FOLLOW_rule__Set___Group_3__0__Impl_in_rule__Set___Group_3__02597);
            rule__Set___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_3__1_in_rule__Set___Group_3__02600);
            rule__Set___Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__0"


    // $ANTLR start "rule__Set___Group_3__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1303:1: rule__Set___Group_3__0__Impl : ( '#' ) ;
    public final void rule__Set___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1307:1: ( ( '#' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1308:1: ( '#' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1308:1: ( '#' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1309:1: '#'
            {
             before(grammarAccess.getSet_Access().getNumberSignKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Set___Group_3__0__Impl2628); 
             after(grammarAccess.getSet_Access().getNumberSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__0__Impl"


    // $ANTLR start "rule__Set___Group_3__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1322:1: rule__Set___Group_3__1 : rule__Set___Group_3__1__Impl rule__Set___Group_3__2 ;
    public final void rule__Set___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1326:1: ( rule__Set___Group_3__1__Impl rule__Set___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1327:2: rule__Set___Group_3__1__Impl rule__Set___Group_3__2
            {
            pushFollow(FOLLOW_rule__Set___Group_3__1__Impl_in_rule__Set___Group_3__12659);
            rule__Set___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_3__2_in_rule__Set___Group_3__12662);
            rule__Set___Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__1"


    // $ANTLR start "rule__Set___Group_3__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1334:1: rule__Set___Group_3__1__Impl : ( ( rule__Set___QualitySpecificationsAssignment_3_1 )* ) ;
    public final void rule__Set___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1338:1: ( ( ( rule__Set___QualitySpecificationsAssignment_3_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1339:1: ( ( rule__Set___QualitySpecificationsAssignment_3_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1339:1: ( ( rule__Set___QualitySpecificationsAssignment_3_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1340:1: ( rule__Set___QualitySpecificationsAssignment_3_1 )*
            {
             before(grammarAccess.getSet_Access().getQualitySpecificationsAssignment_3_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1341:1: ( rule__Set___QualitySpecificationsAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1341:2: rule__Set___QualitySpecificationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Set___QualitySpecificationsAssignment_3_1_in_rule__Set___Group_3__1__Impl2689);
            	    rule__Set___QualitySpecificationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getQualitySpecificationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__1__Impl"


    // $ANTLR start "rule__Set___Group_3__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1351:1: rule__Set___Group_3__2 : rule__Set___Group_3__2__Impl ;
    public final void rule__Set___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1355:1: ( rule__Set___Group_3__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1356:2: rule__Set___Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_3__2__Impl_in_rule__Set___Group_3__22720);
            rule__Set___Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__2"


    // $ANTLR start "rule__Set___Group_3__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1362:1: rule__Set___Group_3__2__Impl : ( '#' ) ;
    public final void rule__Set___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1366:1: ( ( '#' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1367:1: ( '#' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1367:1: ( '#' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1368:1: '#'
            {
             before(grammarAccess.getSet_Access().getNumberSignKeyword_3_2()); 
            match(input,34,FOLLOW_34_in_rule__Set___Group_3__2__Impl2748); 
             after(grammarAccess.getSet_Access().getNumberSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_3__2__Impl"


    // $ANTLR start "rule__Set___Group_4__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1387:1: rule__Set___Group_4__0 : rule__Set___Group_4__0__Impl rule__Set___Group_4__1 ;
    public final void rule__Set___Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1391:1: ( rule__Set___Group_4__0__Impl rule__Set___Group_4__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1392:2: rule__Set___Group_4__0__Impl rule__Set___Group_4__1
            {
            pushFollow(FOLLOW_rule__Set___Group_4__0__Impl_in_rule__Set___Group_4__02785);
            rule__Set___Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__1_in_rule__Set___Group_4__02788);
            rule__Set___Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__0"


    // $ANTLR start "rule__Set___Group_4__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1399:1: rule__Set___Group_4__0__Impl : ( '[' ) ;
    public final void rule__Set___Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1403:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1404:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1404:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1405:1: '['
            {
             before(grammarAccess.getSet_Access().getLeftSquareBracketKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Set___Group_4__0__Impl2816); 
             after(grammarAccess.getSet_Access().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__0__Impl"


    // $ANTLR start "rule__Set___Group_4__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1418:1: rule__Set___Group_4__1 : rule__Set___Group_4__1__Impl rule__Set___Group_4__2 ;
    public final void rule__Set___Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1422:1: ( rule__Set___Group_4__1__Impl rule__Set___Group_4__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1423:2: rule__Set___Group_4__1__Impl rule__Set___Group_4__2
            {
            pushFollow(FOLLOW_rule__Set___Group_4__1__Impl_in_rule__Set___Group_4__12847);
            rule__Set___Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__2_in_rule__Set___Group_4__12850);
            rule__Set___Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__1"


    // $ANTLR start "rule__Set___Group_4__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1430:1: rule__Set___Group_4__1__Impl : ( ( rule__Set___AttributesAssignment_4_1 )* ) ;
    public final void rule__Set___Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1434:1: ( ( ( rule__Set___AttributesAssignment_4_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1435:1: ( ( rule__Set___AttributesAssignment_4_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1435:1: ( ( rule__Set___AttributesAssignment_4_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1436:1: ( rule__Set___AttributesAssignment_4_1 )*
            {
             before(grammarAccess.getSet_Access().getAttributesAssignment_4_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1437:1: ( rule__Set___AttributesAssignment_4_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1437:2: rule__Set___AttributesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Set___AttributesAssignment_4_1_in_rule__Set___Group_4__1__Impl2877);
            	    rule__Set___AttributesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__1__Impl"


    // $ANTLR start "rule__Set___Group_4__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1447:1: rule__Set___Group_4__2 : rule__Set___Group_4__2__Impl ;
    public final void rule__Set___Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1451:1: ( rule__Set___Group_4__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1452:2: rule__Set___Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_4__2__Impl_in_rule__Set___Group_4__22908);
            rule__Set___Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__2"


    // $ANTLR start "rule__Set___Group_4__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1458:1: rule__Set___Group_4__2__Impl : ( ']' ) ;
    public final void rule__Set___Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1462:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1463:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1463:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1464:1: ']'
            {
             before(grammarAccess.getSet_Access().getRightSquareBracketKeyword_4_2()); 
            match(input,25,FOLLOW_25_in_rule__Set___Group_4__2__Impl2936); 
             after(grammarAccess.getSet_Access().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_4__2__Impl"


    // $ANTLR start "rule__Set___Group_5__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1483:1: rule__Set___Group_5__0 : rule__Set___Group_5__0__Impl rule__Set___Group_5__1 ;
    public final void rule__Set___Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1487:1: ( rule__Set___Group_5__0__Impl rule__Set___Group_5__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1488:2: rule__Set___Group_5__0__Impl rule__Set___Group_5__1
            {
            pushFollow(FOLLOW_rule__Set___Group_5__0__Impl_in_rule__Set___Group_5__02973);
            rule__Set___Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_5__1_in_rule__Set___Group_5__02976);
            rule__Set___Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__0"


    // $ANTLR start "rule__Set___Group_5__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1495:1: rule__Set___Group_5__0__Impl : ( '{' ) ;
    public final void rule__Set___Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1499:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1500:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1500:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1501:1: '{'
            {
             before(grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__Set___Group_5__0__Impl3004); 
             after(grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__0__Impl"


    // $ANTLR start "rule__Set___Group_5__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1514:1: rule__Set___Group_5__1 : rule__Set___Group_5__1__Impl rule__Set___Group_5__2 ;
    public final void rule__Set___Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1518:1: ( rule__Set___Group_5__1__Impl rule__Set___Group_5__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1519:2: rule__Set___Group_5__1__Impl rule__Set___Group_5__2
            {
            pushFollow(FOLLOW_rule__Set___Group_5__1__Impl_in_rule__Set___Group_5__13035);
            rule__Set___Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_5__2_in_rule__Set___Group_5__13038);
            rule__Set___Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__1"


    // $ANTLR start "rule__Set___Group_5__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1526:1: rule__Set___Group_5__1__Impl : ( ( rule__Set___EntitiesAssignment_5_1 )* ) ;
    public final void rule__Set___Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1530:1: ( ( ( rule__Set___EntitiesAssignment_5_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1531:1: ( ( rule__Set___EntitiesAssignment_5_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1531:1: ( ( rule__Set___EntitiesAssignment_5_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1532:1: ( rule__Set___EntitiesAssignment_5_1 )*
            {
             before(grammarAccess.getSet_Access().getEntitiesAssignment_5_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1533:1: ( rule__Set___EntitiesAssignment_5_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30||(LA17_0>=35 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1533:2: rule__Set___EntitiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Set___EntitiesAssignment_5_1_in_rule__Set___Group_5__1__Impl3065);
            	    rule__Set___EntitiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getEntitiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__1__Impl"


    // $ANTLR start "rule__Set___Group_5__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1543:1: rule__Set___Group_5__2 : rule__Set___Group_5__2__Impl ;
    public final void rule__Set___Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1547:1: ( rule__Set___Group_5__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1548:2: rule__Set___Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_5__2__Impl_in_rule__Set___Group_5__23096);
            rule__Set___Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__2"


    // $ANTLR start "rule__Set___Group_5__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1554:1: rule__Set___Group_5__2__Impl : ( '}' ) ;
    public final void rule__Set___Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1558:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1559:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1559:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1560:1: '}'
            {
             before(grammarAccess.getSet_Access().getRightCurlyBracketKeyword_5_2()); 
            match(input,29,FOLLOW_29_in_rule__Set___Group_5__2__Impl3124); 
             after(grammarAccess.getSet_Access().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___Group_5__2__Impl"


    // $ANTLR start "rule__Struct___Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1579:1: rule__Struct___Group__0 : rule__Struct___Group__0__Impl rule__Struct___Group__1 ;
    public final void rule__Struct___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1583:1: ( rule__Struct___Group__0__Impl rule__Struct___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1584:2: rule__Struct___Group__0__Impl rule__Struct___Group__1
            {
            pushFollow(FOLLOW_rule__Struct___Group__0__Impl_in_rule__Struct___Group__03161);
            rule__Struct___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__1_in_rule__Struct___Group__03164);
            rule__Struct___Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__0"


    // $ANTLR start "rule__Struct___Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1591:1: rule__Struct___Group__0__Impl : ( 'Struct' ) ;
    public final void rule__Struct___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1595:1: ( ( 'Struct' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1596:1: ( 'Struct' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1596:1: ( 'Struct' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1597:1: 'Struct'
            {
             before(grammarAccess.getStruct_Access().getStructKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Struct___Group__0__Impl3192); 
             after(grammarAccess.getStruct_Access().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__0__Impl"


    // $ANTLR start "rule__Struct___Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1610:1: rule__Struct___Group__1 : rule__Struct___Group__1__Impl rule__Struct___Group__2 ;
    public final void rule__Struct___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1614:1: ( rule__Struct___Group__1__Impl rule__Struct___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1615:2: rule__Struct___Group__1__Impl rule__Struct___Group__2
            {
            pushFollow(FOLLOW_rule__Struct___Group__1__Impl_in_rule__Struct___Group__13223);
            rule__Struct___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__2_in_rule__Struct___Group__13226);
            rule__Struct___Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__1"


    // $ANTLR start "rule__Struct___Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1622:1: rule__Struct___Group__1__Impl : ( ( rule__Struct___NameAssignment_1 ) ) ;
    public final void rule__Struct___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1626:1: ( ( ( rule__Struct___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1627:1: ( ( rule__Struct___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1627:1: ( ( rule__Struct___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1628:1: ( rule__Struct___NameAssignment_1 )
            {
             before(grammarAccess.getStruct_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1629:1: ( rule__Struct___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1629:2: rule__Struct___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Struct___NameAssignment_1_in_rule__Struct___Group__1__Impl3253);
            rule__Struct___NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStruct_Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__1__Impl"


    // $ANTLR start "rule__Struct___Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1639:1: rule__Struct___Group__2 : rule__Struct___Group__2__Impl rule__Struct___Group__3 ;
    public final void rule__Struct___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1643:1: ( rule__Struct___Group__2__Impl rule__Struct___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1644:2: rule__Struct___Group__2__Impl rule__Struct___Group__3
            {
            pushFollow(FOLLOW_rule__Struct___Group__2__Impl_in_rule__Struct___Group__23283);
            rule__Struct___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__3_in_rule__Struct___Group__23286);
            rule__Struct___Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__2"


    // $ANTLR start "rule__Struct___Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1651:1: rule__Struct___Group__2__Impl : ( ( rule__Struct___Group_2__0 )? ) ;
    public final void rule__Struct___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1655:1: ( ( ( rule__Struct___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1656:1: ( ( rule__Struct___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1656:1: ( ( rule__Struct___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1657:1: ( rule__Struct___Group_2__0 )?
            {
             before(grammarAccess.getStruct_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1658:1: ( rule__Struct___Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1658:2: rule__Struct___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Struct___Group_2__0_in_rule__Struct___Group__2__Impl3313);
                    rule__Struct___Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStruct_Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__2__Impl"


    // $ANTLR start "rule__Struct___Group__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1668:1: rule__Struct___Group__3 : rule__Struct___Group__3__Impl rule__Struct___Group__4 ;
    public final void rule__Struct___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1672:1: ( rule__Struct___Group__3__Impl rule__Struct___Group__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1673:2: rule__Struct___Group__3__Impl rule__Struct___Group__4
            {
            pushFollow(FOLLOW_rule__Struct___Group__3__Impl_in_rule__Struct___Group__33344);
            rule__Struct___Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__4_in_rule__Struct___Group__33347);
            rule__Struct___Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__3"


    // $ANTLR start "rule__Struct___Group__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1680:1: rule__Struct___Group__3__Impl : ( ( rule__Struct___Group_3__0 )? ) ;
    public final void rule__Struct___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1684:1: ( ( ( rule__Struct___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1685:1: ( ( rule__Struct___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1685:1: ( ( rule__Struct___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1686:1: ( rule__Struct___Group_3__0 )?
            {
             before(grammarAccess.getStruct_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1687:1: ( rule__Struct___Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1687:2: rule__Struct___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Struct___Group_3__0_in_rule__Struct___Group__3__Impl3374);
                    rule__Struct___Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStruct_Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__3__Impl"


    // $ANTLR start "rule__Struct___Group__4"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1697:1: rule__Struct___Group__4 : rule__Struct___Group__4__Impl ;
    public final void rule__Struct___Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1701:1: ( rule__Struct___Group__4__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1702:2: rule__Struct___Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group__4__Impl_in_rule__Struct___Group__43405);
            rule__Struct___Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__4"


    // $ANTLR start "rule__Struct___Group__4__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1708:1: rule__Struct___Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__Struct___Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1712:1: ( ( ( ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1713:1: ( ( ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1713:1: ( ( ',' )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1714:1: ( ',' )?
            {
             before(grammarAccess.getStruct_Access().getCommaKeyword_4()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1715:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1716:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Struct___Group__4__Impl3434); 

                    }
                    break;

            }

             after(grammarAccess.getStruct_Access().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group__4__Impl"


    // $ANTLR start "rule__Struct___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1737:1: rule__Struct___Group_2__0 : rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1 ;
    public final void rule__Struct___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1741:1: ( rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1742:2: rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__0__Impl_in_rule__Struct___Group_2__03477);
            rule__Struct___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_2__1_in_rule__Struct___Group_2__03480);
            rule__Struct___Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__0"


    // $ANTLR start "rule__Struct___Group_2__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1749:1: rule__Struct___Group_2__0__Impl : ( '[' ) ;
    public final void rule__Struct___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1753:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1754:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1754:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1755:1: '['
            {
             before(grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Struct___Group_2__0__Impl3508); 
             after(grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__0__Impl"


    // $ANTLR start "rule__Struct___Group_2__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1768:1: rule__Struct___Group_2__1 : rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2 ;
    public final void rule__Struct___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1772:1: ( rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1773:2: rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__1__Impl_in_rule__Struct___Group_2__13539);
            rule__Struct___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_2__2_in_rule__Struct___Group_2__13542);
            rule__Struct___Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__1"


    // $ANTLR start "rule__Struct___Group_2__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1780:1: rule__Struct___Group_2__1__Impl : ( ( rule__Struct___AttributesAssignment_2_1 )* ) ;
    public final void rule__Struct___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1784:1: ( ( ( rule__Struct___AttributesAssignment_2_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1785:1: ( ( rule__Struct___AttributesAssignment_2_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1785:1: ( ( rule__Struct___AttributesAssignment_2_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1786:1: ( rule__Struct___AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getStruct_Access().getAttributesAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1787:1: ( rule__Struct___AttributesAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1787:2: rule__Struct___AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Struct___AttributesAssignment_2_1_in_rule__Struct___Group_2__1__Impl3569);
            	    rule__Struct___AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStruct_Access().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__1__Impl"


    // $ANTLR start "rule__Struct___Group_2__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1797:1: rule__Struct___Group_2__2 : rule__Struct___Group_2__2__Impl ;
    public final void rule__Struct___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1801:1: ( rule__Struct___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1802:2: rule__Struct___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__2__Impl_in_rule__Struct___Group_2__23600);
            rule__Struct___Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__2"


    // $ANTLR start "rule__Struct___Group_2__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1808:1: rule__Struct___Group_2__2__Impl : ( ']' ) ;
    public final void rule__Struct___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1812:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1813:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1813:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1814:1: ']'
            {
             before(grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Struct___Group_2__2__Impl3628); 
             after(grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_2__2__Impl"


    // $ANTLR start "rule__Struct___Group_3__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1833:1: rule__Struct___Group_3__0 : rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1 ;
    public final void rule__Struct___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1837:1: ( rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1838:2: rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__0__Impl_in_rule__Struct___Group_3__03665);
            rule__Struct___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_3__1_in_rule__Struct___Group_3__03668);
            rule__Struct___Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__0"


    // $ANTLR start "rule__Struct___Group_3__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1845:1: rule__Struct___Group_3__0__Impl : ( '{' ) ;
    public final void rule__Struct___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1849:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1850:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1850:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1851:1: '{'
            {
             before(grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Struct___Group_3__0__Impl3696); 
             after(grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__0__Impl"


    // $ANTLR start "rule__Struct___Group_3__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1864:1: rule__Struct___Group_3__1 : rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2 ;
    public final void rule__Struct___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1868:1: ( rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1869:2: rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__1__Impl_in_rule__Struct___Group_3__13727);
            rule__Struct___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_3__2_in_rule__Struct___Group_3__13730);
            rule__Struct___Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__1"


    // $ANTLR start "rule__Struct___Group_3__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1876:1: rule__Struct___Group_3__1__Impl : ( ( rule__Struct___EntitiesAssignment_3_1 )* ) ;
    public final void rule__Struct___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1880:1: ( ( ( rule__Struct___EntitiesAssignment_3_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1881:1: ( ( rule__Struct___EntitiesAssignment_3_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1881:1: ( ( rule__Struct___EntitiesAssignment_3_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1882:1: ( rule__Struct___EntitiesAssignment_3_1 )*
            {
             before(grammarAccess.getStruct_Access().getEntitiesAssignment_3_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1883:1: ( rule__Struct___EntitiesAssignment_3_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||(LA22_0>=35 && LA22_0<=36)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1883:2: rule__Struct___EntitiesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Struct___EntitiesAssignment_3_1_in_rule__Struct___Group_3__1__Impl3757);
            	    rule__Struct___EntitiesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStruct_Access().getEntitiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__1__Impl"


    // $ANTLR start "rule__Struct___Group_3__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1893:1: rule__Struct___Group_3__2 : rule__Struct___Group_3__2__Impl ;
    public final void rule__Struct___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1897:1: ( rule__Struct___Group_3__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1898:2: rule__Struct___Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__2__Impl_in_rule__Struct___Group_3__23788);
            rule__Struct___Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__2"


    // $ANTLR start "rule__Struct___Group_3__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1904:1: rule__Struct___Group_3__2__Impl : ( '}' ) ;
    public final void rule__Struct___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1908:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1909:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1909:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1910:1: '}'
            {
             before(grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2()); 
            match(input,29,FOLLOW_29_in_rule__Struct___Group_3__2__Impl3816); 
             after(grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___Group_3__2__Impl"


    // $ANTLR start "rule__Relationship___Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1929:1: rule__Relationship___Group__0 : rule__Relationship___Group__0__Impl rule__Relationship___Group__1 ;
    public final void rule__Relationship___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1933:1: ( rule__Relationship___Group__0__Impl rule__Relationship___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1934:2: rule__Relationship___Group__0__Impl rule__Relationship___Group__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group__0__Impl_in_rule__Relationship___Group__03853);
            rule__Relationship___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__1_in_rule__Relationship___Group__03856);
            rule__Relationship___Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__0"


    // $ANTLR start "rule__Relationship___Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1941:1: rule__Relationship___Group__0__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1945:1: ( ( 'Relationship' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1946:1: ( 'Relationship' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1946:1: ( 'Relationship' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1947:1: 'Relationship'
            {
             before(grammarAccess.getRelationship_Access().getRelationshipKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Relationship___Group__0__Impl3884); 
             after(grammarAccess.getRelationship_Access().getRelationshipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__0__Impl"


    // $ANTLR start "rule__Relationship___Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1960:1: rule__Relationship___Group__1 : rule__Relationship___Group__1__Impl rule__Relationship___Group__2 ;
    public final void rule__Relationship___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1964:1: ( rule__Relationship___Group__1__Impl rule__Relationship___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1965:2: rule__Relationship___Group__1__Impl rule__Relationship___Group__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group__1__Impl_in_rule__Relationship___Group__13915);
            rule__Relationship___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__2_in_rule__Relationship___Group__13918);
            rule__Relationship___Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__1"


    // $ANTLR start "rule__Relationship___Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1972:1: rule__Relationship___Group__1__Impl : ( ( rule__Relationship___NameAssignment_1 ) ) ;
    public final void rule__Relationship___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1976:1: ( ( ( rule__Relationship___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1977:1: ( ( rule__Relationship___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1977:1: ( ( rule__Relationship___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1978:1: ( rule__Relationship___NameAssignment_1 )
            {
             before(grammarAccess.getRelationship_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1979:1: ( rule__Relationship___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1979:2: rule__Relationship___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Relationship___NameAssignment_1_in_rule__Relationship___Group__1__Impl3945);
            rule__Relationship___NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationship_Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__1__Impl"


    // $ANTLR start "rule__Relationship___Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1989:1: rule__Relationship___Group__2 : rule__Relationship___Group__2__Impl rule__Relationship___Group__3 ;
    public final void rule__Relationship___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1993:1: ( rule__Relationship___Group__2__Impl rule__Relationship___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1994:2: rule__Relationship___Group__2__Impl rule__Relationship___Group__3
            {
            pushFollow(FOLLOW_rule__Relationship___Group__2__Impl_in_rule__Relationship___Group__23975);
            rule__Relationship___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__3_in_rule__Relationship___Group__23978);
            rule__Relationship___Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__2"


    // $ANTLR start "rule__Relationship___Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2001:1: rule__Relationship___Group__2__Impl : ( ( rule__Relationship___Group_2__0 )? ) ;
    public final void rule__Relationship___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2005:1: ( ( ( rule__Relationship___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2006:1: ( ( rule__Relationship___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2006:1: ( ( rule__Relationship___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2007:1: ( rule__Relationship___Group_2__0 )?
            {
             before(grammarAccess.getRelationship_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2008:1: ( rule__Relationship___Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2008:2: rule__Relationship___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Relationship___Group_2__0_in_rule__Relationship___Group__2__Impl4005);
                    rule__Relationship___Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationship_Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__2__Impl"


    // $ANTLR start "rule__Relationship___Group__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2018:1: rule__Relationship___Group__3 : rule__Relationship___Group__3__Impl rule__Relationship___Group__4 ;
    public final void rule__Relationship___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2022:1: ( rule__Relationship___Group__3__Impl rule__Relationship___Group__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2023:2: rule__Relationship___Group__3__Impl rule__Relationship___Group__4
            {
            pushFollow(FOLLOW_rule__Relationship___Group__3__Impl_in_rule__Relationship___Group__34036);
            rule__Relationship___Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__4_in_rule__Relationship___Group__34039);
            rule__Relationship___Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__3"


    // $ANTLR start "rule__Relationship___Group__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2030:1: rule__Relationship___Group__3__Impl : ( ( rule__Relationship___Group_3__0 )? ) ;
    public final void rule__Relationship___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2034:1: ( ( ( rule__Relationship___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2035:1: ( ( rule__Relationship___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2035:1: ( ( rule__Relationship___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2036:1: ( rule__Relationship___Group_3__0 )?
            {
             before(grammarAccess.getRelationship_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2037:1: ( rule__Relationship___Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2037:2: rule__Relationship___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Relationship___Group_3__0_in_rule__Relationship___Group__3__Impl4066);
                    rule__Relationship___Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationship_Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__3__Impl"


    // $ANTLR start "rule__Relationship___Group__4"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2047:1: rule__Relationship___Group__4 : rule__Relationship___Group__4__Impl ;
    public final void rule__Relationship___Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2051:1: ( rule__Relationship___Group__4__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2052:2: rule__Relationship___Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group__4__Impl_in_rule__Relationship___Group__44097);
            rule__Relationship___Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__4"


    // $ANTLR start "rule__Relationship___Group__4__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2058:1: rule__Relationship___Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__Relationship___Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2062:1: ( ( ( ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2063:1: ( ( ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2063:1: ( ( ',' )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2064:1: ( ',' )?
            {
             before(grammarAccess.getRelationship_Access().getCommaKeyword_4()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2065:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2066:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Relationship___Group__4__Impl4126); 

                    }
                    break;

            }

             after(grammarAccess.getRelationship_Access().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group__4__Impl"


    // $ANTLR start "rule__Relationship___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2087:1: rule__Relationship___Group_2__0 : rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1 ;
    public final void rule__Relationship___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2091:1: ( rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2092:2: rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__0__Impl_in_rule__Relationship___Group_2__04169);
            rule__Relationship___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_2__1_in_rule__Relationship___Group_2__04172);
            rule__Relationship___Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__0"


    // $ANTLR start "rule__Relationship___Group_2__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2099:1: rule__Relationship___Group_2__0__Impl : ( '[' ) ;
    public final void rule__Relationship___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2103:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2104:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2104:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2105:1: '['
            {
             before(grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Relationship___Group_2__0__Impl4200); 
             after(grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__0__Impl"


    // $ANTLR start "rule__Relationship___Group_2__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2118:1: rule__Relationship___Group_2__1 : rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2 ;
    public final void rule__Relationship___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2122:1: ( rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2123:2: rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__1__Impl_in_rule__Relationship___Group_2__14231);
            rule__Relationship___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_2__2_in_rule__Relationship___Group_2__14234);
            rule__Relationship___Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__1"


    // $ANTLR start "rule__Relationship___Group_2__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2130:1: rule__Relationship___Group_2__1__Impl : ( ( rule__Relationship___AttributesAssignment_2_1 )* ) ;
    public final void rule__Relationship___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2134:1: ( ( ( rule__Relationship___AttributesAssignment_2_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2135:1: ( ( rule__Relationship___AttributesAssignment_2_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2135:1: ( ( rule__Relationship___AttributesAssignment_2_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2136:1: ( rule__Relationship___AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getRelationship_Access().getAttributesAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2137:1: ( rule__Relationship___AttributesAssignment_2_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2137:2: rule__Relationship___AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Relationship___AttributesAssignment_2_1_in_rule__Relationship___Group_2__1__Impl4261);
            	    rule__Relationship___AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRelationship_Access().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__1__Impl"


    // $ANTLR start "rule__Relationship___Group_2__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2147:1: rule__Relationship___Group_2__2 : rule__Relationship___Group_2__2__Impl ;
    public final void rule__Relationship___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2151:1: ( rule__Relationship___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2152:2: rule__Relationship___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__2__Impl_in_rule__Relationship___Group_2__24292);
            rule__Relationship___Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__2"


    // $ANTLR start "rule__Relationship___Group_2__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2158:1: rule__Relationship___Group_2__2__Impl : ( ']' ) ;
    public final void rule__Relationship___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2162:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2163:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2163:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2164:1: ']'
            {
             before(grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Relationship___Group_2__2__Impl4320); 
             after(grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_2__2__Impl"


    // $ANTLR start "rule__Relationship___Group_3__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2183:1: rule__Relationship___Group_3__0 : rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1 ;
    public final void rule__Relationship___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2187:1: ( rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2188:2: rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__0__Impl_in_rule__Relationship___Group_3__04357);
            rule__Relationship___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__1_in_rule__Relationship___Group_3__04360);
            rule__Relationship___Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__0"


    // $ANTLR start "rule__Relationship___Group_3__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2195:1: rule__Relationship___Group_3__0__Impl : ( '{' ) ;
    public final void rule__Relationship___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2199:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2200:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2200:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2201:1: '{'
            {
             before(grammarAccess.getRelationship_Access().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Relationship___Group_3__0__Impl4388); 
             after(grammarAccess.getRelationship_Access().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__0__Impl"


    // $ANTLR start "rule__Relationship___Group_3__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2214:1: rule__Relationship___Group_3__1 : rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2 ;
    public final void rule__Relationship___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2218:1: ( rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2219:2: rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__1__Impl_in_rule__Relationship___Group_3__14419);
            rule__Relationship___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__2_in_rule__Relationship___Group_3__14422);
            rule__Relationship___Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__1"


    // $ANTLR start "rule__Relationship___Group_3__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2226:1: rule__Relationship___Group_3__1__Impl : ( 'start' ) ;
    public final void rule__Relationship___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2230:1: ( ( 'start' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2231:1: ( 'start' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2231:1: ( 'start' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2232:1: 'start'
            {
             before(grammarAccess.getRelationship_Access().getStartKeyword_3_1()); 
            match(input,37,FOLLOW_37_in_rule__Relationship___Group_3__1__Impl4450); 
             after(grammarAccess.getRelationship_Access().getStartKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__1__Impl"


    // $ANTLR start "rule__Relationship___Group_3__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2245:1: rule__Relationship___Group_3__2 : rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3 ;
    public final void rule__Relationship___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2249:1: ( rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2250:2: rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__2__Impl_in_rule__Relationship___Group_3__24481);
            rule__Relationship___Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__3_in_rule__Relationship___Group_3__24484);
            rule__Relationship___Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__2"


    // $ANTLR start "rule__Relationship___Group_3__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2257:1: rule__Relationship___Group_3__2__Impl : ( '=' ) ;
    public final void rule__Relationship___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2261:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2262:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2262:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2263:1: '='
            {
             before(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_2()); 
            match(input,38,FOLLOW_38_in_rule__Relationship___Group_3__2__Impl4512); 
             after(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__2__Impl"


    // $ANTLR start "rule__Relationship___Group_3__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2276:1: rule__Relationship___Group_3__3 : rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4 ;
    public final void rule__Relationship___Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2280:1: ( rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2281:2: rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__3__Impl_in_rule__Relationship___Group_3__34543);
            rule__Relationship___Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__4_in_rule__Relationship___Group_3__34546);
            rule__Relationship___Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__3"


    // $ANTLR start "rule__Relationship___Group_3__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2288:1: rule__Relationship___Group_3__3__Impl : ( ( rule__Relationship___StartAssignment_3_3 ) ) ;
    public final void rule__Relationship___Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2292:1: ( ( ( rule__Relationship___StartAssignment_3_3 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2293:1: ( ( rule__Relationship___StartAssignment_3_3 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2293:1: ( ( rule__Relationship___StartAssignment_3_3 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2294:1: ( rule__Relationship___StartAssignment_3_3 )
            {
             before(grammarAccess.getRelationship_Access().getStartAssignment_3_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2295:1: ( rule__Relationship___StartAssignment_3_3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2295:2: rule__Relationship___StartAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Relationship___StartAssignment_3_3_in_rule__Relationship___Group_3__3__Impl4573);
            rule__Relationship___StartAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationship_Access().getStartAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__3__Impl"


    // $ANTLR start "rule__Relationship___Group_3__4"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2305:1: rule__Relationship___Group_3__4 : rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5 ;
    public final void rule__Relationship___Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2309:1: ( rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2310:2: rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__4__Impl_in_rule__Relationship___Group_3__44603);
            rule__Relationship___Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__5_in_rule__Relationship___Group_3__44606);
            rule__Relationship___Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__4"


    // $ANTLR start "rule__Relationship___Group_3__4__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2317:1: rule__Relationship___Group_3__4__Impl : ( 'end' ) ;
    public final void rule__Relationship___Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2321:1: ( ( 'end' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2322:1: ( 'end' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2322:1: ( 'end' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2323:1: 'end'
            {
             before(grammarAccess.getRelationship_Access().getEndKeyword_3_4()); 
            match(input,39,FOLLOW_39_in_rule__Relationship___Group_3__4__Impl4634); 
             after(grammarAccess.getRelationship_Access().getEndKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__4__Impl"


    // $ANTLR start "rule__Relationship___Group_3__5"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2336:1: rule__Relationship___Group_3__5 : rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6 ;
    public final void rule__Relationship___Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2340:1: ( rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2341:2: rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__5__Impl_in_rule__Relationship___Group_3__54665);
            rule__Relationship___Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__6_in_rule__Relationship___Group_3__54668);
            rule__Relationship___Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__5"


    // $ANTLR start "rule__Relationship___Group_3__5__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2348:1: rule__Relationship___Group_3__5__Impl : ( '=' ) ;
    public final void rule__Relationship___Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2352:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2353:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2353:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2354:1: '='
            {
             before(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_5()); 
            match(input,38,FOLLOW_38_in_rule__Relationship___Group_3__5__Impl4696); 
             after(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__5__Impl"


    // $ANTLR start "rule__Relationship___Group_3__6"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2367:1: rule__Relationship___Group_3__6 : rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7 ;
    public final void rule__Relationship___Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2371:1: ( rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2372:2: rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__6__Impl_in_rule__Relationship___Group_3__64727);
            rule__Relationship___Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__7_in_rule__Relationship___Group_3__64730);
            rule__Relationship___Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__6"


    // $ANTLR start "rule__Relationship___Group_3__6__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2379:1: rule__Relationship___Group_3__6__Impl : ( ( rule__Relationship___EndAssignment_3_6 ) ) ;
    public final void rule__Relationship___Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2383:1: ( ( ( rule__Relationship___EndAssignment_3_6 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2384:1: ( ( rule__Relationship___EndAssignment_3_6 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2384:1: ( ( rule__Relationship___EndAssignment_3_6 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2385:1: ( rule__Relationship___EndAssignment_3_6 )
            {
             before(grammarAccess.getRelationship_Access().getEndAssignment_3_6()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2386:1: ( rule__Relationship___EndAssignment_3_6 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2386:2: rule__Relationship___EndAssignment_3_6
            {
            pushFollow(FOLLOW_rule__Relationship___EndAssignment_3_6_in_rule__Relationship___Group_3__6__Impl4757);
            rule__Relationship___EndAssignment_3_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationship_Access().getEndAssignment_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__6__Impl"


    // $ANTLR start "rule__Relationship___Group_3__7"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2396:1: rule__Relationship___Group_3__7 : rule__Relationship___Group_3__7__Impl ;
    public final void rule__Relationship___Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2400:1: ( rule__Relationship___Group_3__7__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2401:2: rule__Relationship___Group_3__7__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__7__Impl_in_rule__Relationship___Group_3__74787);
            rule__Relationship___Group_3__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__7"


    // $ANTLR start "rule__Relationship___Group_3__7__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2407:1: rule__Relationship___Group_3__7__Impl : ( '}' ) ;
    public final void rule__Relationship___Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2411:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2412:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2412:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2413:1: '}'
            {
             before(grammarAccess.getRelationship_Access().getRightCurlyBracketKeyword_3_7()); 
            match(input,29,FOLLOW_29_in_rule__Relationship___Group_3__7__Impl4815); 
             after(grammarAccess.getRelationship_Access().getRightCurlyBracketKeyword_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___Group_3__7__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2442:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2446:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2447:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04862);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04865);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2454:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2458:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2459:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2459:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2460:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2461:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2461:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4892);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2471:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2475:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2476:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14922);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14925);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2483:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Group_1__0 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2487:1: ( ( ( rule__Attribute__Group_1__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2488:1: ( ( rule__Attribute__Group_1__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2488:1: ( ( rule__Attribute__Group_1__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2489:1: ( rule__Attribute__Group_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2490:1: ( rule__Attribute__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2490:2: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Group__1__Impl4952);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2500:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2504:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2505:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24983);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2511:1: rule__Attribute__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2515:1: ( ( ( ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2516:1: ( ( ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2516:1: ( ( ',' )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2517:1: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2518:1: ( ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2519:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Attribute__Group__2__Impl5012); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2536:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2540:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2541:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__05051);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__05054);
            rule__Attribute__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2548:1: rule__Attribute__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2552:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2553:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2553:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2554:1: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Attribute__Group_1__0__Impl5082); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2567:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2571:1: ( rule__Attribute__Group_1__1__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2572:2: rule__Attribute__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__15113);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2578:1: rule__Attribute__Group_1__1__Impl : ( ( rule__Attribute__ValueAssignment_1_1 ) ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2582:1: ( ( ( rule__Attribute__ValueAssignment_1_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2583:1: ( ( rule__Attribute__ValueAssignment_1_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2583:1: ( ( rule__Attribute__ValueAssignment_1_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2584:1: ( rule__Attribute__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_1_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2585:1: ( rule__Attribute__ValueAssignment_1_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2585:2: rule__Attribute__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_1_1_in_rule__Attribute__Group_1__1__Impl5140);
            rule__Attribute__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Schema__NameAssignment_0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2600:1: rule__Schema__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2604:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2605:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2605:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2606:1: RULE_ID
            {
             before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_05179); 
             after(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NameAssignment_0"


    // $ANTLR start "rule__Schema__AttributesAssignment_1_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2615:1: rule__Schema__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Schema__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2619:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2620:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2620:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2621:1: ruleAttribute
            {
             before(grammarAccess.getSchemaAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Schema__AttributesAssignment_1_15210);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getAttributesAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__AttributesAssignment_1_1"


    // $ANTLR start "rule__Schema__EntitiesAssignment_2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2630:1: rule__Schema__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__Schema__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2634:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2635:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2635:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2636:1: ruleEntity
            {
             before(grammarAccess.getSchemaAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Schema__EntitiesAssignment_25241);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__EntitiesAssignment_2"


    // $ANTLR start "rule__QualitySpecification__CharacteristicAssignment_0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2645:1: rule__QualitySpecification__CharacteristicAssignment_0 : ( ruleQualityCharacteristic ) ;
    public final void rule__QualitySpecification__CharacteristicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2649:1: ( ( ruleQualityCharacteristic ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2650:1: ( ruleQualityCharacteristic )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2650:1: ( ruleQualityCharacteristic )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2651:1: ruleQualityCharacteristic
            {
             before(grammarAccess.getQualitySpecificationAccess().getCharacteristicQualityCharacteristicParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualityCharacteristic_in_rule__QualitySpecification__CharacteristicAssignment_05272);
            ruleQualityCharacteristic();

            state._fsp--;

             after(grammarAccess.getQualitySpecificationAccess().getCharacteristicQualityCharacteristicParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__CharacteristicAssignment_0"


    // $ANTLR start "rule__QualitySpecification__SubCharacteristicsAssignment_1_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2660:1: rule__QualitySpecification__SubCharacteristicsAssignment_1_1 : ( ruleQualitySubCharacteristic ) ;
    public final void rule__QualitySpecification__SubCharacteristicsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2664:1: ( ( ruleQualitySubCharacteristic ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2665:1: ( ruleQualitySubCharacteristic )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2665:1: ( ruleQualitySubCharacteristic )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2666:1: ruleQualitySubCharacteristic
            {
             before(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_rule__QualitySpecification__SubCharacteristicsAssignment_1_15303);
            ruleQualitySubCharacteristic();

            state._fsp--;

             after(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitySpecification__SubCharacteristicsAssignment_1_1"


    // $ANTLR start "rule__Set___NameAssignment_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2675:1: rule__Set___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Set___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2679:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2680:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2680:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2681:1: RULE_ID
            {
             before(grammarAccess.getSet_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Set___NameAssignment_15334); 
             after(grammarAccess.getSet_Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___NameAssignment_1"


    // $ANTLR start "rule__Set___DataModelAssignment_2_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2690:1: rule__Set___DataModelAssignment_2_1 : ( ruleDataModel ) ;
    public final void rule__Set___DataModelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2694:1: ( ( ruleDataModel ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2695:1: ( ruleDataModel )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2695:1: ( ruleDataModel )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2696:1: ruleDataModel
            {
             before(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDataModel_in_rule__Set___DataModelAssignment_2_15365);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___DataModelAssignment_2_1"


    // $ANTLR start "rule__Set___QualitySpecificationsAssignment_3_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2705:1: rule__Set___QualitySpecificationsAssignment_3_1 : ( ruleQualitySpecification ) ;
    public final void rule__Set___QualitySpecificationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2709:1: ( ( ruleQualitySpecification ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2710:1: ( ruleQualitySpecification )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2710:1: ( ruleQualitySpecification )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2711:1: ruleQualitySpecification
            {
             before(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleQualitySpecification_in_rule__Set___QualitySpecificationsAssignment_3_15396);
            ruleQualitySpecification();

            state._fsp--;

             after(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___QualitySpecificationsAssignment_3_1"


    // $ANTLR start "rule__Set___AttributesAssignment_4_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2720:1: rule__Set___AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__Set___AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2724:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2725:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2725:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2726:1: ruleAttribute
            {
             before(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Set___AttributesAssignment_4_15427);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___AttributesAssignment_4_1"


    // $ANTLR start "rule__Set___EntitiesAssignment_5_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2735:1: rule__Set___EntitiesAssignment_5_1 : ( ruleEntity ) ;
    public final void rule__Set___EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2739:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2740:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2740:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2741:1: ruleEntity
            {
             before(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Set___EntitiesAssignment_5_15458);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set___EntitiesAssignment_5_1"


    // $ANTLR start "rule__Struct___NameAssignment_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2750:1: rule__Struct___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Struct___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2754:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2755:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2755:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2756:1: RULE_ID
            {
             before(grammarAccess.getStruct_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct___NameAssignment_15489); 
             after(grammarAccess.getStruct_Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___NameAssignment_1"


    // $ANTLR start "rule__Struct___AttributesAssignment_2_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2765:1: rule__Struct___AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Struct___AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2769:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2770:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2770:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2771:1: ruleAttribute
            {
             before(grammarAccess.getStruct_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Struct___AttributesAssignment_2_15520);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStruct_Access().getAttributesAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___AttributesAssignment_2_1"


    // $ANTLR start "rule__Struct___EntitiesAssignment_3_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2780:1: rule__Struct___EntitiesAssignment_3_1 : ( ruleEntity ) ;
    public final void rule__Struct___EntitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2784:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2785:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2785:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2786:1: ruleEntity
            {
             before(grammarAccess.getStruct_Access().getEntitiesEntityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Struct___EntitiesAssignment_3_15551);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getStruct_Access().getEntitiesEntityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct___EntitiesAssignment_3_1"


    // $ANTLR start "rule__Relationship___NameAssignment_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2795:1: rule__Relationship___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2799:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2800:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2800:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2801:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___NameAssignment_15582); 
             after(grammarAccess.getRelationship_Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___NameAssignment_1"


    // $ANTLR start "rule__Relationship___AttributesAssignment_2_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2810:1: rule__Relationship___AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relationship___AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2814:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2815:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2815:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2816:1: ruleAttribute
            {
             before(grammarAccess.getRelationship_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Relationship___AttributesAssignment_2_15613);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationship_Access().getAttributesAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___AttributesAssignment_2_1"


    // $ANTLR start "rule__Relationship___StartAssignment_3_3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2825:1: rule__Relationship___StartAssignment_3_3 : ( RULE_ID ) ;
    public final void rule__Relationship___StartAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2829:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2830:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2830:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2831:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getStartIDTerminalRuleCall_3_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___StartAssignment_3_35644); 
             after(grammarAccess.getRelationship_Access().getStartIDTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___StartAssignment_3_3"


    // $ANTLR start "rule__Relationship___EndAssignment_3_6"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2840:1: rule__Relationship___EndAssignment_3_6 : ( RULE_ID ) ;
    public final void rule__Relationship___EndAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2844:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2845:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2845:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2846:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getEndIDTerminalRuleCall_3_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___EndAssignment_3_65675); 
             after(grammarAccess.getRelationship_Access().getEndIDTerminalRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship___EndAssignment_3_6"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2855:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2859:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2860:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2860:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2861:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_05706); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_1_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2870:1: rule__Attribute__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2874:1: ( ( RULE_STRING ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2875:1: ( RULE_STRING )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2875:1: ( RULE_STRING )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2876:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_1_15737); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0_in_ruleSchema94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Alternatives_in_ruleDataModel154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_entryRuleQualityCharacteristic181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityCharacteristic188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityCharacteristic__Group__0_in_ruleQualityCharacteristic214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_entryRuleQualitySubCharacteristic241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitySubCharacteristic248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySubCharacteristic__Group__0_in_ruleQualitySubCharacteristic274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_entryRuleQualitySpecification301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitySpecification308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__0_in_ruleQualitySpecification334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_entryRuleSet_421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet_428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__0_in_ruleSet_454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_entryRuleStruct_481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct_488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__0_in_ruleStruct_514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_entryRuleRelationship_541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship_548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__0_in_ruleRelationship_574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataModel__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataModel__Alternatives691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataModel__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataModel__Alternatives731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataModel__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualityCharacteristic__Alternatives_1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualityCharacteristic__Alternatives_1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualitySubCharacteristic__Alternatives_1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualitySubCharacteristic__Alternatives_1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualitySubCharacteristic__Alternatives_1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualitySubCharacteristic__Alternatives_1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualitySubCharacteristic__Alternatives_1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualitySubCharacteristic__Alternatives_1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_rule__Entity__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_rule__Entity__Alternatives992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_rule__Entity__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__01039 = new BitSet(new long[]{0x0000001841000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NameAssignment_0_in_rule__Schema__Group__0__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__11099 = new BitSet(new long[]{0x0000001841000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__0_in_rule__Schema__Group__1__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__21160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__EntitiesAssignment_2_in_rule__Schema__Group__2__Impl1187 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__0__Impl_in_rule__Schema__Group_1__01224 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__1_in_rule__Schema__Group_1__01227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Schema__Group_1__0__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__1__Impl_in_rule__Schema__Group_1__11286 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__2_in_rule__Schema__Group_1__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__AttributesAssignment_1_1_in_rule__Schema__Group_1__1__Impl1316 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__2__Impl_in_rule__Schema__Group_1__21347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Schema__Group_1__2__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityCharacteristic__Group__0__Impl_in_rule__QualityCharacteristic__Group__01412 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__QualityCharacteristic__Group__1_in_rule__QualityCharacteristic__Group__01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QualityCharacteristic__Group__0__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityCharacteristic__Group__1__Impl_in_rule__QualityCharacteristic__Group__11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityCharacteristic__Alternatives_1_in_rule__QualityCharacteristic__Group__1__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySubCharacteristic__Group__0__Impl_in_rule__QualitySubCharacteristic__Group__01535 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_rule__QualitySubCharacteristic__Group__1_in_rule__QualitySubCharacteristic__Group__01538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualitySubCharacteristic__Group__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySubCharacteristic__Group__1__Impl_in_rule__QualitySubCharacteristic__Group__11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySubCharacteristic__Alternatives_1_in_rule__QualitySubCharacteristic__Group__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__0__Impl_in_rule__QualitySpecification__Group__01658 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__1_in_rule__QualitySpecification__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__CharacteristicAssignment_0_in_rule__QualitySpecification__Group__0__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__1__Impl_in_rule__QualitySpecification__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__0_in_rule__QualitySpecification__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__0__Impl_in_rule__QualitySpecification__Group_1__01780 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__1_in_rule__QualitySpecification__Group_1__01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualitySpecification__Group_1__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__1__Impl_in_rule__QualitySpecification__Group_1__11842 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__2_in_rule__QualitySpecification__Group_1__11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__SubCharacteristicsAssignment_1_1_in_rule__QualitySpecification__Group_1__1__Impl1872 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group_1__2__Impl_in_rule__QualitySpecification__Group_1__21903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualitySpecification__Group_1__2__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__0__Impl_in_rule__Set___Group__01968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Set___Group__1_in_rule__Set___Group__01971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Set___Group__0__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__1__Impl_in_rule__Set___Group__12030 = new BitSet(new long[]{0x0000000591000000L});
    public static final BitSet FOLLOW_rule__Set___Group__2_in_rule__Set___Group__12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___NameAssignment_1_in_rule__Set___Group__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__2__Impl_in_rule__Set___Group__22090 = new BitSet(new long[]{0x0000000591000000L});
    public static final BitSet FOLLOW_rule__Set___Group__3_in_rule__Set___Group__22093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__0_in_rule__Set___Group__2__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__3__Impl_in_rule__Set___Group__32151 = new BitSet(new long[]{0x0000000591000000L});
    public static final BitSet FOLLOW_rule__Set___Group__4_in_rule__Set___Group__32154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__0_in_rule__Set___Group__3__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__4__Impl_in_rule__Set___Group__42212 = new BitSet(new long[]{0x0000000591000000L});
    public static final BitSet FOLLOW_rule__Set___Group__5_in_rule__Set___Group__42215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__0_in_rule__Set___Group__4__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__5__Impl_in_rule__Set___Group__52273 = new BitSet(new long[]{0x0000000591000000L});
    public static final BitSet FOLLOW_rule__Set___Group__6_in_rule__Set___Group__52276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_5__0_in_rule__Set___Group__5__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__6__Impl_in_rule__Set___Group__62334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Set___Group__6__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__0__Impl_in_rule__Set___Group_2__02410 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Set___Group_2__1_in_rule__Set___Group_2__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Set___Group_2__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__1__Impl_in_rule__Set___Group_2__12472 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Set___Group_2__2_in_rule__Set___Group_2__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___DataModelAssignment_2_1_in_rule__Set___Group_2__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__2__Impl_in_rule__Set___Group_2__22532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Set___Group_2__2__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__0__Impl_in_rule__Set___Group_3__02597 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_rule__Set___Group_3__1_in_rule__Set___Group_3__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Set___Group_3__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__1__Impl_in_rule__Set___Group_3__12659 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_rule__Set___Group_3__2_in_rule__Set___Group_3__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___QualitySpecificationsAssignment_3_1_in_rule__Set___Group_3__1__Impl2689 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__2__Impl_in_rule__Set___Group_3__22720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Set___Group_3__2__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__0__Impl_in_rule__Set___Group_4__02785 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Set___Group_4__1_in_rule__Set___Group_4__02788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Set___Group_4__0__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__1__Impl_in_rule__Set___Group_4__12847 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Set___Group_4__2_in_rule__Set___Group_4__12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___AttributesAssignment_4_1_in_rule__Set___Group_4__1__Impl2877 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Set___Group_4__2__Impl_in_rule__Set___Group_4__22908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Set___Group_4__2__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_5__0__Impl_in_rule__Set___Group_5__02973 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_rule__Set___Group_5__1_in_rule__Set___Group_5__02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Set___Group_5__0__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_5__1__Impl_in_rule__Set___Group_5__13035 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_rule__Set___Group_5__2_in_rule__Set___Group_5__13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___EntitiesAssignment_5_1_in_rule__Set___Group_5__1__Impl3065 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_rule__Set___Group_5__2__Impl_in_rule__Set___Group_5__23096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Set___Group_5__2__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__0__Impl_in_rule__Struct___Group__03161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Struct___Group__1_in_rule__Struct___Group__03164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Struct___Group__0__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__1__Impl_in_rule__Struct___Group__13223 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Struct___Group__2_in_rule__Struct___Group__13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___NameAssignment_1_in_rule__Struct___Group__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__2__Impl_in_rule__Struct___Group__23283 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Struct___Group__3_in_rule__Struct___Group__23286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__0_in_rule__Struct___Group__2__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__3__Impl_in_rule__Struct___Group__33344 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Struct___Group__4_in_rule__Struct___Group__33347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__0_in_rule__Struct___Group__3__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__4__Impl_in_rule__Struct___Group__43405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Struct___Group__4__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__0__Impl_in_rule__Struct___Group_2__03477 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__1_in_rule__Struct___Group_2__03480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Struct___Group_2__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__1__Impl_in_rule__Struct___Group_2__13539 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__2_in_rule__Struct___Group_2__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___AttributesAssignment_2_1_in_rule__Struct___Group_2__1__Impl3569 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__2__Impl_in_rule__Struct___Group_2__23600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Struct___Group_2__2__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__0__Impl_in_rule__Struct___Group_3__03665 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__1_in_rule__Struct___Group_3__03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Struct___Group_3__0__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__1__Impl_in_rule__Struct___Group_3__13727 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__2_in_rule__Struct___Group_3__13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___EntitiesAssignment_3_1_in_rule__Struct___Group_3__1__Impl3757 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__2__Impl_in_rule__Struct___Group_3__23788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Struct___Group_3__2__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__0__Impl_in_rule__Relationship___Group__03853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group__1_in_rule__Relationship___Group__03856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Relationship___Group__0__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__1__Impl_in_rule__Relationship___Group__13915 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group__2_in_rule__Relationship___Group__13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___NameAssignment_1_in_rule__Relationship___Group__1__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__2__Impl_in_rule__Relationship___Group__23975 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group__3_in_rule__Relationship___Group__23978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__0_in_rule__Relationship___Group__2__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__3__Impl_in_rule__Relationship___Group__34036 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group__4_in_rule__Relationship___Group__34039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__0_in_rule__Relationship___Group__3__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__4__Impl_in_rule__Relationship___Group__44097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Relationship___Group__4__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__0__Impl_in_rule__Relationship___Group_2__04169 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__1_in_rule__Relationship___Group_2__04172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Relationship___Group_2__0__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__1__Impl_in_rule__Relationship___Group_2__14231 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__2_in_rule__Relationship___Group_2__14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___AttributesAssignment_2_1_in_rule__Relationship___Group_2__1__Impl4261 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__2__Impl_in_rule__Relationship___Group_2__24292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Relationship___Group_2__2__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__0__Impl_in_rule__Relationship___Group_3__04357 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__1_in_rule__Relationship___Group_3__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relationship___Group_3__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__1__Impl_in_rule__Relationship___Group_3__14419 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__2_in_rule__Relationship___Group_3__14422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Relationship___Group_3__1__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__2__Impl_in_rule__Relationship___Group_3__24481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__3_in_rule__Relationship___Group_3__24484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Relationship___Group_3__2__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__3__Impl_in_rule__Relationship___Group_3__34543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__4_in_rule__Relationship___Group_3__34546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___StartAssignment_3_3_in_rule__Relationship___Group_3__3__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__4__Impl_in_rule__Relationship___Group_3__44603 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__5_in_rule__Relationship___Group_3__44606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Relationship___Group_3__4__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__5__Impl_in_rule__Relationship___Group_3__54665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__6_in_rule__Relationship___Group_3__54668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Relationship___Group_3__5__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__6__Impl_in_rule__Relationship___Group_3__64727 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__7_in_rule__Relationship___Group_3__64730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___EndAssignment_3_6_in_rule__Relationship___Group_3__6__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__7__Impl_in_rule__Relationship___Group_3__74787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relationship___Group_3__7__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04862 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14922 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Group__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Attribute__Group__2__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__05051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__05054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__Group_1__0__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_1_1_in_rule__Attribute__Group_1__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_05179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Schema__AttributesAssignment_1_15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Schema__EntitiesAssignment_25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_rule__QualitySpecification__CharacteristicAssignment_05272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_rule__QualitySpecification__SubCharacteristicsAssignment_1_15303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Set___NameAssignment_15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Set___DataModelAssignment_2_15365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_rule__Set___QualitySpecificationsAssignment_3_15396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Set___AttributesAssignment_4_15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Set___EntitiesAssignment_5_15458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct___NameAssignment_15489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Struct___AttributesAssignment_2_15520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Struct___EntitiesAssignment_3_15551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___NameAssignment_15582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Relationship___AttributesAssignment_2_15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___StartAssignment_3_35644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___EndAssignment_3_65675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_05706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_1_15737 = new BitSet(new long[]{0x0000000000000002L});

}