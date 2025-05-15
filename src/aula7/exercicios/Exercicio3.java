package aula7.exercicios;

import java.util.Arrays;

import aula7.Produto;

public class Exercicio3 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[1] = new Produto(1, "Mouse", 50.25);
        produtos[2] = new Produto(2, "Teclado", 150.25);
        produtos[0] = new Produto(3, "Cam", 200.25);

        System.out.println("Arr não ordenado");
        imprime(produtos);
        System.out.println();
        
        System.out.println("Ordenação default (Implementação da IComparable) - Código");
        Arrays.sort(produtos);
        imprime(produtos);
        System.out.println();

        System.out.println("Ordenação por descrição usando Comparator com função anônima: ");
        Arrays.sort(produtos, Produto.COMPARADOR_DESCRICAO);
        imprime(produtos);
        System.out.println();
        
        System.out.println("Ordenado pelo preço usando Comparator com função anônima: ");
        Arrays.sort(produtos, Produto.COMPARADOR_PRECO);
        imprime(produtos);
        System.out.println();

    }

    public static void imprime(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.printf("%2d|%8s|%6.2f\n", produto.getCodigo(), produto.getDesc(), produto.getPreco());
        }
    }
}
