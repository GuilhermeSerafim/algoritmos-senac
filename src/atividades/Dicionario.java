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
                String[] palavrasDaLinha = leitor.nextLine().toLowerCase().split("\\s+");
                for (int i = 0; i < palavrasDaLinha.length; i++) {
                    if (!palavrasDaLinha[i].isEmpty()) {
                        int posicaoASerInserida = buscaBinariaInsercao(dicionario, contador, palavrasDaLinha[i]);
                        if (posicaoASerInserida != -1) { 
                            dicionario[posicaoASerInserida] = palavrasDaLinha[i];
                            contador++; 
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

    // REFATORAR ESSA FUNÇÃO, APENAS USE A BUSCA BINARIA NORMAL E USE O RESULTADO DA MESMA, DEPOIS UMA LINEAR PARA IDENTIFICAR A POSIÇÃO PARA SER INSERIDA
    /**
     * Retorna a posição de inserção de uma palavra em um vetor ordenado.
     * Mantém a ordem lexicográfica: tudo antes de 'inicio' é menor, e tudo após,
     * maior.
     * Se a palavra já existir, retorna -1. 
     *
     * @param vetor   Vetor ordenado de strings.
     * @param tamanho Quantidade de elementos válidos no vetor.
     * @param palavra Palavra a ser inserida.
     * @return Índice de inserção ou -1 se já existir.
     */
    public static int buscaBinariaInsercao(String[] vetor, int tamanho, String palavra) {
        int inicio = 0;
        int fim = tamanho - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = vetor[meio].compareTo(palavra);
            if (comparacao == 0) {
                return -1; // Palavra já existe no dicionário.
            } else if (comparacao < 0) {
                inicio = meio + 1; // Inicio vai para direita
            } else {
                fim = meio - 1; // Fim vai para esquerda
            }
        }
        // 'inicio' é a posição correta de inserção se a palavra não existir.
        return inicio;
    }

}
