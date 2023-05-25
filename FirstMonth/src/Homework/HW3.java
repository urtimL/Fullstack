package Homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
            view();
    }

    private static void view() {
        System.out.print("Для подсчета площади круга, введите радиус: ");
        double rad = userDataDouble();
        System.out.println("Площадь круга с радиусоам - " + rad + " равна - " + circleArea(rad));

        System.out.print("Для подсчета площади квадрата, введите длину стороны: ");
        double side = userDataDouble();
        System.out.println("Площадь квадрата с длиной стороны - " + side + " равна - " + squareArea(side));

        System.out.print("Для подсчета площади прямоугольника, введите длины сторон прямоугольника: ");
        double side1 = userDataDouble();
        double side2 = userDataDouble();
        System.out.println("Площадь прямоугольника с длинами сторон - " + side1 + " и " + side2 + " равна - " + rectangleArea(side1, side2));
    }

    private static double pi(){ return 3.1415926535d; }

    private static double circleArea (double radius){
        return 2 * radius * pi();
    }
    private static double squareArea(double side){
        return side * side;
    }

    private static double rectangleArea(double side1, double side2){
        return side1 * side2;
    }

    private static Double userDataDouble() {
        Double num = 0d;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextDouble();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (double) num;
    }
}
