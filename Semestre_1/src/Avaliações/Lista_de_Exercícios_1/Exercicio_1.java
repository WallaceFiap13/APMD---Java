package Avaliações.Lista_de_Exercícios_1;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        double km, min, m, s, velocidadeMedia;

        Scanner inputkeyboard = new Scanner(System.in);

        System.err.println("");
        System.out.print("Insira a distância percorrida em km: ");
        km = inputkeyboard.nextDouble();

        System.err.println("");
        System.out.print("Insira o tempo gasto em minutos para percorrer essa distância: ");
        min = inputkeyboard.nextDouble();

        m = km*1000;
        s = min*60;

        velocidadeMedia = m/s;

        System.err.println("");
        System.out.printf("A velocidade média é de %.1f m/s\n", velocidadeMedia);
        System.err.println("");

        inputkeyboard.close();
    }
}
