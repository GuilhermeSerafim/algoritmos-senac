package atividades;

public class Testes {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 1};
        String[] arr2 = {"e", "b", "c", "d"};
        System.out.println(buscaLinearMenorNumero(arr));
        System.out.println(buscaLinearMenorNumero(arr2));
    }

    public static int buscaLinearMenorNumero(int arr[]) {
        int menorNumero = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < menorNumero) {
                menorNumero = arr[i];
            }
        }
        return menorNumero;
    }

    public static String buscaLinearMenorNumero(String arr[]) {
        String menorStr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(menorStr) < 0) {
                menorStr = arr[i];
            }
        }

        return menorStr;
    }
}
