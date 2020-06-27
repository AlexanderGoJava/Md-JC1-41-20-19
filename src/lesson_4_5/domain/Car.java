package lesson_4_5.domain;

import lesson_4_5.interfaces.MeasStopDist;
import lesson_4_5.interfaces.PrintTechChar;

import java.io.IOException;
import java.util.Objects;

public class Car extends Vehicle implements PrintTechChar, MeasStopDist {

    private static final String COUNTRY_ORIGIN = "Germany";

    private int carPassengersQuantity;
    private double carWeight;
    private double carEngineVolume;

    public Car() {
    }

    public Car(double fuel, String material, String vechicleType, String vechicleEngineType, int carPassengersQuantity, double carWeight, double carEngineVolume) {
        super(fuel, material, vechicleType, vechicleEngineType);
        this.carPassengersQuantity = carPassengersQuantity;
        this.carWeight = carWeight;
        this.carEngineVolume = carEngineVolume;
    }

    public static String getCountryOrigin() {
        return COUNTRY_ORIGIN;
    }

    public int getCarPassengersQuantity() {
        return carPassengersQuantity;
    }

    public void setCarPassengersQuantity(int carPassengersQuantity) {
        this.carPassengersQuantity = carPassengersQuantity;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public double getCarEngineVolume() {
        return carEngineVolume;
    }

    public void setCarEngineVolume(double carEngineVolume) {
        this.carEngineVolume = carEngineVolume;
    }

    @Override
    public String getVechicleType() {
        return super.getVechicleType();
    }

    @Override
    public void setVechicleType(String vechicleType) {
        super.setVechicleType(vechicleType);
    }

    @Override
    public String getVechicleEngineType() {
        return super.getVechicleEngineType();
    }

    @Override
    public void setVechicleEngineType(String vechicleEngineType) {
        super.setVechicleEngineType(vechicleEngineType);
    }

    @Override
    public void makeFuel() {
        System.out.print("Type of fuel: ");
        int randomFuelValue = (int)(Math.random() * 4 + 1);
        switch (randomFuelValue) {
            case 1 -> System.out.println("diesel!");
            case 2 -> System.out.println("petrol!");
            case 3 -> System.out.println("gas!");
            case 4 -> System.out.println("electricity!");
        }
    }

    @Override
    protected void makeMaterial() {
        System.out.print("The car body made of: ");
        int randomMaterialValue = (int)(Math.random() * 2 + 1);
        switch (randomMaterialValue) {
            case 1 -> System.out.println("steel!");
            case 2 -> System.out.println("aluminum!");
        }
    }

    @Override
    public double getFuel() {
        return super.getFuel();
    }

    @Override
    public void setFuel(double fuel) {
        super.setFuel(fuel);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carPassengersQuantity=" + carPassengersQuantity +
                ", carWeight=" + carWeight +
                ", carEngineVolume=" + carEngineVolume +
                ", vechicleType='" + vechicleType + '\'' +
                ", vechicleEngineType='" + vechicleEngineType + '\'' +
                ", fuel=" + fuel +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return carPassengersQuantity == car.carPassengersQuantity &&
                Double.compare(car.carWeight, carWeight) == 0 &&
                Double.compare(car.carEngineVolume, carEngineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carPassengersQuantity, carWeight, carEngineVolume);
    }

    @Override
    public void printTechChar() {
        System.out.println("Technical characteristics of vechicle: " + toString());
        makeFuel();
        makeMaterial();
    }

    @Override
    public void measStopDist() throws IOException {
        super.measStopDist();
    }
}