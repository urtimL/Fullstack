package Homework.Ait.HW25.Model;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return Math.pow(side, 2.);
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square" + super.toString();
    }
}
