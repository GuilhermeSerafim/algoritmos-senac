package aula3.sistemaDeBuscas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int numeroBuscado = -1;
        String visualizarVetor = "";
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 1001); // 1 à 1000
        }
        Arrays.sort(arr);
        System.out.println("Vetor de 100 valores inteiros ordenados gerados!");
        System.out.print("Digite 'sim' para visualizar o vetor: ");
        visualizarVetor = in.nextLine();
        if(visualizarVetor.equalsIgnoreCase("sim")) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        };
        System.out.print("Digite um número a ser encontrado: ");
        numeroBuscado = in.nextInt();
        int posicaoEncontrada = buscaBinaria(arr, numeroBuscado);
        if(posicaoEncontrada == -1) System.out.println("Valor não encontrado");
        else System.out.printf("Número %d encontrado na posição %d.%n", numeroBuscado, posicaoEncontrada);
    }


    /**
     * Realiza uma busca binária em um vetor ordenado.
     *
     * @param vetorOrdenado vetor de inteiros ordenado
     * @param valorProcurado o valor que se deseja encontrar
     * @return o índice do valor procurado ou -1 se não encontrado
     */
    public static int buscaBinaria(int vetorOrdenado[], int valorProcurado) {
        // Define os limites do vetor: início e fim
        int indiceInicio = 0;
        int indiceFim = vetorOrdenado.length - 1; // último índice do vetor

        int indiceMeio; // variável para armazenar o índice central

        // Loop enquanto ainda houver uma faixa para busca
        while (indiceInicio <= indiceFim) {
            // Calcula o índice do meio evitando overflow
            indiceMeio = indiceInicio + (indiceFim - indiceInicio) / 2;

            // Se o elemento central é igual ao valor procurado, retorna seu índice
            if (vetorOrdenado[indiceMeio] == valorProcurado) {
                return indiceMeio;
            }
            // Se o elemento central é menor que o valor procurado,
            // o valor procurado deve estar na metade superior do vetor
            else if (vetorOrdenado[indiceMeio] < valorProcurado) {
                indiceInicio = indiceMeio + 1;
            }
            // Caso contrário, o valor procurado deve estar na metade inferior
            else {
                indiceFim = indiceMeio - 1;
            }
        }
        // Se o valor não for encontrado, retorna -1
        return -1;
    }

}
