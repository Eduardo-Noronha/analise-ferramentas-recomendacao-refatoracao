class Carrinho {
    private List<Item> itens;

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
}

class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
