package Lesson_4.domain;

import Lesson_4.interfaces.MeasStopDist;
import Lesson_4.interfaces.PrintTechChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Vehicle extends Engineering implements PrintTechChar, MeasStopDist {
    public static final double g = 9.81;
    public static final double miu = 5.5;

    protected String vechicleType;

    protected String vechicleEngineType;

    public Vehicle() {
    }

    public Vehicle(double fuel, String material, String vechicleType, String vechicleEngineType) {
        super(fuel, material);
        this.vechicleType = vechicleType;
        this.vechicleEngineType = vechicleEngineType;
    }

    public String getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(String vechicleType) {
        this.vechicleType = vechicleType;
    }

    public String getVechicleEngineType() {
        return vechicleEngineType;
    }

    public void setVechicleEngineType(String vechicleEngineType) {
        this.vechicleEngineType = vechicleEngineType;
    }

    @Override
    protected void makeFuel() {
    }

    @Override
    protected void makeMaterial() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vechicleType='" + vechicleType + '\'' +
                ", vechicleEngineType='" + vechicleEngineType + '\'' +
                ", fuel=" + fuel +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vechicleType, vehicle.vechicleType) &&
                Objects.equals(vechicleEngineType, vehicle.vechicleEngineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vechicleType, vechicleEngineType);
    }

    @Override
    public void printTechChar() {
        System.out.println("Technical characteristics of vechicle: " + toString());
        System.out.println("Sound signal: ");
        makeFuel();
        makeMaterial();
    }

    @Override
    public void measStopDist() throws IOException {
        System.out.print("Enter speed value: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double speedVaslue = Double.parseDouble(reader.readLine());
        double s = (speedVaslue * speedVaslue) / (2 * miu * g);
        System.out.println("Stop distance of the vechicle is: " + new BigDecimal(s).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
}