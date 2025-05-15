package aula7.exercicios;

import aula7.Produto;

public class Exercicio2 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3]; // Estão com um arr de 3 pposições nulas
        produtos[1] = new Produto(1, "Mouse", 50.25);
        produtos[2] = new Produto(2, "Teclado", 150.25);
        produtos[0] = new Produto(3, "WebCam", 200.25);
        System.out.println("Arr não ordenado");
        imprime(produtos);
        bubbleSort(produtos);
        System.out.println("Agora, com bubble sort: ");
        imprime(produtos);
    }

    // Bubble sort usando a implementação do Comparable, que modulamos na classe
    // Produtos
    public static void bubbleSort(Produto[] arr) {
        Produto pTemp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    pTemp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = pTemp;
                }
            }
        }
    }

    public static void imprime(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.printf("%2d|%8s|%6.2f\n", produto.getCodigo(), produto.getDesc(), produto.getPreco());
        }
    }
}
