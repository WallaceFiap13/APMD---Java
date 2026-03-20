package Avaliações.Checkpoint_1.Lista_de_Exercícios_1;

public class Exercicio_3 {
    public static void main(String[] args) {
        double V, I, P;

        V = 2.2e2; // Forma de representar a potênciação de 2.2 * 10^2
        I = 1.5e-1; // Forma de representar a potênciação de 1.5 * 10^-1

        P = V*I;

        System.out.println("");
        System.out.printf("O valor da potência é de: %.1f w\n", P);
        System.out.println("");
    }
}
