package Aula_3_If_While_For_Case_Operadores.Exercícios;

import java.util.Scanner;

public class Exercicio_4_2 {
    public static void main(String[] args) {
        double d1, d2, d3, r1, r2, r3, mediaAritmetica, mediaPonderada;
        int selecao;

        Scanner inputkeyboard = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Média Aritmética");
            System.out.println("2 - Média Ponderada");
            System.out.println("3 - Encerrar o Programa");
            System.out.print("Opção - ");
            selecao = inputkeyboard.nextInt();

            switch (selecao) { // Compara o valor da variável "selecao" com os casos abaixo:
                case 1: // Valor = 1, faz:
                    System.out.println();
                    System.out.print("Insira a distância percorrida no 1° Treino (km) - ");
                    d1 = inputkeyboard.nextDouble();

                    System.out.println();
                    System.out.print("Insira a distância percorrida no 2° Treino (km) - ");
                    d2 = inputkeyboard.nextDouble();

                    System.out.println();
                    System.out.print("Insira a distância percorrida no 2° Treino (km) - ");
                    d3 = inputkeyboard.nextDouble();

                    mediaAritmetica = (d1+d2+d3)/3;

                    System.out.println();
                    System.out.printf("A Média Aritimética das distâncias percorridas nos treinos da semana é de %.1f km\n", mediaAritmetica);
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 2: // Valor = 2, faz:
                    System.out.println();
                    System.out.print("Insira a distância percorrida no 1° Treino (km) - ");
                    d1 = inputkeyboard.nextDouble();
                    System.out.print("E o ritmo do 1° Treino (min/km) - ");
                    r1 = inputkeyboard.nextDouble();

                    System.out.println();
                    System.out.print("Insira a distância percorrida no 2° Treino (km) - ");
                    d2 = inputkeyboard.nextDouble();
                    System.out.print("E o ritmo do 2° Treino (min/km) - ");
                    r2 = inputkeyboard.nextDouble();

                    System.out.println();
                    System.out.print("Insira a distância percorrida no 3° Treino (km) - ");
                    d3 = inputkeyboard.nextDouble();
                    System.out.print("E o ritmo do 3° Treino (min/km) - ");
                    r3 = inputkeyboard.nextDouble();

                    mediaPonderada = ((d1*r1) + (d2*r2) + (d3*r3))/(d1+d2+d3);

                    System.out.println();
                    System.out.printf("A Média Ponderada dos trechos percorridas nos treinos da semana é de %.1f\n", mediaPonderada);
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 3: // Valor = 3, faz:
                    System.out.println();
                    System.out.println("Programa encerrado!!");
                    System.out.println();
                    break;
                default: // Valor diferente de 1, 2 ou 3, faz:
                    System.out.println();
                    System.out.println("Opção inválida!!");
                    System.out.println();
                    break;
            }
        } while(selecao != 3);

        inputkeyboard.close();
    }
}