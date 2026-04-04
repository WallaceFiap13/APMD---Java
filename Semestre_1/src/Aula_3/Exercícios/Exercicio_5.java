package Aula_3.Exercícios;

public class Exercicio_5 {
    public static void main(String[] args) {
        double C, F;

        System.out.println("\nTabela de conversão de Fahrenheit para Celsius de 100°F a 150°F\n");
        for (F = 100; F <= 150; F++) {
            C = ((double)5/9)*(F-32);
            System.out.printf("%.1f°F = %.1f°C\n", F, C);
        }
        System.out.println("");
    }
}