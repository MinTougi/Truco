package src;

public class Main {

    public static void main(String[] args) {
        // Criação dos jogadores
        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        // Criação do jogo
        Jogo jogo = new Jogo(jogador1, jogador2);

        // Loop do jogo
        while (!jogo.alguemGanhou()) {
            // Embaralhar e distribuir as cartas
            jogo.baralho.embaralhar();
            jogo.distribuirCartas();

            // Exibir as cartas dos jogadores
            System.out.println("Cartas do " + jogador1.nome + ": ");
            jogador1.exibeCartas();
            System.out.println("Cartas do " + jogador2.nome + ": ");
            jogador2.exibeCartas();

            // Jogar rodadas até alguém pontuar
            while (!jogo.alguemPontuou()) {
                jogo.iniciarRodada();
            }

            // Exibir pontuação
            System.out.println("Pontuação: ");
            System.out.println(jogador1.nome + ": " + jogo.pontuacaoA);
            System.out.println(jogador2.nome + ": " + jogo.pontuacaoB);
        }

        // Determinar e exibir o vencedor do jogo
        if (jogo.pontuacaoA >= 12) {
            System.out.println(jogador1.nome + " venceu o jogo!");
        } else if (jogo.pontuacaoB >= 12) {
            System.out.println(jogador2.nome + " venceu o jogo!");
        }
    }
}
