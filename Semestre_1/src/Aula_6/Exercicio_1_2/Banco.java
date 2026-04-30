package Aula_6.Exercicio_1_2;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        c1.nomeTitular = "Ana Silva";
        c1.numeroDaConta = 1234;
        c1.saldo = 4500;

        ContaBancaria c2 = new ContaBancaria();
        c2.nomeTitular = "Paulo Santos";
        c2.numeroDaConta = 4567;
        c2.saldo = 2500;

        ContaBancaria c3 = new ContaBancaria();
        c2.nomeTitular = "Lucas Silva";
        c2.numeroDaConta = 8569;
        c2.saldo = 5000;

        // * Loop
        Scanner inputKeyboard = new Scanner(System.in);

        //! Variáveis para guardar as contas escolhidas (objetos da classe ContaBancaria nulos)
        ContaBancaria usuario = null;
        ContaBancaria destinatario = null;

        int selecaoUsuario, selecaoOperacao, selecaoDestinatario, continuar;
        double valor;

        System.err.println("\n********************************************");
        System.err.println("         CAIXA ELETRÔNICO INICIADO");
        System.err.println("********************************************");

        do {
            selecaoOperacao = 0;

            System.out.print("\nInsira o número da conta para entrar: ");
            selecaoUsuario = inputKeyboard.nextInt();

            switch (selecaoUsuario) {
                case 1234: //* usuário Ana Silva
                    usuario = c1;
                    System.out.println("\nBem vindo(a) " + usuario.nomeTitular);
                    break;

                case 4567: //* usuário Paulo Santos
                    usuario = c2;
                    System.out.println("\nBem vindo(a) " + usuario.nomeTitular);
                    break;

                case 8569: //* usuário Lucas Silva
                    usuario = c3;
                    System.out.println("\nBem vindo(a) " + usuario.nomeTitular);
                    break;

                default:
                    System.out.println("\nUsuário não encontrado, tente novamente");
                    selecaoOperacao = 5;
                    break;
            }

            while (selecaoOperacao != 5) {
                System.out.println("\nQual operação deseja fazer?");
                System.out.println("1 - Sacar");
                System.out.println("2 - Transferir");
                System.out.println("3 - Depositar");
                System.out.println("4 - Extrato");
                System.out.println("5 - Encerrar sessão");

                selecaoOperacao = inputKeyboard.nextInt();

                switch (selecaoOperacao) {
                    case 1: //* Chama o método sacar
                        System.out.print("\nInsira o valor do saque: ");
                        valor = inputKeyboard.nextInt();
                        usuario.sacar(valor);
                        break;

                    case 2: //* Chama o método transferir
                        System.out.print("\nInsira o valor da transferência: ");
                        valor = inputKeyboard.nextInt();

                        System.out.print("\nInsira o número da conta do destinatário: ");
                        selecaoDestinatario = inputKeyboard.nextInt();

                        switch (selecaoDestinatario) {
                            case 1234: //* destinatário Ana Silva
                                destinatario = c1;
                                if (usuario == destinatario) {
                                    System.out.println("\nImpossível realizar uma transferência para si mesmo");
                                    break;
                                } else {
                                    usuario.transferir(valor, destinatario);
                                    break;
                                }

                            case 4567: //* destinatário Paulo Santos
                                destinatario = c2;
                                if (usuario == destinatario) {
                                    System.out.println("\nImpossível realizar uma transferência para si mesmo");
                                    break;
                                } else {
                                    usuario.transferir(valor, destinatario);
                                    break;
                                }

                            case 8569: //* destinatário Lucas Silva
                                destinatario = c3;
                                if (usuario == destinatario) {
                                    System.out.println("\nImpossível realizar uma transferência para si mesmo");
                                    break;
                                } else {
                                    usuario.transferir(valor, destinatario);
                                    break;
                                }

                            default:
                                System.out.println("\nDestinatário não encontrado, tente novamente");
                                break;
                        }
                        break;

                    case 3: //* Chama o método depositar
                        System.out.print("\nInsira o valor do deposito: ");
                        valor = inputKeyboard.nextInt();
                        usuario.depositar(valor);
                        break;

                    case 4: //* Chama o método exibirDados
                        usuario.exibirDados();
                        break;

                    case 5: //* Encerra as opções desse usuário
                        System.out.println("\nSessão encerrada, entre enovamente para ter acesso aos serviços");
                        break;

                    default:
                        System.out.println("\nOpção inválida, tente novamente");
                        break;

                }
            }

            System.err.println("\n********************************************");
            System.err.println("Deseja encerrar o programa? Se sim, digite 1");
            System.err.println("********************************************\n");
            continuar = inputKeyboard.nextInt();

            switch (continuar) {
                case 1:
                    System.out.println("\nPrograma encerrado");
                    break;

                default:
                    break;
            }
        } while (continuar != 1);

        inputKeyboard.close();
    }
}