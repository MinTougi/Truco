package src;

public class Rodada {

    public Carta cartaJogadorUm;
    public Carta cartaJogadorDois;
    public int ganhador; // 1 para Jogador 1, 2 para Jogador 2, 0 para empate

    public Rodada() {
        this.cartaJogadorUm = null;
        this.cartaJogadorDois = null;
        this.ganhador = 0;
    }
}
