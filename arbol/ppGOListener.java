// Generated from ppGO.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ppGOParser}.
 */
public interface ppGOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ppGOParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ppGOParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ppGOParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ppGOParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ppGOParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(ppGOParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(ppGOParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ppGOParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ppGOParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ppGOParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ppGOParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ppGOParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ppGOParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ppGOParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ppGOParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#varsDec}.
	 * @param ctx the parse tree
	 */
	void enterVarsDec(ppGOParser.VarsDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#varsDec}.
	 * @param ctx the parse tree
	 */
	void exitVarsDec(ppGOParser.VarsDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(ppGOParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(ppGOParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ppGOParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ppGOParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(ppGOParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(ppGOParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(ppGOParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(ppGOParser.ElseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ppGOParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ppGOParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(ppGOParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(ppGOParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ppGOParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ppGOParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ppGOParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ppGOParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ppGOParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ppGOParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ppGOParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ppGOParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ppGOParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ppGOParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(ppGOParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(ppGOParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#print2}.
	 * @param ctx the parse tree
	 */
	void enterPrint2(ppGOParser.Print2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#print2}.
	 * @param ctx the parse tree
	 */
	void exitPrint2(ppGOParser.Print2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ppGOParser#return2}.
	 * @param ctx the parse tree
	 */
	void enterReturn2(ppGOParser.Return2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ppGOParser#return2}.
	 * @param ctx the parse tree
	 */
	void exitReturn2(ppGOParser.Return2Context ctx);
}