package aula2.arquivos;
// Algumas vezes podemos processar os dados armazenados em arquivo texto,
//onde cada linha corresponderia a um nome do aluno e sua nota, separadas por
//um ponto e vírgula (“;”).

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exemplo do arquivo texto alunos.txt
//Jose da Silva;10.0
//Manoel Pereira;5.0
//Carlos Dias;7.0
//Ana Andrade;6.5
//Escreva um programa que leia as linhas do arquivo alunos.txt, para cada
//linha lida, você deve separar o nome e a nota do aluno, ao final seu programa
//deve informar a média das notas lidas e o nome e nota do aluno com a maior
//nota.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo: ");
        String nomeArq = in.nextLine();
        in.close();
        File file = new File(nomeArq + ".txt");
        String[] nomeNotaAluno = new String[100];
        try (Scanner leitor  = new Scanner(file)){
            while(leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                nomeNotaAluno = linha.split(";");
            }
            for (int i = 0; i < nomeNotaAluno.length; i++) {
                if(i % 2 == 0) {
                    System.out.println("Nome: " + nomeNotaAluno[i]);
                } else {
                    System.out.println("Nota: " + nomeNotaAluno[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
        }
    }
}
