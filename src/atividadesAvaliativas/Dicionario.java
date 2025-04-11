package atividadesAvaliativas;

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
                        if (buscaBinaria(dicionario, palavrasDaLinha[i])!= -1) {
                            // Busca linear para identificar onde colocar a nova palavra no dicionário
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
