package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        char[][] matriz = {
                {'a', 'b', 'c'},
                {'b', 'd', 'e'},
                {'c', 'e', 'f'}
        };
        System.out.println("▬▬▬▬ MATRIZ: ▬▬▬▬");
        imprimeMatriz(matriz);
        System.out.println("▬▬▬▬ A MATRIZ É SIMETRICA? ▬▬▬▬");
        System.out.println(ehSimetrica(matriz));
    }
    public static boolean ehSimetrica(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%3d", elemento);
            }
            System.out.println();
        }
    }

    public static void imprimeMatriz(char[][] matriz) {
        for (char[] linha : matriz) {
            for (char elemento : linha) {
                System.out.printf("%3s", elemento);
            }
            System.out.println();
        }
    }
}
