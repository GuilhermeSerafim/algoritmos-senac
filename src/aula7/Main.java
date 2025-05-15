package aula7;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3]; // Estão com um arr de 3 pposições nulas
        produtos[1] = new Produto(1, "Mouse", 50.25);
        produtos[2] = new Produto(2, "Teclado", 150.25);
        produtos[0] = new Produto(3, "WebCam", 200.25);

        
        
        imprime(produtos);
        bubbleSort(produtos);
        imprime(produtos);
    }

    public static void bubbleSort(Produto[] produtos) {
        Produto aux;
        for (int i = 0; i < produtos.length -1; i++) {
            for (int j = 0; j < produtos.length - 1 - i; j++) {
                if(produtos[j].getCodigo() > produtos[j + 1].getCodigo()) {
                   aux = produtos[j];
                   produtos[j] =  produtos[j + 1];
                   produtos[j + 1] = aux; 
                }
            }
        }
    }

    public static void imprime(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.printf("%2d|%8s|%6.2f\n", produto.getCodigo(), produto.getDesc(), produto.getPreco());
        }
    }
}
