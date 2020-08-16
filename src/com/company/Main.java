package com.company;

import com.contralador.listener;
import com.gui.latexGUI;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {

    public static void main(String[] args) throws Exception{

        /*String ruta = "src/com/company/test.txt";
        CharStream input = fromFileName(ruta);

        matrizLexer lexer = new matrizLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        matrizParser parser = new matrizParser(tokens);

        ParseTree tree =parser.sentencias();
        //VISITOR
        MyVisitor visit = new MyVisitor();
        visit.visit(tree);
        //listener
        Mylistener lis = new Mylistener(visit.tabla);
        ParseTreeWalker walker   = new ParseTreeWalker();
        walker.walk(lis, tree);
        System.out.println(lis.mathToLatex);

        latexGUI gui = new latexGUI("antlr");
        gui.setVisible(true);

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/

        matriz modelo = new matriz();
        latexGUI vista = new latexGUI("antlr");

        listener controlador = new listener(vista, modelo);

        controlador.iniciar();
        vista.setVisible(true);




    }
}
