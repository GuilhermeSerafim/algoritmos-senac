package beecrowd.Lista2;

import java.io.IOException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char operacaoASerRealizada = in.nextLine().toUpperCase().charAt(0);
        double[][] matriz = new double[5][5];
        double soma = 0, media = 0;
        int qtdElementos = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = in.nextDouble();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (coluna > linha && linha + coluna > matriz.length - 1) {
                    soma += matriz[linha][coluna];
                    qtdElementos++;
                }
            }
        }
        media = soma / qtdElementos;
        if (operacaoASerRealizada == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", media);
        }

        in.close();
    }
}
