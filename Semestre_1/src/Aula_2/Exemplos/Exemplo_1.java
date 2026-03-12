package Aula_2.Exemplos;

public class Exemplo_1 {
    public static void main(String[] args) {
        double x, y, z, w, M, Mn; // Declarando as variáveis x,y,z,w como reais
        int m, n = 1; // Declarando m, n como inteiros e atribuindo valor a n
        x = 3.2;
        y = x * 2;
        z = (x + y)/ 2;
        w = x + y/ 2;
        m = n/2; // Inteiro dividido por inteiro resulta em inteiro, não pega as casas decimais
        M = n/2; // Mesmo colocando a variável que vai armazenar como real, a conta ainda gera só inteiro
        Mn = (double) n/2; // Agora a gente considera n como real e a conta resulta em real, guardando em Mn que é real


        System.out.println("");
        System.out.println("Valor dado de X = " + x);
        System.out.println("Valor calculado de Y = " + y);
        System.out.println("Valor calculado de Z = " + z);
        System.out.println("Valor calculado de W = " + w);
        System.out.println("Valor calculado de M = " + m);
        System.out.println("Valor calculado de M = " + M);
        System.out.println("Valor calculado de M = " + Mn);
        System.out.println("");
    }
}