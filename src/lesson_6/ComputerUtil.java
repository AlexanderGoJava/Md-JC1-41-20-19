package lesson_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerUtil {

    //filling constructor, getters and setters of the outer class
    //generating computer status
    public static Computer generateComputer() {
        //1. anonymous class (pos. 1 of homework)
        Computer computer = new Computer(){
            @Override
            public String toString() {
                return super.toString() + " - information about computer work status";
            }
        };
        System.out.println("template: " + computer);
        //end of anonymous class
        return new Computer(generateTypeOfPC(computer), generateOperationSystem(computer), generateOnAndOffStatus(computer), generateOnlineStatus(computer), generateProgramRun(computer));
    }

    public static String generateTypeOfPC(Computer typeOfPC) {
        int randomPCValue = (int) (Math.random() * 10 + 1);
        if (randomPCValue > 5) {
            typeOfPC.setTypeOfPC("Notebook");
        } else {
            typeOfPC.setTypeOfPC("Personal computer");
        }
        return typeOfPC.getTypeOfPC();
    }

    //generating operation system
    public static String generateOperationSystem(Computer operationSystem) {
        int randomOSValue = (int) (Math.random() * 3);
        switch (randomOSValue) {
            case 1 -> operationSystem.setOperationSystem("Linux");
            case 2 -> operationSystem.setOperationSystem("Mac OS");
            default -> operationSystem.setOperationSystem("Windows");
        }
        return operationSystem.getOperationSystem();
    }

    //generating on/off status
    public static String generateOnAndOffStatus(Computer onAndOffStatus) {
        int randomOnOffStatusValue = (int) (Math.random() * 2);
        if (randomOnOffStatusValue == 1) {
            onAndOffStatus.setOnAndOffStatus("Computer has started his work!");
        } else {
            onAndOffStatus.setOnAndOffStatus("Computer has turned off!");
        }
        return onAndOffStatus.getOnAndOffStatus();
    }

    //generating online status
    public static String generateOnlineStatus(Computer onlineStatus) {
        if (generateOnAndOffStatus(onlineStatus).equals("Computer has started his work!")) {
            onlineStatus.setOnlineStatus("User is online!");
        } else if (generateOnAndOffStatus(onlineStatus).equals("Computer has turned off!")) {
            onlineStatus.setOnlineStatus("User is offline!");
        }
        return onlineStatus.getOnlineStatus();
    }

    //generating program running
    public static String generateProgramRun(Computer programRun) {
        if (generateOnAndOffStatus(programRun).equals("Computer has started his work!")) {
            programRun.setProgramRun("Application launched!");
        } else if (generateOnAndOffStatus(programRun).equals("Computer has turned off!")) {
            programRun.setProgramRun("Computer turned off. The program can`t be started!");
        }
        return programRun.getProgramRun();
    }

    //filling constructor, getters and setters of the inner class
    //generating power supply status
    public static Computer.PowerSupply generatePowerSupply() throws IOException {
        System.out.printf("Manufactured country: %s!\n", Computer.PowerSupply.getManufacturedCountry());
        Computer.PowerSupply powerSupply = new Computer.PowerSupply();
        return new Computer.PowerSupply(generatePowerStatus(powerSupply), generateCPU(powerSupply), generateVideoCard(powerSupply), generateRAM(powerSupply), generateSSD(powerSupply));
    }

    //generating power status
    public static String generatePowerStatus(Computer.PowerSupply powerStatus) throws IOException {
        System.out.print("To start the computer enter \"turn on/start\", to finish the computer work enter \"turn off/finish\": ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String startWorking = reader.readLine();
        reader.close();
        if (startWorking.equals("turn on") || startWorking.equals("start")) {
            powerStatus.setPowerStatus("Computer is running!");
        } else if (startWorking.equals("turn off") || startWorking.equals("finish")) {
            powerStatus.setPowerStatus("Computer turned off!");
        } else {
            System.out.println("Incorrect value entered! The program has completed its work.");
            System.exit(0);
        }
        return powerStatus.getPowerStatus();
    }

    //generating CPU
    public static String generateCPU(Computer.PowerSupply CPU) {
        CPU.setCPU("Intel Core i" + (int) (Math.random() * 7 + 3) + " " + (int) (2400 + Math.random() * 1000) + " MHz");
        return CPU.getCPU();
    }

    //generating videocard
    public static String generateVideoCard(Computer.PowerSupply videoCard) {
        videoCard.setVideoCard("NVIDIA GEFORCE RTX " + (int) (1800 + Math.random() * 500) + " TI");
        return videoCard.getVideoCard();
    }

    //generating RAM
    public static String generateRAM(Computer.PowerSupply RAM) {
        RAM.setRAM("DDR " + (int) (4 + Math.random() * 13) + " GB");
        return RAM.getRAM();
    }

    //generating SSD
    public static String generateSSD(Computer.PowerSupply SSD) {
        SSD.setSSD("SSD " + (int) (500 + Math.random() * 2000) + " GB");
        return SSD.getSSD();
    }

}
