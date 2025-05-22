package aulafinal;

// Dado um vetor de números inteiros positivos, criar uma função recursiva para calcular o produto dos elementos do vetor.
public class Prova3 {
    public static void main(String[] args) {
        int[] v = { 2, 4, 2 }; // 2 x 4 x 6 = 48
        System.out.println(calculaProduto(v, 0));
    }

    public static double calculaProduto(int[] v, int i) {
        if (v.length == i) {
            return 1;
        }
        return v[i] * calculaProduto(v, i + 1);
    }
}
