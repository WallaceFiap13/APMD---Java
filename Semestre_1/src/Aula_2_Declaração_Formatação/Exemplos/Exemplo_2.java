package Aula_2_Declaração_Formatação.Exemplos;

import java.util.Scanner;

public class Exemplo_2 {
    public static void main(String[] args) {
        int qtd;
        double price;
        double compra;

        Scanner input_keyboard = new Scanner(System.in); // o .in lê informações vindas do teclado

        System.out.print("Insira a quantidade do produto: ");
        qtd = input_keyboard.nextInt();

        System.out.print("Insira a preço do produto (em R$): ");
        price = input_keyboard.nextDouble();

        compra = qtd * price;
        System.out.printf("%s%.2f\n","O valor da compra é: R$ ", compra);

        input_keyboard.close(); // Libera a memória desse objeto, indicamos que não utilizamos mais ela
    }
}