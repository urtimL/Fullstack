package Homework.Ait.Equation.Model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display() {
        System.out.printf("%fx^2 + %fx + %f = 0", this.a, this.b, this.c);
    }
    public double delta() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public int quantityRoots() {
        double res = delta();

        if(res < 0) {
            return 0;
        } else if (res == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
