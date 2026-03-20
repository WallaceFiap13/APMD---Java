package Avaliações.Lista_de_Exercícios_1;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        double minutos, min, max, amplitude;
        min = 0;
        max = 0;


        Scanner inputkeyboard = new Scanner(System.in);

        do{
            System.out.println("");
            System.out.print("Insira o tempo em minutos - ");
            minutos = inputkeyboard.nextDouble();

            if (minutos > 0) {
                if (min == 0) {
                    min = minutos;
                }
                else {
                    if(minutos < min){
                        min = minutos;
                    }
                }

                if (max == 0) {
                    max = minutos;
                }
                else{
                    if (minutos > max) {
                        max = minutos;
                    }
                }
            }
            else if (minutos == -1){
                break;
            }
            else {
                System.out.println("Insira um valor válido para minutos (maior que 0)");
            }
        } while(minutos != -1);

        amplitude = max - min;

        System.out.println("");
        System.out.printf("Tempo Mínimo - %.1f minutos\n", min);
        System.out.printf("Tempo Máximo - %.1f minutos\n", max);
        System.out.printf("Amplitude de tempo - %.1f minutos\n", amplitude);

        inputkeyboard.close();
    }
}
