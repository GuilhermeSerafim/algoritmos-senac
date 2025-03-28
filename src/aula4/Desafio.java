package aula4;
// Separe os números pares e ímpares do conjunto (pares a esquerda e impares na direita em um arr).
// Em seguida, ordene os números pares em ordem crescente.
// Após isso, ordene os números ímpares também em ordem crescente.
// Por fim, junte os dois grupos, mantendo essa ordem.

// Desenhei um diagrama enquanto resolvia, veja: https://excalidraw.com/#json=FLJTm-5P0mwIPccw74tS-,nVx1n-QjJNDjdnEwNzQhHg

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pt 1
        int[] arr = new int[10];

        populaArr(arr, 20);

        moverParesParaEsquerda(arr);

        System.out.println("Números ordenados por impares a direita e pares a esquerda");
        System.out.println(Arrays.toString(arr));

        // Pt 2
        int divisor = buscarDivisor(arr);

        ordenarPorGrupoParidade(arr, divisor);

        System.out.println("Números ímpares e pares ordenados crescentemente e separadamente");
        System.out.println(Arrays.toString(arr));

        in.close();
    }

    public static void populaArr(int[] arr, int limite) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(limite + 1);
        }
    }


    public static void moverParesParaEsquerda(int[] arr) {
        int aux;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (!ehPar(arr[j]) && ehPar(arr[j + 1])) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }


    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }


    /**
     * Ordena os dois grupos de um vetor previamente separado por paridade.
     * Os elementos à esquerda do índice 'divisorDeGrupos' são ordenados em ordem crescente.

     * Os elementos à direita também são ordenados em ordem crescente.

     * Exemplo: Se o vetor tem [2, 4, 0, 7, 5, 9] e divisorDeGrupos = 3,
     * então será ordenado como: [0, 2, 4, 5, 7, 9]
     */
    private static void ordenarPorGrupoParidade(int[] arr, int divisorDeGrupos) {
        int aux;
        for (int i = 0; i < divisorDeGrupos - 1; i++) {
            for (int j = 0; j < divisorDeGrupos - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Crescente
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        int grupo2Length = arr.length - divisorDeGrupos;

        // 🧠 Pensa assim:
        // O for externo (i) = quantas voltas completas você dá no grupo para garantir que tudo esteja ordenado.
        for (int i = 0; i < grupo2Length - 1; i++) {
            // O for interno (j) = onde você realmente percorre e compara os elementos do grupo para trocar se estiverem fora de ordem
            for (int j = divisorDeGrupos; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    // Busca linear: N passos até encontrar a paridade divergente da sequência inicial
    public static int buscarDivisor(int arr[]) {
        if (ehPar(arr[0])) {
            for (int i = 0; i < arr.length; i++) {
                if (!ehPar(arr[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (ehPar(arr[i])) {
                    return i;
                }
            }
        }
        return -1; // Caso não encontre número com paridade oposta, retorna '-1' para evitar erro de compilação
    }


}
