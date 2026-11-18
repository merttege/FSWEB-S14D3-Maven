package org.example.arge;

public class ElectricCar extends CarSkeleton{
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize, String name, String description){
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine(){
        return "Car is powered.";
    }
    @Override
    protected void runEngine(){
        System.out.println("Car is running.");
    }
}
