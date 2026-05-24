package Aula_6_Classes_Objetos_Metodos.Exercicios.Exercicio_1_2;

public class ContaBancaria {
    // * Atibutos da Classe Conta Bancária
    String nomeTitular;
    int numeroDaConta;
    double saldo;

    // * Método Sacar
    public void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;

            System.out.println("\n********************************************");
            System.out.println("Saque efetuado com sucesso");
            System.out.println("********************************************");
        } else {
            System.out.println("\n********************************************");
            System.out.println("Saldo insuficiente para o saque");
            System.out.println("********************************************");
        }
    }

    // * Método Transferir
    public void transferir(double transferencia, ContaBancaria c) {
        if (transferencia <= saldo) {
            saldo -= transferencia;

            c.saldo += transferencia;

            System.out.println("\n********************************************");
            System.out.println("Transferência efetuada com sucesso para " + c.nomeTitular);
            System.out.println("********************************************");
        } else {
            System.out.println("\n********************************************");
            System.out.println("Saldo insuficiente para a transferência");
            System.out.println("********************************************");
        }
    }

    // * Método Depositar
    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;

            System.out.println("\n********************************************");
            System.out.println("Depósito efetuado com sucesso");
            System.out.println("********************************************");
        } else {
            System.out.println("\n********************************************");
            System.out.println("Valor inválido, tente novamente. Insira um valor maior que 0");
            System.out.println("********************************************");
        }
    }

    // * Método Exibir Dados
    public void exibirDados() {
        System.out.println("\n********************************************");
        System.out.printf("Nome do Titular: %s", nomeTitular);
        System.out.printf("\nNúmero da Conta: %d", numeroDaConta);
        System.out.printf("\nSaldo atual: R$ %.2f\n", saldo);
        System.out.println("********************************************");
    }
}