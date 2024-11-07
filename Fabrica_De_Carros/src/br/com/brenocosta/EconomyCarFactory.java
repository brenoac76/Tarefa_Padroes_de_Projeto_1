package br.com.brenocosta;

public class EconomyCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUV(); // ou new Sedan(); dependendo da necessidade
    }
}
