/*1. Create anonymous class for object and run method that was overrided;
  2. Create local class, create method and call the method through a method call, inside which the class is described;
  3. Class Computer, inner class PowerSupply.*/
package lesson_6;

import java.io.IOException;

public class ComputerStart {
    public static void main(String[] args) throws IOException {
        Computer computer = ComputerUtil.generateComputer();
        Computer.PowerSupply computer1 = ComputerUtil.generatePowerSupply();
        System.out.println(computer + "\n" + computer1);
    }
}
