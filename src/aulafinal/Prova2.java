package aulafinal;

import java.util.Arrays;

// Na ordenação por trocas (bolha - Bubble Sort), sabe-se que, dependendo da ordem dos elementos no vetor, o resultado já pode ser obtido alguns passos antes do final das iterações. Reescreva a função apresentada abaixo, alterando o algoritmo de ordenação por trocas, para identificar esta situação e encerrar o processo quando os elementos já estiverem em ordem.

public class Prova2 {
    public static void main(String[] args) {
        int[] vOrdenado = { 1, 2, 3, 4, 5 };
        bubbleSort(vOrdenado);
        System.out.println(Arrays.toString(vOrdenado));
    }

    public static void bubbleSort(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            boolean trocou = false;

            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // faz a troca
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }
        }
    }

}
