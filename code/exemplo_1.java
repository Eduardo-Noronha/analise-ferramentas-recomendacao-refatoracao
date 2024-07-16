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

import java.util.ArrayList;
import java.util.List;

public class SistemaGestao {
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Produto> produtos;

    public SistemaGestao() {
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public void adicionarFuncionario(String nome, double salario) {
        Funcionario funcionario = new Funcionario(nome, salario);
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarios.remove(funcionario);
                break;
            }
        }
    }

    public void adicionarCliente(String nome, String endereco) {
        Cliente cliente = new Cliente(nome, endereco);
        clientes.add(cliente);
    }

    public void removerCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
                break;
            }
        }
    }
}