/*
 * generated by Xtext
 */
package cz.gpp.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import cz.gpp.services.ExampleGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ExampleFormatter 
	extends AbstractDeclarativeFormatter
{
	@Override
	protected void configureFormatting(FormattingConfig c){
		ExampleGrammarAccess f = (ExampleGrammarAccess)getGrammarAccess();
		
		// set a maximum size of lines
		c.setAutoLinewrap(80);
		
		// set a line wrap after each import of a name space 
		c.setLinewrap().after(f.getImportRule());
		
		// set an empty line between a package declaration 
		// and a set of name space imports 
		c.setLinewrap(2).between(
			f.getModelAccess().getPackageAssignment_0(), 
			f.getModelAccess().getImportsAssignment_1_0()
		);
		
		// set an empty line between a package declaration and a class 
		c.setLinewrap(2).between(
			f.getModelAccess().getPackageAssignment_0(),
			f.getModelAccess().getClassAssignment_1_1()
		);
		
		// set an empty line between a set of name space imports 
		// and a class
		c.setLinewrap(2).between(
			f.getModelAccess().getImportsAssignment_1_0(),
			f.getModelAccess().getClassAssignment_1_1()
		);
		
		// set an empty line between a class and a set of name space imports
		c.setLinewrap(2).between(f.getClassRule(), f.getImportRule());
		
		// set no space around all parentheses
	    for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")){
	    	c.setNoSpace().around(pair.getFirst());
	        c.setNoSpace().around(pair.getSecond());
	    }
	    
	    // set no space before all commas
	    for (Keyword comma : f.findKeywords(",")){
	        c.setNoSpace().before(comma);
	    }
		
	    // set indentation inside all curly brackets 
	    // set line wrap after each left curly bracket
	    // set line wrap around each right curly bracket
	    for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")){
			c.setIndentationIncrement().after(pair.getFirst());
			c.setIndentationDecrement().before(pair.getSecond());
			c.setLinewrap().after(pair.getFirst());
			c.setLinewrap().around(pair.getSecond());
	    }
		
	    // set line wrap before left curly bracket which is contained in Class rule 
		c.setLinewrap().before(
			f.getClassAccess().getLeftCurlyBracketKeyword_4()
		);
		
		// set empty line between two inner elements of class (inner class or method)
		c.setLinewrap(2).between(
			f.getClassAccess().getAlternatives_5(),
			f.getClassAccess().getAlternatives_5()
		);
	}
}
