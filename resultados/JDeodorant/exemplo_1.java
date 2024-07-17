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

public class GerenciaProduto {
	private List<Produto> produtos;

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		produtos.add(produto);
	}

	public void removerProduto(String nome) {
		for (Produto produto : produtos) {
			checaERemove(nome, produto);
			if (produto.getNome().equals(nome)) {
				break;
			}
		}
	}

	private void checaERemove(String nome, Produto produto) {
		if (produto.getNome().equals(nome)) {
			produtos.remove(produto);
		}
	}
}

public class GerenciaClientes {
	private List<Cliente> clientes;

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionarCliente(String nome, String endereco) {
		Cliente cliente = new Cliente(nome, endereco);
		clientes.add(cliente);
	}

	public void removerCliente(String nome) {
		for (Cliente cliente : clientes) {
			checaERemove(nome, cliente);
			if (cliente.getNome().equals(nome)) {
				break;
			}
		}
	}

	private void checaERemove(String nome, Cliente cliente) {
		if (cliente.getNome().equals(nome)) {
			clientes.remove(cliente);
		}
	}
}

public class SistemaGestao {
    private GerenciaProduto gerenciaProduto = new GerenciaProduto();
	private GerenciaClientes gerenciaClientes = new GerenciaClientes();
	private List<Funcionario> funcionarios;
    public SistemaGestao() {
        this.funcionarios = new ArrayList<>();
        gerenciaClientes.setClientes(new ArrayList<>());
        gerenciaProduto.setProdutos(new ArrayList<>());
    }

    public void adicionarFuncionario(String nome, double salario) {
        Funcionario funcionario = new Funcionario(nome, salario);
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            checaERemoveFuncionarios(nome, funcionario);
			if (funcionario.getNome().equals(nome)) {
                break;
            }
        }
    }

	private void checaERemoveFuncionarios(String nome, Funcionario funcionario) {
		if (funcionario.getNome().equals(nome)) {
			funcionarios.remove(funcionario);
		}
	}

    public void adicionarCliente(String nome, String endereco) {
        gerenciaClientes.adicionarCliente(nome, endereco);
    }

    public void removerCliente(String nome) {
        gerenciaClientes.removerCliente(nome);
    }

    public void adicionarProduto(String nome, double preco) {
        gerenciaProduto.adicionarProduto(nome, preco);
    }

    public void removerProduto(String nome) {
        gerenciaProduto.removerProduto(nome);
    }
}
