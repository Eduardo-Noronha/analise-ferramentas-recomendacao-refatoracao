import java.math.BigDecimal;
import java.util.List;

class Carrinho {
    private List<Item> itens;

    public BigDecimal calcularValorTotal() {
        return itens.stream()
                    .map(this::calcularPrecoItem)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calcularPrecoItem(Item item) {
        return item.getPreco().multiply(new BigDecimal(item.getQuantidade()));
    }
}

class Item {
    private String nome;
    private BigDecimal preco;
    private int quantidade;

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
