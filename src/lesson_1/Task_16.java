/*Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким:
10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем (можно захардкодить).*/
package lesson_1;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        System.out.println("Enter 2 natural numbers!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lower number, min: ");
        int min = sc.nextInt();
        if (min % 2 != 0) {
            min += 1;
        }
        System.out.print("Enter a larger number, max: ");
        int max = sc.nextInt();
        if (max % 2 != 0) {
            max += 1;
        }
        sc.close();
        System.out.println("A series of natural even numbers ranging from min to max:");
        for (int i = min; i < max; i += 2) {
            System.out.print(i + " ");
        }
    }
}
