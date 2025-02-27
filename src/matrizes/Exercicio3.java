package matrizes;

import java.util.Random;
import java.util.Scanner;

// Criar uma função que receba uma matriz nxm de números inteiros e
// devolva o maior valor presente nesta matriz.
public class Exercicio3 {
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
        System.out.println("▬▬▬▬ MAIOR VALOR DA MATRIZ ORIGINAL: ▬▬▬▬");
        System.out.println(maiorValorMatriz(matriz));
    }

    public static int maiorValorMatriz(int matriz[][]) {
            int maiorValor = matriz[0][0];
            // Ou -> int maiorValor = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }
        return maiorValor;
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
