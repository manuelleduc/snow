/*
 * generated by Xtext
 */
package org.yazgel.snow.notation.text.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.yazgel.snow.notation.text.services.SnowGrammarAccess;

public class SnowParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SnowGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.yazgel.snow.notation.text.parser.antlr.internal.InternalSnowParser createParser(XtextTokenStream stream) {
		return new org.yazgel.snow.notation.text.parser.antlr.internal.InternalSnowParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DomainModel";
	}
	
	public SnowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SnowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}