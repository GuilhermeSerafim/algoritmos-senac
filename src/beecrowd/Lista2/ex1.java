package beecrowd.Lista2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media = 0, soma = 0;
        int n = in.nextInt();
        in.nextLine();
        char operacaoASerRealizada = in.nextLine().toUpperCase().charAt(0);
        double[][] matriz = new double[12][12];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = in.nextDouble();                
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == n) {
                    if(operacaoASerRealizada == 'S') {
                        soma += matriz[i][j];
                    } else {
                        media += matriz[i][j];
                    }
                } 
            }
        }
        media = media / 12;
        if(operacaoASerRealizada == 'S') {
            System.out.printf("%.1f", soma);
        } else {
            System.out.printf("%.1f", media);
        }

        in.close();
    }
}
