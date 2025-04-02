package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex5troca {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];

        // Leitura dos 20 valores
        for (int i = 0; i < 20; i++) {
            arr[i] = in.nextInt();
        }

        // Troca in-place: o primeiro com o último, o segundo com o penúltimo, etc.
        for (int i = 0; i < 10; i++) {
            int temp = arr[i];
            arr[i] = arr[19 - i];
            arr[19 - i] = temp;
        }

        // Impressão na formatação solicitada
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d%n", i, arr[i]);
        }

        in.close();
    }
}
