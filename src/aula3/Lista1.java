package aula3;

import java.util.Random;
import java.util.Scanner;

/*
Entrega a Atividade 1 - Algoritmos e Programação II

Nós,

André Luiz Duran de Oliveira
Guilherme da Silva Serafim
Kayky de lemos Costa

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/


public class Lista1 {
    public static void main(String[] args) {
        // Criação dos objetos scanner e random para inter9
        // ação com o usuário e geração
        // de números aleatórios
        Scanner scanner = new Scanner(System.in);
        int[] vetor = null; // Inicializa o vetor como null, até ser preenchido com dados
        int opcao; // Variável para armazenar a opção do menu escolhida

        do {
            // Exibição do menu para o usuário
            System.out.println("▬▬▬ MENU ▬▬▬");
            System.out.println("0. Encerrar o programa;");
            System.out.println("1. Inicializar o vetor com números aleatórios;");
            System.out.println("2. Imprimir o vetor;");
            System.out.println("3. Verificar se um determinado número está contido no vetor;");
            System.out.println("4. Buscar o maior número armazenado no vetor;");
            System.out.println("5. Calcular a média dos números pares armazenados no vetor;");
            System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor;");
            System.out.println("7. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt(); // Leitura da opção escolhida

            // Switch para controlar as opções do menu
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                case 1:
                    // Inicializa o vetor com números aleatórios
                    Random random = new Random();
                    System.out.print("Digite o tamanho do vetor: ");
                    int tamanhoVetor = scanner.nextInt(); // Recebe o tamanho do vetor
                    System.out.print("Digite o valor limite para os números que serão gerados, para popular o vetor: ");
                    int valorLimite = scanner.nextInt(); // Recebe o valor máximo para os números gerados
                    vetor = new int[tamanhoVetor]; // Aloca o vetor
                    for (int i = 0; i < tamanhoVetor; i++) {
                        vetor[i] = random.nextInt(valorLimite + 1); // Gera números aleatórios até o limite especificado
                    }
                    System.out.println("Vetor inicializado com números aleatórios.");
                    break;
                case 2:
                    // Imprime o vetor caso já tenha sido inicializado
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    imprimirVetor(vetor); // Chama a função para imprimir o vetor
                    break;
                case 3:
                    // Verifica se um número está presente no vetor
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    System.out.print("Digite o valor a ser verificado: ");
                    int valorASerVerificado = scanner.nextInt(); // Recebe o valor a ser verificado
                    int indiceEncontrado = verificarSeNumeroExisteNoVetor(vetor, valorASerVerificado); // Verifica se o
                    // número está no
                    // vetor
                    if (indiceEncontrado == -1) {
                        System.out.println("Valor " + valorASerVerificado + " não encontrado no vetor.");
                    } else {
                        System.out.println("Valor " + valorASerVerificado + " encontrado na posição " + (indiceEncontrado + 1) + "ª posição!");
                    }
                    break;
                case 4:
                    // Encontra o maior número no vetor
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    int maiorNumero = identificarMaiorNumeroNoVetor(vetor); // Identifica o maior número
                    System.out.println("Maior número no vetor: " + maiorNumero);
                    break;
                case 5:
                    // Calcula a média dos números pares no vetor
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    double mediaNumerosPares = calcularMediaDosNumerosPares(vetor); // Calcula a média
                    System.out.printf("Média dos valores pares: %.2f\n", mediaNumerosPares);
                    break;
                case 6:
                    // Calcula o percentual de números ímpares no vetor
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    double percentualNumerosImpares = calcularPercentualDeNumerosImpares(vetor); // Calcula o percentual
                    System.out.printf("A porcentagem de números ímpares é: %.1f%%\n", percentualNumerosImpares);
                    break;
                case 7:
                    // Verifica se existe um par de números que somados são iguais a um valor
                    // informado
                    if (vetor == null) {
                        System.out.println("O vetor não foi inicializado.");
                        break;
                    }
                    System.out.print("Informe um valor: ");
                    int valorParaVerificarSoma = scanner.nextInt(); // Recebe o valor para verificar
                    boolean existeParComSomaIgualAoValor = verificarSeExisteParComSomaIgualAoValor(vetor,
                            valorParaVerificarSoma); // Verifica a condição
                    if (existeParComSomaIgualAoValor) {
                        System.out.println("Existe um par no vetor cuja soma é " + valorParaVerificarSoma + ".");
                    } else {
                        System.out.println(
                                "Não existe nenhum par no vetor cuja soma seja " + valorParaVerificarSoma + ".");
                    }
                    break;
            }
            // Linha separadora para melhor leitura
        } while (opcao != 0); // Encerra o loop quando a opção 0 é escolhida
        scanner.close(); // Fecha o scanner
    }

    // Função para identificar o maior número no vetor
    public static int identificarMaiorNumeroNoVetor(int[] vetor) {
        int maiorNumero = vetor[0]; // Assume que o primeiro número é o maior
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i]; // Atualiza o maior número
            }
        }
        return maiorNumero;
    }

    // Função para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " "); // Imprime cada número no vetor
        }
        System.out.println();
    }

    // Função para verificar se um número existe no vetor
    public static int verificarSeNumeroExisteNoVetor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i; // Retorna o índice se o número for encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }

    // Função para calcular a média dos números pares no vetor
    public static double calcularMediaDosNumerosPares(int[] vetor) {
        int soma = 0, contador = 0;
        for (int numero : vetor) {
            if (numero % 2 == 0) { // Verifica se o número é par
                soma += numero; // Adiciona o número à soma
                contador++; // Conta os números pares
            }
        }
        return contador == 0 ? 0 : (double) soma / contador; // Retorna a média ou 0 se não houver pares
    }

    // Função para calcular o percentual de números ímpares no vetor
    public static double calcularPercentualDeNumerosImpares(int[] vetor) {
        int contadorImpares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) { // Verifica se o número é ímpar
                contadorImpares++; // Conta os números ímpares
            }
        }
        return (contadorImpares * 100.0) / vetor.length; // Retorna o percentual de números ímpares
    }


    // Função para verificar se existe um par de números no vetor cuja soma seja
    // igual ao valor informado
    public static boolean verificarSeExisteParComSomaIgualAoValor(int[] vetor, int valorInformado) {
        for (int i = 0; i < vetor.length; i++) {
            int valorAtual = vetor[i];
            for (int j = i + 1; j < vetor.length; j++) {
                int outroValor = vetor[j];
                if (valorAtual + outroValor == valorInformado)
                    return true; // Verifica se a soma é igual ao valor informado
            }
        }
        return false; // Retorna falso caso não exista tal par
    }
}
