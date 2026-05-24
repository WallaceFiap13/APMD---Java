package Avaliações.GS1.modelos;

public class Obstaculo {
    String tipoObstaculo;
    double larguraDireita, larguraEsquerda;
    int inclinacao;

    //* Método Construtor
    public Obstaculo(String tipoObstaculo, double larguraDireita, double larguraEsquerda, int inclinacao) {
        this.tipoObstaculo = tipoObstaculo;
        this.larguraDireita = larguraDireita;
        this.larguraEsquerda = larguraEsquerda;
        this.inclinacao = inclinacao;
    }

    //* Método de exibição dos dados do objetos da classe Obstaculo
    public void exibirObstaculo() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\n********************************************");
        System.out.println("   INFORMAÇÕES COLETADAS SOBRE O OBSTÁCULO  ");
        System.out.println("********************************************");
        System.out.printf("Tipo do Obstaculo: %s", tipoObstaculo);
        System.out.printf("\nLargura para direita: %.2f cm", larguraDireita);
        System.out.printf("\nLargura para esquerda: %.2f cm", larguraEsquerda);
        System.out.printf("\nInclinação do obstáculo: %d°\n", inclinacao);
        System.out.println("********************************************");
        Thread.sleep(8000);
    }
}