// Tia Joana é uma respeitada professora e tem vários alunos. Em sua última aula, ela prometeu que iria sortear um aluno para ganhar um bônus especial na nota final: ela colocou N pedaços de papel numerados de 1 a N em um saquinho e sorteou um determinado número K; o aluno premiado foi o K-ésimo aluno na lista de chamada.

// O problema é que a Tia Joana esqueceu o diário de classe, então ela não tem como saber qual número corresponde a qual aluno. Ela sabe os nomes de todos os alunos, e que os números deles, de 1 até N, são atribuídos de acordo com a ordem alfabética, mas os alunos dela estão muito ansiosos e querem logo saber quem foi o vencedor.

// Dado os nomes dos alunos da Tia Joana e o número sorteado, determine o nome do aluno que deve receber o bônus.

// Entrada
// A primeira linha contém dois inteiros N e K separados por um espaço em branco (1 ≤ K ≤ N ≤ 100). Cada uma das N linhas seguintes contém uma cadeia de caracteres de tamanho mínimo 1 e máximo 20 representando os nomes dos alunos. Os nomes são compostos apenas por letras minúsculas de 'a' a 'z'.

// Saída
// Seu programa deve imprimir uma única linha, contendo o nome do aluno que deve receber o bônus.

package beecrowd.Lista3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] palavras = { "banana", "apple", "zebra", "grape", "orange" };

        // Bubble Sort com comparação lexicográfica
        for (int i = 0; i < palavras.length - 1; i++) {
            for (int j = 0; j < palavras.length - i - 1; j++) {
                // Se estiver fora de ordem, troca
                if (palavras[j].compareTo(palavras[j + 1]) > 0) {
                    String temp = palavras[j];
                    palavras[j] = palavras[j + 1];
                    palavras[j + 1] = temp;
                }
            }
        }

        // Imprime o array ordenado
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }

        System.out.println();
        
        in.close();
    }
}
