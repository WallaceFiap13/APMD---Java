package Aula_2.Exercicios;

public class Exercicio_1 {
    public static void main(String[] args) throws Exception {
        double preco, desconto10;

        preco = 23.5;
        desconto10 = preco * 0.9;

        System.out.printf("%s%.2f\n","O preço com desconto é: R$ ", desconto10);
        // %s - indica que vai vir uma frase em primeiro do print
        // %.2f - formata em duas casas
        // \n para pular linha
    }
}