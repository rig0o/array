package com.company;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;


import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class matriz {

    TeXFormula formula;
    TeXIcon icon;
    String math;
    public matriz(){

    }
    public matriz(String math){
        this.math = math;
    }

    public TeXIcon getIconLaTex(){
        try {
            formula = new TeXFormula(this.math);
            this.icon = this.formula.createTeXIcon(TeXConstants.ALIGN_CENTER, 40);
            return this.icon;
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }
    }
    public TeXIcon actualizarIconLaTex(String math, int valor){
        try {
            this.math = math;
            this.formula = new TeXFormula(this.math);
            this.icon = this.formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_DISPLAY)
                    .setSize(valor)
                    .setWidth(TeXConstants.UNIT_PIXEL, 256f, TeXConstants.ALIGN_LEFT)
                    .setIsMaxWidth(true)
                    .setInterLineSpacing(TeXConstants.UNIT_PIXEL, 20f).build();
            return this.icon;

        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }
    }
    public String antlr(String texto){
            System.out.println(texto);
            CharStream input = new ANTLRInputStream(texto);
            matrizLexer lexer = new matrizLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            matrizParser parser = new matrizParser(tokens);

            ParseTree tree =parser.sentencias();
            MyVisitor visit = new MyVisitor();
            visit.visit(tree);
            Mylistener lis = new Mylistener(visit.tabla);
            ParseTreeWalker walker   = new ParseTreeWalker();
            walker.walk(lis, tree);

            return  lis.mathToLatex;
    }

}
