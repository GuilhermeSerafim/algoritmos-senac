package testeIbm;

public class Teste1 {

    public static int contarTokensValidos(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        String[] palavras = texto.trim().split("\\s+");
        int contagemValida = 0;
        for (String palavra : palavras) {
            if (ehTokenValido(palavra)) {
                contagemValida++;
            }
        }
        return contagemValida;
    }

    public static boolean ehTokenValido(String token) {
        if (token.length() < 3) {
            return false;
        }
        if (!token.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        boolean temVogal = false;
        boolean temConsoante = false;
        String tokenMinusculo = token.toLowerCase();
        for (char c : tokenMinusculo.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    temVogal = true;
                } else {
                    temConsoante = true;
                }
            }
            if (temVogal && temConsoante) {
                break;
            }
        }
        return temVogal && temConsoante;
    }