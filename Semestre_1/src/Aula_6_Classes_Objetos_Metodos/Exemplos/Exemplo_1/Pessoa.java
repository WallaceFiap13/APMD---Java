package Aula_6_Classes_Objetos_Metodos.Exemplos.Exemplo_1;

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