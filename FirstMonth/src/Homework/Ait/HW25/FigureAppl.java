package Homework.Ait.HW25;

import Homework.Ait.HW25.Model.Circle;
import Homework.Ait.HW25.Model.Shape;
import Homework.Ait.HW25.Model.Square;
import Homework.Ait.HW25.Model.Triangle;

public class FigureAppl {
    // Write class FigureAppl with method main. In method create array of Shapes.
    // Add to array two circles, one triangle and one square. Calculate total area
    // and total perimeter of all figures from array of Shapes.
    // Calculate total area of circles. (*)
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.);
        shapes[1] = new Circle(4.);
        shapes[2] = new Triangle(5.);
        shapes[3] = new Square(6.);

        printShapes(shapes);

        System.out.println("total area = " + totalArea(shapes));
        System.out.println("total perimeter = " + totalPerimeter(shapes));
        System.out.println("total area of circles = " + circlesTotalArea(shapes));
    }

    private static void printShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }

    private static Double circlesTotalArea(Shape[] shapes) {
        double res = 0;

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Circle){
               res += shapes[i].calcArea();
            }
        }

        return res;
    }

    private static Double totalPerimeter(Shape[] shapes) {
        double res = 0;

        for (int i = 0; i < shapes.length; i++) {
            res += shapes[i].calcPerimeter();
        }

        return res;
    }

    private static Double totalArea(Shape[] shapes) {
        double res = 0;

        for (int i = 0; i < shapes.length; i++) {
            res += shapes[i].calcArea();
        }

        return res;
    }
}
