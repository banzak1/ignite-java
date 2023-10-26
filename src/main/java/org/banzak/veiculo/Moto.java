package org.banzak.veiculo;

public class Moto implements Veiculo{
    @Override
    public void acelerar() {
        System.out.printf("Acelerando a moto\n");

    }

    @Override
    public void frear() {
        System.out.println("Freando a moto");

    }
}
