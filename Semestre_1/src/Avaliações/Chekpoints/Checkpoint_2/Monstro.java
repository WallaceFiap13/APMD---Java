package Avaliações.Chekpoints.Checkpoint_2;

public class Monstro {
    // Atributos da Classe Jogador
    boolean estaVivo;
    int vidas;
    String nome;

    public void sofrerAtaque(){
        vidas -= 20;
    }

    public void exibirDados(){
        System.out.printf("\nMonstro = %s", nome);
        System.out.printf("\nVidas = %d", vidas);
        System.out.printf("\nEstá vivo = %b\n", estaVivo);
    }

    public boolean verificarSeEstaVivo(){
        if (vidas > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void atacar(){
        vidas -= 2;
    }
}
