package Homework.Ait.HW28.Car.Model;

import java.util.Objects;

public class Car {
    protected String regNumber;
    protected String model;
    protected String company;
    protected double engine;
    protected String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return regNumber != null ? regNumber.hashCode() : 0;
    }
}
