package Aula_3_If_While_For_Case_Operadores.Exercícios;

import java.util.Scanner;

public class Exercicio_1e2 {
    public static void main(String[] args) {
        double valor_i, valor_f, valor_p;
        int pagamento, parcelamento;

        Scanner input_keyboard = new Scanner(System.in);

        System.out.println("");
        System.out.print("Qual o valor da compra (R$)? ");
        valor_i = input_keyboard.nextDouble();

        System.out.println("");
        System.out.print("Qual a forma de pagamento, a vista (1) ou a prazo (2)? ");
        pagamento = input_keyboard.nextInt();

        if (pagamento == 1) { // a vista
            valor_f = valor_i * 0.9;
            System.out.println("");
            System.out.printf("%s%.2f a vista\n", "O valor final da compra é de: R$ ", valor_f);
            System.out.println("");
        }
        else { // a prazo
            System.out.println("");
            System.out.print("Em quantas vezes você quer parcelar a sua compra (parcelamos em até 5 vezes)? ");
            parcelamento = input_keyboard.nextInt();

            if (parcelamento >1 && parcelamento <=3) { // Parcelamento até 3 veze
                valor_f = valor_i;
                // Nova maneira de formatar, mais fácil, escreve a string e adicsiona as variáveis dentro dela com %.0f, %d, %s ou %c
                System.out.println("");
                System.out.printf("O valor da compra é de R$ %.2f (em %d parcelas sem juros)\n", valor_f, parcelamento);
                
                valor_p = valor_f / parcelamento;
                System.out.printf("O valor de cada parcela é de R$ %.2f\n", valor_p);
                System.out.println("");
            }
            else if (parcelamento == 4) { // Parcelamento em 4 vezes
                valor_f = valor_i * 1.05;
                System.out.println("");
                System.out.printf("O valor da compra é de R$ %.2f (em %d parcelas com 5%% de juros)\n", valor_f, parcelamento);

                valor_p = valor_f / parcelamento;
                System.out.printf("O valor de cada parcela é de R$ %.2f\n", valor_p);
                System.out.println("");
            }
            else if (parcelamento == 5){ // Parcelamento em 5 vezes
                valor_f = valor_i * 1.06;
                System.out.println("");
                System.out.printf("O valor da compra é de R$ %.2f (em %d parcelas com 6%% de juros)\n", valor_f, parcelamento);

                valor_p = valor_f / parcelamento;
                System.out.printf("O valor de cada parcela é de R$ %.2f\n", valor_p);
                System.out.println("");
            }
            else { // Cliente colocou fora do esperado
                System.out.println("Insira um valor entre 2 e 5");
                System.out.println("");
            }
        }

        input_keyboard.close();
    }
}