package aula4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Considere um vetor com números pares e ímpares, reescreva o método
    bolha para colocar todos os números pares nas posições à direita no mesmo vetor e os
    ímpares ao final no mesmo vetor. Você não pode usar outro vetor como área auxiliar.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];

        populaArr(arr, 20);

        moverParesParaDireita(arr);
        System.out.println("Números ordenados por impares a esquerda e pares a direita");
        System.out.println(Arrays.toString(arr));
        in.close();
    }

    public static void populaArr(int[] vetor, int limite) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(limite + 1);
        }
    }


    public static void moverParesParaDireita(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (ehPar(vetor[j]) && !ehPar(vetor[j + 1])) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

}
