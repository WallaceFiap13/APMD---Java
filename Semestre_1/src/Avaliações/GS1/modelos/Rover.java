package Avaliações.GS1.modelos;

public class Rover {
    int inclinacaoMaxima;
    String modelo;
    Bateria bateria; //! Parâmetro da classe Bateria

    //* Método Construtor
    public Rover(String modelo, int inclinacaoMaxima) {
        this.inclinacaoMaxima = inclinacaoMaxima;
        this.modelo = modelo;
        this.bateria = new Bateria();
    }

    //* Vincula a imagem ao obstáculo e gera a distância até ele aleatoriamente
    public void capturarImagemCamera(Imagem imagem, Obstaculo obstaculo) {
        imagem.getImagem(obstaculo);

        double distancia = (Math.random() * 401) + 100;
        imagem.distancia = distancia;
    }

    //* Informações do Rover com toString
    @Override
    public String toString() {
        return "{modelo='" + modelo + "',inclinacaoMaxima=" + inclinacaoMaxima + "}";
    }

    //* Analisa se o obstáculo pode ser trasposto ou se deve ser desviado e toma as ações
    public void analisarObstaculoParaMovimento(Imagem imagem) throws InterruptedException {
        //! Verifica se tem bateria
        if (!bateria.temCargaSuficiente()) {
            System.out.println("\n[BATERIA] - ESGOTADA - ROVER NÃO PODE SE MOVER!");
            return;
        }
        
        if (imagem.obstaculo.inclinacao <= inclinacaoMaxima) { //* Rover transpõe o obstáculo
            System.out.println("\nObstáculo com inclinação permitida para passagem");
            Thread.sleep(3000);
            System.out.printf("%s se movimenta %.2f cm para frente...\n", modelo, imagem.distancia);
            Thread.sleep(5000);
            System.out.printf("%s transpõe o obstáculo com inclinação de %d°\n", modelo, imagem.obstaculo.inclinacao);
            Thread.sleep(3000);

            //* Implementação do consumo da bateria
            bateria.consumirTransposicao(imagem.distancia);

        } else { //* Rover desvia do obstáculo
            //? Calcular menor distância larteral do Obstáculo e consequentemente o seu angulo de rotação e a direção
            double largura;
            String direcao;

            if (imagem.obstaculo.larguraDireita < imagem.obstaculo.larguraEsquerda) {
                largura = imagem.obstaculo.larguraDireita;
                direcao = "direita";
            } else {
                largura = imagem.obstaculo.larguraEsquerda;
                direcao = "esquerda";
            }

            System.out.println("\nObstáculo com inclinação não pertmitida para passagem");
            Thread.sleep(3000);
            System.out.printf("Rover precisa desviar para a %s", direcao);
            Thread.sleep(3000);
            System.out.printf("\n%s rotaciona %.2f° para a %s...", modelo, calcularAnguloDesvio(imagem.distancia, largura), direcao);
            Thread.sleep(5000);
            System.out.printf("\n%s se movimenta %.2f cm para frente...\n", modelo, calcularDistanciaDesvio(imagem.distancia, largura));
            Thread.sleep(5000);
            System.out.printf("%s passa ao lado do obstáculo com inclinação de %d°\n", modelo, imagem.obstaculo.inclinacao);
            Thread.sleep(3000);

            //* Implementação do consumo da bateria
            bateria.consumirDesvio(calcularAnguloDesvio(imagem.distancia, largura), calcularDistanciaDesvio(imagem.distancia, largura)); 
        }
    }

    //* Movimentação Smples
    //! Verifica se tem bateria
    public void moverParaFrente(double distancia) throws InterruptedException {
        if (!bateria.temCargaSuficiente()) {
            System.out.println("\n[BATERIA] - ESGOTADA - ROVER NÃO PODE SE MOVER!");
            return;
        }

        System.out.printf("\n%s se movimenta %.2f cm para frente...\n", modelo, distancia);
        Thread.sleep(5000);

        bateria.consumirMovimento(distancia);
    }

    //* Calcula o ãngulo de rotação necessário para desvio do obstáculo
    public double calcularAnguloDesvio(double distancia, double largura) {
        double anguloRad = Math.atan(largura / distancia);

        double anguloGraus = Math.toDegrees(anguloRad);

        return anguloGraus;
    }

    //* Calcula a nova rota pós desvio
    public double calcularDistanciaDesvio(double distancia, double largura) {
        double distanciaDesvio = Math.sqrt((largura*largura) + (distancia*distancia));

        return distanciaDesvio;
    }
}