package Aula_4_Funções.Exemplos;

import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        int x, y, z, d;

        Scanner inputKeyboard = new Scanner(System.in);

        titulo();

        System.out.print("x: ");
        x = inputKeyboard.nextInt();

        System.out.print("y: ");
        y = inputKeyboard.nextInt();

        System.out.print("z: ");
        z = inputKeyboard.nextInt();

        d = delta(x,y,z); // inputa na função delta os valores de x,y,z respectivamente, para obter o resultado
        System.out.println("Discriminante: " + d);
        inputKeyboard.close();
    }

    public static int delta(int a, int b, int c){
        int cd; // cd é o resultado do calculo de delta que é visto e reconhecido somente dentro dessa função
        cd = b*b - 4*a*c;
        return cd; // joga o valor de cd para aonde a função foi solicitada
    }

    public static void titulo(){ // podemos ter uma função que não tem parâmetros e nem retornos
        System.out.println("Programa para calcular o discriminante de uma função de segundo grau");
    }
}
