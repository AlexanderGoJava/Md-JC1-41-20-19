package Lesson_4.domain;

public enum Colour {
    WHITE("white colour"), RED("red colour"), BLACK("blcak colour"),
    BLUE("blue colour"), GREEN("green colour"), PINK("pink colour"),
    YELLOW("yellow colour"), SILVER("silver colour"), VINOUS("vinous colour"),
    PURPLE("purple colour"), DEFAULT("brown colour");

    private String randomColour;

    Colour(String randomColour) {
        this.randomColour = randomColour;
    }

    public String getRandomColour() {
        return randomColour;
    }

    public void setRandomColour(String randomColour) {
        this.randomColour = randomColour;
    }

    public static void printColour() {
        for (Colour colour: Colour.values()) {
            System.out.println(colour + " " + colour.ordinal());
        }
    }
}
