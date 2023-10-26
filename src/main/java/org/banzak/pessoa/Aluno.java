package org.banzak.pessoa;

public class Aluno extends Pessoa{

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private String matricula;

    public String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é aluno";
    }
}
