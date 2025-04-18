package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra = in.nextLine();
        String[] dicionario = new String[1000];
        dicionario[0] = "a";
        dicionario[1] = "b";
        dicionario[2] = "c";
        dicionario[3] = "e";
        int validas = 4;
        int pos = 0;
        while (pos < validas && dicionario[pos].compareTo(palavra) < 0) {
            pos++;
        }
        for (int i = validas; i > pos; i--) {
            dicionario[i] = dicionario[i - 1];
        }
        dicionario[pos] = palavra;
        validas++;
        System.out.println(Arrays.toString(Arrays.copyOf(dicionario, validas)));
        in.close();
    }
}
