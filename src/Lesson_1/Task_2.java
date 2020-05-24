//Напишите метод, который будет увеличивать каждый элемент массива на 10%.
package Lesson_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10 + 1);
        double[] array = new double[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println("Первоначальный массив:\n".concat(Arrays.toString(array)));
        System.out.println("Массив после увеличения каждого его элемента на 10%:\n".concat(Arrays.toString(arrayIncrease(array))));
    }

    public static double[] arrayIncrease(double[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * 1.1;
            array[i] = BigDecimal.valueOf(array[i]).setScale(1, RoundingMode.HALF_UP).doubleValue();
            }
        return array;
    }
}
