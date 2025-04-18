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
                    // Verificando se não é uma String vazia -> " " e se foi não foi achado a palavra no DICIONÁRIO
                    if (!palavrasDaLinha[i].isEmpty() && buscaBinaria(dicionario, palavrasDaLinha[i], posicoesPreenchidasDicionario) == -1) {
                        // Busca linear para encontrar a menor posição e inserir ordenado
                        

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
