package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

/*
    Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou ímpares.
    Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez que um dos dois vetores encher,
    você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos.
    Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar.
    Cada vetor pode ser preenchido tantas vezes quantas for necessário.

    Entrada
    A entrada contém 15 números inteiros.

    Saída
    Imprima a saída conforme o exemplo abaixo.
*/
public class ex6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] vPar = new int[5];
        int[] vImpar = new int[5];
        int[] vTodos = new int[15];

        // Inputando valores
        for (int i = 0; i < vTodos.length; i++) {
            vTodos[i] = in.nextInt();
        }

        // Distribuindo valores entre ímpares e pares
        for (int i = 0; i < vTodos.length; i++) {
            // if(vImpar[5])
        }


    }
}
