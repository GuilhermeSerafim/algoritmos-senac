package aulafinal;

import java.util.Arrays;

// QUESTÃO 1 - não entendi muito bem o enunciado

// QUESTÃO 4 - o que é produto?

// Criar uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua função efetua a UNIÃO entre os vetores, ou seja, os elementos do vetor A mais aos elementos do vetor B, desde que os elementos de B não estejam presentes no vetor A, ao final sua função retorna uma String com a resposta. Os vetores dados não possuem valores duplicados e não estão ordenados.

// Primeiro case - OK - A[] = {3, 9, 11} e B[] = {2, 6, 1} então A union B = {3, 9, 11, 2, 6, 1}

// Segundo case - OK - A[] = {7, 2, 5, 8, 4} e B[] = {4, 2, 9, 5} então A union B = {7, 2, 5, 8, 4, 9}

public class Prova1 {
    public static void main(String[] args) {
        int[] A = { 7, 2, 5, 8, 4 };
        int[] B = { 4, 2, 9, 5 };
        System.out.println(juntaVetores(A, B));
    }

    public static String juntaVetores(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int lengthTotal = n + m;
        int vTemp[] = new int[lengthTotal];
        int countNumValidos = 0;
        int contadorParaA = 0;

        for (int i = 0; i < A.length; i++) {
            vTemp[i] = A[i];
            contadorParaA++;
            countNumValidos++;
        }

        for (int j = 0; j < B.length; j++) {
            if (buscaLinear(vTemp, vTemp[j + contadorParaA]) == -1) {
                vTemp[j + contadorParaA] = B[j];
                countNumValidos++;
            }
        }
        
        int C[] = new int[countNumValidos];
        
        // Popular C
        for (int i = 0; i < countNumValidos; i++) {
            C[i] = vTemp[i];
        }
        return Arrays.toString(C);
    }

    public static int buscaLinear(int vetor[], int numeroASerProcurado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroASerProcurado) {
                return i;
            }
        }
        return -1;
    }
}
