package Avaliações.Lista_de_Exercícios_1;

import java.util.Scanner;

public class Exercicios_7 {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner inputkeyboard = new Scanner(System.in);

        do{
            System.out.println("");
            System.out.print("Insira o seu peso em kg (digite -1 para encerrar o programa): ");
            peso = inputkeyboard.nextDouble();

            System.out.print("Insiraa sua altura em metros: ");
            altura = inputkeyboard.nextDouble();

            imc = peso / (altura * altura);

            if (imc < 18.5) {
                System.out.println("");
                System.out.println("Baixo Peso");
            }
            else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("");
                System.out.println("Peso Normal");
            }
            else if (imc >= 25 && imc <= 29.9) {
                System.out.println("");
                System.out.println("Sobrepeso");
            }
            else if (imc >= 30) {
                System.out.println("");
                System.out.println("Obeso");
            }

        } while(peso != -1);

        inputkeyboard.close();
    }
}
