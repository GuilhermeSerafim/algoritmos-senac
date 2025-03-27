package aula1;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];

        // Preenche o array com números aleatórios de 0 a 100
        populaArrNrsRandons(arr, 100);

        // Ordena o array usando o algoritmo Bubble Sort
        bubbleSortCrescente(arr);

        // Solicita ao usuário um número para buscar no array
        System.out.println("Digite um número a ser buscado: ");
        int nrProcurado = in.nextInt();

        // Realiza busca binária no array ordenado
        int indiceBuscado = buscaBinaria(arr, nrProcurado);

        // Exibe o resultado da busca
        if (indiceBuscado == -1)
            System.out.println("Número não encontrado");
        else
            System.out.println("Número encontrado no índice: " + indiceBuscado);
    }

    // Preenche o vetor com números aleatórios de 0 até o limite informado
    public static void populaArrNrsRandons(int[] vetor, int limite) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(limite + 1);
        }
    }

    // Ordena o vetor usando o algoritmo Bubble Sort
    public static void bubbleSortCrescente(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            // A cada iteração externa, o maior valor é posicionado no final,
            // então podemos ignorar as últimas posições já ordenadas
            for (int j = 0; j < vetor.length - i - 1; j++) {
                // Troca os elementos se estiverem fora de ordem
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    // Realiza busca linear (sequencial) no vetor
    public static int buscaLinear(int vetor[], int numeroASerProcurado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroASerProcurado) {
                return i;
            }
        }
        return -1;
    }

    // Realiza busca binária no vetor (é necessário que ele esteja ordenado)
    public static int buscaBinaria(int vetor[], int numeroASerProcurado) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (vetor[meio] == numeroASerProcurado) {
                return meio;
            } else if (vetor[meio] < numeroASerProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
