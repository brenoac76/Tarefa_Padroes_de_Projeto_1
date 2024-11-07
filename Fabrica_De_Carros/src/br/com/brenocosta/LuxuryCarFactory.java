package br.com.brenocosta;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan(); // ou new SUV(); dependendo da necessidade
    }
}
