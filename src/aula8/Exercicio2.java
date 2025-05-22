package aula8;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] v = { 3, 2, 5, 8, 9, 1, 5, 7, 4, 6 };
        mergeSort(v, 0, v.length);
        System.out.println(Arrays.toString(v));
    }

    private static void mergeSort(int[] v, int ini, int fim) {
        // Caso base
        if (ini < fim - 1) {
            int mei = (ini + fim) / 2;
            // Chamada recursiva até o caso base
            mergeSort(v, ini, mei);
            mergeSort(v, mei, fim);
            intercala(v, ini, mei, fim);
        }
    }

    private static void intercala(int[] v, int ini, int mei, int fim) {
        int[] aux = new int[fim - ini];
        int i = ini; // 0 Left
        int j = mei; // 0 Right
        int k = 0; // 0 Aux

        // Intercala enquanto houver elementos em ambas as metades
        while (i < mei && j < fim) {
            if (v[i] <= v[j]) {
                aux[k] = v[i];
                i++;
            } else {
                aux[k] = v[j];
                j++;
            }
            k++;
        }

        // Se caso sobrar elementos em algumas das extremidades:
        // Copia quaisquer elementos restantes da metade esquerda
        while (i < mei) {
            aux[k] = v[i];
            k++;
            i++;
        }
        // Copia quaisquer elementos restantes da metade direita
        while (j < fim) {
            aux[k] = v[j];
            k++;
            j++;
        }

        // Atualiza o vetor original com os valores ordenados
        for (int x = ini, y = 0; x < fim; x++, y++) {
            v[x] = aux[y];
        }
    }
}
