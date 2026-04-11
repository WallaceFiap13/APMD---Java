package Aula_3_If_While_For_Case_Operadores.Exemplos;

import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner input_keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.print("Insira o Número 1: ");
        n1 = input_keyboard.nextInt();

        System.out.print("Insira o Número 2: ");
        n2 = input_keyboard.nextInt();

        if (n1 == n2){
            System.out.println("Números iguais");
            System.out.println("");
        }
        else if (n1 > n2) {                 // Seria o Elif do Python
            System.out.println("Número 1 *maior* que o Número 2");
            System.out.println("");
        } 
        else {
            System.out.println("Número 1 *menor* que o Número 2");
            System.out.println("");
        }

        input_keyboard.close();
    }
}
