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
	 * Enter a parse tree produced by {@link RBOLParser#programbody}.
	 * @param ctx the parse tree
	 */
	void enterProgrambody(RBOLParser.ProgrambodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#programbody}.
	 * @param ctx the parse tree
	 */
	void exitProgrambody(RBOLParser.ProgrambodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#structura}.
	 * @param ctx the parse tree
	 */
	void enterStructura(RBOLParser.StructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#structura}.
	 * @param ctx the parse tree
	 */
	void exitStructura(RBOLParser.StructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#strukturasetter}.
	 * @param ctx the parse tree
	 */
	void enterStrukturasetter(RBOLParser.StrukturasetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#strukturasetter}.
	 * @param ctx the parse tree
	 */
	void exitStrukturasetter(RBOLParser.StrukturasetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#strukturagetterproperty}.
	 * @param ctx the parse tree
	 */
	void enterStrukturagetterproperty(RBOLParser.StrukturagetterpropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#strukturagetterproperty}.
	 * @param ctx the parse tree
	 */
	void exitStrukturagetterproperty(RBOLParser.StrukturagetterpropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#structbody}.
	 * @param ctx the parse tree
	 */
	void enterStructbody(RBOLParser.StructbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#structbody}.
	 * @param ctx the parse tree
	 */
	void exitStructbody(RBOLParser.StructbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RBOLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RBOLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(RBOLParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(RBOLParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(RBOLParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(RBOLParser.FblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(RBOLParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(RBOLParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void enterIfbody(RBOLParser.IfbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void exitIfbody(RBOLParser.IfbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#repeatstatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatstatement(RBOLParser.RepeatstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#repeatstatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatstatement(RBOLParser.RepeatstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#repeatbody}.
	 * @param ctx the parse tree
	 */
	void enterRepeatbody(RBOLParser.RepeatbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#repeatbody}.
	 * @param ctx the parse tree
	 */
	void exitRepeatbody(RBOLParser.RepeatbodyContext ctx);
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
	 * Enter a parse tree produced by {@link RBOLParser#localassigment}.
	 * @param ctx the parse tree
	 */
	void enterLocalassigment(RBOLParser.LocalassigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#localassigment}.
	 * @param ctx the parse tree
	 */
	void exitLocalassigment(RBOLParser.LocalassigmentContext ctx);
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
	 * Enter a parse tree produced by {@link RBOLParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(RBOLParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(RBOLParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(RBOLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(RBOLParser.OperatorContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link RBOLParser#strukturagetter}.
	 * @param ctx the parse tree
	 */
	void enterStrukturagetter(RBOLParser.StrukturagetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#strukturagetter}.
	 * @param ctx the parse tree
	 */
	void exitStrukturagetter(RBOLParser.StrukturagetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RBOLParser#repeatheader}.
	 * @param ctx the parse tree
	 */
	void enterRepeatheader(RBOLParser.RepeatheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RBOLParser#repeatheader}.
	 * @param ctx the parse tree
	 */
	void exitRepeatheader(RBOLParser.RepeatheaderContext ctx);
}