/*
* generated by Xtext
*/

package org.xconfig.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class XconfigGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cXmlsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cXmlsXmlConfigParserRuleCall_0 = (RuleCall)cXmlsAssignment.eContents().get(0);
		
		//Model hidden(WS, ML_COMMENT, SL_COMMENT):
		//
		//	xmls+=XmlConfig*;
		public ParserRule getRule() { return rule; }

		//xmls+=XmlConfig*
		public Assignment getXmlsAssignment() { return cXmlsAssignment; }

		//XmlConfig
		public RuleCall getXmlsXmlConfigParserRuleCall_0() { return cXmlsXmlConfigParserRuleCall_0; }
	}

	public class XmlConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XmlConfig");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cXmlKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConfigElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConfigElementsConfigElementParserRuleCall_3_0 = (RuleCall)cConfigElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//XmlConfig:
		//
		//	"xml" name=ID "{" configElements+=ConfigElement* "}";
		public ParserRule getRule() { return rule; }

		//"xml" name=ID "{" configElements+=ConfigElement* "}"
		public Group getGroup() { return cGroup; }

		//"xml"
		public Keyword getXmlKeyword_0() { return cXmlKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//configElements+=ConfigElement*
		public Assignment getConfigElementsAssignment_3() { return cConfigElementsAssignment_3; }

		//ConfigElement
		public RuleCall getConfigElementsConfigElementParserRuleCall_3_0() { return cConfigElementsConfigElementParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ConfigElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeConfigElementTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//ConfigElement:
		//
		//	name=ID ":" type=ConfigElementType;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=ConfigElementType
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=ConfigElementType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//ConfigElementType
		public RuleCall getTypeConfigElementTypeParserRuleCall_2_0() { return cTypeConfigElementTypeParserRuleCall_2_0; }
	}

	public class ConfigElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ConfigElementType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypeSTRINGTerminalRuleCall_0 = (RuleCall)cTypeAssignment.eContents().get(0);
		
		//ConfigElementType:
		//
		//	type=STRING;
		public ParserRule getRule() { return rule; }

		//type=STRING
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_0() { return cTypeSTRINGTerminalRuleCall_0; }
	}
	
	
	private ModelElements pModel;
	private XmlConfigElements pXmlConfig;
	private ConfigElementElements pConfigElement;
	private ConfigElementTypeElements pConfigElementType;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public XconfigGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xconfig.Xconfig".equals(grammar.getName())) {
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

	
	//Model hidden(WS, ML_COMMENT, SL_COMMENT):
	//
	//	xmls+=XmlConfig*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//XmlConfig:
	//
	//	"xml" name=ID "{" configElements+=ConfigElement* "}";
	public XmlConfigElements getXmlConfigAccess() {
		return (pXmlConfig != null) ? pXmlConfig : (pXmlConfig = new XmlConfigElements());
	}
	
	public ParserRule getXmlConfigRule() {
		return getXmlConfigAccess().getRule();
	}

	//ConfigElement:
	//
	//	name=ID ":" type=ConfigElementType;
	public ConfigElementElements getConfigElementAccess() {
		return (pConfigElement != null) ? pConfigElement : (pConfigElement = new ConfigElementElements());
	}
	
	public ParserRule getConfigElementRule() {
		return getConfigElementAccess().getRule();
	}

	//ConfigElementType:
	//
	//	type=STRING;
	public ConfigElementTypeElements getConfigElementTypeAccess() {
		return (pConfigElementType != null) ? pConfigElementType : (pConfigElementType = new ConfigElementTypeElements());
	}
	
	public ParserRule getConfigElementTypeRule() {
		return getConfigElementTypeAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
