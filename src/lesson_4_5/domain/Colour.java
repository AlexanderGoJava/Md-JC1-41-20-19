package lesson_4_5.domain;

public enum Colour {
    WHITE("white"), RED("red"), BLACK("blcak"), BLUE("blue"),
    GREEN("green"), PINK("pink"),     YELLOW("yellow"), SILVER("silver"),
    VINOUS("vinous"), PURPLE("purple"), DEFAULT("brown");

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

    public String toString() {
        return randomColour;
    }

}
