package br.com.brenocosta;

public class Main {
    public static void main(String[] args) {
        CarFactory luxuryFactory = new LuxuryCarFactory();
        Car luxuryCar = luxuryFactory.createCar();
        luxuryCar.drive(); // Output: Driving a Sedan (ou SUV)

        CarFactory economyFactory = new EconomyCarFactory();
        Car economyCar = economyFactory.createCar();
        economyCar.drive(); // Output: Driving an SUV (ou Sedan)
    }
}