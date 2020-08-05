// Generated from C:/Users/rmama/IdeaProjects/matriz\matrizParser.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link matrizParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(matrizParser.ArrayContext ctx);
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
	 * Visit a parse tree produced by {@link matrizParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(matrizParser.AnnotationContext ctx);
}