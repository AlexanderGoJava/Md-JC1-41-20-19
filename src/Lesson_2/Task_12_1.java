package Lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_12_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность численного массива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySizeNum = Integer.parseInt(reader.readLine()), i, j;
        if (arraySizeNum < 1) {
            System.out.println("Введено неверное значение! Программа завершила свою работу.");
            System.exit(0);
        }
        int[] arrayNum = new int[arraySizeNum];
        System.out.printf("Введите %d чисел:\n", arraySizeNum);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(reader1.readLine());
        }
        reader.close();
        reader1.close();
        System.out.println("Полученный массив чисел: ".concat(Arrays.toString(arrayNum)));
        //без сортировки
        for (i = 0; i < arrayNum.length - 1; i++) {
            for (j = i + 1; j < arrayNum.length; j++) {
                if (arrayNum[i] == arrayNum[j]) {
                    System.out.printf("Значение элемента массива ‘%d‘ по индексу \"%d\" совпадает со значением массива ‘%d‘ по индексу \"%d\"\n", arrayNum[i], i, arrayNum[j], j);
                }
            }
        }
    }
}