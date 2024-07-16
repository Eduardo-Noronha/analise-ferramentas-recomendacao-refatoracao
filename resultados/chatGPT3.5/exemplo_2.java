class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Money multiply(int factor) {
        return new Money(this.amount * factor);
    }

    public Money multiply(double factor) {
        return new Money(this.amount * factor);
    }

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}

class Vendedor {
    private String nome;
    private double comissao;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = comissao;
    }

    public Money calcularComissao(Money precoTotal) {
        return precoTotal.multiply(comissao);
    }
}

class Produto {
    private String nome;
    private Money preco;

    public Produto(String nome, Money preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Money getPreco() {
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

    public Money calcularComissaoVendedor() {
        Money precoTotal = produto.getPreco().multiply(quantidade);
        return vendedor.calcularComissao(precoTotal);
    }
}

class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carlos", 0.1);
        Produto produto = new Produto("Camiseta", new Money(25.0));

        Venda venda = new Venda(vendedor, produto, 5);
        Money comissao = venda.calcularComissaoVendedor();
        System.out.println("Comissão do vendedor: " + comissao);
    }
}
