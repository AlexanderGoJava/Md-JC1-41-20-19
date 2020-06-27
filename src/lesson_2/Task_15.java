/*Task 15. Write a Java program to find the common elements between two arrays of integers.
  Задача 15. Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.*/
package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_15 {
    public static void main(String[] args) throws IOException {
        //Первый массив чисел
        System.out.println("Введите размерность первого численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNumFst = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeNumFst < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double[] arrayNumFst = new double[arraySizeNumFst];
        System.out.printf("Введите %d чисел:\n", arraySizeNumFst);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNumFst.length; i++) {
            arrayNumFst[i] = Double.parseDouble(reader1.readLine());
        }
        System.out.println("Полученный первый массив чисел: ".concat(Arrays.toString(arrayNumFst)));
        //Второй массив чисел
        System.out.println("Введите размерность второго численного массива:");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNumScd = Integer.parseInt(reader2.readLine());
        if (arraySizeNumScd < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        double[] arrayNumScd = new double[arraySizeNumScd];
        System.out.printf("Введите %d чисел:\n", arraySizeNumScd);
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNumScd.length; i++) {
            arrayNumScd[i] = Double.parseDouble(reader3.readLine());
        }
        reader.close();
        reader1.close();
        reader2.close();
        reader3.close();
        System.out.println("Полученный второй массив чисел: ".concat(Arrays.toString(arrayNumScd)));
        for (i = 0; i < arrayNumFst.length; i++) {
            for (j = i; j < arrayNumScd.length; j++) {
                if (arrayNumFst[i] == arrayNumScd[j]) {
                    System.out.printf("Значение элемента первого массива ‘%s‘ по индексу \"%d\" совпадает со значением второго массива ‘%s‘ по индексу \"%d\"\n", arrayNumFst[i], i, arrayNumScd[j], j);
                }
            }
        }
    }
}
