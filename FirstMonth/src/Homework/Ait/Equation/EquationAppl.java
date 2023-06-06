package Homework.Ait.Equation;

import Homework.Ait.Equation.Model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        QuadraticEquation qE1 = new QuadraticEquation(3, 4, 5);
        QuadraticEquation qE2 = new QuadraticEquation(4, 8, 4);
        QuadraticEquation qE3 = new QuadraticEquation(2, 5, 3);

        schowResult(qE1, 1);
        schowResult(qE2, 2);
        schowResult(qE3, 3);
    }

    private static void schowResult(QuadraticEquation qE, int k) {
        System.out.println();
        System.out.println("example " + k);
        System.out.print("display: ");
        qE.display();
        System.out.println();
        System.out.printf("delta: %f", qE.delta());
        System.out.println();
        System.out.printf("quantityRoots: %d", qE.quantityRoots());
        System.out.println();
        System.out.println("----------------------------------");
    }
}
