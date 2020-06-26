package Lesson_4.util;

import Lesson_4.domain.Colour;
import Lesson_4.domain.Owner;
import Lesson_4.domain.TechPassport;

import java.util.Random;

public class TechPaspUtil {

    public static TechPassport generateTechPass() {
        TechPassport<String, String, Integer> techPassport = new TechPassport<>();
        Colour colour = Colour.DEFAULT;
        Owner owner = Owner.NOOWNER;
        System.out.println("Colour of the car is " + generateColour(colour));
        System.out.println("Car owner is " + generateOwner(owner));
        return new TechPassport<>(generateRegNumber(techPassport), generateModel(techPassport), generateIssueYear(techPassport));
    }

    public static Number generateIssueYear(TechPassport<String, String, Integer> regIssueYear) {
        regIssueYear.setIssueYear(2000 + (int) (Math.random() * 20 + 1));
        return regIssueYear.getIssueYear();
    }

    public static String generateModel(TechPassport<String, String, Integer> regModel) {
        int randomModel = (int) (Math.random() * 10 + 1);
        switch (randomModel) {
            case 1 -> regModel.setModel("BMW");
            case 2 -> regModel.setModel("Opel");
            case 3 -> regModel.setModel("Renault");
            case 4 -> regModel.setModel("Nissan");
            case 5 -> regModel.setModel("Mazda");
            case 6 -> regModel.setModel("Peugeot");
            case 7 -> regModel.setModel("Volkswagen");
            case 8 -> regModel.setModel("Toyota");
            case 9 -> regModel.setModel("Skoda");
            case 10 -> regModel.setModel("Maserati");
        }
        return regModel.getModel();
    }

    public static String generateRegNumber(TechPassport<String, String, Integer> regNum) {
        regNum.setRegistrationNumber(new Random().nextInt() + " MH-" + (int) (Math.random() * 10 + 1));
        return regNum.getRegistrationNumber();
    }

    public static String generateColour(Colour colour) {
        int randomColour = (int) (Math.random() * 11);
        switch (randomColour) {
            case 0 -> colour.setRandomColour(Colour.WHITE.toString());
            case 1 -> colour.setRandomColour(Colour.RED.toString());
            case 2 -> colour.setRandomColour(Colour.BLACK.toString());
            case 3 -> colour.setRandomColour(Colour.BLUE.toString());
            case 4 -> colour.setRandomColour(Colour.GREEN.toString());
            case 5 -> colour.setRandomColour(Colour.PINK.toString());
            case 6 -> colour.setRandomColour(Colour.YELLOW.toString());
            case 7 -> colour.setRandomColour(Colour.SILVER.toString());
            case 8 -> colour.setRandomColour(Colour.VINOUS.toString());
            case 9 -> colour.setRandomColour(Colour.PURPLE.toString());
            default -> colour.setRandomColour(Colour.DEFAULT.toString());
        }
        return colour.getRandomColour();
    }

    public static String generateOwner(Owner owner) {
        int randomOwner = (int) (Math.random() * 6 + 1);
        switch (randomOwner) {
            case 1 -> owner.setCarOwner(Owner.FIRSTOWNER.toString());
            case 2 -> owner.setCarOwner(Owner.SECONDOWNER.toString());
            case 3 -> owner.setCarOwner(Owner.THIRDOWNER.toString());
            case 4 -> owner.setCarOwner(Owner.FOURTHOWNER.toString());
            case 5 -> owner.setCarOwner(Owner.FIFTHOWNER.toString());
            case 6 -> owner.setCarOwner(Owner.SIXTHOWNER.toString());
            default -> owner.setCarOwner(Owner.NOOWNER.toString());
        }
        return owner.getCarOwner();
    }

}
