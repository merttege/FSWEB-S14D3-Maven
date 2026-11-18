package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)){
            return false;
        }
        Car other = (Car) obj;
        return this.name.equals(other.name) && this.cylinders == other.cylinders;
    }

    public String startEngine(){
        return "the car's engine is starting";
    }
    public String accelerate(){
        return "the car is accelerating";
    }
    public String brake(){
        return "the car is braking";
    }
}