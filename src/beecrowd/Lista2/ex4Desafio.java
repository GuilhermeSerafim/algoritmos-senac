package beecrowd.Lista2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ex4Desafio {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        double[][] matriz = new double[5][5];
        double soma = 0, media = 0;
        int qtdElementos = 0;
        // Cores ANSI
        final String RED = "\u001B[31m";
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";

        // Preenche a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = r.nextInt(3);
            }
        }

        // Exibe com cor
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha == coluna) {
                    // Diagonal principal (vermelho)
                    System.out.printf("%s%5.0f%s", RED, matriz[linha][coluna], RESET);
                } else if (linha + coluna == matriz.length - 1) {
                    // Diagonal secundária (azul)
                    System.out.printf("%s%5.0f%s", BLUE, matriz[linha][coluna], RESET);
                } else {
                    // Normal
                    System.out.printf("%5.0f", matriz[linha][coluna]);
                }

                if(coluna > linha && linha + coluna > matriz.length - 1) {
                    soma += matriz[linha][coluna];
                    qtdElementos++;
                }
            }
            System.out.println();
        }
        media = soma / qtdElementos;
        System.out.println("Soma dos elementos entre as diagonais: " + soma);
        System.out.println("Media: " + media);

        in.close();
    }
}
