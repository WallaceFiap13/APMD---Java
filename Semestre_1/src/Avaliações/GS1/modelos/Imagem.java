package Avaliações.GS1.modelos;

public class Imagem {
    Obstaculo obstaculo; //! Parâmetro da classe Obstáculo
    double distancia;

    //* Método construtor sem parâmetros
    public Imagem(){
    }

    //* Método para obter o obstáculo
    public void getImagem(Obstaculo obstaculo){
        this.obstaculo = obstaculo;
    }

    //* Método de exibição dos dados do objetos da classe Imagem
    public void exibirImagem() throws InterruptedException {
        System.out.println("       INFORMAÇÕES COLETADAS DA IMAGEM      ");
        System.out.println("********************************************");
        System.out.printf("Obstaculo: %s", obstaculo.tipoObstaculo);
        System.out.printf("\nDistância até o obstáculo: %.2f cm", distancia);
        System.out.println("\n********************************************");
        Thread.sleep(5000);
    }
}
