package beecrowd.Lista3;

import java.util.Arrays;

public class Ex1Desafio {
    public static void main(String[] args) {
        String[] arr = {"d", "aaaa", "bb", "ccc"};
        System.out.println("Array não ordenado");
        System.out.println(Arrays.toString(arr));
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬");
        System.out.println("Array ordenado descrescentemente pela quantidade de caracteres da string");
        bubbleSortDescrente(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSortDescrente(String[] vetor) {
        String aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            // A cada iteração externa, o maior valor é posicionado no final,
            // então podemos ignorar as últimas posições já ordenadas
            for (int j = 0; j < vetor.length - i - 1; j++) {
                // Troca os elementos se estiverem fora de ordem
                if (vetor[j].length() < vetor[j + 1].length()) { // Descrescente
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
