/*Создайте программу с двумя переменными целого типа, присвойте им значения,
если первая переменная больше второй, то увеличьте её значение на 3, иначе увеличьте
значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран.*/
package lesson_1;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers!");
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        int a = sc.nextInt();
        System.out.println("Second number:");
        int b = sc.nextInt();
        sc.close();
        if (a > b) {
            a += 3;
        } else {
            b += 8;
        }
        System.out.println("Variable a = " + a + "\n" + "Variable b = " + b);
    }
}
