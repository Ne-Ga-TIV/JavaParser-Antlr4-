// Generated from /home/ngtv/Public/Study/Java/AntlrJavaParser/src/main/java/antlr/SimpleJava.g4 by ANTLR 4.13.1
package org.javaParser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(SimpleJavaParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(SimpleJavaParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifiers(SimpleJavaParser.AccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SimpleJavaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#increments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrements(SimpleJavaParser.IncrementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#returt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturt(SimpleJavaParser.ReturtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#medtotArgsVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedtotArgsVariable(SimpleJavaParser.MedtotArgsVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#medhotDecalration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedhotDecalration(SimpleJavaParser.MedhotDecalrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SimpleJavaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#keyCicleWords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyCicleWords(SimpleJavaParser.KeyCicleWordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleJavaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SimpleJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SimpleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
}