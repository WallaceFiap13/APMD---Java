package Aula_3.Exercícios;

import java.util.Scanner;

public class Exercício_4 {
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

            do{
                selecao = inputkeyboard.nextInt();

                if(selecao <1 || selecao >3){
                    System.out.println();
                    System.out.println();
                    System.err.println("Opção inválida, selecione entre as opções 1, 2 ou 3:");
                    System.out.println("1 - Média Aritmética");
                    System.out.println("2 - Média Ponderada");
                    System.out.println("3 - Encerrar o Programa");
                    System.out.print("Opção - ");
                }
            } while(selecao <1 || selecao >3);

            if(selecao == 1){
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
            }

            else if(selecao == 2){
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
            }

            else{
                System.out.println();
                System.out.println("Programa encerrado!!");
                System.out.println();
            }
        } while(selecao != 3);

        inputkeyboard.close();
    }
}