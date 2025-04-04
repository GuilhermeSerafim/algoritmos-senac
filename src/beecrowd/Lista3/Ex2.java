// Tia Joana é uma respeitada professora e tem vários alunos. Em sua última aula, ela prometeu que iria sortear um aluno para ganhar um bônus especial na nota final: ela colocou N pedaços de papel numerados de 1 a N em um saquinho e sorteou um determinado número K; o aluno premiado foi o K-ésimo aluno na lista de chamada.

// O problema é que a Tia Joana esqueceu o diário de classe, então ela não tem como saber qual número corresponde a qual aluno. Ela sabe os nomes de todos os alunos, e que os números deles, de 1 até N, são atribuídos de acordo com a ordem alfabética, mas os alunos dela estão muito ansiosos e querem logo saber quem foi o vencedor.

// Dado os nomes dos alunos da Tia Joana e o número sorteado, determine o nome do aluno que deve receber o bônus.

// Entrada
// A primeira linha contém dois inteiros N e K separados por um espaço em branco (1 ≤ K ≤ N ≤ 100). Cada uma das N linhas seguintes contém uma cadeia de caracteres de tamanho mínimo 1 e máximo 20 representando os nomes dos alunos. Os nomes são compostos apenas por letras minúsculas de 'a' a 'z'.

// Saída
// Seu programa deve imprimir uma única linha, contendo o nome do aluno que deve receber o bônus.

package beecrowd.Lista3;

import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt() - 1;

        in.nextLine();

        String[] arr = new String[n];

        // Populando
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }

        // Bubble sort lexicógrafo
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Irá trocar somente se a posição anterior for maior que a posterior
                if(arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(arr[k]);

        in.close();
    }
}
