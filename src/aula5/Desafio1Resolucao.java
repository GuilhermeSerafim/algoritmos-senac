package aula5;

import java.util.Arrays;

public class Desafio1Resolucao {
    public static void main(String[] args) {
        int[] v = {3, 9, 11, 15, 17, 19, 2};
        ordenaUltimo(v);
        System.out.println(Arrays.toString(v));
    }

    public static void ordenaUltimo(int[] v) {
        int x = v[v.length - 1];
        int j = v.length - 1;

        /**
         * Insere o último elemento do vetor na posição correta,
         * assumindo que os elementos anteriores já estão ordenados.
         *
         * A condição 'j > 0' evita o acesso a um índice negativo (v[j - 1]),
         * prevenindo uma exceção de índice fora dos limites.
         *
         * Observação: O operador && realiza avaliação de curto-circuito (short circuit).
         * Isso significa que, se a condição 'j > 0' for falsa, a segunda condição (x < v[j - 1])
         * não será avaliada, evitando assim um possível acesso indevido ao vetor.
         */
        while (j > 0 && x < v[j - 1]) {
            v[j] = v[j - 1];
            j--;
        }

        v[j] = x;
    }
}
