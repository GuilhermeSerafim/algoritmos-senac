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
        String[] dicionario = new String[1000];
        int posicoesPreenchidasDicionario = 0;

        File file = new File("src/atividades/txt");

        try (Scanner leitor = new Scanner(file)) { // Usando try-with-resources para fechar o Scanner automaticamente
            while (leitor.hasNextLine()) {
                // Lê a linha e divide separa as palavras no array
                String[] palavrasDaLinha = leitor.nextLine().toLowerCase().split(" ");
                // Percorre as palavras daquela linha
                for (int i = 0; i < palavrasDaLinha.length; i++) {
                    // Inserção com verificação
                    // -> Para garantir que não tenhamos palavras repetidas no dicionário do Samuel, para cada palavra lida no arquivo texto deve feita a busca no dicionário (usando a busca binária), caso a palavra já conste no dicionário a palavra lida deve ser descartada
                    if (!palavrasDaLinha[i].isEmpty() && buscaBinaria(dicionario, palavrasDaLinha[i], posicoesPreenchidasDicionario) == -1) {
                        // Busca linear para encontrar a menor posição e inserir ordenado
                        if(posicoesPreenchidasDicionario > 0) {
                            String menorString = dicionario[0];
                            int indiceASerInserido = 0;
                            // Caso contrário a palavra deverá ser inserida no dicionário (vetor) de forma ordenada, essa operação deve gastar no máximo N passos para cada palavra nova.
                            for (int j = 0; j < posicoesPreenchidasDicionario; j++) {
                                if(dicionario[j].compareTo(menorString) > 0) {
                                    menorString = dicionario[j];
                                    indiceASerInserido = j;
                                }
                            }
                        } else {
                            dicionario[0] = palavrasDaLinha[i];
                            posicoesPreenchidasDicionario++;
                        }

                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
        }
        
    }

    public static int buscaBinaria(String[] vetor, String chave, int length) {
        int inicio = 0;
        int fim = length - 1;

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
