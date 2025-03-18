package lista1;

import java.util.Random;
import java.util.Scanner;

public class operacoesVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] vetor = null;
        int opcao;

        do {
        System.out.println("▬▬▬MENU▬▬▬");
        System.out.println("1. Inicializar o vetor com números aleatórios;");
        System.out.println("2. Imprimir o vetor;");
        System.out.println("3. Verificar se um determinado número está contido no vetor;");
        System.out.println("4. Buscar o maior número armazenado no vetor;");
        System.out.println("5. Calcular a média dos números pares armazenados no vetor;");
        System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor;");
        System.out.println("7. Calcula a média centralizada dos números armazenados no vetor;");
        System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
        System.out.println("Selecione uma opção:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o tamanho do vetor: ");
                int tamanhoVetor = scanner.nextInt();
                System.out.println("Digite o valor limite para os números que serão gerados, para popular o vetor");
                int valor = scanner.nextInt();
                vetor = new int[tamanhoVetor];
                break;
            case 2:
                if(vetor == null) {
                    break;
                }
                imprimeVetor();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        } while(opcao != 0);
        scanner.close();

    }

    public static void imprimeVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
