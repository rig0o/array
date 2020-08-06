// Generated from C:/Users/rmama/IdeaProjects/matriz/src/com/company\matrizParser.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matrizParser}.
 */
public interface matrizParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matrizParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(matrizParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(matrizParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(matrizParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(matrizParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(matrizParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(matrizParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(matrizParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(matrizParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(matrizParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(matrizParser.AnnotationContext ctx);
}