//Все элементы массива поделить на значение наибольшего элемента этого массива.
package lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task_17 {
    public static void main(String[] args) {
        int i, y = (int) Math.pow((int) (Math.random() * 10 + 2), 2);
        double max = 0;
        double[] array = new double[y];
        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow((int) (Math.random() * 10 + 1), 2);
        }
        System.out.println("Array of random numbers:\n".concat(Arrays.toString(array)));
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
        for (i = 0; i < array.length; i++) {
            array[i] = new BigDecimal(array[i] / max).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        System.out.println("An array, each element of which is divided by the value of a larger element:\n".concat(Arrays.toString(array)));
    }
}
