package atividades;

/*
    Entrega a Atividade 2 - Algoritmos e Programação II

    Eu,  
    Guilherme da Silva Serafim, 
    Kayky de Lemos Costa 
    declaro que  

    todas as respostas são fruto do meu trabalho,  
    não copio respostas de colegas externos à equipe,  
    não disponibilizo minhas respostas para colegas externos ao grupo e  
    não realizo quaisquer outras atividades desonestas para me beneficiar ou prejudicar outros.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        // vetor de palavras únicas (capacidade máxima de 1000)
        String[] dicionario = new String[1000];
        // contador de palavras válidas inseridas
        int totalPalavras = 0;
        // arquivo de entrada contendo o texto a ser processado
        File arquivo = new File("src/atividades/txt");

        // abre o arquivo e cria Scanner para leitura
        try (Scanner leitor = new Scanner(arquivo)) {
            // enquanto houver linhas a ler
            while (leitor.hasNextLine()) {
                // lê a próxima linha e normaliza para minúsculas
                String linha = leitor.nextLine().toLowerCase();
                // separa a linha em termos usando espaço como delimitador
                String[] termos = linha.split(" ");
                // processa cada termo extraído
                for (String termo : termos) {
                    // ignora termos vazios causados por múltiplos espaços
                    if (termo.isEmpty()) {
                        continue;
                    }
                    // verifica duplicata com busca binária em posições válidas
                    if (buscaBinaria(dicionario, termo, totalPalavras) == -1) {
                        // determina posição correta para manter vetor ordenado
                        int posInsercao = 0;
                        while (posInsercao < totalPalavras &&
                               dicionario[posInsercao].compareTo(termo) < 0) {
                            posInsercao++;
                        }
                        // desloca palavras à direita a partir de posInsercao
                        for (int i = totalPalavras; i > posInsercao; i--) {
                            dicionario[i] = dicionario[i - 1];
                        }
                        // insere o termo na posição correta
                        dicionario[posInsercao] = termo;
                        totalPalavras++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + arquivo.getAbsolutePath());
        }

        // imprime as palavras únicas em ordem alfabética
        for (int i = 0; i < totalPalavras; i++) {
            System.out.println(dicionario[i]);
        }
        // exibe contagem total de palavras distintas encontradas
        System.out.println("total de palavras diferentes no dicionario=" + totalPalavras);
    }

    /**
     * Busca binária em vetor ordenado de Strings.
     * @param vetor   vetor onde pesquisar
     * @param chave   termo a ser buscado
     * @param limite  número de posições válidas no vetor
     * @return índice do termo ou -1 se não encontrado
     */
    public static int buscaBinaria(String[] vetor, String chave, int limite) {
        int inicio = 0;
        int fim = limite - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int cmp = vetor[meio].compareTo(chave);
            if (cmp == 0) {
                return meio;
            } else if (cmp < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
