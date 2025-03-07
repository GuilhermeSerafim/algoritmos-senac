package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que conta o número de ocorrências de um
//determinado caractere de um texto de um arquivo. O caractere deve ser
//informado pelo usuário via teclado.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo: ");
        String nomeArq = in.nextLine();
        System.out.println("Informe o caracter: ");
        char caracter = in.nextLine().charAt(0);
        int contador = 0;
        in.close();
        File file = new File(nomeArq);
        try (Scanner leitor  = new Scanner(file)){
            while(leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                if(linha.contains(String.valueOf(caracter))) { // String.valueOf para converter valores de tipos primitivos ou objetos em strings.
                    contador++;
                }
            }
            System.out.println("O caracter " + caracter + " repetiu " + contador + " vezes");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
        }
    }
}
