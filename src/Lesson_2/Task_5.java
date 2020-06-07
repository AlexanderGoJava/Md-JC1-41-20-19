/*Task 5.  Write a Java program to test if an array contains a specific value.
* Задача 5. Напишите программу на Java, чтобы проверить, содержит ли массив определенное значение.*/
package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        // Массив чисел
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), counter = 0,i;
        if (arraySizeNum < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double specValue;
        double[] arrayNum = new double[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Полученный массив чисел: ".concat(Arrays.toString(arrayNum)));
        System.out.println("Введите определённое численное значение:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        specValue = Double.parseDouble(reader2.readLine());
        for (i = 0; i < arrayNum.length; i++) {
            if (specValue == arrayNum[i]) {
                counter++;
                System.out.printf("Введённое Вами значение \"%.2f\" совпадает с одним из значений в массиве!\nПозиция данного значения в массиве: " + i + "\n", specValue);
            }
        }
        if (counter == 0) {
            System.out.println("Совпадений не найдено!");
        }
        // Массив строк
        System.out.println("Введите размерность строкового массива:");
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeStr = Integer.parseInt(reader3.readLine()), counter1 = 0;
        if (arraySizeStr < 0) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        String[] arrayStr = new String[arraySizeStr];
        System.out.printf("Введите %d символов/строк:\n", arraySizeStr);
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader4.readLine();
        }
        System.out.println("Полученный массив символов/строк: ".concat(Arrays.toString(arrayStr)));
        System.out.println("Введите определённое символьное/строковое значение:");
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader5.readLine();
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        reader4.close();
        reader5.close();
        for (i = 0; i < arrayStr.length; i++) {
            if (s.equals(arrayStr[i])) {
                counter1++;
                System.out.printf("Введённое Вами значение \"%s\" совпадает с одним из значений в массиве!\nПозиция данного значения в массиве: " + i + "\n", s);
            }
        }
        if (counter1 == 0) {
            System.out.println("Совпадений не найдено!");
        }
    }
}