package aula8;

import java.util.Arrays;

// Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a
// sua função calcula e retorna o resultado da INTERCALAÇÃO, ou seja, o vetor
// C[].
public class Exercicio1 {
    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 7 };
        int[] B = { 2, 4, 5 };
        int[] C = merge(A, B);
        System.out.println(Arrays.toString(C));
    }

    public static int[] merge(int A[], int B[]) {
        int n = A.length, m = B.length;
        int lengthC = n + m;
        int C[] = new int[lengthC];
        // Para ir populando indices, logo, incrementando tbm...
        int i = 0, j = 0, k = 0;

        // Enquanto ambos tiverem elementos
        while (i < n && j < m) {
            if (A[i] <= B[j])
                C[k++] = A[i++];
            else
                C[k++] = B[j++];
        }

        // Se sobrar em A
        while (i < n) {
            C[k++] = A[i++];
        }
        // Se sobrar em B
        while (j < m) {
            C[k++] = B[j++];
        }

        return C;
    }
}
