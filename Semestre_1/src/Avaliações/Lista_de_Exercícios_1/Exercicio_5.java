package Avaliações.Lista_de_Exercícios_1;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        double valor, valor_s, media;
        valor_s = 0;

        Scanner inputkeyboard = new Scanner(System.in);

        System.out.println("");
        System.out.println("Insira os valores consecutivos de IQAr dos 5 dias da semana:");

        valor = inputkeyboard.nextDouble();
        valor_s += valor;

        valor = inputkeyboard.nextDouble();
        valor_s += valor;

        valor = inputkeyboard.nextDouble();
        valor_s += valor;

        valor = inputkeyboard.nextDouble();
        valor_s += valor;

        valor = inputkeyboard.nextDouble();
        valor_s += valor;

        media = valor_s/5;

        if (media >= 0 && media <= 40) {
            System.out.println("");
            System.out.println("IQAr - Bom");
            System.out.println("");
        }
        else if (media >= 41 && media <= 80) {
            System.out.println("");
            System.out.println("IQAr - Moderado");
            System.out.println("");
        }
        else if (media >= 81 && media <= 120) {
            System.out.println("");
            System.out.println("IQAr - Ruim");
            System.out.println("");
        }
        else if (media >= 121 && media <= 200) {
            System.out.println("");
            System.out.println("IQAr - Muito Ruim");
            System.out.println("");
        }
        else if (media >= 201){
            System.out.println("");
            System.out.println("IQAr - Péssimo");
            System.out.println("");
        }

        inputkeyboard.close();
    }
}
