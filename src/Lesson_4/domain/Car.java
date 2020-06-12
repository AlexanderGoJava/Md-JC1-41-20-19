package Lesson_4.domain;

public class Car  {

    private static final String COUNTRY_ORIGIN = "Germany";

    private String carType;
    private String carEngineType;
    private int carPassengersQuantity;
    private double carWeight;
    private double carEngineVolume;

    public Car() {
    }

    public Car(String carType, String carEngineType, int carPassengersQuantity,double carWeight, double carEngineVolume) {
        this.carType = carType;
        this.carEngineType = carEngineType;
        this.carPassengersQuantity = carPassengersQuantity;
        this.carWeight = carWeight;
        this.carEngineVolume = carEngineVolume;
    }

    public static String getCountryOrigin() {
        return COUNTRY_ORIGIN;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarEngineType() {
        return carEngineType;
    }

    public void setCarEngineType(String carEngineType) {
        this.carEngineType = carEngineType;
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
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carEngineType='" + carEngineType + '\'' +
                ", carPassengersQuantity=" + carPassengersQuantity +
                ", carWeight=" + carWeight +
                ", carEngineVolume=" + carEngineVolume +
                '}';
    }
}
