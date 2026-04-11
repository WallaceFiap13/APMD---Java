package Aula_4_Funções.Exercícios;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        double nota_1, nota_2;

        Scanner inputKeyboard = new Scanner(System.in);

        for(int contador=1; contador<=4; contador++){
            System.out.println("\nAluno " + contador);

            System.out.print("Nota 1: ");
            nota_1 = inputKeyboard.nextDouble();

            System.out.print("Nota 2: ");
            nota_2 = inputKeyboard.nextDouble();

            System.out.printf("A média da nota do Aluno %d é: %.2f\n", contador, media_com_pesos(nota_1, nota_2));
        }
        inputKeyboard.close();
    }

    public static double media_com_pesos(double nota_1, double nota_2){
        double media;

        media = (nota_1*4 + nota_2*6)/10;

        return media;
    }
}
