package org.javaParser;

import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.javaParser.antlr.SimpleJavaLexer;
import org.javaParser.antlr.SimpleJavaParser;
import org.junit.Test;

public class ParserTest {

    String path = "src/test/resources/";
    @Test
    public void testInput1() throws IOException {

        SimpleJavaLexer java8Lexer = new SimpleJavaLexer(CharStreams.fromFileName(path + "test1/input.java"));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.program();
        ASTPrinter asaPrinter = new ASTPrinter();
        asaPrinter.print((RuleContext) tree, path + "test1/ast.json");
    }

    @Test
    public void testInput2() throws IOException {

        SimpleJavaLexer java8Lexer = new SimpleJavaLexer(CharStreams.fromFileName(path + "test2/input.java"));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.program();
        ASTPrinter asaPrinter = new ASTPrinter();
        asaPrinter.print((RuleContext) tree, path + "test2/ast.json");
    }

    @Test
    public void testInput3() throws IOException {

        SimpleJavaLexer java8Lexer = new SimpleJavaLexer(CharStreams.fromFileName(path + "test3/input.java"));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.program();
        ASTPrinter asaPrinter = new ASTPrinter();
        asaPrinter.print((RuleContext) tree, path + "test3/ast.json");
    }
    @Test
    public void testInput4() throws IOException {

        SimpleJavaLexer java8Lexer = new SimpleJavaLexer(CharStreams.fromFileName(path + "test4/input.java"));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.program();
        ASTPrinter asaPrinter = new ASTPrinter();
        asaPrinter.print((RuleContext) tree, path + "test4/ast.json");
    }

}
