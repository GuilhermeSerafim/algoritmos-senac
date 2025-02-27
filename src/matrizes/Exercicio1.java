package matrizes;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(3, 4);
        imprimeMatriz(matriz);
    }

    public static int[][] gerarMatriz(int linhas, int colunas) {
        Random r = new Random();
        int[][] matriz = new int[linhas][colunas];
        for(int linha = 0; linha < matriz.length; linha++ ) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = r.nextInt(101); // 101 exclusivo, 0 inclusivo
            }
        }
        return matriz;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("%3d ", matriz[linha][coluna]);
            }
            System.out.println();
        }
    }
}
