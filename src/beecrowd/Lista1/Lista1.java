package beecrowd.Lista1;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = -1, minValue, iMinValue;
        while (!(1 < length && length < 1000)) {
            System.out.println("Info length of array");
            length = in.nextInt();
        }

        in.nextLine(); // Consumindo buffer
        
        System.out.println("Info N Values to " + length + " lenght of array, separation of spaces");
        String values = in.nextLine();
        String[] valuesSepararation = values.split(" ");
        int[] result = new int[length];

        // Inserting integer values
        for (int i = 0; i < length; i++) {
            result[i] = Integer.parseInt(valuesSepararation[i]);
        }

        // Identify min value
        minValue = result[0];
        iMinValue = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] < minValue) {
                minValue = result[i];
                iMinValue = i;
            }
        }

        System.out.printf("Min value: %d%n", minValue);
        System.out.printf("Posição: %d", iMinValue);

        in.close();
    }
}