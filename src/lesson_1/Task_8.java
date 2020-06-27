//Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else).
package lesson_1;

public class Task_8 {
    public static void main(String[] args) {
        String s1 = "January", s2 = "February", s3 = "March", s4 = "April", s5 = "May", s6 = "June",
                s7 = "July", s8 = "August", s9 = "September", s10 = "October", s11 = "November", s12 = "December";
        int a = 12;
        for (int i = 1; i <= a; i++) {
            if (i == 1) {
                System.out.println(s1);
            } else if (i == 2) {
                System.out.println(s2);
            } else if (i == 3) {
                System.out.println(s3);
            } else if (i == 4) {
                System.out.println(s4);
            } else if (i == 5) {
                System.out.println(s5);
            } else if (i == 6) {
                System.out.println(s6);
            } else if (i == 7) {
                System.out.println(s7);
            } else if (i == 8) {
                System.out.println(s8);
            } else if (i == 9) {
                System.out.println(s9);
            } else if (i == 10) {
                System.out.println(s10);
            } else if (i == 11) {
                System.out.println(s11);
            } else {
                System.out.println(s12);
            }
        }
    }
}
