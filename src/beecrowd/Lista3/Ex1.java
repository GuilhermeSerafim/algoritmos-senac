package beecrowd.Lista3;
import java.util.Scanner;

// Crie um programa para ordenar um conjunto de strings pelo seu tamanho. Seu programa deve receber um conjunto de strings e retornar este mesmo conjunto ordenado pelo tamanho das palavras, se o tamanho das strings for igual, deve-se manter a ordem original do conjunto.

// Entrada
// A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 strings inclusive, e cada uma das strings poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

// Saída
// A saída deve conter o conjunto de strings da entrada ordenado pelo tamanho das strings. Um espaço em branco deve ser impresso entre duas palavras.

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrCasosTestes = in.nextInt();
        int[][] matriz = new int[nrCasosTestes][];
        for (int i = 1; i <= matriz.length; i++) {
            String[] str = in.nextLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                
                
            }
        }

        in.close();
    }
    
}
