package org.xconfig.ui.contentassist.antlr.internal; 

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
import org.xconfig.services.XconfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXconfigParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g"; }


     
     	private XconfigGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XconfigGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:64:1: ( ruleModel EOF )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:65:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel66);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:75:1: ruleModel : ( ( rule__Model__XmlsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:80:2: ( ( ( rule__Model__XmlsAssignment )* ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:81:1: ( ( rule__Model__XmlsAssignment )* )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:81:1: ( ( rule__Model__XmlsAssignment )* )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:82:1: ( rule__Model__XmlsAssignment )*
            {
             before(grammarAccess.getModelAccess().getXmlsAssignment()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:83:1: ( rule__Model__XmlsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:83:2: rule__Model__XmlsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__XmlsAssignment_in_ruleModel103);
            	    rule__Model__XmlsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getXmlsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleXmlConfig"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:96:1: entryRuleXmlConfig : ruleXmlConfig EOF ;
    public final void entryRuleXmlConfig() throws RecognitionException {
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:97:1: ( ruleXmlConfig EOF )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:98:1: ruleXmlConfig EOF
            {
             before(grammarAccess.getXmlConfigRule()); 
            pushFollow(FOLLOW_ruleXmlConfig_in_entryRuleXmlConfig131);
            ruleXmlConfig();

            state._fsp--;

             after(grammarAccess.getXmlConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlConfig138); 

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
    // $ANTLR end "entryRuleXmlConfig"


    // $ANTLR start "ruleXmlConfig"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:105:1: ruleXmlConfig : ( ( rule__XmlConfig__Group__0 ) ) ;
    public final void ruleXmlConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:109:2: ( ( ( rule__XmlConfig__Group__0 ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:110:1: ( ( rule__XmlConfig__Group__0 ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:110:1: ( ( rule__XmlConfig__Group__0 ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:111:1: ( rule__XmlConfig__Group__0 )
            {
             before(grammarAccess.getXmlConfigAccess().getGroup()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:112:1: ( rule__XmlConfig__Group__0 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:112:2: rule__XmlConfig__Group__0
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__0_in_ruleXmlConfig164);
            rule__XmlConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlConfig"


    // $ANTLR start "entryRuleConfigElement"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:124:1: entryRuleConfigElement : ruleConfigElement EOF ;
    public final void entryRuleConfigElement() throws RecognitionException {
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:125:1: ( ruleConfigElement EOF )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:126:1: ruleConfigElement EOF
            {
             before(grammarAccess.getConfigElementRule()); 
            pushFollow(FOLLOW_ruleConfigElement_in_entryRuleConfigElement191);
            ruleConfigElement();

            state._fsp--;

             after(grammarAccess.getConfigElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigElement198); 

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
    // $ANTLR end "entryRuleConfigElement"


    // $ANTLR start "ruleConfigElement"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:133:1: ruleConfigElement : ( ( rule__ConfigElement__Group__0 ) ) ;
    public final void ruleConfigElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:137:2: ( ( ( rule__ConfigElement__Group__0 ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:138:1: ( ( rule__ConfigElement__Group__0 ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:138:1: ( ( rule__ConfigElement__Group__0 ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:139:1: ( rule__ConfigElement__Group__0 )
            {
             before(grammarAccess.getConfigElementAccess().getGroup()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:140:1: ( rule__ConfigElement__Group__0 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:140:2: rule__ConfigElement__Group__0
            {
            pushFollow(FOLLOW_rule__ConfigElement__Group__0_in_ruleConfigElement224);
            rule__ConfigElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigElementAccess().getGroup()); 

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
    // $ANTLR end "ruleConfigElement"


    // $ANTLR start "entryRuleConfigElementType"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:152:1: entryRuleConfigElementType : ruleConfigElementType EOF ;
    public final void entryRuleConfigElementType() throws RecognitionException {
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:153:1: ( ruleConfigElementType EOF )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:154:1: ruleConfigElementType EOF
            {
             before(grammarAccess.getConfigElementTypeRule()); 
            pushFollow(FOLLOW_ruleConfigElementType_in_entryRuleConfigElementType251);
            ruleConfigElementType();

            state._fsp--;

             after(grammarAccess.getConfigElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigElementType258); 

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
    // $ANTLR end "entryRuleConfigElementType"


    // $ANTLR start "ruleConfigElementType"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:161:1: ruleConfigElementType : ( ( rule__ConfigElementType__TypeAssignment ) ) ;
    public final void ruleConfigElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:165:2: ( ( ( rule__ConfigElementType__TypeAssignment ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:166:1: ( ( rule__ConfigElementType__TypeAssignment ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:166:1: ( ( rule__ConfigElementType__TypeAssignment ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:167:1: ( rule__ConfigElementType__TypeAssignment )
            {
             before(grammarAccess.getConfigElementTypeAccess().getTypeAssignment()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:168:1: ( rule__ConfigElementType__TypeAssignment )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:168:2: rule__ConfigElementType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ConfigElementType__TypeAssignment_in_ruleConfigElementType284);
            rule__ConfigElementType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConfigElementTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleConfigElementType"


    // $ANTLR start "rule__XmlConfig__Group__0"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:182:1: rule__XmlConfig__Group__0 : rule__XmlConfig__Group__0__Impl rule__XmlConfig__Group__1 ;
    public final void rule__XmlConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:186:1: ( rule__XmlConfig__Group__0__Impl rule__XmlConfig__Group__1 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:187:2: rule__XmlConfig__Group__0__Impl rule__XmlConfig__Group__1
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__0__Impl_in_rule__XmlConfig__Group__0318);
            rule__XmlConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlConfig__Group__1_in_rule__XmlConfig__Group__0321);
            rule__XmlConfig__Group__1();

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
    // $ANTLR end "rule__XmlConfig__Group__0"


    // $ANTLR start "rule__XmlConfig__Group__0__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:194:1: rule__XmlConfig__Group__0__Impl : ( 'xml' ) ;
    public final void rule__XmlConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:198:1: ( ( 'xml' ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:199:1: ( 'xml' )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:199:1: ( 'xml' )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:200:1: 'xml'
            {
             before(grammarAccess.getXmlConfigAccess().getXmlKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__XmlConfig__Group__0__Impl349); 
             after(grammarAccess.getXmlConfigAccess().getXmlKeyword_0()); 

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
    // $ANTLR end "rule__XmlConfig__Group__0__Impl"


    // $ANTLR start "rule__XmlConfig__Group__1"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:213:1: rule__XmlConfig__Group__1 : rule__XmlConfig__Group__1__Impl rule__XmlConfig__Group__2 ;
    public final void rule__XmlConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:217:1: ( rule__XmlConfig__Group__1__Impl rule__XmlConfig__Group__2 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:218:2: rule__XmlConfig__Group__1__Impl rule__XmlConfig__Group__2
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__1__Impl_in_rule__XmlConfig__Group__1380);
            rule__XmlConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlConfig__Group__2_in_rule__XmlConfig__Group__1383);
            rule__XmlConfig__Group__2();

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
    // $ANTLR end "rule__XmlConfig__Group__1"


    // $ANTLR start "rule__XmlConfig__Group__1__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:225:1: rule__XmlConfig__Group__1__Impl : ( ( rule__XmlConfig__NameAssignment_1 ) ) ;
    public final void rule__XmlConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:229:1: ( ( ( rule__XmlConfig__NameAssignment_1 ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:230:1: ( ( rule__XmlConfig__NameAssignment_1 ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:230:1: ( ( rule__XmlConfig__NameAssignment_1 ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:231:1: ( rule__XmlConfig__NameAssignment_1 )
            {
             before(grammarAccess.getXmlConfigAccess().getNameAssignment_1()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:232:1: ( rule__XmlConfig__NameAssignment_1 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:232:2: rule__XmlConfig__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlConfig__NameAssignment_1_in_rule__XmlConfig__Group__1__Impl410);
            rule__XmlConfig__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlConfigAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__XmlConfig__Group__1__Impl"


    // $ANTLR start "rule__XmlConfig__Group__2"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:242:1: rule__XmlConfig__Group__2 : rule__XmlConfig__Group__2__Impl rule__XmlConfig__Group__3 ;
    public final void rule__XmlConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:246:1: ( rule__XmlConfig__Group__2__Impl rule__XmlConfig__Group__3 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:247:2: rule__XmlConfig__Group__2__Impl rule__XmlConfig__Group__3
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__2__Impl_in_rule__XmlConfig__Group__2440);
            rule__XmlConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlConfig__Group__3_in_rule__XmlConfig__Group__2443);
            rule__XmlConfig__Group__3();

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
    // $ANTLR end "rule__XmlConfig__Group__2"


    // $ANTLR start "rule__XmlConfig__Group__2__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:254:1: rule__XmlConfig__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:258:1: ( ( '{' ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:259:1: ( '{' )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:259:1: ( '{' )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:260:1: '{'
            {
             before(grammarAccess.getXmlConfigAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__XmlConfig__Group__2__Impl471); 
             after(grammarAccess.getXmlConfigAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__XmlConfig__Group__2__Impl"


    // $ANTLR start "rule__XmlConfig__Group__3"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:273:1: rule__XmlConfig__Group__3 : rule__XmlConfig__Group__3__Impl rule__XmlConfig__Group__4 ;
    public final void rule__XmlConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:277:1: ( rule__XmlConfig__Group__3__Impl rule__XmlConfig__Group__4 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:278:2: rule__XmlConfig__Group__3__Impl rule__XmlConfig__Group__4
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__3__Impl_in_rule__XmlConfig__Group__3502);
            rule__XmlConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlConfig__Group__4_in_rule__XmlConfig__Group__3505);
            rule__XmlConfig__Group__4();

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
    // $ANTLR end "rule__XmlConfig__Group__3"


    // $ANTLR start "rule__XmlConfig__Group__3__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:285:1: rule__XmlConfig__Group__3__Impl : ( ( rule__XmlConfig__ConfigElementsAssignment_3 )* ) ;
    public final void rule__XmlConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:289:1: ( ( ( rule__XmlConfig__ConfigElementsAssignment_3 )* ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:290:1: ( ( rule__XmlConfig__ConfigElementsAssignment_3 )* )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:290:1: ( ( rule__XmlConfig__ConfigElementsAssignment_3 )* )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:291:1: ( rule__XmlConfig__ConfigElementsAssignment_3 )*
            {
             before(grammarAccess.getXmlConfigAccess().getConfigElementsAssignment_3()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:292:1: ( rule__XmlConfig__ConfigElementsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:292:2: rule__XmlConfig__ConfigElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__XmlConfig__ConfigElementsAssignment_3_in_rule__XmlConfig__Group__3__Impl532);
            	    rule__XmlConfig__ConfigElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getXmlConfigAccess().getConfigElementsAssignment_3()); 

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
    // $ANTLR end "rule__XmlConfig__Group__3__Impl"


    // $ANTLR start "rule__XmlConfig__Group__4"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:302:1: rule__XmlConfig__Group__4 : rule__XmlConfig__Group__4__Impl ;
    public final void rule__XmlConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:306:1: ( rule__XmlConfig__Group__4__Impl )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:307:2: rule__XmlConfig__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__XmlConfig__Group__4__Impl_in_rule__XmlConfig__Group__4563);
            rule__XmlConfig__Group__4__Impl();

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
    // $ANTLR end "rule__XmlConfig__Group__4"


    // $ANTLR start "rule__XmlConfig__Group__4__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:313:1: rule__XmlConfig__Group__4__Impl : ( '}' ) ;
    public final void rule__XmlConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:317:1: ( ( '}' ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:318:1: ( '}' )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:318:1: ( '}' )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:319:1: '}'
            {
             before(grammarAccess.getXmlConfigAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__XmlConfig__Group__4__Impl591); 
             after(grammarAccess.getXmlConfigAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__XmlConfig__Group__4__Impl"


    // $ANTLR start "rule__ConfigElement__Group__0"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:342:1: rule__ConfigElement__Group__0 : rule__ConfigElement__Group__0__Impl rule__ConfigElement__Group__1 ;
    public final void rule__ConfigElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:346:1: ( rule__ConfigElement__Group__0__Impl rule__ConfigElement__Group__1 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:347:2: rule__ConfigElement__Group__0__Impl rule__ConfigElement__Group__1
            {
            pushFollow(FOLLOW_rule__ConfigElement__Group__0__Impl_in_rule__ConfigElement__Group__0632);
            rule__ConfigElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConfigElement__Group__1_in_rule__ConfigElement__Group__0635);
            rule__ConfigElement__Group__1();

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
    // $ANTLR end "rule__ConfigElement__Group__0"


    // $ANTLR start "rule__ConfigElement__Group__0__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:354:1: rule__ConfigElement__Group__0__Impl : ( ( rule__ConfigElement__NameAssignment_0 ) ) ;
    public final void rule__ConfigElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:358:1: ( ( ( rule__ConfigElement__NameAssignment_0 ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:359:1: ( ( rule__ConfigElement__NameAssignment_0 ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:359:1: ( ( rule__ConfigElement__NameAssignment_0 ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:360:1: ( rule__ConfigElement__NameAssignment_0 )
            {
             before(grammarAccess.getConfigElementAccess().getNameAssignment_0()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:361:1: ( rule__ConfigElement__NameAssignment_0 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:361:2: rule__ConfigElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ConfigElement__NameAssignment_0_in_rule__ConfigElement__Group__0__Impl662);
            rule__ConfigElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigElementAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ConfigElement__Group__0__Impl"


    // $ANTLR start "rule__ConfigElement__Group__1"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:371:1: rule__ConfigElement__Group__1 : rule__ConfigElement__Group__1__Impl rule__ConfigElement__Group__2 ;
    public final void rule__ConfigElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:375:1: ( rule__ConfigElement__Group__1__Impl rule__ConfigElement__Group__2 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:376:2: rule__ConfigElement__Group__1__Impl rule__ConfigElement__Group__2
            {
            pushFollow(FOLLOW_rule__ConfigElement__Group__1__Impl_in_rule__ConfigElement__Group__1692);
            rule__ConfigElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConfigElement__Group__2_in_rule__ConfigElement__Group__1695);
            rule__ConfigElement__Group__2();

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
    // $ANTLR end "rule__ConfigElement__Group__1"


    // $ANTLR start "rule__ConfigElement__Group__1__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:383:1: rule__ConfigElement__Group__1__Impl : ( ':' ) ;
    public final void rule__ConfigElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:387:1: ( ( ':' ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:388:1: ( ':' )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:388:1: ( ':' )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:389:1: ':'
            {
             before(grammarAccess.getConfigElementAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__ConfigElement__Group__1__Impl723); 
             after(grammarAccess.getConfigElementAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ConfigElement__Group__1__Impl"


    // $ANTLR start "rule__ConfigElement__Group__2"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:402:1: rule__ConfigElement__Group__2 : rule__ConfigElement__Group__2__Impl ;
    public final void rule__ConfigElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:406:1: ( rule__ConfigElement__Group__2__Impl )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:407:2: rule__ConfigElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConfigElement__Group__2__Impl_in_rule__ConfigElement__Group__2754);
            rule__ConfigElement__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigElement__Group__2"


    // $ANTLR start "rule__ConfigElement__Group__2__Impl"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:413:1: rule__ConfigElement__Group__2__Impl : ( ( rule__ConfigElement__TypeAssignment_2 ) ) ;
    public final void rule__ConfigElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:417:1: ( ( ( rule__ConfigElement__TypeAssignment_2 ) ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:418:1: ( ( rule__ConfigElement__TypeAssignment_2 ) )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:418:1: ( ( rule__ConfigElement__TypeAssignment_2 ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:419:1: ( rule__ConfigElement__TypeAssignment_2 )
            {
             before(grammarAccess.getConfigElementAccess().getTypeAssignment_2()); 
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:420:1: ( rule__ConfigElement__TypeAssignment_2 )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:420:2: rule__ConfigElement__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ConfigElement__TypeAssignment_2_in_rule__ConfigElement__Group__2__Impl781);
            rule__ConfigElement__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigElementAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ConfigElement__Group__2__Impl"


    // $ANTLR start "rule__Model__XmlsAssignment"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:437:1: rule__Model__XmlsAssignment : ( ruleXmlConfig ) ;
    public final void rule__Model__XmlsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:441:1: ( ( ruleXmlConfig ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:442:1: ( ruleXmlConfig )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:442:1: ( ruleXmlConfig )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:443:1: ruleXmlConfig
            {
             before(grammarAccess.getModelAccess().getXmlsXmlConfigParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleXmlConfig_in_rule__Model__XmlsAssignment822);
            ruleXmlConfig();

            state._fsp--;

             after(grammarAccess.getModelAccess().getXmlsXmlConfigParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__XmlsAssignment"


    // $ANTLR start "rule__XmlConfig__NameAssignment_1"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:452:1: rule__XmlConfig__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XmlConfig__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:456:1: ( ( RULE_ID ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:457:1: ( RULE_ID )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:457:1: ( RULE_ID )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:458:1: RULE_ID
            {
             before(grammarAccess.getXmlConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XmlConfig__NameAssignment_1853); 
             after(grammarAccess.getXmlConfigAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__XmlConfig__NameAssignment_1"


    // $ANTLR start "rule__XmlConfig__ConfigElementsAssignment_3"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:467:1: rule__XmlConfig__ConfigElementsAssignment_3 : ( ruleConfigElement ) ;
    public final void rule__XmlConfig__ConfigElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:471:1: ( ( ruleConfigElement ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:472:1: ( ruleConfigElement )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:472:1: ( ruleConfigElement )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:473:1: ruleConfigElement
            {
             before(grammarAccess.getXmlConfigAccess().getConfigElementsConfigElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConfigElement_in_rule__XmlConfig__ConfigElementsAssignment_3884);
            ruleConfigElement();

            state._fsp--;

             after(grammarAccess.getXmlConfigAccess().getConfigElementsConfigElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__XmlConfig__ConfigElementsAssignment_3"


    // $ANTLR start "rule__ConfigElement__NameAssignment_0"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:482:1: rule__ConfigElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:486:1: ( ( RULE_ID ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:487:1: ( RULE_ID )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:487:1: ( RULE_ID )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:488:1: RULE_ID
            {
             before(grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConfigElement__NameAssignment_0915); 
             after(grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConfigElement__NameAssignment_0"


    // $ANTLR start "rule__ConfigElement__TypeAssignment_2"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:497:1: rule__ConfigElement__TypeAssignment_2 : ( ruleConfigElementType ) ;
    public final void rule__ConfigElement__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:501:1: ( ( ruleConfigElementType ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:502:1: ( ruleConfigElementType )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:502:1: ( ruleConfigElementType )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:503:1: ruleConfigElementType
            {
             before(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConfigElementType_in_rule__ConfigElement__TypeAssignment_2946);
            ruleConfigElementType();

            state._fsp--;

             after(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConfigElement__TypeAssignment_2"


    // $ANTLR start "rule__ConfigElementType__TypeAssignment"
    // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:512:1: rule__ConfigElementType__TypeAssignment : ( RULE_STRING ) ;
    public final void rule__ConfigElementType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:516:1: ( ( RULE_STRING ) )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:517:1: ( RULE_STRING )
            {
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:517:1: ( RULE_STRING )
            // ../org.xconfig.ui/src-gen/org/xconfig/ui/contentassist/antlr/internal/InternalXconfig.g:518:1: RULE_STRING
            {
             before(grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConfigElementType__TypeAssignment977); 
             after(grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ConfigElementType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__XmlsAssignment_in_ruleModel103 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleXmlConfig_in_entryRuleXmlConfig131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlConfig138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__0_in_ruleXmlConfig164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElement_in_entryRuleConfigElement191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigElement198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__0_in_ruleConfigElement224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElementType_in_entryRuleConfigElementType251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigElementType258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElementType__TypeAssignment_in_ruleConfigElementType284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__0__Impl_in_rule__XmlConfig__Group__0318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__1_in_rule__XmlConfig__Group__0321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__XmlConfig__Group__0__Impl349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__1__Impl_in_rule__XmlConfig__Group__1380 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__2_in_rule__XmlConfig__Group__1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__NameAssignment_1_in_rule__XmlConfig__Group__1__Impl410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__2__Impl_in_rule__XmlConfig__Group__2440 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__3_in_rule__XmlConfig__Group__2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XmlConfig__Group__2__Impl471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__3__Impl_in_rule__XmlConfig__Group__3502 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__4_in_rule__XmlConfig__Group__3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlConfig__ConfigElementsAssignment_3_in_rule__XmlConfig__Group__3__Impl532 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XmlConfig__Group__4__Impl_in_rule__XmlConfig__Group__4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__XmlConfig__Group__4__Impl591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__0__Impl_in_rule__ConfigElement__Group__0632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__1_in_rule__ConfigElement__Group__0635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__NameAssignment_0_in_rule__ConfigElement__Group__0__Impl662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__1__Impl_in_rule__ConfigElement__Group__1692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__2_in_rule__ConfigElement__Group__1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConfigElement__Group__1__Impl723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__Group__2__Impl_in_rule__ConfigElement__Group__2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigElement__TypeAssignment_2_in_rule__ConfigElement__Group__2__Impl781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlConfig_in_rule__Model__XmlsAssignment822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XmlConfig__NameAssignment_1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElement_in_rule__XmlConfig__ConfigElementsAssignment_3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConfigElement__NameAssignment_0915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigElementType_in_rule__ConfigElement__TypeAssignment_2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConfigElementType__TypeAssignment977 = new BitSet(new long[]{0x0000000000000002L});

}