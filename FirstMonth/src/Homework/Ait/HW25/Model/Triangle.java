package Homework.Ait.HW25.Model;

public class Triangle extends Shape{

    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return Math.pow(side, 2.) * Math.sqrt(3) / 4;
    }

    @Override
    public double calcPerimeter() {
        return 3 * side;
    }

    @Override
    public String toString() {
        return "Triangle" + super.toString();
    }
}
