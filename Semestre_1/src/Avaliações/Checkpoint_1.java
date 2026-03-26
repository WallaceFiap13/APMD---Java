package Avaliações;

import java.util.Scanner;

public class Checkpoint_1 {
    public static void main(String[] args) {
        double totalInvest, valorSolicitado, valorFinal;
        int qtdInvest = 0, continuar;

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.print("\nInsira o valor total disponível para investimentos: ");
        totalInvest = inputKeyboard.nextDouble();

        valorFinal = totalInvest;

        System.out.print("\nIniciado a rodada de investimentos");

        do{
            System.out.print("\nQual o valor do investimento? ");
            valorSolicitado = inputKeyboard.nextDouble();

            if (valorSolicitado > (0.25 * totalInvest)) {
                System.out.printf("\nInvestimento não efetivado, pois excede a 25%% do investimento ( máximo R$ %.2f )", (0.25* totalInvest));
            }
            else {
                valorFinal = valorFinal - valorSolicitado;
                qtdInvest ++;
                System.out.print("\nValor restante em caixa = R$ " + valorFinal);
            }

            System.out.print("\nGostaria de continuar a rodada de investimentos? Se sim, digite 1: ");
            continuar = inputKeyboard.nextInt();

            if (continuar !=1){
                System.out.print("\nEncerrada a rodada de investimentos");
                System.out.printf("\nForam atendidos %d investimentos restando em caixa R$ %.1f", qtdInvest, valorFinal);
            }
        } while(continuar == 1);

        inputKeyboard.close();
    }
}
