package com.company;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MyVisitor extends matrizParserBaseVisitor<Array2DRowRealMatrix>{

    Map<String,RealMatrix> tabla = new HashMap<String, RealMatrix>();
    int columnas ;

    @Override
    public Array2DRowRealMatrix visitSentencias(matrizParser.SentenciasContext ctx) {

        return super.visitSentencias(ctx);
    }

    @Override
    public Array2DRowRealMatrix visitAsignacion(matrizParser.AsignacionContext ctx) {
        tabla.put(ctx.ID().toString(),visit(ctx.e()));
        return null;
    }

    @Override
    public Array2DRowRealMatrix visitImprime(matrizParser.ImprimeContext ctx) {
        System.out.println(ctx.getText());
        System.out.println(visit(ctx.e()));
        return null;
    }


    @Override
    public Array2DRowRealMatrix visitVariable(matrizParser.VariableContext ctx) {
        return  (Array2DRowRealMatrix) tabla.get(ctx.ID().getText());
    }

    @Override
    public Array2DRowRealMatrix visitParen(matrizParser.ParenContext ctx) {
        return visit(ctx.e());
    }

    @Override
    public Array2DRowRealMatrix visitMult(matrizParser.MultContext ctx) {
        return visit(ctx.e(0)).multiply(visit(ctx.e(1)));
    }

    @Override
    public Array2DRowRealMatrix visitMenos(matrizParser.MenosContext ctx) {
        return visit(ctx.e(0)).subtract(visit(ctx.e(1)));
    }

    @Override
    public Array2DRowRealMatrix visitPlus(matrizParser.PlusContext ctx) {
        System.out.println(visit(ctx.e(0))+"+"+visit(ctx.e(1)));
        return visit(ctx.e(0)).add(visit(ctx.e(1)));
    }

    @Override
    public Array2DRowRealMatrix visitR1(matrizParser.R1Context ctx) {
        return visit(ctx.arrayInitializer());
    }

    @Override
    public Array2DRowRealMatrix visitR2(matrizParser.R2Context ctx) {
        return visit(ctx.variableInitializerList());
    }

    @Override
    public Array2DRowRealMatrix visitR3(matrizParser.R3Context ctx) {

        List<matrizParser.VariableInitializerContext> lista = ctx.variableInitializer();
       columnas = visit(ctx.variableInitializer(0)).getColumnDimension();
        Array2DRowRealMatrix matriz = new Array2DRowRealMatrix(lista.size(),columnas);
        int i=0;
        for (matrizParser.VariableInitializerContext actual : lista) {
            matriz.setRow(i, visit(actual).getRow(0));
            i++;
        }
        return matriz;
    }

    @Override
    public Array2DRowRealMatrix visitDamearry(matrizParser.DamearryContext ctx) {
        String st =(ctx.getText());
        st=st.replace("{", "").replace("}", "");
        String[] temporal = st.split(",");
        columnas = temporal.length;
        double[][] m = new double[1][columnas];
        for(int i = 0 ; i < temporal.length; i++) {
            m[0][i] = Double.parseDouble(temporal[i]);
        }
        Array2DRowRealMatrix fila = new Array2DRowRealMatrix(m);
        return fila;
    }
}
