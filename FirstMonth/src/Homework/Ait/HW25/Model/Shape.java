package Homework.Ait.HW25.Model;

public abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();

    @Override
    public String toString() {
        return " {" +
                "side = " + side +
                ", Area = " + calcArea() +
                ", Perimeter = " + calcPerimeter() +
                '}';
    }
}
