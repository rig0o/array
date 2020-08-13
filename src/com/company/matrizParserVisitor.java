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
	 * Visit a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(matrizParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(matrizParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(matrizParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(matrizParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(matrizParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(matrizParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(matrizParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans(matrizParser.TransContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(matrizParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(matrizParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR1(matrizParser.R1Context ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#transpuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranspuesta(matrizParser.TranspuestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PotenciasM}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciasM(matrizParser.PotenciasMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PotenciaA}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciaA(matrizParser.PotenciaAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR2(matrizParser.R2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR3(matrizParser.R3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDAMEint(matrizParser.DAMEintContext ctx);
	/**
	 * Visit a parse tree produced by {@link matrizParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(matrizParser.TipoContext ctx);
}