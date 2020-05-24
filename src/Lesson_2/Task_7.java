package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int a = 10;
        int[] array = new int[a];
        System.out.println("Введите 10 целых чисел массива:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int b = sc.nextInt();
            array[i] = b;
        }
//        System.out.println("Массив после удаления повторяющихся элементов:\n".concat(Arrays.toString(remove(array))));
    }
}
