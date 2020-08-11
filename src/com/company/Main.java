package com.company;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {

    public static void main(String[] args) {

        double[][] C = {{1, -1, 1}, {-1, 5, -5}, {1, -5, 6}};


        RealMatrix matrizC = new Array2DRowRealMatrix(C);



        // Descomposición o factorización de Cholesky:
        CholeskyDecomposition cd = new CholeskyDecomposition(matrizC);

        RealMatrix L = cd.getL();
        RealMatrix LT = cd.getLT();

        RealMatrix LLT = L.multiply(LT);
        System.out.println(L);
        System.out.println(LT);
        System.out.println(LLT);
    }
}
