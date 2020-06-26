package Lesson_4.util;

import Lesson_4.domain.Car;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarUtil {
    public static final String PASSENGER_CAR = "Passenger car";
    public static final String TRUCK = "Truck";
    public static final String PASSENGER_TRUCK = "Passenger and truck car"; //грузопассажирский
    public static final String SPECIAL_CAR = "Special car";
    public static final String PETROL_ENGINE = "Petrol engine";
    public static final String DIESEL_ENGINE = "Diesel engine";
    public static final String MIXED_ENGINE = "Mixed engine";
    //1st variant generation of the car
    public static Car generateCar() {
        Car car = new Car();
        System.out.printf("Country of origin: %s\n", Car.getCountryOrigin());
        car.setCarEngineVolume(generateEngVlm(car));
        car.setCarWeight(generateCarWeight(car));
        car.setVechicleType(generateCarType(car));
        car.setCarPassengersQuantity(generatePasQnt(car));
        car.setVechicleEngineType(generateEngType(car));
        generateMoving();
        generateUseHeadLights();
        generateSndSngl();
        return car;
    }
    //2nd variant generation of the car
    public static Car generate() {
        Car car = new Car();
        System.out.printf("Country of origin: %s\n", Car.getCountryOrigin());
        generateMoving();
        generateUseHeadLights();
        generateSndSngl();
        return new Car(generateFuel(), generateMaterial(car), generateCarType(car), generateEngType(car), generatePasQnt(car), generateCarWeight(car), generateEngVlm(car));
    }

    public static void generateUseHeadLights() {
        int randomUseHdLghts = (int) (Math.random() * 2 + 1);
        switch (randomUseHdLghts) {
            case 1 -> System.out.println("headlights on!");
            case 2 -> System.out.println("headlights off!");
        }
    }

    public static void generateMoving() {
        int randomMov = (int) (Math.random() * 2 + 1);
        switch (randomMov) {
            case 1 -> System.out.println("The vechicle in motion!");
            case 2 -> System.out.println("The vechicle stopped!");
        }
    }

    public static void generateSndSngl() {
        System.out.print("Sound signal: ");
        int randomSndSngl = (int) (Math.random() * 3 + 1);
        switch (randomSndSngl) {
            case 1 -> System.out.println("Beep! Beep!");
            case 2 -> System.out.println("Beeeeeeeeeeeeep!");
            case 3 -> System.out.println("Boom! Crash!");
        }
    }

    public static String generateMaterial(Car car) {
        int randomMat = (int) (Math.random() * 2 + 1);
        String typeMat = switch (randomMat) {
            case 1 -> "Steel!";
            case 2 -> "Titanium!";
            default -> "Aluminium!";
        };
        car.setMaterial(typeMat);
        return car.getMaterial();
    }

    public static double generateFuel() {
        double volumeFuel = Math.random() * 40;
        return new BigDecimal(volumeFuel).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static String generateEngType(Car car) {
        int randomEngType = (int) (Math.random() * 2 + 1);
        switch (randomEngType) {
            case 1 -> car.setVechicleEngineType(DIESEL_ENGINE);
            case 2 -> car.setVechicleEngineType(PETROL_ENGINE);
            default -> car.setVechicleEngineType(MIXED_ENGINE);
        }
        return car.getVechicleEngineType();
    }

    public static int generatePasQnt(Car car) {
        switch (generateCarType(car)) {
            case PASSENGER_CAR -> car.setCarPassengersQuantity((int) (Math.random() * 9 + 1)); //0...9 passengers
            case TRUCK -> car.setCarPassengersQuantity((int) (Math.random() * 2 + 1)); //1...2
            case PASSENGER_TRUCK -> car.setCarPassengersQuantity((int) (Math.random() * 22 + 10)); //10...31
            case SPECIAL_CAR -> car.setCarPassengersQuantity((int) (Math.random() * 2 + 1)); //1...2
        }
        return car.getCarPassengersQuantity();
    }

    public static String generateCarType(Car car) {
        if (generateCarWeight(car) < 2000) {
            car.setVechicleType(PASSENGER_CAR);
        } else if (generateCarWeight(car) >= 2000 && generateCarWeight(car) < 5000) {
            car.setVechicleType(PASSENGER_TRUCK);
        } else if (generateCarWeight(car) >= 5000 && generateCarWeight(car) < 10000) {
            car.setVechicleType(TRUCK);
        } else if (generateCarWeight(car) >= 10000) {
            car.setVechicleType(SPECIAL_CAR);
        }
        return car.getVechicleType();
    }

    public static double generateCarWeight(Car car) {
        if (generateEngVlm(car) < 2200) {
            car.setCarWeight((int) (Math.random() * 11 + 10) * 100); //1000...2000 kg - passenger
        } else if (generateEngVlm(car) >= 2200 && generateEngVlm(car) < 2800) {
            car.setCarWeight((int) (Math.random() * 31 + 20) * 100); //2000...5000 kg - pass & truck
        } else if (generateEngVlm(car) >= 2800 && generateEngVlm(car) < 3500) {
            car.setCarWeight((int) (Math.random() * 51 + 50) * 100); //5000...10000 kg - truck
        } else if (generateEngVlm(car) >= 3500) {
            car.setCarWeight((int) (Math.random() * 3 + 1) * 10000); //10000...30000 - special (for example, truck crane ~ m = 15...30 tons (*1000 kg))
        }
        return car.getCarWeight();
    }

    public static double generateEngVlm(Car car) {
        car.setCarEngineVolume((int) (Math.random() * 10 + 1) * 500);
        return car.getCarEngineVolume();
    }

}
