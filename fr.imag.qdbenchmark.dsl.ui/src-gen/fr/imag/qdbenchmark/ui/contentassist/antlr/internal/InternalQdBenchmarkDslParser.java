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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'KeyValue'", "'Graph'", "'Document'", "'Column-Family'", "'Relational'", "'Reliability'", "'PerformanceEfficiency'", "'Maturity'", "'Availability'", "'FaultTolerance'", "'Recoverability'", "'TimeBehaviour'", "'ResourceUtilisation'", "'['", "']'", "'QualityCharacteristic'", "'QualitySubCharacteristic'", "'{'", "'}'", "'Set'", "'<'", "'>'", "','", "'Struct'", "'Relationship'", "'start'", "'='", "'end'"
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
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
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

                if ( (LA6_0==30||(LA6_0>=34 && LA6_0<=35)) ) {
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:847:1: rule__QualitySpecification__Group__1 : rule__QualitySpecification__Group__1__Impl rule__QualitySpecification__Group__2 ;
    public final void rule__QualitySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:851:1: ( rule__QualitySpecification__Group__1__Impl rule__QualitySpecification__Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:852:2: rule__QualitySpecification__Group__1__Impl rule__QualitySpecification__Group__2
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__1__Impl_in_rule__QualitySpecification__Group__11718);
            rule__QualitySpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySpecification__Group__2_in_rule__QualitySpecification__Group__11721);
            rule__QualitySpecification__Group__2();

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:859:1: rule__QualitySpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__QualitySpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:863:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:864:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:864:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:865:1: '{'
            {
             before(grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__QualitySpecification__Group__1__Impl1749); 
             after(grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__QualitySpecification__Group__2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:878:1: rule__QualitySpecification__Group__2 : rule__QualitySpecification__Group__2__Impl rule__QualitySpecification__Group__3 ;
    public final void rule__QualitySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:882:1: ( rule__QualitySpecification__Group__2__Impl rule__QualitySpecification__Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:883:2: rule__QualitySpecification__Group__2__Impl rule__QualitySpecification__Group__3
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__2__Impl_in_rule__QualitySpecification__Group__21780);
            rule__QualitySpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualitySpecification__Group__3_in_rule__QualitySpecification__Group__21783);
            rule__QualitySpecification__Group__3();

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
    // $ANTLR end "rule__QualitySpecification__Group__2"


    // $ANTLR start "rule__QualitySpecification__Group__2__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:890:1: rule__QualitySpecification__Group__2__Impl : ( ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )* ) ;
    public final void rule__QualitySpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:894:1: ( ( ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:895:1: ( ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:895:1: ( ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:896:1: ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )*
            {
             before(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsAssignment_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:897:1: ( rule__QualitySpecification__SubCharacteristicsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:897:2: rule__QualitySpecification__SubCharacteristicsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__QualitySpecification__SubCharacteristicsAssignment_2_in_rule__QualitySpecification__Group__2__Impl1810);
            	    rule__QualitySpecification__SubCharacteristicsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsAssignment_2()); 

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
    // $ANTLR end "rule__QualitySpecification__Group__2__Impl"


    // $ANTLR start "rule__QualitySpecification__Group__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:907:1: rule__QualitySpecification__Group__3 : rule__QualitySpecification__Group__3__Impl ;
    public final void rule__QualitySpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:911:1: ( rule__QualitySpecification__Group__3__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:912:2: rule__QualitySpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QualitySpecification__Group__3__Impl_in_rule__QualitySpecification__Group__31841);
            rule__QualitySpecification__Group__3__Impl();

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
    // $ANTLR end "rule__QualitySpecification__Group__3"


    // $ANTLR start "rule__QualitySpecification__Group__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:918:1: rule__QualitySpecification__Group__3__Impl : ( '}' ) ;
    public final void rule__QualitySpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:922:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:923:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:923:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:924:1: '}'
            {
             before(grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__QualitySpecification__Group__3__Impl1869); 
             after(grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__QualitySpecification__Group__3__Impl"


    // $ANTLR start "rule__Set___Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:945:1: rule__Set___Group__0 : rule__Set___Group__0__Impl rule__Set___Group__1 ;
    public final void rule__Set___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:949:1: ( rule__Set___Group__0__Impl rule__Set___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:950:2: rule__Set___Group__0__Impl rule__Set___Group__1
            {
            pushFollow(FOLLOW_rule__Set___Group__0__Impl_in_rule__Set___Group__01908);
            rule__Set___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__1_in_rule__Set___Group__01911);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:957:1: rule__Set___Group__0__Impl : ( 'Set' ) ;
    public final void rule__Set___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:961:1: ( ( 'Set' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:962:1: ( 'Set' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:962:1: ( 'Set' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:963:1: 'Set'
            {
             before(grammarAccess.getSet_Access().getSetKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Set___Group__0__Impl1939); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:976:1: rule__Set___Group__1 : rule__Set___Group__1__Impl rule__Set___Group__2 ;
    public final void rule__Set___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:980:1: ( rule__Set___Group__1__Impl rule__Set___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:981:2: rule__Set___Group__1__Impl rule__Set___Group__2
            {
            pushFollow(FOLLOW_rule__Set___Group__1__Impl_in_rule__Set___Group__11970);
            rule__Set___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__2_in_rule__Set___Group__11973);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:988:1: rule__Set___Group__1__Impl : ( ( rule__Set___NameAssignment_1 ) ) ;
    public final void rule__Set___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:992:1: ( ( ( rule__Set___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:993:1: ( ( rule__Set___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:993:1: ( ( rule__Set___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:994:1: ( rule__Set___NameAssignment_1 )
            {
             before(grammarAccess.getSet_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:995:1: ( rule__Set___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:995:2: rule__Set___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Set___NameAssignment_1_in_rule__Set___Group__1__Impl2000);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1005:1: rule__Set___Group__2 : rule__Set___Group__2__Impl rule__Set___Group__3 ;
    public final void rule__Set___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1009:1: ( rule__Set___Group__2__Impl rule__Set___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1010:2: rule__Set___Group__2__Impl rule__Set___Group__3
            {
            pushFollow(FOLLOW_rule__Set___Group__2__Impl_in_rule__Set___Group__22030);
            rule__Set___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__3_in_rule__Set___Group__22033);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1017:1: rule__Set___Group__2__Impl : ( ( rule__Set___Group_2__0 )? ) ;
    public final void rule__Set___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1021:1: ( ( ( rule__Set___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1022:1: ( ( rule__Set___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1022:1: ( ( rule__Set___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1023:1: ( rule__Set___Group_2__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1024:1: ( rule__Set___Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1024:2: rule__Set___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_2__0_in_rule__Set___Group__2__Impl2060);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1034:1: rule__Set___Group__3 : rule__Set___Group__3__Impl rule__Set___Group__4 ;
    public final void rule__Set___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1038:1: ( rule__Set___Group__3__Impl rule__Set___Group__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1039:2: rule__Set___Group__3__Impl rule__Set___Group__4
            {
            pushFollow(FOLLOW_rule__Set___Group__3__Impl_in_rule__Set___Group__32091);
            rule__Set___Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group__4_in_rule__Set___Group__32094);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1046:1: rule__Set___Group__3__Impl : ( ( rule__Set___Group_3__0 )? ) ;
    public final void rule__Set___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1050:1: ( ( ( rule__Set___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1051:1: ( ( rule__Set___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1051:1: ( ( rule__Set___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1052:1: ( rule__Set___Group_3__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1053:1: ( rule__Set___Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1053:2: rule__Set___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_3__0_in_rule__Set___Group__3__Impl2121);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1063:1: rule__Set___Group__4 : rule__Set___Group__4__Impl ;
    public final void rule__Set___Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1067:1: ( rule__Set___Group__4__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1068:2: rule__Set___Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group__4__Impl_in_rule__Set___Group__42152);
            rule__Set___Group__4__Impl();

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1074:1: rule__Set___Group__4__Impl : ( ( rule__Set___Group_4__0 )? ) ;
    public final void rule__Set___Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1078:1: ( ( ( rule__Set___Group_4__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1079:1: ( ( rule__Set___Group_4__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1079:1: ( ( rule__Set___Group_4__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1080:1: ( rule__Set___Group_4__0 )?
            {
             before(grammarAccess.getSet_Access().getGroup_4()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1081:1: ( rule__Set___Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1081:2: rule__Set___Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Set___Group_4__0_in_rule__Set___Group__4__Impl2179);
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


    // $ANTLR start "rule__Set___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1101:1: rule__Set___Group_2__0 : rule__Set___Group_2__0__Impl rule__Set___Group_2__1 ;
    public final void rule__Set___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1105:1: ( rule__Set___Group_2__0__Impl rule__Set___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1106:2: rule__Set___Group_2__0__Impl rule__Set___Group_2__1
            {
            pushFollow(FOLLOW_rule__Set___Group_2__0__Impl_in_rule__Set___Group_2__02220);
            rule__Set___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_2__1_in_rule__Set___Group_2__02223);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1113:1: rule__Set___Group_2__0__Impl : ( '[' ) ;
    public final void rule__Set___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1117:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1118:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1118:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1119:1: '['
            {
             before(grammarAccess.getSet_Access().getLeftSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Set___Group_2__0__Impl2251); 
             after(grammarAccess.getSet_Access().getLeftSquareBracketKeyword_2_0()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1132:1: rule__Set___Group_2__1 : rule__Set___Group_2__1__Impl rule__Set___Group_2__2 ;
    public final void rule__Set___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1136:1: ( rule__Set___Group_2__1__Impl rule__Set___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1137:2: rule__Set___Group_2__1__Impl rule__Set___Group_2__2
            {
            pushFollow(FOLLOW_rule__Set___Group_2__1__Impl_in_rule__Set___Group_2__12282);
            rule__Set___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_2__2_in_rule__Set___Group_2__12285);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1144:1: rule__Set___Group_2__1__Impl : ( ( rule__Set___AttributesAssignment_2_1 )* ) ;
    public final void rule__Set___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1148:1: ( ( ( rule__Set___AttributesAssignment_2_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1149:1: ( ( rule__Set___AttributesAssignment_2_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1149:1: ( ( rule__Set___AttributesAssignment_2_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1150:1: ( rule__Set___AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getSet_Access().getAttributesAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1151:1: ( rule__Set___AttributesAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1151:2: rule__Set___AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Set___AttributesAssignment_2_1_in_rule__Set___Group_2__1__Impl2312);
            	    rule__Set___AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getAttributesAssignment_2_1()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1161:1: rule__Set___Group_2__2 : rule__Set___Group_2__2__Impl ;
    public final void rule__Set___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1165:1: ( rule__Set___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1166:2: rule__Set___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_2__2__Impl_in_rule__Set___Group_2__22343);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1172:1: rule__Set___Group_2__2__Impl : ( ']' ) ;
    public final void rule__Set___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1176:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1177:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1177:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1178:1: ']'
            {
             before(grammarAccess.getSet_Access().getRightSquareBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Set___Group_2__2__Impl2371); 
             after(grammarAccess.getSet_Access().getRightSquareBracketKeyword_2_2()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1197:1: rule__Set___Group_3__0 : rule__Set___Group_3__0__Impl rule__Set___Group_3__1 ;
    public final void rule__Set___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1201:1: ( rule__Set___Group_3__0__Impl rule__Set___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1202:2: rule__Set___Group_3__0__Impl rule__Set___Group_3__1
            {
            pushFollow(FOLLOW_rule__Set___Group_3__0__Impl_in_rule__Set___Group_3__02408);
            rule__Set___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_3__1_in_rule__Set___Group_3__02411);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1209:1: rule__Set___Group_3__0__Impl : ( '<' ) ;
    public final void rule__Set___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1213:1: ( ( '<' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1214:1: ( '<' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1214:1: ( '<' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1215:1: '<'
            {
             before(grammarAccess.getSet_Access().getLessThanSignKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__Set___Group_3__0__Impl2439); 
             after(grammarAccess.getSet_Access().getLessThanSignKeyword_3_0()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1228:1: rule__Set___Group_3__1 : rule__Set___Group_3__1__Impl rule__Set___Group_3__2 ;
    public final void rule__Set___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1232:1: ( rule__Set___Group_3__1__Impl rule__Set___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1233:2: rule__Set___Group_3__1__Impl rule__Set___Group_3__2
            {
            pushFollow(FOLLOW_rule__Set___Group_3__1__Impl_in_rule__Set___Group_3__12470);
            rule__Set___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_3__2_in_rule__Set___Group_3__12473);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1240:1: rule__Set___Group_3__1__Impl : ( ( rule__Set___DataModelAssignment_3_1 ) ) ;
    public final void rule__Set___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1244:1: ( ( ( rule__Set___DataModelAssignment_3_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1245:1: ( ( rule__Set___DataModelAssignment_3_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1245:1: ( ( rule__Set___DataModelAssignment_3_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1246:1: ( rule__Set___DataModelAssignment_3_1 )
            {
             before(grammarAccess.getSet_Access().getDataModelAssignment_3_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1247:1: ( rule__Set___DataModelAssignment_3_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1247:2: rule__Set___DataModelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Set___DataModelAssignment_3_1_in_rule__Set___Group_3__1__Impl2500);
            rule__Set___DataModelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSet_Access().getDataModelAssignment_3_1()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1257:1: rule__Set___Group_3__2 : rule__Set___Group_3__2__Impl ;
    public final void rule__Set___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1261:1: ( rule__Set___Group_3__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1262:2: rule__Set___Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_3__2__Impl_in_rule__Set___Group_3__22530);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1268:1: rule__Set___Group_3__2__Impl : ( '>' ) ;
    public final void rule__Set___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1272:1: ( ( '>' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1273:1: ( '>' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1273:1: ( '>' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1274:1: '>'
            {
             before(grammarAccess.getSet_Access().getGreaterThanSignKeyword_3_2()); 
            match(input,32,FOLLOW_32_in_rule__Set___Group_3__2__Impl2558); 
             after(grammarAccess.getSet_Access().getGreaterThanSignKeyword_3_2()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1293:1: rule__Set___Group_4__0 : rule__Set___Group_4__0__Impl rule__Set___Group_4__1 ;
    public final void rule__Set___Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1297:1: ( rule__Set___Group_4__0__Impl rule__Set___Group_4__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1298:2: rule__Set___Group_4__0__Impl rule__Set___Group_4__1
            {
            pushFollow(FOLLOW_rule__Set___Group_4__0__Impl_in_rule__Set___Group_4__02595);
            rule__Set___Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__1_in_rule__Set___Group_4__02598);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1305:1: rule__Set___Group_4__0__Impl : ( '{' ) ;
    public final void rule__Set___Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1309:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1310:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1310:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1311:1: '{'
            {
             before(grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__Set___Group_4__0__Impl2626); 
             after(grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_4_0()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1324:1: rule__Set___Group_4__1 : rule__Set___Group_4__1__Impl rule__Set___Group_4__2 ;
    public final void rule__Set___Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1328:1: ( rule__Set___Group_4__1__Impl rule__Set___Group_4__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1329:2: rule__Set___Group_4__1__Impl rule__Set___Group_4__2
            {
            pushFollow(FOLLOW_rule__Set___Group_4__1__Impl_in_rule__Set___Group_4__12657);
            rule__Set___Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__2_in_rule__Set___Group_4__12660);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1336:1: rule__Set___Group_4__1__Impl : ( ( rule__Set___EntitiesAssignment_4_1 )* ) ;
    public final void rule__Set___Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1340:1: ( ( ( rule__Set___EntitiesAssignment_4_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1341:1: ( ( rule__Set___EntitiesAssignment_4_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1341:1: ( ( rule__Set___EntitiesAssignment_4_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1342:1: ( rule__Set___EntitiesAssignment_4_1 )*
            {
             before(grammarAccess.getSet_Access().getEntitiesAssignment_4_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1343:1: ( rule__Set___EntitiesAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30||(LA13_0>=34 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1343:2: rule__Set___EntitiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Set___EntitiesAssignment_4_1_in_rule__Set___Group_4__1__Impl2687);
            	    rule__Set___EntitiesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getEntitiesAssignment_4_1()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1353:1: rule__Set___Group_4__2 : rule__Set___Group_4__2__Impl rule__Set___Group_4__3 ;
    public final void rule__Set___Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1357:1: ( rule__Set___Group_4__2__Impl rule__Set___Group_4__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1358:2: rule__Set___Group_4__2__Impl rule__Set___Group_4__3
            {
            pushFollow(FOLLOW_rule__Set___Group_4__2__Impl_in_rule__Set___Group_4__22718);
            rule__Set___Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__3_in_rule__Set___Group_4__22721);
            rule__Set___Group_4__3();

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1365:1: rule__Set___Group_4__2__Impl : ( ',' ) ;
    public final void rule__Set___Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1369:1: ( ( ',' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1370:1: ( ',' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1370:1: ( ',' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1371:1: ','
            {
             before(grammarAccess.getSet_Access().getCommaKeyword_4_2()); 
            match(input,33,FOLLOW_33_in_rule__Set___Group_4__2__Impl2749); 
             after(grammarAccess.getSet_Access().getCommaKeyword_4_2()); 

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


    // $ANTLR start "rule__Set___Group_4__3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1384:1: rule__Set___Group_4__3 : rule__Set___Group_4__3__Impl rule__Set___Group_4__4 ;
    public final void rule__Set___Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1388:1: ( rule__Set___Group_4__3__Impl rule__Set___Group_4__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1389:2: rule__Set___Group_4__3__Impl rule__Set___Group_4__4
            {
            pushFollow(FOLLOW_rule__Set___Group_4__3__Impl_in_rule__Set___Group_4__32780);
            rule__Set___Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set___Group_4__4_in_rule__Set___Group_4__32783);
            rule__Set___Group_4__4();

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
    // $ANTLR end "rule__Set___Group_4__3"


    // $ANTLR start "rule__Set___Group_4__3__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1396:1: rule__Set___Group_4__3__Impl : ( ( rule__Set___QualitySpecificationsAssignment_4_3 )* ) ;
    public final void rule__Set___Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1400:1: ( ( ( rule__Set___QualitySpecificationsAssignment_4_3 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1401:1: ( ( rule__Set___QualitySpecificationsAssignment_4_3 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1401:1: ( ( rule__Set___QualitySpecificationsAssignment_4_3 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1402:1: ( rule__Set___QualitySpecificationsAssignment_4_3 )*
            {
             before(grammarAccess.getSet_Access().getQualitySpecificationsAssignment_4_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1403:1: ( rule__Set___QualitySpecificationsAssignment_4_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1403:2: rule__Set___QualitySpecificationsAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__Set___QualitySpecificationsAssignment_4_3_in_rule__Set___Group_4__3__Impl2810);
            	    rule__Set___QualitySpecificationsAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSet_Access().getQualitySpecificationsAssignment_4_3()); 

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
    // $ANTLR end "rule__Set___Group_4__3__Impl"


    // $ANTLR start "rule__Set___Group_4__4"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1413:1: rule__Set___Group_4__4 : rule__Set___Group_4__4__Impl ;
    public final void rule__Set___Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1417:1: ( rule__Set___Group_4__4__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1418:2: rule__Set___Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Set___Group_4__4__Impl_in_rule__Set___Group_4__42841);
            rule__Set___Group_4__4__Impl();

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
    // $ANTLR end "rule__Set___Group_4__4"


    // $ANTLR start "rule__Set___Group_4__4__Impl"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1424:1: rule__Set___Group_4__4__Impl : ( '}' ) ;
    public final void rule__Set___Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1428:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1429:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1429:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1430:1: '}'
            {
             before(grammarAccess.getSet_Access().getRightCurlyBracketKeyword_4_4()); 
            match(input,29,FOLLOW_29_in_rule__Set___Group_4__4__Impl2869); 
             after(grammarAccess.getSet_Access().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Set___Group_4__4__Impl"


    // $ANTLR start "rule__Struct___Group__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1453:1: rule__Struct___Group__0 : rule__Struct___Group__0__Impl rule__Struct___Group__1 ;
    public final void rule__Struct___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1457:1: ( rule__Struct___Group__0__Impl rule__Struct___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1458:2: rule__Struct___Group__0__Impl rule__Struct___Group__1
            {
            pushFollow(FOLLOW_rule__Struct___Group__0__Impl_in_rule__Struct___Group__02910);
            rule__Struct___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__1_in_rule__Struct___Group__02913);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1465:1: rule__Struct___Group__0__Impl : ( 'Struct' ) ;
    public final void rule__Struct___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1469:1: ( ( 'Struct' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1470:1: ( 'Struct' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1470:1: ( 'Struct' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1471:1: 'Struct'
            {
             before(grammarAccess.getStruct_Access().getStructKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Struct___Group__0__Impl2941); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1484:1: rule__Struct___Group__1 : rule__Struct___Group__1__Impl rule__Struct___Group__2 ;
    public final void rule__Struct___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1488:1: ( rule__Struct___Group__1__Impl rule__Struct___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1489:2: rule__Struct___Group__1__Impl rule__Struct___Group__2
            {
            pushFollow(FOLLOW_rule__Struct___Group__1__Impl_in_rule__Struct___Group__12972);
            rule__Struct___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__2_in_rule__Struct___Group__12975);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1496:1: rule__Struct___Group__1__Impl : ( ( rule__Struct___NameAssignment_1 ) ) ;
    public final void rule__Struct___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1500:1: ( ( ( rule__Struct___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1501:1: ( ( rule__Struct___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1501:1: ( ( rule__Struct___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1502:1: ( rule__Struct___NameAssignment_1 )
            {
             before(grammarAccess.getStruct_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1503:1: ( rule__Struct___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1503:2: rule__Struct___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Struct___NameAssignment_1_in_rule__Struct___Group__1__Impl3002);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1513:1: rule__Struct___Group__2 : rule__Struct___Group__2__Impl rule__Struct___Group__3 ;
    public final void rule__Struct___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1517:1: ( rule__Struct___Group__2__Impl rule__Struct___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1518:2: rule__Struct___Group__2__Impl rule__Struct___Group__3
            {
            pushFollow(FOLLOW_rule__Struct___Group__2__Impl_in_rule__Struct___Group__23032);
            rule__Struct___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group__3_in_rule__Struct___Group__23035);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1525:1: rule__Struct___Group__2__Impl : ( ( rule__Struct___Group_2__0 )? ) ;
    public final void rule__Struct___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1529:1: ( ( ( rule__Struct___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1530:1: ( ( rule__Struct___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1530:1: ( ( rule__Struct___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1531:1: ( rule__Struct___Group_2__0 )?
            {
             before(grammarAccess.getStruct_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1532:1: ( rule__Struct___Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1532:2: rule__Struct___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Struct___Group_2__0_in_rule__Struct___Group__2__Impl3062);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1542:1: rule__Struct___Group__3 : rule__Struct___Group__3__Impl ;
    public final void rule__Struct___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1546:1: ( rule__Struct___Group__3__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1547:2: rule__Struct___Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group__3__Impl_in_rule__Struct___Group__33093);
            rule__Struct___Group__3__Impl();

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1553:1: rule__Struct___Group__3__Impl : ( ( rule__Struct___Group_3__0 )? ) ;
    public final void rule__Struct___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1557:1: ( ( ( rule__Struct___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1558:1: ( ( rule__Struct___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1558:1: ( ( rule__Struct___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1559:1: ( rule__Struct___Group_3__0 )?
            {
             before(grammarAccess.getStruct_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1560:1: ( rule__Struct___Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1560:2: rule__Struct___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Struct___Group_3__0_in_rule__Struct___Group__3__Impl3120);
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


    // $ANTLR start "rule__Struct___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1578:1: rule__Struct___Group_2__0 : rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1 ;
    public final void rule__Struct___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1582:1: ( rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1583:2: rule__Struct___Group_2__0__Impl rule__Struct___Group_2__1
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__0__Impl_in_rule__Struct___Group_2__03159);
            rule__Struct___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_2__1_in_rule__Struct___Group_2__03162);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1590:1: rule__Struct___Group_2__0__Impl : ( '[' ) ;
    public final void rule__Struct___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1594:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1595:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1595:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1596:1: '['
            {
             before(grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Struct___Group_2__0__Impl3190); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1609:1: rule__Struct___Group_2__1 : rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2 ;
    public final void rule__Struct___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1613:1: ( rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1614:2: rule__Struct___Group_2__1__Impl rule__Struct___Group_2__2
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__1__Impl_in_rule__Struct___Group_2__13221);
            rule__Struct___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_2__2_in_rule__Struct___Group_2__13224);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1621:1: rule__Struct___Group_2__1__Impl : ( ( rule__Struct___AttributesAssignment_2_1 )* ) ;
    public final void rule__Struct___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1625:1: ( ( ( rule__Struct___AttributesAssignment_2_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1626:1: ( ( rule__Struct___AttributesAssignment_2_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1626:1: ( ( rule__Struct___AttributesAssignment_2_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1627:1: ( rule__Struct___AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getStruct_Access().getAttributesAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1628:1: ( rule__Struct___AttributesAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1628:2: rule__Struct___AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Struct___AttributesAssignment_2_1_in_rule__Struct___Group_2__1__Impl3251);
            	    rule__Struct___AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1638:1: rule__Struct___Group_2__2 : rule__Struct___Group_2__2__Impl ;
    public final void rule__Struct___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1642:1: ( rule__Struct___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1643:2: rule__Struct___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group_2__2__Impl_in_rule__Struct___Group_2__23282);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1649:1: rule__Struct___Group_2__2__Impl : ( ']' ) ;
    public final void rule__Struct___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1653:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1654:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1654:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1655:1: ']'
            {
             before(grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Struct___Group_2__2__Impl3310); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1674:1: rule__Struct___Group_3__0 : rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1 ;
    public final void rule__Struct___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1678:1: ( rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1679:2: rule__Struct___Group_3__0__Impl rule__Struct___Group_3__1
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__0__Impl_in_rule__Struct___Group_3__03347);
            rule__Struct___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_3__1_in_rule__Struct___Group_3__03350);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1686:1: rule__Struct___Group_3__0__Impl : ( '{' ) ;
    public final void rule__Struct___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1690:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1691:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1691:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1692:1: '{'
            {
             before(grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Struct___Group_3__0__Impl3378); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1705:1: rule__Struct___Group_3__1 : rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2 ;
    public final void rule__Struct___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1709:1: ( rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1710:2: rule__Struct___Group_3__1__Impl rule__Struct___Group_3__2
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__1__Impl_in_rule__Struct___Group_3__13409);
            rule__Struct___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct___Group_3__2_in_rule__Struct___Group_3__13412);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1717:1: rule__Struct___Group_3__1__Impl : ( ( rule__Struct___EntitiesAssignment_3_1 )* ) ;
    public final void rule__Struct___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1721:1: ( ( ( rule__Struct___EntitiesAssignment_3_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1722:1: ( ( rule__Struct___EntitiesAssignment_3_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1722:1: ( ( rule__Struct___EntitiesAssignment_3_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1723:1: ( rule__Struct___EntitiesAssignment_3_1 )*
            {
             before(grammarAccess.getStruct_Access().getEntitiesAssignment_3_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1724:1: ( rule__Struct___EntitiesAssignment_3_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30||(LA18_0>=34 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1724:2: rule__Struct___EntitiesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Struct___EntitiesAssignment_3_1_in_rule__Struct___Group_3__1__Impl3439);
            	    rule__Struct___EntitiesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1734:1: rule__Struct___Group_3__2 : rule__Struct___Group_3__2__Impl ;
    public final void rule__Struct___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1738:1: ( rule__Struct___Group_3__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1739:2: rule__Struct___Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Struct___Group_3__2__Impl_in_rule__Struct___Group_3__23470);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1745:1: rule__Struct___Group_3__2__Impl : ( '}' ) ;
    public final void rule__Struct___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1749:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1750:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1750:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1751:1: '}'
            {
             before(grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2()); 
            match(input,29,FOLLOW_29_in_rule__Struct___Group_3__2__Impl3498); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1770:1: rule__Relationship___Group__0 : rule__Relationship___Group__0__Impl rule__Relationship___Group__1 ;
    public final void rule__Relationship___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1774:1: ( rule__Relationship___Group__0__Impl rule__Relationship___Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1775:2: rule__Relationship___Group__0__Impl rule__Relationship___Group__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group__0__Impl_in_rule__Relationship___Group__03535);
            rule__Relationship___Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__1_in_rule__Relationship___Group__03538);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1782:1: rule__Relationship___Group__0__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1786:1: ( ( 'Relationship' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1787:1: ( 'Relationship' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1787:1: ( 'Relationship' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1788:1: 'Relationship'
            {
             before(grammarAccess.getRelationship_Access().getRelationshipKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Relationship___Group__0__Impl3566); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1801:1: rule__Relationship___Group__1 : rule__Relationship___Group__1__Impl rule__Relationship___Group__2 ;
    public final void rule__Relationship___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1805:1: ( rule__Relationship___Group__1__Impl rule__Relationship___Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1806:2: rule__Relationship___Group__1__Impl rule__Relationship___Group__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group__1__Impl_in_rule__Relationship___Group__13597);
            rule__Relationship___Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__2_in_rule__Relationship___Group__13600);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1813:1: rule__Relationship___Group__1__Impl : ( ( rule__Relationship___NameAssignment_1 ) ) ;
    public final void rule__Relationship___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1817:1: ( ( ( rule__Relationship___NameAssignment_1 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1818:1: ( ( rule__Relationship___NameAssignment_1 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1818:1: ( ( rule__Relationship___NameAssignment_1 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1819:1: ( rule__Relationship___NameAssignment_1 )
            {
             before(grammarAccess.getRelationship_Access().getNameAssignment_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1820:1: ( rule__Relationship___NameAssignment_1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1820:2: rule__Relationship___NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Relationship___NameAssignment_1_in_rule__Relationship___Group__1__Impl3627);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1830:1: rule__Relationship___Group__2 : rule__Relationship___Group__2__Impl rule__Relationship___Group__3 ;
    public final void rule__Relationship___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1834:1: ( rule__Relationship___Group__2__Impl rule__Relationship___Group__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1835:2: rule__Relationship___Group__2__Impl rule__Relationship___Group__3
            {
            pushFollow(FOLLOW_rule__Relationship___Group__2__Impl_in_rule__Relationship___Group__23657);
            rule__Relationship___Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group__3_in_rule__Relationship___Group__23660);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1842:1: rule__Relationship___Group__2__Impl : ( ( rule__Relationship___Group_2__0 )? ) ;
    public final void rule__Relationship___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1846:1: ( ( ( rule__Relationship___Group_2__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1847:1: ( ( rule__Relationship___Group_2__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1847:1: ( ( rule__Relationship___Group_2__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1848:1: ( rule__Relationship___Group_2__0 )?
            {
             before(grammarAccess.getRelationship_Access().getGroup_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1849:1: ( rule__Relationship___Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1849:2: rule__Relationship___Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Relationship___Group_2__0_in_rule__Relationship___Group__2__Impl3687);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1859:1: rule__Relationship___Group__3 : rule__Relationship___Group__3__Impl ;
    public final void rule__Relationship___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1863:1: ( rule__Relationship___Group__3__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1864:2: rule__Relationship___Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group__3__Impl_in_rule__Relationship___Group__33718);
            rule__Relationship___Group__3__Impl();

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1870:1: rule__Relationship___Group__3__Impl : ( ( rule__Relationship___Group_3__0 )? ) ;
    public final void rule__Relationship___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1874:1: ( ( ( rule__Relationship___Group_3__0 )? ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1875:1: ( ( rule__Relationship___Group_3__0 )? )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1875:1: ( ( rule__Relationship___Group_3__0 )? )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1876:1: ( rule__Relationship___Group_3__0 )?
            {
             before(grammarAccess.getRelationship_Access().getGroup_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1877:1: ( rule__Relationship___Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1877:2: rule__Relationship___Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Relationship___Group_3__0_in_rule__Relationship___Group__3__Impl3745);
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


    // $ANTLR start "rule__Relationship___Group_2__0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1895:1: rule__Relationship___Group_2__0 : rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1 ;
    public final void rule__Relationship___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1899:1: ( rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1900:2: rule__Relationship___Group_2__0__Impl rule__Relationship___Group_2__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__0__Impl_in_rule__Relationship___Group_2__03784);
            rule__Relationship___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_2__1_in_rule__Relationship___Group_2__03787);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1907:1: rule__Relationship___Group_2__0__Impl : ( '[' ) ;
    public final void rule__Relationship___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1911:1: ( ( '[' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1912:1: ( '[' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1912:1: ( '[' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1913:1: '['
            {
             before(grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Relationship___Group_2__0__Impl3815); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1926:1: rule__Relationship___Group_2__1 : rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2 ;
    public final void rule__Relationship___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1930:1: ( rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1931:2: rule__Relationship___Group_2__1__Impl rule__Relationship___Group_2__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__1__Impl_in_rule__Relationship___Group_2__13846);
            rule__Relationship___Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_2__2_in_rule__Relationship___Group_2__13849);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1938:1: rule__Relationship___Group_2__1__Impl : ( ( rule__Relationship___AttributesAssignment_2_1 )* ) ;
    public final void rule__Relationship___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1942:1: ( ( ( rule__Relationship___AttributesAssignment_2_1 )* ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1943:1: ( ( rule__Relationship___AttributesAssignment_2_1 )* )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1943:1: ( ( rule__Relationship___AttributesAssignment_2_1 )* )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1944:1: ( rule__Relationship___AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getRelationship_Access().getAttributesAssignment_2_1()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1945:1: ( rule__Relationship___AttributesAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1945:2: rule__Relationship___AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Relationship___AttributesAssignment_2_1_in_rule__Relationship___Group_2__1__Impl3876);
            	    rule__Relationship___AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1955:1: rule__Relationship___Group_2__2 : rule__Relationship___Group_2__2__Impl ;
    public final void rule__Relationship___Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1959:1: ( rule__Relationship___Group_2__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1960:2: rule__Relationship___Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group_2__2__Impl_in_rule__Relationship___Group_2__23907);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1966:1: rule__Relationship___Group_2__2__Impl : ( ']' ) ;
    public final void rule__Relationship___Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1970:1: ( ( ']' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1971:1: ( ']' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1971:1: ( ']' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1972:1: ']'
            {
             before(grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__Relationship___Group_2__2__Impl3935); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1991:1: rule__Relationship___Group_3__0 : rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1 ;
    public final void rule__Relationship___Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1995:1: ( rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:1996:2: rule__Relationship___Group_3__0__Impl rule__Relationship___Group_3__1
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__0__Impl_in_rule__Relationship___Group_3__03972);
            rule__Relationship___Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__1_in_rule__Relationship___Group_3__03975);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2003:1: rule__Relationship___Group_3__0__Impl : ( '{' ) ;
    public final void rule__Relationship___Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2007:1: ( ( '{' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2008:1: ( '{' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2008:1: ( '{' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2009:1: '{'
            {
             before(grammarAccess.getRelationship_Access().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Relationship___Group_3__0__Impl4003); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2022:1: rule__Relationship___Group_3__1 : rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2 ;
    public final void rule__Relationship___Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2026:1: ( rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2027:2: rule__Relationship___Group_3__1__Impl rule__Relationship___Group_3__2
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__1__Impl_in_rule__Relationship___Group_3__14034);
            rule__Relationship___Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__2_in_rule__Relationship___Group_3__14037);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2034:1: rule__Relationship___Group_3__1__Impl : ( 'start' ) ;
    public final void rule__Relationship___Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2038:1: ( ( 'start' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2039:1: ( 'start' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2039:1: ( 'start' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2040:1: 'start'
            {
             before(grammarAccess.getRelationship_Access().getStartKeyword_3_1()); 
            match(input,36,FOLLOW_36_in_rule__Relationship___Group_3__1__Impl4065); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2053:1: rule__Relationship___Group_3__2 : rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3 ;
    public final void rule__Relationship___Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2057:1: ( rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2058:2: rule__Relationship___Group_3__2__Impl rule__Relationship___Group_3__3
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__2__Impl_in_rule__Relationship___Group_3__24096);
            rule__Relationship___Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__3_in_rule__Relationship___Group_3__24099);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2065:1: rule__Relationship___Group_3__2__Impl : ( '=' ) ;
    public final void rule__Relationship___Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2069:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2070:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2070:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2071:1: '='
            {
             before(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_2()); 
            match(input,37,FOLLOW_37_in_rule__Relationship___Group_3__2__Impl4127); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2084:1: rule__Relationship___Group_3__3 : rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4 ;
    public final void rule__Relationship___Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2088:1: ( rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2089:2: rule__Relationship___Group_3__3__Impl rule__Relationship___Group_3__4
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__3__Impl_in_rule__Relationship___Group_3__34158);
            rule__Relationship___Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__4_in_rule__Relationship___Group_3__34161);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2096:1: rule__Relationship___Group_3__3__Impl : ( ( rule__Relationship___StartAssignment_3_3 ) ) ;
    public final void rule__Relationship___Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2100:1: ( ( ( rule__Relationship___StartAssignment_3_3 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2101:1: ( ( rule__Relationship___StartAssignment_3_3 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2101:1: ( ( rule__Relationship___StartAssignment_3_3 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2102:1: ( rule__Relationship___StartAssignment_3_3 )
            {
             before(grammarAccess.getRelationship_Access().getStartAssignment_3_3()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2103:1: ( rule__Relationship___StartAssignment_3_3 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2103:2: rule__Relationship___StartAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Relationship___StartAssignment_3_3_in_rule__Relationship___Group_3__3__Impl4188);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2113:1: rule__Relationship___Group_3__4 : rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5 ;
    public final void rule__Relationship___Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2117:1: ( rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2118:2: rule__Relationship___Group_3__4__Impl rule__Relationship___Group_3__5
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__4__Impl_in_rule__Relationship___Group_3__44218);
            rule__Relationship___Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__5_in_rule__Relationship___Group_3__44221);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2125:1: rule__Relationship___Group_3__4__Impl : ( 'end' ) ;
    public final void rule__Relationship___Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2129:1: ( ( 'end' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2130:1: ( 'end' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2130:1: ( 'end' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2131:1: 'end'
            {
             before(grammarAccess.getRelationship_Access().getEndKeyword_3_4()); 
            match(input,38,FOLLOW_38_in_rule__Relationship___Group_3__4__Impl4249); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2144:1: rule__Relationship___Group_3__5 : rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6 ;
    public final void rule__Relationship___Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2148:1: ( rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2149:2: rule__Relationship___Group_3__5__Impl rule__Relationship___Group_3__6
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__5__Impl_in_rule__Relationship___Group_3__54280);
            rule__Relationship___Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__6_in_rule__Relationship___Group_3__54283);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2156:1: rule__Relationship___Group_3__5__Impl : ( '=' ) ;
    public final void rule__Relationship___Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2160:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2161:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2161:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2162:1: '='
            {
             before(grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_5()); 
            match(input,37,FOLLOW_37_in_rule__Relationship___Group_3__5__Impl4311); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2175:1: rule__Relationship___Group_3__6 : rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7 ;
    public final void rule__Relationship___Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2179:1: ( rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2180:2: rule__Relationship___Group_3__6__Impl rule__Relationship___Group_3__7
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__6__Impl_in_rule__Relationship___Group_3__64342);
            rule__Relationship___Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relationship___Group_3__7_in_rule__Relationship___Group_3__64345);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2187:1: rule__Relationship___Group_3__6__Impl : ( ( rule__Relationship___EndAssignment_3_6 ) ) ;
    public final void rule__Relationship___Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2191:1: ( ( ( rule__Relationship___EndAssignment_3_6 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2192:1: ( ( rule__Relationship___EndAssignment_3_6 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2192:1: ( ( rule__Relationship___EndAssignment_3_6 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2193:1: ( rule__Relationship___EndAssignment_3_6 )
            {
             before(grammarAccess.getRelationship_Access().getEndAssignment_3_6()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2194:1: ( rule__Relationship___EndAssignment_3_6 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2194:2: rule__Relationship___EndAssignment_3_6
            {
            pushFollow(FOLLOW_rule__Relationship___EndAssignment_3_6_in_rule__Relationship___Group_3__6__Impl4372);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2204:1: rule__Relationship___Group_3__7 : rule__Relationship___Group_3__7__Impl ;
    public final void rule__Relationship___Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2208:1: ( rule__Relationship___Group_3__7__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2209:2: rule__Relationship___Group_3__7__Impl
            {
            pushFollow(FOLLOW_rule__Relationship___Group_3__7__Impl_in_rule__Relationship___Group_3__74402);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2215:1: rule__Relationship___Group_3__7__Impl : ( '}' ) ;
    public final void rule__Relationship___Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2219:1: ( ( '}' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2220:1: ( '}' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2220:1: ( '}' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2221:1: '}'
            {
             before(grammarAccess.getRelationship_Access().getRightCurlyBracketKeyword_3_7()); 
            match(input,29,FOLLOW_29_in_rule__Relationship___Group_3__7__Impl4430); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2250:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2254:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2255:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04477);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04480);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2262:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2266:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2267:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2267:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2268:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2269:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2269:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4507);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2279:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2283:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2284:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14537);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14540);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2291:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2295:1: ( ( '=' ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2296:1: ( '=' )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2296:1: ( '=' )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2297:1: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Attribute__Group__1__Impl4568); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2310:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2314:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2315:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24599);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2321:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2325:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2326:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2326:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2327:1: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2328:1: ( rule__Attribute__ValueAssignment_2 )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2328:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4626);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 

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


    // $ANTLR start "rule__Schema__NameAssignment_0"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2345:1: rule__Schema__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2349:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2350:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2350:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2351:1: RULE_ID
            {
             before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_04667); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2360:1: rule__Schema__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Schema__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2364:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2365:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2365:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2366:1: ruleAttribute
            {
             before(grammarAccess.getSchemaAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Schema__AttributesAssignment_1_14698);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2375:1: rule__Schema__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__Schema__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2379:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2380:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2380:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2381:1: ruleEntity
            {
             before(grammarAccess.getSchemaAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Schema__EntitiesAssignment_24729);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2390:1: rule__QualitySpecification__CharacteristicAssignment_0 : ( ruleQualityCharacteristic ) ;
    public final void rule__QualitySpecification__CharacteristicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2394:1: ( ( ruleQualityCharacteristic ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2395:1: ( ruleQualityCharacteristic )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2395:1: ( ruleQualityCharacteristic )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2396:1: ruleQualityCharacteristic
            {
             before(grammarAccess.getQualitySpecificationAccess().getCharacteristicQualityCharacteristicParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualityCharacteristic_in_rule__QualitySpecification__CharacteristicAssignment_04760);
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


    // $ANTLR start "rule__QualitySpecification__SubCharacteristicsAssignment_2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2405:1: rule__QualitySpecification__SubCharacteristicsAssignment_2 : ( ruleQualitySubCharacteristic ) ;
    public final void rule__QualitySpecification__SubCharacteristicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2409:1: ( ( ruleQualitySubCharacteristic ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2410:1: ( ruleQualitySubCharacteristic )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2410:1: ( ruleQualitySubCharacteristic )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2411:1: ruleQualitySubCharacteristic
            {
             before(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_rule__QualitySpecification__SubCharacteristicsAssignment_24791);
            ruleQualitySubCharacteristic();

            state._fsp--;

             after(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QualitySpecification__SubCharacteristicsAssignment_2"


    // $ANTLR start "rule__Set___NameAssignment_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2420:1: rule__Set___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Set___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2424:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2425:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2425:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2426:1: RULE_ID
            {
             before(grammarAccess.getSet_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Set___NameAssignment_14822); 
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


    // $ANTLR start "rule__Set___AttributesAssignment_2_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2435:1: rule__Set___AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Set___AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2439:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2440:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2440:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2441:1: ruleAttribute
            {
             before(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Set___AttributesAssignment_2_14853);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Set___AttributesAssignment_2_1"


    // $ANTLR start "rule__Set___DataModelAssignment_3_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2450:1: rule__Set___DataModelAssignment_3_1 : ( ruleDataModel ) ;
    public final void rule__Set___DataModelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2454:1: ( ( ruleDataModel ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2455:1: ( ruleDataModel )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2455:1: ( ruleDataModel )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2456:1: ruleDataModel
            {
             before(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleDataModel_in_rule__Set___DataModelAssignment_3_14884);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Set___DataModelAssignment_3_1"


    // $ANTLR start "rule__Set___EntitiesAssignment_4_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2465:1: rule__Set___EntitiesAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Set___EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2469:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2470:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2470:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2471:1: ruleEntity
            {
             before(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Set___EntitiesAssignment_4_14915);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Set___EntitiesAssignment_4_1"


    // $ANTLR start "rule__Set___QualitySpecificationsAssignment_4_3"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2480:1: rule__Set___QualitySpecificationsAssignment_4_3 : ( ruleQualitySpecification ) ;
    public final void rule__Set___QualitySpecificationsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2484:1: ( ( ruleQualitySpecification ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2485:1: ( ruleQualitySpecification )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2485:1: ( ruleQualitySpecification )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2486:1: ruleQualitySpecification
            {
             before(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleQualitySpecification_in_rule__Set___QualitySpecificationsAssignment_4_34946);
            ruleQualitySpecification();

            state._fsp--;

             after(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Set___QualitySpecificationsAssignment_4_3"


    // $ANTLR start "rule__Struct___NameAssignment_1"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2495:1: rule__Struct___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Struct___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2499:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2500:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2500:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2501:1: RULE_ID
            {
             before(grammarAccess.getStruct_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct___NameAssignment_14977); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2510:1: rule__Struct___AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Struct___AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2514:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2515:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2515:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2516:1: ruleAttribute
            {
             before(grammarAccess.getStruct_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Struct___AttributesAssignment_2_15008);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2525:1: rule__Struct___EntitiesAssignment_3_1 : ( ruleEntity ) ;
    public final void rule__Struct___EntitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2529:1: ( ( ruleEntity ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2530:1: ( ruleEntity )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2530:1: ( ruleEntity )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2531:1: ruleEntity
            {
             before(grammarAccess.getStruct_Access().getEntitiesEntityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Struct___EntitiesAssignment_3_15039);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2540:1: rule__Relationship___NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship___NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2544:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2545:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2545:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2546:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___NameAssignment_15070); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2555:1: rule__Relationship___AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relationship___AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2559:1: ( ( ruleAttribute ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2560:1: ( ruleAttribute )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2560:1: ( ruleAttribute )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2561:1: ruleAttribute
            {
             before(grammarAccess.getRelationship_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Relationship___AttributesAssignment_2_15101);
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2570:1: rule__Relationship___StartAssignment_3_3 : ( RULE_ID ) ;
    public final void rule__Relationship___StartAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2574:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2575:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2575:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2576:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getStartIDTerminalRuleCall_3_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___StartAssignment_3_35132); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2585:1: rule__Relationship___EndAssignment_3_6 : ( RULE_ID ) ;
    public final void rule__Relationship___EndAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2589:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2590:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2590:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2591:1: RULE_ID
            {
             before(grammarAccess.getRelationship_Access().getEndIDTerminalRuleCall_3_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship___EndAssignment_3_65163); 
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
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2600:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2604:1: ( ( RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2605:1: ( RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2605:1: ( RULE_ID )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2606:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_05194); 
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


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2615:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2619:1: ( ( RULE_STRING ) )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2620:1: ( RULE_STRING )
            {
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2620:1: ( RULE_STRING )
            // ../fr.imag.qdbenchmark.dsl.ui/src-gen/fr/imag/qdbenchmark/ui/contentassist/antlr/internal/InternalQdBenchmarkDsl.g:2621:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_25225); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__ValueAssignment_2"

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
    public static final BitSet FOLLOW_rule__Schema__Group__0__Impl_in_rule__Schema__Group__01039 = new BitSet(new long[]{0x0000000C41000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__1_in_rule__Schema__Group__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__NameAssignment_0_in_rule__Schema__Group__0__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__1__Impl_in_rule__Schema__Group__11099 = new BitSet(new long[]{0x0000000C41000000L});
    public static final BitSet FOLLOW_rule__Schema__Group__2_in_rule__Schema__Group__11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group_1__0_in_rule__Schema__Group__1__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__Group__2__Impl_in_rule__Schema__Group__21160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Schema__EntitiesAssignment_2_in_rule__Schema__Group__2__Impl1187 = new BitSet(new long[]{0x0000000C40000002L});
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
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__1__Impl_in_rule__QualitySpecification__Group__11718 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__2_in_rule__QualitySpecification__Group__11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualitySpecification__Group__1__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__2__Impl_in_rule__QualitySpecification__Group__21780 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__3_in_rule__QualitySpecification__Group__21783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__SubCharacteristicsAssignment_2_in_rule__QualitySpecification__Group__2__Impl1810 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QualitySpecification__Group__3__Impl_in_rule__QualitySpecification__Group__31841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualitySpecification__Group__3__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__0__Impl_in_rule__Set___Group__01908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Set___Group__1_in_rule__Set___Group__01911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Set___Group__0__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__1__Impl_in_rule__Set___Group__11970 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Set___Group__2_in_rule__Set___Group__11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___NameAssignment_1_in_rule__Set___Group__1__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__2__Impl_in_rule__Set___Group__22030 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Set___Group__3_in_rule__Set___Group__22033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__0_in_rule__Set___Group__2__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__3__Impl_in_rule__Set___Group__32091 = new BitSet(new long[]{0x0000000091000000L});
    public static final BitSet FOLLOW_rule__Set___Group__4_in_rule__Set___Group__32094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__0_in_rule__Set___Group__3__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group__4__Impl_in_rule__Set___Group__42152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__0_in_rule__Set___Group__4__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__0__Impl_in_rule__Set___Group_2__02220 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Set___Group_2__1_in_rule__Set___Group_2__02223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Set___Group_2__0__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_2__1__Impl_in_rule__Set___Group_2__12282 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Set___Group_2__2_in_rule__Set___Group_2__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___AttributesAssignment_2_1_in_rule__Set___Group_2__1__Impl2312 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Set___Group_2__2__Impl_in_rule__Set___Group_2__22343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Set___Group_2__2__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__0__Impl_in_rule__Set___Group_3__02408 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Set___Group_3__1_in_rule__Set___Group_3__02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Set___Group_3__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__1__Impl_in_rule__Set___Group_3__12470 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Set___Group_3__2_in_rule__Set___Group_3__12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___DataModelAssignment_3_1_in_rule__Set___Group_3__1__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_3__2__Impl_in_rule__Set___Group_3__22530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Set___Group_3__2__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__0__Impl_in_rule__Set___Group_4__02595 = new BitSet(new long[]{0x0000000E40000000L});
    public static final BitSet FOLLOW_rule__Set___Group_4__1_in_rule__Set___Group_4__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Set___Group_4__0__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__1__Impl_in_rule__Set___Group_4__12657 = new BitSet(new long[]{0x0000000E40000000L});
    public static final BitSet FOLLOW_rule__Set___Group_4__2_in_rule__Set___Group_4__12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___EntitiesAssignment_4_1_in_rule__Set___Group_4__1__Impl2687 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__2__Impl_in_rule__Set___Group_4__22718 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__Set___Group_4__3_in_rule__Set___Group_4__22721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Set___Group_4__2__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__3__Impl_in_rule__Set___Group_4__32780 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__Set___Group_4__4_in_rule__Set___Group_4__32783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set___QualitySpecificationsAssignment_4_3_in_rule__Set___Group_4__3__Impl2810 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Set___Group_4__4__Impl_in_rule__Set___Group_4__42841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Set___Group_4__4__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__0__Impl_in_rule__Struct___Group__02910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Struct___Group__1_in_rule__Struct___Group__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Struct___Group__0__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__1__Impl_in_rule__Struct___Group__12972 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Struct___Group__2_in_rule__Struct___Group__12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___NameAssignment_1_in_rule__Struct___Group__1__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__2__Impl_in_rule__Struct___Group__23032 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Struct___Group__3_in_rule__Struct___Group__23035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__0_in_rule__Struct___Group__2__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group__3__Impl_in_rule__Struct___Group__33093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__0_in_rule__Struct___Group__3__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__0__Impl_in_rule__Struct___Group_2__03159 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__1_in_rule__Struct___Group_2__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Struct___Group_2__0__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__1__Impl_in_rule__Struct___Group_2__13221 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__2_in_rule__Struct___Group_2__13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___AttributesAssignment_2_1_in_rule__Struct___Group_2__1__Impl3251 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Struct___Group_2__2__Impl_in_rule__Struct___Group_2__23282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Struct___Group_2__2__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__0__Impl_in_rule__Struct___Group_3__03347 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__1_in_rule__Struct___Group_3__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Struct___Group_3__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__1__Impl_in_rule__Struct___Group_3__13409 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__2_in_rule__Struct___Group_3__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct___EntitiesAssignment_3_1_in_rule__Struct___Group_3__1__Impl3439 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_rule__Struct___Group_3__2__Impl_in_rule__Struct___Group_3__23470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Struct___Group_3__2__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__0__Impl_in_rule__Relationship___Group__03535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group__1_in_rule__Relationship___Group__03538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Relationship___Group__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__1__Impl_in_rule__Relationship___Group__13597 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group__2_in_rule__Relationship___Group__13600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___NameAssignment_1_in_rule__Relationship___Group__1__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__2__Impl_in_rule__Relationship___Group__23657 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group__3_in_rule__Relationship___Group__23660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__0_in_rule__Relationship___Group__2__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group__3__Impl_in_rule__Relationship___Group__33718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__0_in_rule__Relationship___Group__3__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__0__Impl_in_rule__Relationship___Group_2__03784 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__1_in_rule__Relationship___Group_2__03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Relationship___Group_2__0__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__1__Impl_in_rule__Relationship___Group_2__13846 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__2_in_rule__Relationship___Group_2__13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___AttributesAssignment_2_1_in_rule__Relationship___Group_2__1__Impl3876 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Relationship___Group_2__2__Impl_in_rule__Relationship___Group_2__23907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Relationship___Group_2__2__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__0__Impl_in_rule__Relationship___Group_3__03972 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__1_in_rule__Relationship___Group_3__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relationship___Group_3__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__1__Impl_in_rule__Relationship___Group_3__14034 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__2_in_rule__Relationship___Group_3__14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Relationship___Group_3__1__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__2__Impl_in_rule__Relationship___Group_3__24096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__3_in_rule__Relationship___Group_3__24099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Relationship___Group_3__2__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__3__Impl_in_rule__Relationship___Group_3__34158 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__4_in_rule__Relationship___Group_3__34161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___StartAssignment_3_3_in_rule__Relationship___Group_3__3__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__4__Impl_in_rule__Relationship___Group_3__44218 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__5_in_rule__Relationship___Group_3__44221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Relationship___Group_3__4__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__5__Impl_in_rule__Relationship___Group_3__54280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__6_in_rule__Relationship___Group_3__54283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Relationship___Group_3__5__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__6__Impl_in_rule__Relationship___Group_3__64342 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__7_in_rule__Relationship___Group_3__64345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___EndAssignment_3_6_in_rule__Relationship___Group_3__6__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship___Group_3__7__Impl_in_rule__Relationship___Group_3__74402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relationship___Group_3__7__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04477 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Schema__NameAssignment_04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Schema__AttributesAssignment_1_14698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Schema__EntitiesAssignment_24729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_rule__QualitySpecification__CharacteristicAssignment_04760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_rule__QualitySpecification__SubCharacteristicsAssignment_24791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Set___NameAssignment_14822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Set___AttributesAssignment_2_14853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Set___DataModelAssignment_3_14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Set___EntitiesAssignment_4_14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_rule__Set___QualitySpecificationsAssignment_4_34946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct___NameAssignment_14977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Struct___AttributesAssignment_2_15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Struct___EntitiesAssignment_3_15039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___NameAssignment_15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Relationship___AttributesAssignment_2_15101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___StartAssignment_3_35132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship___EndAssignment_3_65163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_25225 = new BitSet(new long[]{0x0000000000000002L});

}