package beecrowd.Lista2;

import java.io.IOException;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        char operacaoASerRealizada = in.nextLine().toUpperCase().charAt(0);
        double soma = 0, media = 0;
        double[][] matriz = new double[12][12];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = in.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == n) {
                    soma += matriz[i][j];
                }
                System.out.printf("%d ", (int) matriz[i][j]);
            }
            System.out.println();
        }

        media = soma / matriz.length;

        if (operacaoASerRealizada == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", media);
        }
        in.close();
    }

}