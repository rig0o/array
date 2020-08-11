// Generated from C:/Users/rmama/IdeaProjects/matriz/src/com/company\matrizParser.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matrizParser}.
 */
public interface matrizParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(matrizParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(matrizParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(matrizParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(matrizParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(matrizParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(matrizParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(matrizParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(matrizParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(matrizParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(matrizParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(matrizParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(matrizParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(matrizParser.AsignacionContext ctx);
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
	 * Enter a parse tree produced by {@link matrizParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(matrizParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(matrizParser.VariableContext ctx);
}