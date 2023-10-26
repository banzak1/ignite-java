package org.banzak.conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    //Getter e Setters
    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //construtor
    public ContaBancaria(){
        this.saldo = 0.0;
    }

    //depositar método
    void depositar(double valor) {
        if(valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + ". Saldo atual R$ " + saldo);
        } else {
            System.out.println("Valor inválido");

        }
    }

    //sacar método
    void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);

        } else {
            System.out.println("Valor inválido");

        }
    }
}
