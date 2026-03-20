package Avaliações.Checkpoint_1.Lista_de_Exercícios_1;

public class Exercicio_2 {
    public static void main(String[] args) {
        short t1, t2;
        int tQuad1, tQuad2;
        double s1, s2;

        t1 = 2;
        t2 = 20;

        tQuad1 = t1*t1;
        tQuad2 = t2*t2;

        s1 = ((double)1/2)*9.8*tQuad1;

        s2 = ((double)1/2)*9.8*tQuad2;

        System.out.println("");
        System.out.printf("Distância 1 = %.1f m\n", s1);

        System.out.println("");
        System.out.printf("Distância 2 = %.1f m\n", s2);
        System.out.println("");
    }
}
