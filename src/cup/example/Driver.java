package cup.example;

import java.io.File;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		
		/*
		 * ComplexSymbolFactory f = new ComplexSymbolFactory(); // symbolFactory = f;
		 * File file = new File("input.txt"); FileInputStream fis = null; try { fis =
		 * new FileInputStream(file); } catch (IOException e) { e.printStackTrace(); }
		 * Lexer lexer = new Lexer(f,fis); Symbol symbol;
		 * 
		 * while ((symbol = lexer.next_token()).sym != sym.EOF) {
		 * System.out.println(symbol); }
		 */
		 
		
		  Parser parser = new Parser(); parser.parse();
		  
		  var rootHtmlEl = parser.getRootHtmlEl();
		  
		  Output(rootHtmlEl);
		 
	}
	
	public static void Output(HtmlEl element) {
        if (element == null) {
            return;
        }

        if (element.getData() != null && !element.getData().equals("tel")) {
        	System.out.println(element.getData());
        }

        List<HtmlEl> children = element.getChildren();
        List<HtmlEl> brothers = element.getBrotherHtmlEls();
        children.forEach(child -> Output(child));
        brothers.forEach(brother -> Output(brother));
    }
	
}