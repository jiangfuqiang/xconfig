/*
* generated by Xtext
*/
grammar InternalXconfig;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xconfig.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Model
ruleModel
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getXmlsAssignment()); }
(rule__Model__XmlsAssignment)*
{ after(grammarAccess.getModelAccess().getXmlsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRuleXmlConfig
entryRuleXmlConfig 
:
{ before(grammarAccess.getXmlConfigRule()); }
	 ruleXmlConfig
{ after(grammarAccess.getXmlConfigRule()); } 
	 EOF 
;

// Rule XmlConfig
ruleXmlConfig
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getXmlConfigAccess().getGroup()); }
(rule__XmlConfig__Group__0)
{ after(grammarAccess.getXmlConfigAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConfigElement
entryRuleConfigElement 
:
{ before(grammarAccess.getConfigElementRule()); }
	 ruleConfigElement
{ after(grammarAccess.getConfigElementRule()); } 
	 EOF 
;

// Rule ConfigElement
ruleConfigElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConfigElementAccess().getGroup()); }
(rule__ConfigElement__Group__0)
{ after(grammarAccess.getConfigElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConfigElementType
entryRuleConfigElementType 
:
{ before(grammarAccess.getConfigElementTypeRule()); }
	 ruleConfigElementType
{ after(grammarAccess.getConfigElementTypeRule()); } 
	 EOF 
;

// Rule ConfigElementType
ruleConfigElementType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConfigElementTypeAccess().getTypeAssignment()); }
(rule__ConfigElementType__TypeAssignment)
{ after(grammarAccess.getConfigElementTypeAccess().getTypeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__XmlConfig__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__XmlConfig__Group__0__Impl
	rule__XmlConfig__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getXmlKeyword_0()); }

	'xml' 

{ after(grammarAccess.getXmlConfigAccess().getXmlKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__XmlConfig__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__XmlConfig__Group__1__Impl
	rule__XmlConfig__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getNameAssignment_1()); }
(rule__XmlConfig__NameAssignment_1)
{ after(grammarAccess.getXmlConfigAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__XmlConfig__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__XmlConfig__Group__2__Impl
	rule__XmlConfig__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getXmlConfigAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__XmlConfig__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__XmlConfig__Group__3__Impl
	rule__XmlConfig__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getConfigElementsAssignment_3()); }
(rule__XmlConfig__ConfigElementsAssignment_3)*
{ after(grammarAccess.getXmlConfigAccess().getConfigElementsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__XmlConfig__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__XmlConfig__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getXmlConfigAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ConfigElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ConfigElement__Group__0__Impl
	rule__ConfigElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementAccess().getNameAssignment_0()); }
(rule__ConfigElement__NameAssignment_0)
{ after(grammarAccess.getConfigElementAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ConfigElement__Group__1__Impl
	rule__ConfigElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getConfigElementAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ConfigElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementAccess().getTypeAssignment_2()); }
(rule__ConfigElement__TypeAssignment_2)
{ after(grammarAccess.getConfigElementAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__XmlsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getXmlsXmlConfigParserRuleCall_0()); }
	ruleXmlConfig{ after(grammarAccess.getModelAccess().getXmlsXmlConfigParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getXmlConfigAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__XmlConfig__ConfigElementsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXmlConfigAccess().getConfigElementsConfigElementParserRuleCall_3_0()); }
	ruleConfigElement{ after(grammarAccess.getXmlConfigAccess().getConfigElementsConfigElementParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElement__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElement__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0()); }
	ruleConfigElementType{ after(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigElementType__TypeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


