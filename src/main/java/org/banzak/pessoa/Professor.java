package org.banzak.pessoa;

public class Professor extends Pessoa{

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;

    public String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é professor";
    }
}
