package aula7.exercicios;

import java.util.Arrays;

import aula7.Produto;

public class Exercicio1 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[1] = new Produto(1, "Mouse", 50.25);
        produtos[2] = new Produto(2, "Teclado", 150.25);
        produtos[0] = new Produto(3, "WebCam", 200.25);

        System.out.println("Array não ordenado");
        imprime(produtos);
        System.out.println(
                "Ordenando com Quick Sort 3 - Array.sort() -  E a interface comparable: Implementamos no compareTo no código");
        Arrays.sort(produtos); // Irá pegar como referência a implementação do Comparable -> Compareto
        imprime(produtos);
    }

    public static void imprime(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.printf("%2d|%8s|%6.2f\n", produto.getCodigo(), produto.getDesc(), produto.getPreco());
        }
    }
}
