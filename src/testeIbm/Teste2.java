package testeIbm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste2 {
    public static List<Long> countMinimumOperations(List<Integer> distance, List<Integer> targetDistance) {
        int n = distance.size();
        // Converte a lista "distance" para um vetor de long e ordena-o
        long[] dist = new long[n];
        for (int i = 0; i < n; i++) {
            dist[i] = distance.get(i);
        }
        Arrays.sort(dist);

        // Calcula a soma prefixada dos elementos em "dist"
        long[] somaPrefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            somaPrefix[i] = somaPrefix[i - 1] + dist[i - 1];
        }

        // Lista para armazenar os resultados de cada meta
        List<Long> resultado = new ArrayList<>();

        // Processa cada meta "t" presente em targetDistance
        for (int t : targetDistance) {
            // p é a quantidade de elementos em "dist" que são menores ou iguais a t
            int p = upperBound(dist, t);

            // Calcula o custo para os elementos menores ou iguais a t:
            // soma dos valores (t - elemento) = p*t - somaPrefix[p]
            long custoEsquerda = (p > 0) ? (long) p * t - somaPrefix[p] : 0;

            // Calcula o custo para os elementos maiores que t:
            // soma dos valores (elemento - t) = (somaPrefix[n] - somaPrefix[p]) - (n-p)*t
            long custoDireita = (p < n) ? (somaPrefix[n] - somaPrefix[p]) - (long) (n - p) * t : 0;

            // Adiciona o custo total à lista de resultados
            resultado.add(custoEsquerda + custoDireita);
        }

        return resultado;
    }

    // Função auxiliar que retorna o índice do primeiro elemento estritamente maior
    // que x
    private static int upperBound(long[] arr, int x) {
        int inicio = 0, fim = arr.length;
        while (inicio < fim) {
            int meio = (inicio + fim) >>> 1;
            if (arr[meio] <= x) {
                inicio = meio + 1;
            } else {
                fim = meio;
            }
        }
        return inicio;
    }

}
