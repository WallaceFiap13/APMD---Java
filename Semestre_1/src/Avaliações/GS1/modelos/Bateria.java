package Avaliações.GS1.modelos;

public class Bateria {
    double carga = 100.0;

    //* Constantes para facilitar o trabalho
    double consumoCm = 0.008; //? Custo do movimento por cm
    double consumoTranspor = 1.5; //? Custo fixo por transposição
    double consumoGrau = 0.04; //? Custo de rotação por grau

    double nivelCritico = carga * 0.15;
    double nivelAlerta = carga * 0.40;

    //* Movimento livre
    public void consumirMovimento(double distancia) {
        double consumo = distancia * consumoCm;
        descontarCarga(consumo);

        System.out.printf("\n[BATERIA] - Consumo: %.2f%%\n", consumo);

        exibirStatus();
    }

    //* Transpor obstáculo
    public void consumirTransposicao(double distancia) {
        double consumo = ((distancia * consumoCm) + consumoTranspor);
        descontarCarga(consumo);

        System.out.printf("\n[BATERIA] - Consumo: %.2f%%\n", consumo);

        exibirStatus();
    }

    //* Desviar obstáculo
    public void consumirDesvio(double angulo, double distanciaDesvio) {
        double consumoRotacao = angulo * consumoGrau;
        double consumoMovimento = distanciaDesvio * consumoCm;
        double consumoTotal = consumoRotacao + consumoMovimento;
        descontarCarga(consumoTotal);

        System.out.printf("\n[BATERIA] - Consumo: %.2f%%\n", consumoTotal);

        exibirStatus();
    }

    //* Método para verificar carga
    public boolean temCargaSuficiente() {
        return carga > 0;
    }


    //* Método para descontar carga
    public void descontarCarga(double consumo) {
        //? se o consumo deixar a bateria abaixo de 0 eu considero como 0
        carga = Math.max(0, carga - consumo);
    }

    //* Método de exibição do status da bateria
    public void exibirStatus() {
        System.out.printf("[BATERIA] - Carga atual: %.2f%%\n", carga);

        if (carga <= 0) {
            System.out.println("[BATERIA] - ESGOTADA");
        } else if (carga <= nivelCritico) {
            System.out.println("[BATERIA] - Nível Crítico!! - retornar à base!");
        } else if (carga <= nivelAlerta) {
            System.out.println("[BATERIA] - Nivel de atenção - planejar recarga");
        } else {
            System.out.println("[BATERIA] - Ok");
        }
    }
}
