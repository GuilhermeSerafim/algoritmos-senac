package aula7;

// Molder
public class Produto implements Comparable<Produto> {
    // Modificadores de acesso
    private int codigo;
    private String desc;
    private double preco;

    public Produto(int c, String d, double p) {
        codigo = c;
        desc = d;
        preco = p;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        // ordem CRESCENTE
        if (this.codigo < outro.codigo) return -1;  // menor → antes
        if (this.codigo == outro.codigo) return 0;  // igual
        return 1;                                   // maior → depois
    }
}
