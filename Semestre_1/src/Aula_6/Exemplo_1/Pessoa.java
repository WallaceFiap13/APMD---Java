package Aula_6.Exemplo_1;

public class Pessoa {
    String nome;
    int idade;

    //* Método
    public void atualizaNomeDaPessoa(String novoNome){ //* visibilidade tipo nomeDoMetodo(parametros)
        nome = novoNome;
    }

    public void imprimirDadosDaPessoa(){
        System.out.printf("\nPessoa %s tem %d anos", nome, idade);
    }
}