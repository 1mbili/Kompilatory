// Generated from RBOL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RBOLParser}.
 */
public interface RBOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RBOLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(RBOLParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(RBOLParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RBOLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RBOLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RBOLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RBOLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RBOLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RBOLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RBOLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RBOLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(RBOLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(RBOLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#substract}.
	 * @param ctx the parse tree
	 */
	void enterSubstract(RBOLParser.SubstractContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#substract}.
	 * @param ctx the parse tree
	 */
	void exitSubstract(RBOLParser.SubstractContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(RBOLParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(RBOLParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(RBOLParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(RBOLParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(RBOLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(RBOLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(RBOLParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(RBOLParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#scand}.
	 * @param ctx the parse tree
	 */
	void enterScand(RBOLParser.ScandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#scand}.
	 * @param ctx the parse tree
	 */
	void exitScand(RBOLParser.ScandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RBOLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RBOLParser.VariableContext ctx);
}