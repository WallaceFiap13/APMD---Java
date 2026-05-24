package Aula_7_Metodos_Construtores.Exemplo_1;

public class Banco {
    public static void main(String[] args) {
        //* Criação de dois objetos da classe ContaBancaria
        ContaBancaria c1 = new ContaBancaria("Paulo", 1500);
        ContaBancaria c2 = new ContaBancaria("Julia", 5000);

        //* Exibir os dados dos objetos
        System.out.println(c1);
        System.out.println(c2);
    }
}