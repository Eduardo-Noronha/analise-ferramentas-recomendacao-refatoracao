class Vendedor {
    private String nome;
    private double comissao;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
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

    public double calcularComissaoVendedor() {
        // Feature Envy: Venda está acessando os detalhes internos de Vendedor e Produto
        double precoTotal = produto.getPreco() * quantidade;
        return vendedor.getComissao() * precoTotal;
    }
}

class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carlos", 0.1);
        Produto produto = new Produto("Camiseta", 25.0);

        Venda venda = new Venda(vendedor, produto, 5);
        double comissao = venda.calcularComissaoVendedor();
        System.out.println("Comissão do vendedor: " + comissao);
    }
}