// Generated from C:/Users/rmama/IdeaProjects/matriz/src/com/company\matrizParser.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matrizParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matrizParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matrizParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(matrizParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(matrizParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(matrizParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(matrizParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(matrizParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(matrizParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(matrizParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(matrizParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(matrizParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(matrizParser.VariableContext ctx);
}