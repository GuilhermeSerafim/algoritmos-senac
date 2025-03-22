package sistemaDeBuscas;

import java.util.Random;
import java.util.Scanner;

// Simulação de buscas:	 https://www.cs.usfca.edu/~galles/visualization/Search.html
public class Buscas {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor: ");
		int tamanhoVetor = in.nextInt();
		System.out.print("Digite o até que número o vetor irá preencher aleatoriamente: ");
		int limite = in.nextInt();
		int[] vetor = new int[tamanhoVetor];
		populaArrNrsRandons(vetor, limite);
		System.out.println("Vetor gerado!");
		System.out.print("Digite o número que deseja buscar: ");
		int numeroASerProcurado = in.nextInt();
		int nrBuscadoBinario = buscaBinaria(vetor, numeroASerProcurado);
		int nrBuscadoLinear = buscaLinear(vetor, numeroASerProcurado);
		// Se caso houver pouca variedade de resultados, quem irá encontrar o número mais rápido é a busca linear
		System.out.println("Busca linear: Número encontrado na posição " + nrBuscadoLinear);
		System.out.println("Busca binária: Número encontrado na posição " + nrBuscadoBinario);
		
		in.close();
		
	}

	public static void populaArrNrsRandons(int[] vetor, int limite) {
		Random random = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(limite + 1);
		}
	}

	public static int buscaLinear(int vetor[], int numeroASerProcurado) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroASerProcurado) {
				return i;
			}
		}
		return -1;
	}

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
