package aula6;

public class FuncaoRecursiva {

    public static int fatorial(int n) {
        // Caso base (parada da recursão)
        if (n == 0) {
            return 1;
        }
        // Chamada recursiva
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
    }

}
