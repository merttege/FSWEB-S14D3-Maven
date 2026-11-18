package org.example.arge;

public class HybridCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders, String name, String description){
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }
    public int getBatterySize() {
        return batterySize;
    }
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine(){
        return "Engine and battery is on.";
    }
    @Override
    protected void runEngine(){
        System.out.println("Engine and battery is running.");
    }
}
