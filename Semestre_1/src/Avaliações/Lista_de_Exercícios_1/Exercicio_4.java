package Avaliações.Lista_de_Exercícios_1;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        double media;
        int nota, nota_s, qtd_notas;

        nota_s = 0;
        qtd_notas = 0;

        Scanner inputkeyboard = new Scanner(System.in);

        do{
            do{
                System.out.println("");
                System.out.print("Insira a nota do aluno de 0 à 10 (Obs.: digite -1 para encerrar): ");
                nota = inputkeyboard.nextInt();
                
                if (nota >= 0 && nota <= 10) {
                    nota_s += nota;
                    qtd_notas += 1;
                }
                else if (nota == -1){
                    break;
                }
                else{
                    System.out.println("");
                    System.out.println("Valor inválido, insira uma nota de 0 à 10");
                }
            } while (nota >=0 && nota <=10);
        } while(nota != -1);

        media = nota_s/qtd_notas;

        System.out.printf("A média das notas dos alunos é de: %.1f\n", media);
        System.out.printf("A quantidade de notas válidas foi de: %d\n", qtd_notas);

        inputkeyboard.close();
    }
}
