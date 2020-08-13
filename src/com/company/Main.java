package com.company;
import org.antlr.v4.runtime.CharStream;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {

    public static void main(String[] args) throws Exception{

        String ruta = "src/com/company/test.txt";
        CharStream input = fromFileName(ruta);

        matrizLexer lexer = new matrizLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        matrizParser parser = new matrizParser(tokens);

        ParseTree tree =parser.sentencias();

        MyVisitor visit = new MyVisitor();
        visit.visit(tree);



    }
}
