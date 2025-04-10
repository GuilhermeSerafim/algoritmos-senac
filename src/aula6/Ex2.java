package aula6;

public class Ex2 {
    public static void main(String[] args) {
        binario(18);
    }

    public static void binario(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            binario(n / 2);
            System.out.print(n % 2);
        }
    }
}
