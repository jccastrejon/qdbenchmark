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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'KeyValue'", "'Graph'", "'Document'", "'Column-Family'", "'Relational'", "'QualityCharacteristic'", "'Reliability'", "'PerformanceEfficiency'", "'QualitySubCharacteristic'", "'Maturity'", "'Availability'", "'FaultTolerance'", "'Recoverability'", "'TimeBehaviour'", "'ResourceUtilisation'", "'{'", "'}'", "'Set'", "'<'", "'>'", "','", "'Struct'", "'Relationship'", "'start'", "'='", "'end'"
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

                if ( (LA3_0==30||(LA3_0>=34 && LA3_0<=35)) ) {
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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:322:1: ruleQualitySpecification returns [EObject current=null] : ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' ) ;
    public final EObject ruleQualitySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_characteristic_0_0 = null;

        AntlrDatatypeRuleToken lv_subCharacteristics_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:325:28: ( ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:1: ( ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}' )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:326:2: ( (lv_characteristic_0_0= ruleQualityCharacteristic ) ) otherlv_1= '{' ( (lv_subCharacteristics_2_0= ruleQualitySubCharacteristic ) )* otherlv_3= '}'
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleQualitySpecification797); 

                	newLeafNode(otherlv_1, grammarAccess.getQualitySpecificationAccess().getLeftCurlyBracketKeyword_1());
                
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
            	     
            	    	        newCompositeNode(grammarAccess.getQualitySpecificationAccess().getSubCharacteristicsQualitySubCharacteristicParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualitySubCharacteristic_in_ruleQualitySpecification818);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleQualitySpecification831); 

                	newLeafNode(otherlv_3, grammarAccess.getQualitySpecificationAccess().getRightCurlyBracketKeyword_3());
                

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
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity867);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity877); 

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
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:392:5: this_Set__0= ruleSet_
                    {
                     
                            newCompositeNode(grammarAccess.getEntityAccess().getSet_ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSet__in_ruleEntity924);
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
                        
                    pushFollow(FOLLOW_ruleStruct__in_ruleEntity951);
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
                        
                    pushFollow(FOLLOW_ruleRelationship__in_ruleEntity978);
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
            pushFollow(FOLLOW_ruleSet__in_entryRuleSet_1013);
            iv_ruleSet_=ruleSet_();

            state._fsp--;

             current =iv_ruleSet_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet_1023); 

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:437:1: ruleSet_ returns [EObject current=null] : (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )? ) ;
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
        Token otherlv_12=null;
        EObject lv_attributes_3_0 = null;

        AntlrDatatypeRuleToken lv_dataModel_6_0 = null;

        EObject lv_entities_9_0 = null;

        EObject lv_qualitySpecifications_11_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:440:28: ( (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:1: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:1: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:441:3: otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSet_1060); 

                	newLeafNode(otherlv_0, grammarAccess.getSet_Access().getSetKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:446:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSet_1077); 

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

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:463:2: (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:463:4: otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleSet_1095); 

                        	newLeafNode(otherlv_2, grammarAccess.getSet_Access().getLeftSquareBracketKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:467:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:468:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:468:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:469:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleSet_1116);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleSet_1129); 

                        	newLeafNode(otherlv_4, grammarAccess.getSet_Access().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:489:3: (otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:489:5: otherlv_5= '<' ( (lv_dataModel_6_0= ruleDataModel ) ) otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSet_1144); 

                        	newLeafNode(otherlv_5, grammarAccess.getSet_Access().getLessThanSignKeyword_3_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:493:1: ( (lv_dataModel_6_0= ruleDataModel ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:494:1: (lv_dataModel_6_0= ruleDataModel )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:494:1: (lv_dataModel_6_0= ruleDataModel )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:495:3: lv_dataModel_6_0= ruleDataModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getSet_Access().getDataModelDataModelParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataModel_in_ruleSet_1165);
                    lv_dataModel_6_0=ruleDataModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	        }
                           		set(
                           			current, 
                           			"dataModel",
                            		lv_dataModel_6_0, 
                            		"DataModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleSet_1177); 

                        	newLeafNode(otherlv_7, grammarAccess.getSet_Access().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:515:3: (otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:515:5: otherlv_8= '{' ( (lv_entities_9_0= ruleEntity ) )* otherlv_10= ',' ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleSet_1192); 

                        	newLeafNode(otherlv_8, grammarAccess.getSet_Access().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:519:1: ( (lv_entities_9_0= ruleEntity ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30||(LA12_0>=34 && LA12_0<=35)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:520:1: (lv_entities_9_0= ruleEntity )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:520:1: (lv_entities_9_0= ruleEntity )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:521:3: lv_entities_9_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getEntitiesEntityParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntity_in_ruleSet_1213);
                    	    lv_entities_9_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_9_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleSet_1226); 

                        	newLeafNode(otherlv_10, grammarAccess.getSet_Access().getCommaKeyword_4_2());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:541:1: ( (lv_qualitySpecifications_11_0= ruleQualitySpecification ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:542:1: (lv_qualitySpecifications_11_0= ruleQualitySpecification )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:542:1: (lv_qualitySpecifications_11_0= ruleQualitySpecification )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:543:3: lv_qualitySpecifications_11_0= ruleQualitySpecification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSet_Access().getQualitySpecificationsQualitySpecificationParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualitySpecification_in_ruleSet_1247);
                    	    lv_qualitySpecifications_11_0=ruleQualitySpecification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSet_Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"qualitySpecifications",
                    	            		lv_qualitySpecifications_11_0, 
                    	            		"QualitySpecification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleSet_1260); 

                        	newLeafNode(otherlv_12, grammarAccess.getSet_Access().getRightCurlyBracketKeyword_4_4());
                        

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:571:1: entryRuleStruct_ returns [EObject current=null] : iv_ruleStruct_= ruleStruct_ EOF ;
    public final EObject entryRuleStruct_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct_ = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:572:2: (iv_ruleStruct_= ruleStruct_ EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:573:2: iv_ruleStruct_= ruleStruct_ EOF
            {
             newCompositeNode(grammarAccess.getStruct_Rule()); 
            pushFollow(FOLLOW_ruleStruct__in_entryRuleStruct_1298);
            iv_ruleStruct_=ruleStruct_();

            state._fsp--;

             current =iv_ruleStruct_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct_1308); 

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:580:1: ruleStruct_ returns [EObject current=null] : (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleStruct_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_entities_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:583:28: ( (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:584:1: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:584:1: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:584:3: otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStruct_1345); 

                	newLeafNode(otherlv_0, grammarAccess.getStruct_Access().getStructKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:588:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:589:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:589:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:590:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct_1362); 

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

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:606:2: (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:606:4: otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleStruct_1380); 

                        	newLeafNode(otherlv_2, grammarAccess.getStruct_Access().getLeftSquareBracketKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:610:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:611:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:611:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:612:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStruct_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleStruct_1401);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleStruct_1414); 

                        	newLeafNode(otherlv_4, grammarAccess.getStruct_Access().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:632:3: (otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:632:5: otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleStruct_1429); 

                        	newLeafNode(otherlv_5, grammarAccess.getStruct_Access().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:636:1: ( (lv_entities_6_0= ruleEntity ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==30||(LA17_0>=34 && LA17_0<=35)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:637:1: (lv_entities_6_0= ruleEntity )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:637:1: (lv_entities_6_0= ruleEntity )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:638:3: lv_entities_6_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStruct_Access().getEntitiesEntityParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntity_in_ruleStruct_1450);
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleStruct_1463); 

                        	newLeafNode(otherlv_7, grammarAccess.getStruct_Access().getRightCurlyBracketKeyword_3_2());
                        

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:666:1: entryRuleRelationship_ returns [EObject current=null] : iv_ruleRelationship_= ruleRelationship_ EOF ;
    public final EObject entryRuleRelationship_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship_ = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:667:2: (iv_ruleRelationship_= ruleRelationship_ EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:668:2: iv_ruleRelationship_= ruleRelationship_ EOF
            {
             newCompositeNode(grammarAccess.getRelationship_Rule()); 
            pushFollow(FOLLOW_ruleRelationship__in_entryRuleRelationship_1501);
            iv_ruleRelationship_=ruleRelationship_();

            state._fsp--;

             current =iv_ruleRelationship_; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship_1511); 

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:675:1: ruleRelationship_ returns [EObject current=null] : (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? ) ;
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
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:678:28: ( (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:679:1: (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:679:1: (otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )? )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:679:3: otherlv_0= 'Relationship' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )? (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleRelationship_1548); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationship_Access().getRelationshipKeyword_0());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:683:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:684:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:684:1: (lv_name_1_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:685:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1565); 

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

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:701:2: (otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:701:4: otherlv_2= '[' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleRelationship_1583); 

                        	newLeafNode(otherlv_2, grammarAccess.getRelationship_Access().getLeftSquareBracketKeyword_2_0());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:705:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:706:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:706:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:707:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationship_Access().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleRelationship_1604);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRelationship_1617); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationship_Access().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:727:3: (otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:727:5: otherlv_5= '{' otherlv_6= 'start' otherlv_7= '=' ( (lv_start_8_0= RULE_ID ) ) otherlv_9= 'end' otherlv_10= '=' ( (lv_end_11_0= RULE_ID ) ) otherlv_12= '}'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleRelationship_1632); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelationship_Access().getLeftCurlyBracketKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleRelationship_1644); 

                        	newLeafNode(otherlv_6, grammarAccess.getRelationship_Access().getStartKeyword_3_1());
                        
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleRelationship_1656); 

                        	newLeafNode(otherlv_7, grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_2());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:739:1: ( (lv_start_8_0= RULE_ID ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:740:1: (lv_start_8_0= RULE_ID )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:740:1: (lv_start_8_0= RULE_ID )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:741:3: lv_start_8_0= RULE_ID
                    {
                    lv_start_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1673); 

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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleRelationship_1690); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationship_Access().getEndKeyword_3_4());
                        
                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleRelationship_1702); 

                        	newLeafNode(otherlv_10, grammarAccess.getRelationship_Access().getEqualsSignKeyword_3_5());
                        
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:765:1: ( (lv_end_11_0= RULE_ID ) )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:766:1: (lv_end_11_0= RULE_ID )
                    {
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:766:1: (lv_end_11_0= RULE_ID )
                    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:767:3: lv_end_11_0= RULE_ID
                    {
                    lv_end_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship_1719); 

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

                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleRelationship_1736); 

                        	newLeafNode(otherlv_12, grammarAccess.getRelationship_Access().getRightCurlyBracketKeyword_3_7());
                        

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:795:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:796:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:797:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1774);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1784); 

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
    // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:804:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:807:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:808:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:808:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:808:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:808:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:809:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:809:1: (lv_name_0_0= RULE_ID )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:810:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1826); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAttribute1843); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:830:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:831:1: (lv_value_2_0= RULE_STRING )
            {
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:831:1: (lv_value_2_0= RULE_STRING )
            // ../fr.imag.qdbenchmark.dsl/src-gen/fr/imag/qdbenchmark/parser/antlr/internal/InternalQdBenchmarkDsl.g:832:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1860); 

            			newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleSchema127 = new BitSet(new long[]{0x0000000C40000802L});
    public static final BitSet FOLLOW_11_in_ruleSchema145 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSchema166 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleSchema179 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleSchema202 = new BitSet(new long[]{0x0000000C40000002L});
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
    public static final BitSet FOLLOW_ruleQualityCharacteristic_in_ruleQualitySpecification785 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQualitySpecification797 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_ruleQualitySubCharacteristic_in_ruleQualitySpecification818 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_ruleQualitySpecification831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_ruleEntity924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_ruleEntity951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_ruleEntity978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet__in_entryRuleSet_1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet_1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSet_1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSet_1077 = new BitSet(new long[]{0x0000000090000802L});
    public static final BitSet FOLLOW_11_in_ruleSet_1095 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSet_1116 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleSet_1129 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_31_in_ruleSet_1144 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleSet_1165 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSet_1177 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleSet_1192 = new BitSet(new long[]{0x0000000E40000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleSet_1213 = new BitSet(new long[]{0x0000000E40000000L});
    public static final BitSet FOLLOW_33_in_ruleSet_1226 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_ruleQualitySpecification_in_ruleSet_1247 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleSet_1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct__in_entryRuleStruct_1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct_1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStruct_1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStruct_1362 = new BitSet(new long[]{0x0000000010000802L});
    public static final BitSet FOLLOW_11_in_ruleStruct_1380 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStruct_1401 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStruct_1414 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleStruct_1429 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleStruct_1450 = new BitSet(new long[]{0x0000000C60000000L});
    public static final BitSet FOLLOW_29_in_ruleStruct_1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship__in_entryRuleRelationship_1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship_1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRelationship_1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1565 = new BitSet(new long[]{0x0000000010000802L});
    public static final BitSet FOLLOW_11_in_ruleRelationship_1583 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleRelationship_1604 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleRelationship_1617 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationship_1632 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRelationship_1644 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRelationship_1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1673 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelationship_1690 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRelationship_1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship_1719 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationship_1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1826 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAttribute1843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1860 = new BitSet(new long[]{0x0000000000000002L});

}