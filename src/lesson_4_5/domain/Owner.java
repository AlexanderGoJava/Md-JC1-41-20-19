package lesson_4_5.domain;

public enum Owner {
    FIRSTOWNER("Michael"), SECONDOWNER("Alex"), THIRDOWNER("John"), FOURTHOWNER("Max"),
    FIFTHOWNER("Sara"), SIXTHOWNER("Caroline"), NOOWNER("The car has no owner");

    private String carOwner;

    Owner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String toString() {
        return carOwner;
    }

}
