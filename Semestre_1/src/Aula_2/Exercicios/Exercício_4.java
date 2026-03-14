package Aula_2.Exercicios;

import java.util.Scanner;

public class Exercício_4 {
    public static void main(String[] args) {
        double peso, emagrecer, engordar;

        Scanner input_keyboard = new Scanner(System.in);

        System.err.println("");
        System.err.print("Insira o seu peso atual (Kg): ");

        peso = input_keyboard.nextDouble();

        engordar = peso * 1.15;
        emagrecer = peso * 0.8;

        // Colocar após a formatação o texto que você quer que apareça após a variável (nesse caso o Kg)
        System.err.println("");
        System.err.printf("%s%.2f Kg\n", "Peso final se engordas 15% = ", engordar);
        System.err.printf("%s%.2f Kg\n", "Peso final se emagrecer 20% = ", emagrecer);
        System.err.println("");

        input_keyboard.close();
    }
}
