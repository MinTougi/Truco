package src;

public class UserInteract {

    public static void exibeCartaVirada(Carta cartaVirada) {
        System.out.println("Carta virada: " + cartaVirada);
    }

    public static void exibeCartaJogada(String nomeJogador, Carta cartaJogada) {
        System.out.println(nomeJogador + " jogou: " + cartaJogada);
    }

    public static void vencedorRodada(int ganhador, Jogador jogador1, Jogador jogador2) {
        if (ganhador == 1) {
            System.out.println("Vencedor da rodada: " + jogador1.nome);
        } else if (ganhador == 2) {
            System.out.println("Vencedor da rodada: " + jogador2.nome);
        } else {
            System.out.println("Rodada empatada!");
        }
    }
}
