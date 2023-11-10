package org.javaParser;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.javaParser.antlr.SimpleJavaParser;

import java.io.FileWriter;
import java.io.IOException;

public class ASTPrinter {

    private FileWriter jsonWriter;
    private int indentation = 0;

    public void print(RuleContext ctx, String outputFileName) {
        try {
            jsonWriter = new FileWriter(outputFileName);
            jsonWriter.write("[\n");
            indentation++;
            explore(ctx);
            indentation--;
            jsonWriter.write("\n]");
            jsonWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void explore(RuleContext ctx) {
        buildNode(ctx);
        try {
            jsonWriter.write("\n");
            jsonWriter.write(getIndentation());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void buildNode(RuleContext ctx) {
        String ruleName = SimpleJavaParser.ruleNames[ctx.getRuleIndex()];
        try {
            jsonWriter.write("{\n");

            indentation++;
            jsonWriter.write(getIndentation());
            jsonWriter.write("\"type\": \"" + ruleName + "\",\n");

            jsonWriter.write(getIndentation());
            if (checkChildren(ctx, 0)){
                jsonWriter.write("\"text\": \"" + escapeJson(ctx.getText()) + "\",\n");
            }
            else {
                jsonWriter.write("\"text\": \"" + escapeJson(ctx.getText()) + "\"\n");
            }
            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree element = ctx.getChild(i);
                if (element instanceof RuleContext) {
                    jsonWriter.write(getIndentation());
                    jsonWriter.write("\"child_" + i + "\": ");
                    indentation++;
                    buildNode((RuleContext) element);
                    indentation--;
                    if (checkChildren(ctx, i+1)) {
                        jsonWriter.write(",");
                    }
                    jsonWriter.write("\n");
                }
            }

            indentation -= 2;
            jsonWriter.write(getIndentation());
            jsonWriter.write("}");
            indentation++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String escapeJson(String text) {
        // Экранирование специальных символов JSON
        return text
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\b", "\\b")
                .replace("\f", "\\f")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private String getIndentation() {
        return "  ".repeat(indentation);
    }
    private boolean checkChildren(RuleContext ctx, int index){
        for(int i = index; i < ctx.getChildCount(); i++)
            if(ctx.getChild(i) instanceof RuleContext)
                return true;

        return false;
    }

}
