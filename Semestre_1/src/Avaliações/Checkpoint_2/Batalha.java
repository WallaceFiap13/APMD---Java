package Avaliações.Checkpoint_2;

public class Batalha {
    public static void main(String[] args) {
        Jogador player1 = new Jogador();
        player1.vidas = 90;
        player1.nome = "Luke";
        player1.jogada = 0;

        Monstro hunter1 = new Monstro();
        hunter1.nome = "Nemesis";
        hunter1.vidas = 30;
        hunter1.estaVivo = true;

        Monstro hunter2 = new Monstro();
        hunter2.nome = "Creeper";
        hunter2.vidas = 40;
        hunter2.estaVivo = true;

        // Rodada 1
        System.out.print("Rodada 1\n");
        player1.atacar();
        hunter1.sofrerAtaque();
        player1.jogada ++;
        hunter1.verificarSeEstaVivo();

        player1.exibirDados();
        hunter1.exibirDados();

        // Rodada 2
        System.out.print("\n\nRodada 2\n");
        hunter2.atacar();
        player1.defender();
        player1.jogada ++;
        hunter2.verificarSeEstaVivo();

        player1.exibirDados();
        hunter2.exibirDados();

        // Rodada 3
        System.out.print("\n\nRodada 3\n");
        player1.atacar();
        hunter2.sofrerAtaque();
        player1.jogada ++;
        hunter2.verificarSeEstaVivo();

        player1.exibirDados();
        hunter2.exibirDados();
    }
}