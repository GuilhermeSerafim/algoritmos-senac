package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Reescreva o programa anterior para que toda linha que comece com //
// não seja impressa na tela.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo");
        String nomeArquivo = in.nextLine();
        in.close();
        File file = new File(nomeArquivo);
        try (Scanner leitor = new Scanner(file)) { // Usando try-with-resources para fechar o Scanner automaticamente
            while (leitor.hasNextLine()) { // Verifica se há mais linhas para ler
                String linha = leitor.nextLine();
                if(!linha.startsWith("//")) {
                    System.out.println(linha);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
        }
    }
}
