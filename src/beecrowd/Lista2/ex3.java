package beecrowd.Lista2;

import java.io.IOException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char operacaoASerRealizada = in.nextLine().toUpperCase().charAt(0);
        double[][] matriz = new double[12][12];
        double soma = 0, media = 0;

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = in.nextDouble();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // Elementos que estão acima da diagonal principal da matriz
                if (coluna > linha) {
                    soma += matriz[linha][coluna];
                }
            }
        }


        media = soma / 12;

        if (operacaoASerRealizada == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", media);
        }

        in.close();
    }
}
