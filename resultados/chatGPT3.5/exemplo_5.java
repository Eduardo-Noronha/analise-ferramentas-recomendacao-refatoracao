class Jogo {

    public void iniciar() {
        Personagem jogador = inicializarPersonagem("Jogador");
        Personagem inimigo = inicializarPersonagem("Inimigo");

        while (jogoEmAndamento(jogador, inimigo)) {
            realizarAtaque(jogador, inimigo);
            if (inimigo.getVida() > 0) {
                realizarAtaque(inimigo, jogador);
            }
        }

        anunciarVencedor(jogador);
    }

    private Personagem inicializarPersonagem(String nome) {
        Personagem personagem = new Personagem(nome);
        personagem.setVida(new Vida(100));
        return personagem;
    }

    private boolean jogoEmAndamento(Personagem jogador, Personagem inimigo) {
        return jogador.getVida() > 0 && inimigo.getVida() > 0;
    }

    private void realizarAtaque(Personagem atacante, Personagem defensor) {
        int dano = calcularDano(atacante);
        defensor.receberDano(dano);
    }

    private void anunciarVencedor(Personagem jogador) {
        if (jogador.getVida() > 0) {
            System.out.println("Jogador venceu!");
        } else {
            System.out.println("Inimigo venceu!");
        }
    }

    private int calcularDano(Personagem p) {
        return (int) (Math.random() * 10);
    }
}

class Vida {
    private int valor;

    public Vida(int valorInicial) {
        this.valor = valorInicial;
    }

    public int getValor() {
        return valor;
    }

    public void reduzir(int quantidade) {
        this.valor -= quantidade;
    }

    public boolean estaVivo() {
        return valor > 0;
    }
}

class Personagem {
    private String nome;
    private Vida vida;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void setVida(Vida vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida.getValor();
    }

    public void receberDano(int dano) {
        vida.reduzir(dano);
    }
}
