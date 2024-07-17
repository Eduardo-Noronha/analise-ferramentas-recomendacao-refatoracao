import java.math.BigDecimal;

class Vendedor {
    private String nome;
    private BigDecimal comissao;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = BigDecimal.valueOf(comissao);
    }

    public BigDecimal calcularComissao(BigDecimal precoTotal) {
        return precoTotal.multiply(comissao);
    }
}

class Produto {
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = BigDecimal.valueOf(preco);
    }

    public BigDecimal getPreco() {
        return preco;
    }
}

class Venda {
    private Vendedor vendedor;
    private Produto produto;
    private int quantidade;

    public Venda(Vendedor vendedor, Produto produto, int quantidade) {
        this.vendedor = vendedor;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal calcularComissaoVendedor() {
        BigDecimal precoTotal = produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
        return vendedor.calcularComissao(precoTotal);
    }
}

class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carlos", 0.1);
        Produto produto = new Produto("Camiseta", 25.0);

        Venda venda = new Venda(vendedor, produto, 5);
        BigDecimal comissao = venda.calcularComissaoVendedor();
        System.out.println("Comissão do vendedor: " + comissao);
    }
}