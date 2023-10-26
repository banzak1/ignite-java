package org.banzak.veiculo;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.printf("Acelerando o carro\n");

    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }
}
