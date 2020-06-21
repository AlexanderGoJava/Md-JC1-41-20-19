package Lesson_4.domain;

public abstract class Engineering {

    protected double fuel;

    protected String material;

    public Engineering() {
    }

    public Engineering(double fuel, String material) {
        this.fuel = fuel;
        this.material = material;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    protected abstract void makeFuel();

    protected abstract void makeMaterial();

}
