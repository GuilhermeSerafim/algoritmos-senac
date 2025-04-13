package aula6;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, base;
        System.out.println("Digite o número em decimal para converter em base binária");
        n = in.nextInt();
        System.out.println("Digite para outra base que você quer converter");
        base = in.nextInt();
        System.out.println("Binário: ");
        binario(n);
        System.out.println();
        System.out.print("Base " + base + " :");
        converteBaseDecimalPara(n, base);
   }

    public static void binario(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            binario(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void converteBaseDecimalPara(int nrDecimal, int base) {
        if (nrDecimal < base)
            System.out.print(nrDecimal);
        else {
            binario(nrDecimal / base);
            System.out.print(nrDecimal % base);
        }
    }
}
