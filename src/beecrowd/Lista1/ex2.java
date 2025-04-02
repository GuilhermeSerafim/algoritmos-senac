package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Integer[] arr = new Integer[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0 || arr[i] == null) {
                System.out.printf("X[%d] = %d%n",  i, 1);
            } else {
                System.out.printf("X[%d] = %d%n", i, arr[i]);
            }
        }


        in.close();
    }
}
