// Generated from /home/ngtv/Public/Study/Java/AntlrJavaParser/src/main/java/antlr/SimpleJava.g4 by ANTLR 4.13.1
package org.javaParser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(SimpleJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(SimpleJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(SimpleJavaParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(SimpleJavaParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifiers(SimpleJavaParser.AccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifiers(SimpleJavaParser.AccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SimpleJavaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SimpleJavaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#increments}.
	 * @param ctx the parse tree
	 */
	void enterIncrements(SimpleJavaParser.IncrementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#increments}.
	 * @param ctx the parse tree
	 */
	void exitIncrements(SimpleJavaParser.IncrementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#returt}.
	 * @param ctx the parse tree
	 */
	void enterReturt(SimpleJavaParser.ReturtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#returt}.
	 * @param ctx the parse tree
	 */
	void exitReturt(SimpleJavaParser.ReturtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#medtotArgsVariable}.
	 * @param ctx the parse tree
	 */
	void enterMedtotArgsVariable(SimpleJavaParser.MedtotArgsVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#medtotArgsVariable}.
	 * @param ctx the parse tree
	 */
	void exitMedtotArgsVariable(SimpleJavaParser.MedtotArgsVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#medhotDecalration}.
	 * @param ctx the parse tree
	 */
	void enterMedhotDecalration(SimpleJavaParser.MedhotDecalrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#medhotDecalration}.
	 * @param ctx the parse tree
	 */
	void exitMedhotDecalration(SimpleJavaParser.MedhotDecalrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SimpleJavaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SimpleJavaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#keyCicleWords}.
	 * @param ctx the parse tree
	 */
	void enterKeyCicleWords(SimpleJavaParser.KeyCicleWordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#keyCicleWords}.
	 * @param ctx the parse tree
	 */
	void exitKeyCicleWords(SimpleJavaParser.KeyCicleWordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimpleJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimpleJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SimpleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SimpleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
}