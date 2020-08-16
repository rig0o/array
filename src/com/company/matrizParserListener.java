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
	 * Enter a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(matrizParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(matrizParser.ImprimeContext ctx);
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
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterDiv(matrizParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitDiv(matrizParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterVariable(matrizParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitVariable(matrizParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(matrizParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(matrizParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMenos(matrizParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menos}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMenos(matrizParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potencias}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPotencias(matrizParser.PotenciasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterPlus(matrizParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitPlus(matrizParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterTrans(matrizParser.TransContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trans}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitTrans(matrizParser.TransContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(matrizParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(matrizParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterParen(matrizParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitParen(matrizParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void enterR1(matrizParser.R1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R1}
	 * labeled alternative in {@link matrizParser#e}.
	 * @param ctx the parse tree
	 */
	void exitR1(matrizParser.R1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PotenciasM}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotenciasM(matrizParser.PotenciasMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PotenciasM}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotenciasM(matrizParser.PotenciasMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PotenciaA}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotenciaA(matrizParser.PotenciaAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PotenciaA}
	 * labeled alternative in {@link matrizParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotenciaA(matrizParser.PotenciaAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterR2(matrizParser.R2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R2}
	 * labeled alternative in {@link matrizParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitR2(matrizParser.R2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterR3(matrizParser.R3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code R3}
	 * labeled alternative in {@link matrizParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitR3(matrizParser.R3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Damearry}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDamearry(matrizParser.DamearryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDAMEint(matrizParser.DAMEintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DAMEint}
	 * labeled alternative in {@link matrizParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDAMEint(matrizParser.DAMEintContext ctx);
	/**
	 * Enter a parse tree produced by {@link matrizParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(matrizParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matrizParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(matrizParser.TipoContext ctx);
}