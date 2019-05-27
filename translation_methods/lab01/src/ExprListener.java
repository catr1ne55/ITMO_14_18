// Generated from Expr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExprParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExprParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(ExprParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(ExprParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprParser.TermContext ctx);
}