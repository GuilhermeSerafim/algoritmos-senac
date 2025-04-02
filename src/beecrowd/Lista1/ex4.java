package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 10) {
                System.out.printf("A[%d] = %.2f%n", i, arr[i]);
            }
        }
    }
}
