package org.banzak.pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;

    public String imprimirDadosDaPessoa() {
        return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf;
    }
}
