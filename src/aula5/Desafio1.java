package aula5;

import java.util.Arrays;

public class Desafio1 {
    public static void main(String[] args) {
        int[] vetorQuaseOrdenado = {2, 3, 4, 6, 5};
        ordenaVetorUltimaPosicaoNaoOrdenada(vetorQuaseOrdenado);
        System.out.println(Arrays.toString(vetorQuaseOrdenado));
           
    }

    // Tá certo, mas é um pouco mais lento do que a resolução do professor
    public static void ordenaVetorUltimaPosicaoNaoOrdenada(int[] v) {
        int temp = 0;
        for(int i = 0; i < v.length -1; i++) {
            if(v[v.length - 1] < v[i]) {
                temp = v[v.length - 1];
                v[v.length - 1] = v[i];
                v[i] = temp;
            }
        }
    }
}
