package fr.imag.qdbenchmark.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imag.qdbenchmark.services.QdBenchmarkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQdBenchmarkDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'KeyValue'", "'Graph'", "'Document'", "'Column-Family'", "'Relational'", "'QualityCharacteristic'", "'Reliability'", "'PerformanceEfficiency'", "'QualitySubCharacteristic'", "'Maturity'", "'Availability'", "'FaultTolerance'", "'Recoverability'", "'TimeBehaviour'", "'ResourceUtilisation'", "'{'", "'}'", "'Set'", "'<'", "'>'", "'#'", "','", "'Struct'", "'Relationship'", "'start'", "'='", "'end'"
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
    public String getGrammarFileName() { return "../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g"; }



     	private QdBenchmarkDslGrammarAccess grammarAccess;
     	
        public InternalQdBenchmarkDslParser(TokenStream input, QdBenchmarkDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Schema";	
       	}
       	
       	@Override
       	protected QdBenchmarkDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSchema"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:67:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:68:2: (iv_ruleSchema= ruleSchema EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:69:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_ruleSchema_in_entryRuleSchema75);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchema85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:76:1: ruleSchema returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )? ( (lv_entities_4_0= ruleEntity ) )* ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_entities_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:79:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )? ( (lv_entities_4_0= ruleEntity ) )* ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )? ( (lv_entities_4_0= ruleEntity ) )* )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )? ( (lv_entities_4_0= ruleEntity ) )* )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:80:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )? ( (lv_entities_4_0= ruleEntity ) )*
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:80:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:81:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:81:1: (lv_name_0_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:82:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSchema127); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSchemaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:98:2: (otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:98:4: otherlv_1= '[' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSchema145); 

                        	newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:102:1: ( (lv_attributes_2_0= ruleAttribute ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:103:1: (lv_attributes_2_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:103:1: (lv_attributes_2_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:104:3: lv_attributes_2_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSchemaAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleSchema166);
                    	    lv_attributes_2_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_2_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSchema179); 

                        	newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:124:3: ( (lv_entities_4_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30||(LA3_0>=35 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:125:1: (lv_entities_4_0= ruleEntity )
            	    {
            	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:125:1: (lv_entities_4_0= ruleEntity )
            	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:126:3: lv_entities_4_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSchemaAccess().getEntitiesEntityParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleSchema202);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_4_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleDataModel"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:150:1: entryRuleDataModel returns [String current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final String entryRuleDataModel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataModel = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:151:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:152:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel240);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel251); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:159:1: ruleDataModel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'KeyValue' | kw= 'Graph' | kw= 'Document' | kw= 'Column-Family' | kw= 'Relational' ) ;
    public final AntlrDatatypeRuleToken ruleDataModel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:162:28: ( (kw= 'KeyValue' | kw= 'Graph' | kw= 'Document' | kw= 'Column-Family' | kw= 'Relational' ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:163:1: (kw= 'KeyValue' | kw= 'Graph' | kw= 'Document' | kw= 'Column-Family' | kw= 'Relational' )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:163:1: (kw= 'KeyValue' | kw= 'Graph' | kw= 'Document' | kw= 'Column-Family' | kw= 'Relational' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:164:2: kw= 'KeyValue'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleDataModel289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataModelAccess().getKeyValueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:171:2: kw= 'Graph'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleDataModel308); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataModelAccess().getGraphKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:178:2: kw= 'Document'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleDataModel327); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataModelAccess().getDocumentKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:185:2: kw= 'Column-Family'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleDataModel346); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataModelAccess().getColumnFamilyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:192:2: kw= 'Relational'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleDataModel365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataModelAccess().getRelationalKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleQualityCharacteristic"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:205:1: entryRuleQualityCharacteristic returns [String current=null] : iv_ruleQualityCharacteristic= ruleQualityCharacteristic EOF ;
    public final String entryRuleQualityCharacteristic() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualityCharacteristic = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:206:2: (iv_ruleQualityCharacteristic= ruleQualityCharacteristic EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:207:2: iv_ruleQualityCharacteristic= ruleQualityCharacteristic EOF
            {
             newCompositeNode(grammarAccess.getQualityCharacteristicRule()); 
            pushFollow(FOLLOW_ruleQualityCharacteristic_in_entryRuleQualityCharacteristic406);
            iv_ruleQualityCharacteristic=ruleQualityCharacteristic();

            state._fsp--;

             current =iv_ruleQualityCharacteristic.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityCharacteristic417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityCharacteristic"


    // $ANTLR start "ruleQualityCharacteristic"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:214:1: ruleQualityCharacteristic returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'QualityCharacteristic' (kw= 'Reliability' | kw= 'PerformanceEfficiency' ) ) ;
    public final AntlrDatatypeRuleToken ruleQualityCharacteristic() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:217:28: ( (kw= 'QualityCharacteristic' (kw= 'Reliability' | kw= 'PerformanceEfficiency' ) ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:218:1: (kw= 'QualityCharacteristic' (kw= 'Reliability' | kw= 'PerformanceEfficiency' ) )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:218:1: (kw= 'QualityCharacteristic' (kw= 'Reliability' | kw= 'PerformanceEfficiency' ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:219:2: kw= 'QualityCharacteristic' (kw= 'Reliability' | kw= 'PerformanceEfficiency' )
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleQualityCharacteristic455); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualityCharacteristicAccess().getQualityCharacteristicKeyword_0()); 
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:224:1: (kw= 'Reliability' | kw= 'PerformanceEfficiency' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:225:2: kw= 'Reliability'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualityCharacteristic469); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualityCharacteristicAccess().getReliabilityKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:232:2: kw= 'PerformanceEfficiency'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualityCharacteristic488); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualityCharacteristicAccess().getPerformanceEfficiencyKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityCharacteristic"


    // $ANTLR start "entryRuleQualitySubCharacteristic"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:245:1: entryRuleQualitySubCharacteristic returns [String current=null] : iv_ruleQualitySubCharacteristic= ruleQualitySubCharacteristic EOF ;
    public final String entryRuleQualitySubCharacteristic() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualitySubCharacteristic = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:246:2: (iv_ruleQualitySubCharacteristic= ruleQualitySubCharacteristic EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:247:2: iv_ruleQualitySubCharacteristic= ruleQualitySubCharacteristic EOF
            {
             newCompositeNode(grammarAccess.getQualitySubCharacteristicRule()); 
            pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_entryRuleQualitySubCharacteristic530);
            iv_ruleQualitySubCharacteristic=ruleQualitySubCharacteristic();

            state._fsp--;

             current =iv_ruleQualitySubCharacteristic.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitySubCharacteristic541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualitySubCharacteristic"


    // $ANTLR start "ruleQualitySubCharacteristic"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:254:1: ruleQualitySubCharacteristic returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'QualitySubCharacteristic' (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' ) ) ;
    public final AntlrDatatypeRuleToken ruleQualitySubCharacteristic() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:257:28: ( (kw= 'QualitySubCharacteristic' (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' ) ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:258:1: (kw= 'QualitySubCharacteristic' (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' ) )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:258:1: (kw= 'QualitySubCharacteristic' (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:259:2: kw= 'QualitySubCharacteristic' (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' )
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleQualitySubCharacteristic579); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getQualitySubCharacteristicKeyword_0()); 
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:264:1: (kw= 'Maturity' | kw= 'Availability' | kw= 'FaultTolerance' | kw= 'Recoverability' | kw= 'TimeBehaviour' | kw= 'ResourceUtilisation' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:265:2: kw= 'Maturity'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualitySubCharacteristic593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getMaturityKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:272:2: kw= 'Availability'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualitySubCharacteristic612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getAvailabilityKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:279:2: kw= 'FaultTolerance'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualitySubCharacteristic631); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getFaultToleranceKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:286:2: kw= 'Recoverability'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualitySubCharacteristic650); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getRecoverabilityKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:293:2: kw= 'TimeBehaviour'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualitySubCharacteristic669); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getTimeBehaviourKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:300:2: kw= 'ResourceUtilisation'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualitySubCharacteristic688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualitySubCharacteristicAccess().getResourceUtilisationKeyword_1_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualitySubCharacteristic"


    // $ANTLR start "entryRuleQualitySpecification"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:313:1: entryRuleQualitySpecification returns [EObject current=null] : iv_ruleQualitySpecification= ruleQualitySpecification EOF ;
    public final EObject entryRuleQualitySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitySpecification = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:314:2: (iv_ruleQualitySpecification= ruleQualitySpecification EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:315:2: iv_ruleQualitySpecification= ruleQualitySpecification EOF
            {
             newCompositeNode(grammarAccess.getQualitySpecificationRule()); 
            pushFollow(FOLLOW_ruleQualitySpecification_in_entryRuleQualitySpecification729);
            iv_ruleQualitySpecification=ruleQualitySpecification();

            state._fsp--;

             current =iv_ruleQualitySpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitySpecification739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualitySpecification"


    // $ANTLR start "ruleQualitySpecification"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:322:1: ruleQualitySpecification returns [EObject current=null] : ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleQualitySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_characteristic_0_0 = null;

        AntlrDatatypeRuleToken lv_subCharacteristics_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:325:28: ( ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:2: ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )?
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:2: ( (lv_characteristic_0_0= ruleQualityCharacteristic ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:327:1: (lv_characteristic_0_0= ruleQualityCharacteristic )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:327:1: (lv_characteristic_0_0= ruleQualityCharacteristic )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:328:3: lv_characteristic_0_0= ruleQualityCharacteristic
            {
             
            	        newCompositeNode(grammarAccess.getQualitySpecificationAccess().getCharacteristicQualityCharacteristicParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualityCharacteristic_in_ruleQualitySpecification785);
            lv_characteristic_0_0=ruleQualityCharacteristic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualitySpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"characteristic",
                    		lv_characteristic_0_0, 
                    		"QualityCharacteristic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:344:2: (otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:344:4: otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleQualitySpecification798); 

                        	newLeafNode(otherlv_1, grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:348:1: ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:349:1: (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:349:1: (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:350:3: lv_subCharacteristics_2_0= ruleQualitySubCharacteristic
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_ruleQualitySpecification819);
                    	    lv_subCharacteristics_2_0=ruleQualitySubCharacteristic();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQualitySpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subCharacteristics",
                    	            		lv_subCharacteristics_2_0, 
                    	            		"QualitySubCharacteristic");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleQualitySpecification832); 

                        	newLeafNode(otherlv_3, grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualitySpecification"


    // $ANTLR start "entryRuleEntity"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:378:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:379:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:380:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity870);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:387:1: ruleEntity returns [EObject current=null] : (this_Set__0= ruleSet_ | this_Struct__1= ruleStruct_ | this_Relationship__2= ruleRelationship_ ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Set__0 = null;

        EObject this_Struct__1 = null;

        EObject this_Relationship__2 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:390:28: ( (this_Set__0= ruleSet_ | this_Struct__1= ruleStruct_ | this_Relationship__2= ruleRelationship_ ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:391:1: (this_Set__0= ruleSet_ | this_Struct__1= ruleStruct_ | this_Relationship__2= ruleRelationship_ )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:391:1: (this_Set__0= ruleSet_ | this_Struct__1= ruleStruct_ | this_Relationship__2= ruleRelationship_ )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:392:5: this_Set__0= ruleSet_
                    {
                     
                            newCompositeNode(grammarAccess.getEntityAccess().getSet_ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSet__in_ruleEntity927);
                    this_Set__0=ruleSet_();

                    state._fsp--;

                     
                            current = this_Set__0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:402:5: this_Struct__1= ruleStruct_
                    {
                     
                            newCompositeNode(grammarAccess.getEntityAccess().getStruct_ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStruct__in_ruleEntity954);
                    this_Struct__1=ruleStruct_();

                    state._fsp--;

                     
                            current = this_Struct__1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:412:5: this_Relationship__2= ruleRelationship_
                    {
                     
                            newCompositeNode(grammarAccess.getEntityAccess().getRelationship_ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRelationship__in_ruleEntity981);
                    this_Relationship__2=ruleRelationship_();

                    state._fsp--;

                     
                            current = this_Relationship__2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSet_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:428:1: entryRuleSet_ returns [EObject current=null] : iv_ruleSet_= ruleSet_ EOF ;
    public final EObject entryRuleSet_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet_ = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:429:2: (iv_ruleSet_= ruleSet_ EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:430:2: iv_ruleSet_= ruleSet_ EOF
            {
             newCompositeNode(grammarAccess.getSet_Rule()); 
            pushFollow(FOLLOW_ruleSet__in_entryRuleSet_1016);
            iv_ruleSet_=ruleSet_();

            state._fsp--;

             current =iv_ruleSet_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet_1026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet_"


    // $ANTLR start "ruleSet_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:437:1: ruleSet_ returns [EObject current=null] : (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )? (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )? (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )? (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )? (otherlv_14= ',' )? ) ;
    public final EObject ruleSet_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_dataModel_3_0 = null;

        EObject lv_qualitySpecifications_6_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_entities_12_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:440:28: ( (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )? (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )? (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )? (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )? (otherlv_14= ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:1: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )? (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )? (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )? (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )? (otherlv_14= ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:1: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )? (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )? (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )? (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )? (otherlv_14= ',' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:3: otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )? (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )? (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )? (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )? (otherlv_14= ',' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSet_1063); 

                	newLeafNode(otherlv_0, grammarAccess.getSet_Access().getSetKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:446:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSet_1080); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSet_Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSet_Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:463:2: (otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:463:4: otherlv_2= '<' ( (lv_dataModel_3_0= ruleDataModel ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleSet_1098); 

                        	newLeafNode(otherlv_2, grammarAccess.getSet_Access().getLessThanSignKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:467:1: ( (lv_dataModel_3_0= ruleDataModel ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:468:1: (lv_dataModel_3_0= ruleDataModel )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:468:1: (lv_dataModel_3_0= ruleDataModel )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:469:3: lv_dataModel_3_0= ruleDataModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataModel_in_ruleSet_1119);
                    lv_dataModel_3_0=ruleDataModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	        }
                           		set(
                           			current, 
                           			"dataModel",
                            		lv_dataModel_3_0, 
                            		"DataModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleSet_1131); 

                        	newLeafNode(otherlv_4, grammarAccess.getSet_Access().getGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:489:3: (otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:489:5: otherlv_5= '#' ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )* otherlv_7= '#'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleSet_1146); 

                        	newLeafNode(otherlv_5, grammarAccess.getSet_Access().getNumberSignKeyword_3_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:493:1: ( (lv_qualitySpecifications_6_0= ruleQualitySpecification ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:494:1: (lv_qualitySpecifications_6_0= ruleQualitySpecification )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:494:1: (lv_qualitySpecifications_6_0= ruleQualitySpecification )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:495:3: lv_qualitySpecifications_6_0= ruleQualitySpecification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualitySpecification_in_ruleSet_1167);
                    	    lv_qualitySpecifications_6_0=ruleQualitySpecification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"qualitySpecifications",
                    	            		lv_qualitySpecifications_6_0, 
                    	            		"QualitySpecification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleSet_1180); 

                        	newLeafNode(otherlv_7, grammarAccess.getSet_Access().getNumberSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:515:3: (otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:515:5: otherlv_8= '[' ( (lv_attributes_9_0= ruleAttribute ) )* otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleSet_1195); 

                        	newLeafNode(otherlv_8, grammarAccess.getSet_Access().getLeftSquareBracketKeyword_4_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:519:1: ( (lv_attributes_9_0= ruleAttribute ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:520:1: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:520:1: (lv_attributes_9_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:521:3: lv_attributes_9_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleSet_1216);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_9_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleSet_1229); 

                        	newLeafNode(otherlv_10, grammarAccess.getSet_Access().getRightSquareBracketKeyword_4_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:541:3: (otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:541:5: otherlv_11= '{' ( (lv_entities_12_0= ruleEntity ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleSet_1244); 

                        	newLeafNode(otherlv_11, grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:545:1: ( (lv_entities_12_0= ruleEntity ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==30||(LA15_0>=35 && LA15_0<=36)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:546:1: (lv_entities_12_0= ruleEntity )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:546:1: (lv_entities_12_0= ruleEntity )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:547:3: lv_entities_12_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntity_in_ruleSet_1265);
                    	    lv_entities_12_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_12_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleSet_1278); 

                        	newLeafNode(otherlv_13, grammarAccess.getSet_Access().getRightCurlyBracketKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:567:3: (otherlv_14= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:567:5: otherlv_14= ','
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_34_in_ruleSet_1293); 

                        	newLeafNode(otherlv_14, grammarAccess.getSet_Access().getCommaKeyword_6());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet_"


    // $ANTLR start "entryRuleStruct_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:579:1: entryRuleStruct_ returns [EObject current=null] : iv_ruleStruct_= ruleStruct_ EOF ;
    public final EObject entryRuleStruct_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct_ = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:580:2: (iv_ruleStruct_= ruleStruct_ EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:581:2: iv_ruleStruct_= ruleStruct_ EOF
            {
             newCompositeNode(grammarAccess.getStruct_Rule()); 
            pushFollow(FOLLOW_ruleStruct__in_entryRuleStruct_1331);
            iv_ruleStruct_=ruleStruct_();

            state._fsp--;

             current =iv_ruleStruct_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct_1341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStruct_"


    // $ANTLR start "ruleStruct_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:588:1: ruleStruct_ returns [EObject current=null] : (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? (otherlv_8= ',' )? ) ;
    public final EObject ruleStruct_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_entities_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:591:28: ( (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? (otherlv_8= ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:592:1: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? (otherlv_8= ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:592:1: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? (otherlv_8= ',' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:592:3: otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? (otherlv_8= ',' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStruct_1378); 

                	newLeafNode(otherlv_0, grammarAccess.getStruct_Access().getStructKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:596:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:597:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct_1395); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStruct_Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStruct_Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:614:2: (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:614:4: otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleStruct_1413); 

                        	newLeafNode(otherlv_2, grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:618:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:619:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:619:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:620:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStruct_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleStruct_1434);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStruct_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_3_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleStruct_1447); 

                        	newLeafNode(otherlv_4, grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:640:3: (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:640:5: otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleStruct_1462); 

                        	newLeafNode(otherlv_5, grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:644:1: ( (lv_entities_6_0= ruleEntity ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==30||(LA20_0>=35 && LA20_0<=36)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:645:1: (lv_entities_6_0= ruleEntity )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:645:1: (lv_entities_6_0= ruleEntity )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:646:3: lv_entities_6_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStruct_Access().getEntitiesEntityParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntity_in_ruleStruct_1483);
                    	    lv_entities_6_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStruct_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_6_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleStruct_1496); 

                        	newLeafNode(otherlv_7, grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:666:3: (otherlv_8= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:666:5: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleStruct_1511); 

                        	newLeafNode(otherlv_8, grammarAccess.getStruct_Access().getCommaKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStruct_"


    // $ANTLR start "entryRuleRelationship_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:678:1: entryRuleRelationship_ returns [EObject current=null] : iv_ruleRelationship_= ruleRelationship_ EOF ;
    public final EObject entryRuleRelationship_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship_ = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:679:2: (iv_ruleRelationship_= ruleRelationship_ EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:680:2: iv_ruleRelationship_= ruleRelationship_ EOF
            {
             newCompositeNode(grammarAccess.getRelationship_Rule()); 
            pushFollow(FOLLOW_ruleRelationship__in_entryRuleRelationship_1549);
            iv_ruleRelationship_=ruleRelationship_();

            state._fsp--;

             current =iv_ruleRelationship_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship_1559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship_"


    // $ANTLR start "ruleRelationship_"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:687:1: ruleRelationship_ returns [EObject current=null] : (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? (otherlv_13= ',' )? ) ;
    public final EObject ruleRelationship_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_start_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_end_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:690:28: ( (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? (otherlv_13= ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:691:1: (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? (otherlv_13= ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:691:1: (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? (otherlv_13= ',' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:691:3: otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? (otherlv_13= ',' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleRelationship_1596); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationship_Access().getRelationshipKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:695:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:696:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:696:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:697:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1613); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRelationship_Access().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationship_Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:713:2: (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:713:4: otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleRelationship_1631); 

                        	newLeafNode(otherlv_2, grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:717:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:718:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:718:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:719:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationship_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleRelationship_1652);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationship_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_3_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRelationship_1665); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:739:3: (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:739:5: otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleRelationship_1680); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelationship_Access().getLeftCurlyBracketKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleRelationship_1692); 

                        	newLeafNode(otherlv_6, grammarAccess.getRelationship_Access().getStartKeyword_3_1());
                        
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleRelationship_1704); 

                        	newLeafNode(otherlv_7, grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_2());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:751:1: ( (lv_start_8_0= RULE_ID ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:752:1: (lv_start_8_0= RULE_ID )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:752:1: (lv_start_8_0= RULE_ID )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:753:3: lv_start_8_0= RULE_ID
                    {
                    lv_start_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1721); 

                    			newLeafNode(lv_start_8_0, grammarAccess.getRelationship_Access().getStartIDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationship_Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"start",
                            		lv_start_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleRelationship_1738); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationship_Access().getEndKeyword_3_4());
                        
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleRelationship_1750); 

                        	newLeafNode(otherlv_10, grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_5());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:777:1: ( (lv_end_11_0= RULE_ID ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:778:1: (lv_end_11_0= RULE_ID )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:778:1: (lv_end_11_0= RULE_ID )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:779:3: lv_end_11_0= RULE_ID
                    {
                    lv_end_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1767); 

                    			newLeafNode(lv_end_11_0, grammarAccess.getRelationship_Access().getEndIDTerminalRuleCall_3_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationship_Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"end",
                            		lv_end_11_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleRelationship_1784); 

                        	newLeafNode(otherlv_12, grammarAccess.getRelationship_Access().getRightCurlyBracketKeyword_3_7());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:799:3: (otherlv_13= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:799:5: otherlv_13= ','
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_34_in_ruleRelationship_1799); 

                        	newLeafNode(otherlv_13, grammarAccess.getRelationship_Access().getCommaKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship_"


    // $ANTLR start "entryRuleAttribute"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:811:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:812:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:813:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1837);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:820:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? (otherlv_3= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:823:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? (otherlv_3= ',' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:824:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? (otherlv_3= ',' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:824:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? (otherlv_3= ',' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:824:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? (otherlv_3= ',' )?
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:824:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:825:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:825:1: (lv_name_0_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:826:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1889); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:842:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:842:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleAttribute1907); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:846:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:847:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:847:1: (lv_value_2_0= RULE_STRING )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:848:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1924); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:864:4: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:864:6: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleAttribute1944); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSchema_in_entryRuleSchema75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchema85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchema127 = new BitSet(new long[]{0x0000001840000802L});
    public static final BitSet FOLLOW_11_in_ruleSchema145 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSchema166 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleSchema179 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleSchema202 = new BitSet(new long[]{0x0000001840000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataModel289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDataModel308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDataModel327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataModel346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataModel365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_entryRuleQualityCharacteristic406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityCharacteristic417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQualityCharacteristic455 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleQualityCharacteristic469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleQualityCharacteristic488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_entryRuleQualitySubCharacteristic530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitySubCharacteristic541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleQualitySubCharacteristic579 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_22_in_ruleQualitySubCharacteristic593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQualitySubCharacteristic612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleQualitySubCharacteristic631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleQualitySubCharacteristic650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleQualitySubCharacteristic669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQualitySubCharacteristic688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_entryRuleQualitySpecification729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitySpecification739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_ruleQualitySpecification785 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualitySpecification798 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_ruleQualitySpecification819 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_ruleQualitySpecification832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_ruleEntity927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_ruleEntity954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_ruleEntity981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_entryRuleSet_1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet_1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSet_1063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSet_1080 = new BitSet(new long[]{0x0000000690000802L});
    public static final BitSet FOLLOW_31_in_ruleSet_1098 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleSet_1119 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSet_1131 = new BitSet(new long[]{0x0000000610000802L});
    public static final BitSet FOLLOW_33_in_ruleSet_1146 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_ruleSet_1167 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_33_in_ruleSet_1180 = new BitSet(new long[]{0x0000000410000802L});
    public static final BitSet FOLLOW_11_in_ruleSet_1195 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSet_1216 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleSet_1229 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_28_in_ruleSet_1244 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleSet_1265 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_29_in_ruleSet_1278 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleSet_1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_entryRuleStruct_1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct_1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStruct_1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStruct_1395 = new BitSet(new long[]{0x0000000410000802L});
    public static final BitSet FOLLOW_11_in_ruleStruct_1413 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStruct_1434 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStruct_1447 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_28_in_ruleStruct_1462 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleStruct_1483 = new BitSet(new long[]{0x0000001860000000L});
    public static final BitSet FOLLOW_29_in_ruleStruct_1496 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleStruct_1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_entryRuleRelationship_1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship_1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRelationship_1596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1613 = new BitSet(new long[]{0x0000000410000802L});
    public static final BitSet FOLLOW_11_in_ruleRelationship_1631 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRelationship_1652 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleRelationship_1665 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationship_1680 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRelationship_1692 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelationship_1704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1721 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRelationship_1738 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelationship_1750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1767 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationship_1784 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleRelationship_1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1889 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_38_in_ruleAttribute1907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1924 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAttribute1944 = new BitSet(new long[]{0x0000000000000002L});

}