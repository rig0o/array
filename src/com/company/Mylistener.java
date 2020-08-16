package com.company;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.HashMap;
import java.util.Map;

public class Mylistener extends matrizParserBaseListener{

    public String mathToLatex ="";
    Map<String, RealMatrix> tabla = new HashMap<String, RealMatrix>();

    public Mylistener(Map<String, RealMatrix> tabla) {
        super();
        this.tabla = tabla;
    }

    @Override
    public void exitImprime(matrizParser.ImprimeContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        //System.out.println(tabla.get(ctx.e().getText()));
        Array2DRowRealMatrix matriz = (Array2DRowRealMatrix) tabla.get(ctx.e().getText());
        sb.append(ctx.e().getText());
        sb.append("\\begin{pmatrix}");
        for (int i = 0 ; i < matriz.getRowDimension();i++) {
            for (int j = 0; j < matriz.getColumnDimension(); j++) {
                sb.append(Float.toString((float) matriz.getEntry(i, j)));
                if(j<matriz.getColumnDimension()-1)sb.append("&");
            }
            sb.append("\\\\");
        }
        sb.append("\\end{pmatrix}");
        sb.append("\\\\");
        mathToLatex = sb.toString();
    }
    @Override
    public void enterAsignacion(matrizParser.AsignacionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(ctx.ID().getText());
        sb.append(ctx.EQ().getText());
        mathToLatex = sb.toString();
    }
    @Override
    public void exitAsignacion(matrizParser.AsignacionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\\\");
        mathToLatex = sb.toString();
    }
    @Override
    public void enterR1(matrizParser.R1Context ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\begin{pmatrix}");
        mathToLatex = sb.toString();
    }
    @Override
    public void exitR1(matrizParser.R1Context ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\end{pmatrix}");
        mathToLatex = sb.toString();
    }
    @Override
    public void exitDamearry(matrizParser.DamearryContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\\\");
        mathToLatex = sb.toString();
    }
    @Override
    public void enterDamearry(matrizParser.DamearryContext ctx) {
        String fila =(ctx.getText());
        fila=fila.replace("{", "").replace(",", "&").replace("}", "");
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(fila);
        mathToLatex = sb.toString();
    }
}
























