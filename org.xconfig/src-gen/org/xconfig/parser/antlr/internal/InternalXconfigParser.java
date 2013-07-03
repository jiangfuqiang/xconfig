package org.xconfig.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xconfig.services.XconfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXconfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xml'", "'{'", "'}'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalXconfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXconfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXconfigParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g"; }



     	private XconfigGrammarAccess grammarAccess;
     	
        public InternalXconfigParser(TokenStream input, XconfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected XconfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:71:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:72:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:82:1: ruleModel returns [EObject current=null] : ( (lv_xmls_0_0= ruleXmlConfig ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_xmls_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:86:28: ( ( (lv_xmls_0_0= ruleXmlConfig ) )* )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:87:1: ( (lv_xmls_0_0= ruleXmlConfig ) )*
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:87:1: ( (lv_xmls_0_0= ruleXmlConfig ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:88:1: (lv_xmls_0_0= ruleXmlConfig )
            	    {
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:88:1: (lv_xmls_0_0= ruleXmlConfig )
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:89:3: lv_xmls_0_0= ruleXmlConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getXmlsXmlConfigParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXmlConfig_in_ruleModel140);
            	    lv_xmls_0_0=ruleXmlConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"xmls",
            	            		lv_xmls_0_0, 
            	            		"XmlConfig");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleXmlConfig"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:116:1: entryRuleXmlConfig returns [EObject current=null] : iv_ruleXmlConfig= ruleXmlConfig EOF ;
    public final EObject entryRuleXmlConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlConfig = null;


        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:117:2: (iv_ruleXmlConfig= ruleXmlConfig EOF )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:118:2: iv_ruleXmlConfig= ruleXmlConfig EOF
            {
             newCompositeNode(grammarAccess.getXmlConfigRule()); 
            pushFollow(FOLLOW_ruleXmlConfig_in_entryRuleXmlConfig180);
            iv_ruleXmlConfig=ruleXmlConfig();

            state._fsp--;

             current =iv_ruleXmlConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlConfig190); 

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
    // $ANTLR end "entryRuleXmlConfig"


    // $ANTLR start "ruleXmlConfig"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:125:1: ruleXmlConfig returns [EObject current=null] : (otherlv_0= 'xml' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_configElements_3_0= ruleConfigElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleXmlConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_configElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:128:28: ( (otherlv_0= 'xml' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_configElements_3_0= ruleConfigElement ) )* otherlv_4= '}' ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:129:1: (otherlv_0= 'xml' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_configElements_3_0= ruleConfigElement ) )* otherlv_4= '}' )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:129:1: (otherlv_0= 'xml' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_configElements_3_0= ruleConfigElement ) )* otherlv_4= '}' )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:129:3: otherlv_0= 'xml' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_configElements_3_0= ruleConfigElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleXmlConfig227); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlConfigAccess().getXmlKeyword_0());
                
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:133:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:134:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:134:1: (lv_name_1_0= RULE_ID )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:135:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXmlConfig244); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXmlConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleXmlConfig261); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlConfigAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:155:1: ( (lv_configElements_3_0= ruleConfigElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:156:1: (lv_configElements_3_0= ruleConfigElement )
            	    {
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:156:1: (lv_configElements_3_0= ruleConfigElement )
            	    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:157:3: lv_configElements_3_0= ruleConfigElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXmlConfigAccess().getConfigElementsConfigElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigElement_in_ruleXmlConfig282);
            	    lv_configElements_3_0=ruleConfigElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXmlConfigRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configElements",
            	            		lv_configElements_3_0, 
            	            		"ConfigElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXmlConfig295); 

                	newLeafNode(otherlv_4, grammarAccess.getXmlConfigAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleXmlConfig"


    // $ANTLR start "entryRuleConfigElement"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:185:1: entryRuleConfigElement returns [EObject current=null] : iv_ruleConfigElement= ruleConfigElement EOF ;
    public final EObject entryRuleConfigElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigElement = null;


        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:186:2: (iv_ruleConfigElement= ruleConfigElement EOF )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:187:2: iv_ruleConfigElement= ruleConfigElement EOF
            {
             newCompositeNode(grammarAccess.getConfigElementRule()); 
            pushFollow(FOLLOW_ruleConfigElement_in_entryRuleConfigElement331);
            iv_ruleConfigElement=ruleConfigElement();

            state._fsp--;

             current =iv_ruleConfigElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigElement341); 

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
    // $ANTLR end "entryRuleConfigElement"


    // $ANTLR start "ruleConfigElement"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:194:1: ruleConfigElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConfigElementType ) ) ) ;
    public final EObject ruleConfigElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:197:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConfigElementType ) ) ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:198:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConfigElementType ) ) )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:198:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConfigElementType ) ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:198:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleConfigElementType ) )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:198:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:199:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:199:1: (lv_name_0_0= RULE_ID )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:200:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigElement383); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleConfigElement400); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigElementAccess().getColonKeyword_1());
                
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:220:1: ( (lv_type_2_0= ruleConfigElementType ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:221:1: (lv_type_2_0= ruleConfigElementType )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:221:1: (lv_type_2_0= ruleConfigElementType )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:222:3: lv_type_2_0= ruleConfigElementType
            {
             
            	        newCompositeNode(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConfigElementType_in_ruleConfigElement421);
            lv_type_2_0=ruleConfigElementType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigElementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ConfigElementType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleConfigElement"


    // $ANTLR start "entryRuleConfigElementType"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:246:1: entryRuleConfigElementType returns [EObject current=null] : iv_ruleConfigElementType= ruleConfigElementType EOF ;
    public final EObject entryRuleConfigElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigElementType = null;


        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:247:2: (iv_ruleConfigElementType= ruleConfigElementType EOF )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:248:2: iv_ruleConfigElementType= ruleConfigElementType EOF
            {
             newCompositeNode(grammarAccess.getConfigElementTypeRule()); 
            pushFollow(FOLLOW_ruleConfigElementType_in_entryRuleConfigElementType457);
            iv_ruleConfigElementType=ruleConfigElementType();

            state._fsp--;

             current =iv_ruleConfigElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigElementType467); 

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
    // $ANTLR end "entryRuleConfigElementType"


    // $ANTLR start "ruleConfigElementType"
    // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:255:1: ruleConfigElementType returns [EObject current=null] : ( (lv_type_0_0= RULE_STRING ) ) ;
    public final EObject ruleConfigElementType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:258:28: ( ( (lv_type_0_0= RULE_STRING ) ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:259:1: ( (lv_type_0_0= RULE_STRING ) )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:259:1: ( (lv_type_0_0= RULE_STRING ) )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:260:1: (lv_type_0_0= RULE_STRING )
            {
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:260:1: (lv_type_0_0= RULE_STRING )
            // ../org.xconfig/src-gen/org/xconfig/parser/antlr/internal/InternalXconfig.g:261:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigElementType508); 

            			newLeafNode(lv_type_0_0, grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigElementTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleConfigElementType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlConfig_in_ruleModel140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXmlConfig_in_entryRuleXmlConfig180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlConfig190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXmlConfig227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXmlConfig244 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXmlConfig261 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleConfigElement_in_ruleXmlConfig282 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleXmlConfig295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElement_in_entryRuleConfigElement331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigElement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigElement383 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigElement400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleConfigElementType_in_ruleConfigElement421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElementType_in_entryRuleConfigElementType457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigElementType467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigElementType508 = new BitSet(new long[]{0x0000000000000002L});

}