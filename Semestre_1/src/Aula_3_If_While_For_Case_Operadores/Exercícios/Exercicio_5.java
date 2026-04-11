package Aula_3_If_While_For_Case_Operadores.Exercícios;

public class Exercicio_5 {
    public static void main(String[] args) {
        double C, F;
        // double F_1;

        // do{
        //     F_1 = 100;
        //     C = ((double)5/9)*(F_1-32);
        //     System.out.printf("%.1f°F = %.1f°C\n", F_1, C);
        //     F_1++;
        // } while (F_1 <=150);

        // Envés de fazer isso a cima com o while, fazemos a opção abaixo com for

        System.out.println("\nTabela de conversão de Fahrenheit para Celsius de 100°F a 150°F\n");
        for (F = 100; F <= 150; F++) {
            C = ((double)5/9)*(F-32);
            System.out.printf("%.1f°F = %.1f°C\n", F, C);
        }
        System.out.println("");
    }
}