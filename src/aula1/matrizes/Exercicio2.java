package aula1.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        System.out.println("Digite a quantidade de linhas");
        linhas = in.nextInt();
        System.out.println("Digite a quantidade de colunas");
        colunas = in.nextInt();
        int[][] matriz = gerarMatriz(linhas, colunas);
        System.out.println("▬▬▬▬ MATRIZ ORIGINAL: ▬▬▬▬");
        imprimeMatriz(matriz);

        System.out.println("▬▬▬▬ MATRIZ TRANSPOSTA: ▬▬▬▬");
        int[][] matrizTransposta = gerarMatrizTransposta(matriz);
        imprimeMatriz(matrizTransposta);
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

    // Assumimos que ele passou uma matriz "matematicamente correta dimensionalmente"
    public static int[][] gerarMatrizTransposta (int[][] matriz) {
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length]; // Qtd de linha vira coluna, e qtdColuna vira linha
        for(int linha = 0; linha < matriz.length; linha++) {
            for(int coluna =0; coluna < matriz[linha].length; coluna++){
                matrizTransposta[coluna][linha] = matriz[linha][coluna];
            }
        }
        return matrizTransposta;
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
