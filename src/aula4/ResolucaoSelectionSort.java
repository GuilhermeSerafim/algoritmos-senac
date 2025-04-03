package aula4;

import java.util.Arrays;

public class ResolucaoSelectionSort {
    public static void main(String[] args) {
        int[] vetor = {10, 12, 5, 2, 20};
        selectionSort(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    public static void selectionSort(int[] v) {
        int min;
        int aux;
        for (int i = 0; i < v.length - 1; i++) {
            min = i;
            for (int j = min + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            // Se o menor valor for o indice inicial, não preciso trocar...
            if(i != min) {
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }

        }
    }
}
