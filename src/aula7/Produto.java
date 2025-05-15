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
    public int compareTo(Produto arg0) {
        // TODO Auto-generated method stub
        if (this.codigo < arg0.codigo)
            return -1;
        else if (this.codigo == arg0.codigo)
            return 0;
        else
            return 1;
    }
}
