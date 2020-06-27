package lesson_4_5.util;

import lesson_4_5.domain.Car;

import java.util.Arrays;

public class ArraySortUtil {
    public static void carArrayFuelSort(Car[] cars) {
        for (int i = 1; i < cars.length; i++) {
            for (int j = cars.length - 1; j >= i; j--) {
                if (cars[j - 1].getFuel() > cars[j].getFuel()) {
                    Car k = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = k;
                }
            }
        }
        System.out.println("Array of cars sorted by increasing fuel volume:\n".concat(Arrays.toString(cars)));
    }

    public static void carArrayWeightSort(Car[] cars) {
        for (int i = 1; i < cars.length; i++) {
            for (int j = cars.length - 1; j >= i; j--) {
                if (cars[j - 1].getCarWeight() > cars[j].getCarWeight()) {
                    Car k = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = k;
                }
            }
        }
        System.out.println("Array of cars sorted by increasing car weight:\n".concat(Arrays.toString(cars)));
    }
}
