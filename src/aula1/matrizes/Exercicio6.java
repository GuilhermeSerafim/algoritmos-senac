package aula1.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz A e B: ");
        int n = in.nextInt();
        System.out.println("Digite a quantidade de coluna da matriz A e B: ");
        int m = in.nextInt();

        int[][] matrizA = gerarMatriz(n, m);
        System.out.println("▬▬▬▬ MATRIZ A: ▬▬▬▬");
        imprimeMatriz(matrizA);
        System.out.println("▬▬▬▬ MATRIZ B: ▬▬▬▬");
        int[][] matrizB = gerarMatriz(n, m);
        imprimeMatriz(matrizB);
        System.out.println("▬▬▬▬ MATRIZ C (A + B): ▬▬▬▬");
        int[][] matrizC = somaMatriz(matrizA, matrizB);
        imprimeMatriz(matrizC);
        System.out.println("▬▬▬▬ MATRIZ D (A - B): ▬▬▬▬");
        int[][] matrizD = subtraiMatriz(matrizA, matrizB);
        imprimeMatriz(matrizD);
        System.out.println("▬▬▬▬ MATRIZ E (A * B): ▬▬▬▬");
        int[][] matrizE = multiplicaMatriz(matrizA, matrizB);
        imprimeMatriz(matrizE);
        System.out.println("▬▬▬▬ MATRIZ F (A / B): ▬▬▬▬");
        double[][] matrizF = divideMatriz(matrizA, matrizB);
        imprimeMatriz(matrizF);
        in.close();
    }
    public static int[][] gerarMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for(int linha = 0; linha < matriz.length; linha++ ) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = r.nextInt(10); // -10 inclusivo,10 exclusivo
            }
        }
        return matriz;
    }

    public static int[][] somaMatriz(int[][] A, int[][] B) {
        int[][] c = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                c[i][j] = A[i][j] + B[i][j];
            }
        }
        return c;
    }

    public static int[][] subtraiMatriz(int[][] A, int[][] B) {
        int[][] c = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                c[i][j] = A[i][j] - B[i][j];
            }
        }
        return c;
    }

    public static int[][] multiplicaMatriz(int[][] A, int[][] B) {
        int[][] c = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return c;
    }

    public static double[][] divideMatriz(int[][] A, int[][] B) {
        double[][] c = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (B[i][j] != 0) {
                    c[i][j] = (double) A[i][j] / B[i][j];
                } else {
                    c[i][j] = Double.POSITIVE_INFINITY; // Tratamento de divisão por zero
                }
            }
        }
        return c;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%5d", elemento);
            }
            System.out.println();
        }
    }
    public static void imprimeMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double elemento : linha) {
                System.out.printf("%10.2f", elemento);
            }
            System.out.println();
        }
    }
}