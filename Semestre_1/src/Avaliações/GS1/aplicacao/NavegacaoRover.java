package Avaliações.GS1.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Avaliações.GS1.modelos.Obstaculo;
import Avaliações.GS1.modelos.Rover;
import Avaliações.GS1.modelos.Imagem;

public class NavegacaoRover {
    public static Scanner le = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException { //! Para liberar a gente utilizar sleep
        Locale.setDefault(Locale.US); //! Define que o padrão de formato de números reais é com . e não ,

        //* Input dos dados do Rover
        System.out.print("Digite o modelo do Rover: ");
        String modelo = le.nextLine();

        System.out.print("Qual inclinação máxima para subir ou descer obstáculos? (graus): ");
        int inclinacao = le.nextInt();

        //* Criação do objeto da classe Rover
        Rover rover = new Rover(modelo, inclinacao);

        System.out.println("\nRover está pronto para iniciar testes!!!");
        Thread.sleep(1000);
        System.out.println(rover);
        Thread.sleep(2000);

        //* Criação do objeto da classe Imagem
        Imagem imagem = new Imagem();

        int continua;
        do {
            //* Chama a função para a simulação de uma leitura de um obstáculo
            //? lerDadosObstaculo -> new Obstaculo(tipoObstaculo, larguraDireita, larguraEsquerda, inclinacao);
            //? Para conseguir trabalhar com as variáveis do objeto 'rover' passamos elas como parâmetro da função
            Obstaculo obstaculo = lerDadosObstaculo(rover);

            //* O objeto 'obstaculo' não sendo nulo, iniciamos o fluxo
            if (obstaculo != null) {
                //* Simula a captura da imagem da câmera
                rover.capturarImagemCamera(imagem, obstaculo);

                //* Exibe os dados coletados pela imagem
                imagem.exibirImagem();

                //* Faz o processamento das informações e decide as ações a serem tomadas
                rover.analisarObstaculoParaMovimento(imagem);
            }
            Thread.sleep(2000);
            System.out.printf("\nDigite 1 para continuar a se movimentar com o %s : ", modelo);
            continua = le.nextInt();
        } while (continua == 1);
    }

    //* Função para a simulação de uma leitura de um obstáculo
    //? Para conseguir usar a variável 'modelo' solicitamos ela como parâmetro da função
    public static Obstaculo lerDadosObstaculo(Rover rover) throws InterruptedException {
        System.out.print("\nExiste obstáculo a frente? (1-sim): ");
        int opcao = le.nextInt();

        //* Input dos dados do obstáculo
        if (opcao == 1) {
            System.out.print("Qual tipo de obstáculo | 1-Rocha | 2-Buraco | : ");
            int tipo = le.nextInt();
            String tipoObstaculo;
            if (tipo == 1) {
                tipoObstaculo = "Rocha";
            } 
            else if(tipo == 2)            {
                tipoObstaculo = "Buraco";
            }
            else{
                System.out.println("\nErro, selecione um obstáculo válido");
                return null;
            }
            System.out.print("\nQual a inclinação para transpor? (graus): ");
            int inclinacao = le.nextInt();
            System.out.print("Qual a largura do obstáculo para direita? (cm): ");
            double larguraDireita = le.nextDouble();
            System.out.print("Qual a largura do obstáculo para esquerda? (cm): ");
            double larguraEsquerda = le.nextDouble();

            //* Criação do objeto da classe Obstaculo
            Obstaculo obstaculo = new Obstaculo(tipoObstaculo, larguraDireita, larguraEsquerda, inclinacao);

            //* Exibe os dados coletados sobre o obstáculo
            obstaculo.exibirObstaculo();

            //* Retorna a criação do objeto para 'obstaculo'
            return obstaculo;
        }

        //* Adicionando o consumo de bateria e distância quando não há obstáculos a frente
        double distancia = (Math.random() * 401) + 100;
        rover.moverParaFrente(distancia);
        Thread.sleep(1000);

        return null;
    }
}