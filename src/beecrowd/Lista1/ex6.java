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
                // Se houver valor na última posição, de acordo com a paridade, vou imprimir e replicar
                if (vPar[4] != 0) {
                    for(int j = 0; j < vPar.length; j++) {
                        System.out.printf("par[%d] = %d%n", IContagemPar, vPar[j]);
                    }
                    vPar[4] = 0; // Resetando a última posição (para ir populando o arr no else da paridade)
                    IContagemPar = 0; // Resetando interação da paridade
                    vPar[IContagemPar] = vTodos[i];
                    IContagemPar++;
                } else {
                    vPar[IContagemPar] = vTodos[i];
                    IContagemPar++;
                }
            } else {
                if (vImpar[4] != 0) {
                    for (int j = 0; i < vImpar.length; i++) {
                        System.out.printf("impar[%d] = %d%n", IContagemImpar, vImpar[j]);
                    }
                    vImpar[4] = 0;
                    IContagemImpar = 0;
                    vImpar[IContagemImpar] = vTodos[i];
                    IContagemImpar++;
                } else {
                    vImpar[IContagemImpar] = vTodos[i];
                    IContagemImpar++;
                }
            }
        }

        in.close();

    }
}
