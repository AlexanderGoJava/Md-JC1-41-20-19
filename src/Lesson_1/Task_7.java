//Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for).
package Lesson_1;

public class Task_7 {
    public static void main(String[] args) {
        int sum = 0, a = 20, b = 200;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.printf("Сумма чисел от %d до %d равна: " + sum, a, b);
    }
}
