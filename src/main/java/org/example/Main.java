package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasPoweredCar = new GasPoweredCar(15.5, 4, "Suzuki", "Swift");
        CarSkeleton electricCar = new ElectricCar(350.5, 65, "Tesla", "Model 3");
        CarSkeleton hybridCar = new HybridCar(25.5, 15, 4, "Toyota", "Corolla");

        gasPoweredCar.startEngine();
        electricCar.startEngine();
        hybridCar.startEngine();

        gasPoweredCar.drive();
        electricCar.drive();
        hybridCar.drive();

        System.out.println(gasPoweredCar.getClass().getSimpleName());
        System.out.println(electricCar.getClass().getSimpleName());
        System.out.println(hybridCar.getClass().getSimpleName());
    }

}