package Aula_6.Exemplo_1;

public class Aplicacao {
    public static void main(String[] args) {
        //* Objeto
        Pessoa pessoa1 = new Pessoa(); //* Classe objeto = operador atributos
        pessoa1.atualizaNomeDaPessoa("JavaScript");
        pessoa1.idade = 19;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.atualizaNomeDaPessoa("Pedro");
        pessoa2.idade = 18;

        pessoa1.imprimirDadosDaPessoa();
        pessoa2.imprimirDadosDaPessoa();
    }
}