package matrizes;

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
        System.out.println("▬▬▬▬ MATRIZ C: ▬▬▬▬");
        int[][] matrizC = somaMatriz(matrizA, matrizB);
        imprimeMatriz(matrizC);
    }
    public static int[][] gerarMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for(int linha = 0; linha < matriz.length; linha++ ) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = r.nextInt(-10, 10); // -10 inclusivo,10 exclusivo
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
    public static void imprimeMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%5d", elemento);
            }
            System.out.println();
        }
    }
}