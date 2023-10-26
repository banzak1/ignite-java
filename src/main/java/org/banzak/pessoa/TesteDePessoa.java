package org.banzak.pessoa;
import org.banzak.pessoa.Pessoa;

public class TesteDePessoa {

        public static void main(String[] args) {
            Professor professor = new Professor();
            professor.setCpf("01808657578");
            professor.setNome("Leonardo");
            professor.setIdade(26);
            professor.setSalario(50000);


            System.out.println(professor.imprimirDadosDaPessoa());

            Aluno aluno = new Aluno();
            aluno.setCpf("12568948960");
            aluno.setNome("Jessica");
            aluno.setIdade(25);
            aluno.setMatricula("587559");

            System.out.println(aluno.imprimirDadosDaPessoa());

        }
    }
