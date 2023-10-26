package org.banzak.pessoa;
import org.banzak.pessoa.Pessoa;

public class TesteDePessoa {

        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();
            pessoa.cpf = "01808657578";
            pessoa.nome = "Leonardo";
            pessoa.idade = 26;


            System.out.println(pessoa.imprimirDadosDaPessoa());


            Pessoa pessoa2 = new Pessoa();
            pessoa2.cpf = "01808657578";
            pessoa2.nome = "Jessica";
            pessoa2.idade = 25;

            System.out.println(pessoa2.imprimirDadosDaPessoa());
        }
    }
