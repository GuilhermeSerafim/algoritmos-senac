package sistemaDeBuscas;

import java.util.Random;
import java.util.Scanner;

public class buscaBinaria {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número a ser procurado no arr: ");
        int num = in.nextInt();
        int[] arr = new int[100];
        int numero = buscaLinear(arr, num);
        System.out.println(numero);
    }

    public static int buscaLinear(int vetor[], int numeroASerProcurado) {
        for(int i = 0; i < vetor.length; i++)  {
            if(vetor[i] == numeroASerProcurado) {
                return i;
            }
        }
        return -1;
    }
}
