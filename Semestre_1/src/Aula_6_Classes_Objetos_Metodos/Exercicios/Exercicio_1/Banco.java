package Aula_6_Classes_Objetos_Metodos.Exercicios.Exercicio_1;

public class Banco {
    public static void main(String[] args) {

        //* Criação do Objeto c1 na Classe Conta Bancária
        ContaBancaria c1 = new ContaBancaria();
        c1.nomeTitular = "Ana Silva";
        c1.numeroDaConta = 1234;
        c1.saldo = 4500;

        //* Criação do Objeto c2 na Classe Conta Bancária
        ContaBancaria c2 = new ContaBancaria();
        c2.nomeTitular = "Paulo Santos";
        c2.numeroDaConta = 4567;
        c2.saldo = 2500;
        
        c1.exibirDados();
        c2.exibirDados();

        //* Transferência do Paulo para Ana de R$ 1.000,00
        c2.transferir(1000, c1);

        c1.exibirDados();
        c2.exibirDados();
    }
}
