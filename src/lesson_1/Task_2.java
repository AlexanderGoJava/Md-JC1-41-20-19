//Напишите метод, который будет увеличивать каждый элемент массива на 10%.
package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        double[] array = new double[generateArraySize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber();
        }
        System.out.println("Initial array:\n".concat(Arrays.toString(array)));
        System.out.println("Array after increasing each of its elements by 10%:\n".concat(Arrays.toString(arrayIncrease(array))));
    }

    //method that increases each element of the array by 10%
    public static double[] arrayIncrease(double[] array) {
        final float multiplicator = 1.1f;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multiplicator;
            array[i] = BigDecimal.valueOf(array[i]).setScale(1, RoundingMode.HALF_UP).doubleValue();
        }
        return array;
    }

    //generate random array size
    public static int generateArraySize() {
        return (int) (Math.random() * 10 + 1);
    }

    //generate random number of array cell
    public static int generateNumber() {
        return (int) (Math.random() * 10 + 1);
    }
}
