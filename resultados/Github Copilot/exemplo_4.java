import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Carrinho {
    private List<Item> itens = new ArrayList<>();

    public BigDecimal calcularValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Item item : itens) {
            total = total.add(item.getPreco().multiply(BigDecimal.valueOf(item.getQuantidade())));
        }
        return total;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
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
