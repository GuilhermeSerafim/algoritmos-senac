package aula7;

import java.util.Comparator;

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
        if (this.codigo < outro.codigo)
            return -1; // menor → antes
        if (this.codigo == outro.codigo)
            return 0; // igual
        return 1; // maior → depois
    }

    // Função anonima
    public static final Comparator<Produto> COMPARADOR_DESCRICAO = new Comparator<Produto>() {
        @Override
        public int compare(Produto o1, Produto o2) {
            return o1.desc.compareToIgnoreCase(o2.desc);
        }
    };

    public static final Comparator<Produto> COMPARADOR_PRECO = new Comparator<Produto>() {
        @Override
        public int compare(Produto o1, Produto o2) {
            if (o1.preco < o2.preco)
                return -1;
            else if (o1.preco == o2.preco)
                return 0;
            else
                return 1;
        }
    };
}