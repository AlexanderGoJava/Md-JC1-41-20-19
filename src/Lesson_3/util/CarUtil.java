package Lesson_3.util;

import Lesson_3.domain.Car;

public class CarUtil {
    public static final String PASSENGER_CAR = "Passenger car";
    public static final String TRUCK = "Truck";
    public static final String PASSENGER_TRUCK = "Passenger and truck car"; //грузопассажирский
    public static final String SPECIAL_CAR = "Special car";
    public static final String PETROL_ENGINE = "Petrol engine";
    public static final String DIESEL_ENGINE = "Diesel engine";
    public static final String MIXED_ENGINE = "Mixed engine";

    public static Car generateCar() {
        Car car = new Car();
        System.out.printf("Country of origin: %s\n", Car.getCountryOrigin());
        car.setCarEngineVolume(generateEngVlm(car));
        car.setCarWeight(generateCarWeight(car));
        car.setCarType(generateCarType(car));
        car.setCarPassengersQuantity(generatePasQnt(car));
        car.setCarEngineType(generateEngType(car));
        return car;
    }

    public static Car generate(Car car) {
        return new Car(generateCarType(car), generateEngType(car), generatePasQnt(car), generateCarWeight(car), generateEngVlm(car));
    }

    public static String generateEngType(Car car) {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 1 -> car.setCarEngineType(DIESEL_ENGINE);
            case 2 -> car.setCarEngineType(PETROL_ENGINE);
            default -> car.setCarEngineType(MIXED_ENGINE);
        }
        return car.getCarEngineType();
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
            car.setCarType(PASSENGER_CAR);
        } else if (generateCarWeight(car) >= 2000 && generateCarWeight(car) < 5000) {
            car.setCarType(PASSENGER_TRUCK);
        } else if (generateCarWeight(car) >= 5000 && generateCarWeight(car) < 10000) {
            car.setCarType(TRUCK);
        } else if (generateCarWeight(car) >= 10000) {
            car.setCarType(SPECIAL_CAR);
        }
        return car.getCarType();
    }

    public static double generateCarWeight(Car car) {
        if (generateEngVlm(car) < 2200) {
            car.setCarWeight((int) (Math.random() * 11 + 10) * 100); //1000...2000 kg - passenger
        } else if (generateEngVlm(car) >= 2200 && generateEngVlm(car) < 2800) {
            car.setCarWeight((int) (Math.random() * 31 + 20) * 100); //2000...5000 kg - pass & truck
        } else if (generateEngVlm(car) >= 2800 && generateEngVlm(car) < 3500) {
            car.setCarWeight((int) (Math.random() * 51 + 50) * 100); //5000...10000 kg - truck
        } else if (generateEngVlm(car) >= 3500) {
            car.setCarWeight((int) (Math.random() * 4) * 10000); //10000...30000 - special (for example, truck crane ~ m = 15...30 tons (*1000 kg))
        }
        return car.getCarWeight();
    }

    public static double generateEngVlm(Car car) {
        car.setCarEngineVolume((int) (Math.random() * 10 + 1) * 500);
        return car.getCarEngineVolume();
    }

//    public static void showCar(Car car) {
//        System.out.println(car);
//    }

}
