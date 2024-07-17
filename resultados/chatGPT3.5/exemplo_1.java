import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
}

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
}

class Gestao<T> {
    private List<T> items;

    public Gestao() {
        this.items = new ArrayList<>();
    }

    public void adicionar(T item) {
        items.add(item);
    }

    public void remover(String nome, Nameable<T> nameable) {
        for (T item : items) {
            if (nameable.getName(item).equals(nome)) {
                items.remove(item);
                break;
            }
        }
    }
}

interface Nameable<T> {
    String getName(T item);
}

public class SistemaGestao {
    private Gestao<Funcionario> gestaoFuncionarios;
    private Gestao<Cliente> gestaoClientes;
    private Gestao<Produto> gestaoProdutos;

    public SistemaGestao() {
        this.gestaoFuncionarios = new Gestao<>();
        this.gestaoClientes = new Gestao<>();
        this.gestaoProdutos = new Gestao<>();
    }

    public void adicionarFuncionario(String nome, double salario) {
        Funcionario funcionario = new Funcionario(nome, salario);
        gestaoFuncionarios.adicionar(funcionario);
    }

    public void removerFuncionario(String nome) {
        gestaoFuncionarios.remover(nome, Funcionario::getNome);
    }

    public void adicionarCliente(String nome, String endereco) {
        Cliente cliente = new Cliente(nome, endereco);
        gestaoClientes.adicionar(cliente);
    }

    public void removerCliente(String nome) {
        gestaoClientes.remover(nome, Cliente::getNome);
    }

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        gestaoProdutos.adicionar(produto);
    }

    public void removerProduto(String nome) {
        gestaoProdutos.remover(nome, Produto::getNome);
    }
}
