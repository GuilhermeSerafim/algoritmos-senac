package beecrowd.Lista1;

import java.io.IOException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws IOException  {
        int[] arr =  new int[10];
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(!(x <= 50)) {
          return;  
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("N[" + i + "] = " + x);
            x *= 2;
        }
        in.close();
    }
}
