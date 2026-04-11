package Aula_4_Funções.Exercícios;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        double nota_1, nota_2;

        Scanner inputKeyboard = new Scanner(System.in);

        for(int contador=1; contador<=4; contador++){
            System.out.println("\nAluno " + contador);

            do{
                System.out.print("Nota 1: ");
                nota_1 = inputKeyboard.nextDouble();
                if(nota_1 <0 || nota_1 >10){
                    System.out.println("Input inválido, digite um valor entre 0 e 10");
                }
            } while(nota_1 <0 || nota_1 >10);

            do{
                System.out.print("Nota 2: ");
                nota_2 = inputKeyboard.nextDouble();
                if(nota_2 <0 || nota_2 >10){
                    System.out.println("Input inválido, digite um valor entre 0 e 10");
                }
            } while(nota_2 <0 || nota_2 >10);

            //Não esquecer que para valores inteiros formatados usamos o %d (tem no material "aula 2" todos os formatos)
            System.out.printf("A média da nota do Aluno %d é: %.2f (%c)\n", contador, media_com_pesos(nota_1, nota_2), conceito(media_com_pesos(nota_1, nota_2)));
        }
        inputKeyboard.close();
    }

    public static double media_com_pesos(double nota_1, double nota_2){
        return ((nota_1*4 + nota_2*6)/10);
    }

    public static char conceito(double media){ // char de character
        if(media >= 8.5){
            return 'E';
        }
        else if(media >=5){
            return 'B';
        }
        else{
            return 'R';
        }
    }
}
