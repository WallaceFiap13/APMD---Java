package Aula_2.Exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        double A, B, b, h;

        Scanner input_keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.print("Insira o valor da base maior do trapézio (cm): ");
        B = input_keyboard.nextDouble();

        System.out.print("Insira o valor da base menor do trapézio (cm): ");
        b = input_keyboard.nextDouble();

        System.out.print("Insira o valor da altura do trapézio (cm): ");
        h = input_keyboard.nextDouble();

        A = ((B+b) * h)/2;

        System.out.println("");
        System.out.printf("%s%.1f cm²\n", "A área do trapézio é: ", A);
        System.out.println("");

        input_keyboard.close();
    }
}
