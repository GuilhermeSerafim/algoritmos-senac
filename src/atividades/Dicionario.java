/*
    Entrega a Atividade 2 - Algoritmos e Programação II

    Eu,  
    Guilherme da Silva Serafim,  
    declaro que  

    todas as respostas são fruto do meu trabalho,  
    não copio respostas de colegas externos à equipe,  
    não disponibilizo minhas respostas para colegas externos ao grupo e  
    não realizo quaisquer outras atividades desonestas para me beneficiar ou prejudicar outros.
*/

package atividades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        // Cores ANSI
        final String RED = "\u001B[31m";
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";
        String[] dicionario = new String[1000];
        int contador = 0;
        File file = new File("src/atividades/txt");
        try (Scanner leitor = new Scanner(file)) { // Usando try-with-resources para fechar o Scanner automaticamente
            while (leitor.hasNextLine()) {
                String[] palavrasDaLinha = leitor.nextLine().toLowerCase().split(" ");
                for (int i = 0; i < palavrasDaLinha.length; i++) {
                    if (!palavrasDaLinha[i].isEmpty() && buscaBinaria(dicionario, palavrasDaLinha[i]) == -1) {
                        // Busca linear
                        for (int j = 0; j < dicionario.length; j++) {
                            if(dicionario[j].compareTo(dicionario[j + 1]) > 0) {
                                String temp = dicionario[j];
                                dicionario[j] = dicionario[j + 1];
                                dicionario[j + 1] = temp;
                            }
                        }

                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());

        }

        // Exibição
        System.out.print(RED + "NÃO ORDENADO: " + RESET);
        for (int i = 0; i < contador; i++) {
            if (i == contador - 1) {
                System.out.printf("[%s].", dicionario[i]); // último elemento sem vírgula
            } else {
                System.out.printf("[%s], ", dicionario[i]);
            }
        }
        System.out.println();

    }

    public static int buscaBinaria(String[] vetor, String chave) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = vetor[meio].compareTo(chave);

            if (comparacao == 0) {
                return meio; // Encontrou
            } else if (comparacao < 0) {
                inicio = meio + 1; // Vai pra direita
            } else {
                fim = meio - 1; // Vai pra esquerda
            }
        }

        return -1; // Não encontrou
    }

}
