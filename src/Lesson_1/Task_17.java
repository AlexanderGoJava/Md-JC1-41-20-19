//Все элементы массива поделить на значение наибольшего элемента этого массива.
package Lesson_1;

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
        System.out.println("Массив случайных чисел:\n".concat(Arrays.toString(array)));
        for (i = 0; i < array.length - 1; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
        }
        System.out.println("Наибольшее число в массиве равно: " + max);
        for (i = 0; i < array.length; i++) {
            array[i] = new BigDecimal(array[i] / max).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        System.out.println("Массив, каждый элемент которого разделён на значение большего элемента:\n".concat(Arrays.toString(array)));
    }
}
