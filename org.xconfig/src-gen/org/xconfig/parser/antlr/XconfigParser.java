/*
* generated by Xtext
*/
package org.xconfig.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xconfig.services.XconfigGrammarAccess;

public class XconfigParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XconfigGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xconfig.parser.antlr.internal.InternalXconfigParser createParser(XtextTokenStream stream) {
		return new org.xconfig.parser.antlr.internal.InternalXconfigParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public XconfigGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XconfigGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}