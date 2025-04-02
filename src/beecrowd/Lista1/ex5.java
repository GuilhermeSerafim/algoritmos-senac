package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arrInverso = new int[4]; // Inversão
        int length = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            arrInverso[i] = arr[length - 1];
            length--;
        }

        for (int index = 0; index < arrInverso.length; index++) {
            System.out.printf("N[%d] = %d%n", index, arrInverso[index]);
        }
        
        in.close();
    }
}
