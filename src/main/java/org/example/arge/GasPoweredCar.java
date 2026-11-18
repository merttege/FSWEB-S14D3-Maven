package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders, String name, String description){
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine(){
        return "Engine started.";
    }
    @Override
    protected void runEngine(){
        System.out.println("Engine is running.");
    }
}