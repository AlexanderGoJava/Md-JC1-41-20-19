/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
  В классе создать 2 метода, статический и не статический. Один из методов решает по весу машины ее тип:
  легковой, джип, грузовой (через свитч). Второй метод генерирует рандомную машину.*/
package Lesson_4;

import Lesson_4.domain.Car;
import Lesson_4.util.CarUtil;

public class Task_1 {
    public static void main(String[] args) {

        Car car = new Car();

        Car car1 = CarUtil.generateCar();
        Car car2 = CarUtil.generate(car);

        System.out.println(car1);
        System.out.println(car2);
    }
}

