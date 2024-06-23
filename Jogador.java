package src;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    public List<Carta> cartas;

    public String nome;

    public Jogador(String nome) {
        this.cartas = new ArrayList<>();
        this.nome = nome;
    }

    public Carta jogada(Carta cartaNaMesa) {
        return escolherCarta(cartaNaMesa);
    }

    public Carta escolherCarta(Carta cartaNaMesa) {
        if (cartaNaMesa == null) {
            return cartas.get(0);
        }

        for (Carta carta : cartas) {
            if (isCartaValida(carta, cartaNaMesa)) {
                return carta;
            }
        }
        
        return cartas.get(0);
    }

    private boolean isCartaValida(Carta carta, Carta cartaNaMesa) {
        return true;
    }

    public void exibeCartas() {
        cartas.forEach(c -> System.out.print(c + " "));
        System.out.println();
    }
}
