package Aula_6_Classes_Objetos_Metodos.Exercicios.Exercicio_1;

public class ContaBancaria {
    //* Atibutos da Classe Conta Bancária
    String nomeTitular;
    int numeroDaConta;
    double saldo;

    //* Método Sacar
    public void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("\nSaque efetuado com sucesso");
        } else {
            System.out.println("\nSaldo insuficiente para o saque");
        }
    }

    //* Método Transferir
    //! Utilizamos o "ContaBancaria c" para trazer ps dados do objeto escolhido para o método
    public void transferir(double transferencia, ContaBancaria c) {
        //! Operação realizada nos atibutos do solicitante
        saldo -= transferencia;
        //! Operação realizada nos atributos de c (conta que foi informada no uso do método)
        c.saldo += transferencia;
    }

    //* Método Depositar
    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.printf("\nValor depositado, seu saldo agora é de R$ %.2f", saldo);
        } else {
            System.out.println("\nTente novamente, valor inválido. Insira um valor maior que 0");
        }
    }

    //* Método Exibir Dados
    public void exibirDados() {
        System.out.printf("\nNome do Titular: %s", nomeTitular);
        System.out.printf("\nNúmero da Conta: %d", numeroDaConta);
        System.out.printf("\nSaldo atual: R$ %.2f\n", saldo);
    }
}