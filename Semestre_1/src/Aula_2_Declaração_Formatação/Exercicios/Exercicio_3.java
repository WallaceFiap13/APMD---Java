package Aula_2_Declaração_Formatação.Exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        double salario_i, comissao, salario_f, vendas;

        Scanner input_keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.print("Insira o valor do seu salário fixo (R$): ");
        salario_i = input_keyboard.nextDouble();

        System.out.print("Insira o valor do suas vendas (R$): ");
        vendas = input_keyboard.nextDouble();

        comissao = 0.04 * vendas;
        salario_f = salario_i + comissao;

        System.out.println("");
        System.err.printf("%s%.2f\n", "Comissão em cima das vendas: R$ ", comissao);
        System.out.printf("%s%.2f\n", "Salário final; R$ ", salario_f);
        System.out.println("");

        input_keyboard.close();
    }
}