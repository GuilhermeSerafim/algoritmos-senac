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
        int IContagemImpar = 0, IContagemPar = 0;

        // Inputando valores
        for (int i = 0; i < vTodos.length; i++) {
            vTodos[i] = in.nextInt();
        }

        // Distribuindo valores entre ímpares e pares
        for (int i = 0; i < vTodos.length; i++) {
            if (vTodos[i] % 2 == 0) {
                vPar[IContagemPar] = vTodos[i];
                IContagemPar++;

                if (IContagemPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("par[%d] = %d%n", j, vPar[j]);
                    }
                    IContagemPar = 0;
                }
            } else {
                vImpar[IContagemImpar] = vTodos[i];
                IContagemImpar++;

                if (IContagemImpar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("impar[%d] = %d%n", j, vImpar[j]);
                    }
                    IContagemImpar = 0;
                }
            }
        }

        // Primeiro imprime os ímpares restantes
        for (int i = 0; i < IContagemImpar; i++) {
            System.out.printf("impar[%d] = %d%n", i, vImpar[i]);
        }

        // Depois os pares restantes
        for (int i = 0; i < IContagemPar; i++) {
            System.out.printf("par[%d] = %d%n", i, vPar[i]);
        }
        
        in.close();

    }
}
