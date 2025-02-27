package matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhaColuna;
        System.out.println("Digite a quantidade de linhas e colunas da matriz quadrada");
        linhaColuna = in.nextInt();
        int[][] matriz = gerarMatriz(linhaColuna, linhaColuna);
        System.out.println("▬▬▬▬ MATRIZ ORIGINAL: ▬▬▬▬");
        imprimeMatriz(matriz);
        System.out.println("▬▬▬▬ TRAÇO DA MATRIZ: ▬▬▬▬");
        System.out.println(retornaTracoMatrizQuadrada(matriz));
    }
    public static int retornaTracoMatrizQuadrada(int matrizQuadrada[][] ) {
        int traco = 0;
//        for (int i = 0; i < matrizQuadrada.length; i++) {
//            for(int j = 0; j < matrizQuadrada[i].length; j++) {
//                if(i == j) {
//                    traco += matrizQuadrada[i][j];
//                }
//            }
//        }
        // De uma forma mais simples e objetiva (percorre mais rápido)
        for(int i = 0; i < matrizQuadrada.length; i++) {
            traco += matrizQuadrada[i][i];
        }
        return traco;
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

    public static void imprimeMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%3d", elemento);
            }
            System.out.println();
        }
    }
}
