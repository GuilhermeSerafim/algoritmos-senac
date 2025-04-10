package aula6;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(potencia(3, 4));
    }

    public static int potencia(int a, int n) {
        if (n == 0)
            return 1;
        return a * potencia(a, n - 1);
    }
}
