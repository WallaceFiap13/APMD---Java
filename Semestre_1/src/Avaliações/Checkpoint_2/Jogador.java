package Avaliações.Checkpoint_2;

public class Jogador {
    // Atributos da Classe Jogador
    int jogada, vidas;
    String nome;

    public boolean temVidas(int v){
        if (vidas >= v){
            return true;
        }
        else{
            return false;
        }
    }

    public void atacar(){
        if (temVidas(10) == true){
            vidas -= 10;
        }
        else{
            System.out.println("Jogador morto");
        }
    }

    public void defender(){
        vidas -= 10;
    }

    public void exibirDados(){
        System.out.printf("\nJogador = %s", nome);
        System.out.printf("\nNúmero de Jogadas = %d", jogada);
        System.out.printf("\nVidas = %d\n", vidas);
    }
}