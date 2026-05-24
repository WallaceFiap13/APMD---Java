package Aula_7_Metodos_Construtores.Exemplo_1;

public class ContaBancaria {
    String nome;
    double saldo;

    //* Assim, podemos criar um objeto dessa classe mais facilmente
    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    //! Permitimos criar o objeto somente com o nome, sem o saldo, chamando o construtor sobrecarregado
    public ContaBancaria(String nome) {
        this(nome, 0);
    }

    //* Método que consegue imprimir as informações do objeto
    public String toString() {
        return "Nome: " + nome + ", Saldo = R$ " + saldo;
    }
}