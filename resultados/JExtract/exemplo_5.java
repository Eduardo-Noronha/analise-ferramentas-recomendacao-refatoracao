class Jogo {
    public void iniciar() {
        // Inicializa personagens
        Personagem jogador = new Personagem("Jogador");
        Personagem inimigo = new Personagem("Inimigo");

        // Configurações iniciais
        jogador.setVida(100);
        inimigo.setVida(100);

        // Loop do jogo
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            // Jogador ataca
            int danoJogador = calcularDano(jogador);
            inimigo.receberDano(danoJogador);

            // Inimigo ataca
            if (inimigo.getVida() > 0) {
                int danoInimigo = calcularDano(inimigo);
                jogador.receberDano(danoInimigo);
            }
        }

        // Fim do jogo
        finalizarJogo(jogador);
    }

	private void finalizarJogo(Personagem jogador) {
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
