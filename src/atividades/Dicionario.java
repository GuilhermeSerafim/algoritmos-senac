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
        int contador = 0;
        File file = new File("src/atividades/txt");
        try (Scanner leitor = new Scanner(file)) { // Usando try-with-resources para fechar o Scanner automaticamente
            while (leitor.hasNextLine()) {
                String[] palavrasDaLinha = leitor.nextLine().toLowerCase().split("\\s+");
                for (int i = 0; i < palavrasDaLinha.length; i++) {
                    if (!palavrasDaLinha[i].isEmpty()) {
                        dicionario[contador] = palavrasDaLinha[i];
                        contador++;
                    }
                }
            }

            System.out.println("Não ordenado: ");
            for (int i = 0; i < contador; i++) {
                System.out.printf("[%s], ", dicionario[i]);
            }
            System.out.println();

            System.out.println("Ordenado: ");
            bubbleSort(dicionario, contador);
            for (int i = 0; i < contador; i++) {
                System.out.printf("[%s], ", dicionario[i]);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());

        }

    }

    public static void bubbleSort(String arr[], int lenght) {
        // Bubble sort lexicógrafo
        for (int i = 0; i < lenght - 1; i++) {
            for (int j = 0; j < lenght - i - 1; j++) {
                // Irá trocar somente se a posição anterior for maior que a posterior
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
