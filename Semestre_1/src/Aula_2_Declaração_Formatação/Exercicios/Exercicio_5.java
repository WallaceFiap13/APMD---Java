package Aula_2_Declaração_Formatação.Exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        double peso_kg, peso_g;

        Scanner input_keyboard = new Scanner(System.in);

        System.err.println("");
        System.err.print("Insira o seu peso atual (Kg): ");

        peso_kg = input_keyboard.nextDouble();

        peso_g = peso_kg * 1000;

        System.err.println("");
        System.err.printf("%s%.2f g\n", "Peso final em gramas = ", peso_g);
        System.err.println("");

        input_keyboard.close();
    }
}
