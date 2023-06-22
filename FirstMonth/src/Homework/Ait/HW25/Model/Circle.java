package Homework.Ait.HW25.Model;

public class Circle extends Shape{
    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(side, 2.);
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * side * 2;
    }

    @Override
    public String toString() {
        return "Circle" + super.toString();
    }
}
