package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
        }
        
        int menorValor = X[0];
        int posicaoMenor = 0;
        for (int i = 1; i < N; i++) {
            if (X[i] < menorValor) {
                menorValor = X[i];
                posicaoMenor = i;
            }
        }
        
        // Imprime na formatação exata que o beecrowd pede
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenor);
        
        in.close();
    }
}