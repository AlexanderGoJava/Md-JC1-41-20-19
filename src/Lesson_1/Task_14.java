/*Создайте программу с двумя переменными целого типа, присвойте им значения,
если первая переменная больше второй, то увеличьте её значение на 3, иначе увеличьте
значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран.*/
package Lesson_1;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число:");
        int a = sc.nextInt();
        System.out.println("Второе число:");
        int b = sc.nextInt();
        if (a > b) {
            a += 3;
        } else {
            b += 8;
        }
        System.out.println("Переменная a = " + a + "\n" + "Переменная b = " + b);
    }
}
