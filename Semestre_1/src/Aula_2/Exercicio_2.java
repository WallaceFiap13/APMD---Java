package Aula_2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        double F;
        double C;

        Scanner input_keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.println("Programa para converter temperatura de °F para °C");
        System.out.println("");

        System.out.print("Insira a temperatura (°F):  ");
        F = input_keyboard.nextDouble();

        C = ((double) 5/9) * (F - 32); // int/ int trás só a parte inteira, por isso transformar em double

        System.out.printf("%s%.2f\n", "A conversão é: ", C);
        System.out.println("");
    }
}
