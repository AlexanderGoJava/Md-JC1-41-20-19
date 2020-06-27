//Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for).
package lesson_1;

public class Task_7 {
    public static void main(String[] args) {
        int sum = 0, a = 20, b = 200;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.printf("The sum of the numbers from %d to %d is: " + sum, a, b);
    }
}
