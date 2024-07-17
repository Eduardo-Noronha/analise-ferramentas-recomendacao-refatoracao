class Jogo {
    public void iniciar() {
        // Inicializa personagens
        Personagem jogador = new Personagem("Jogador");
        Personagem inimigo = new Personagem("Inimigo");

        // Configurações iniciais
        jogador.setVida(100);
        inimigo.setVida(100);

        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            realizarAtaque(jogador, inimigo);
            if (inimigo.getVida() > 0) {
                realizarAtaque(inimigo, jogador);
            }
        }

        // Fim do jogo
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
