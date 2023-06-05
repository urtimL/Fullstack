package Homework.Ait;

import Homework.Ait.Calculator.CalculatorAppl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        view();
    }

    private static void view() {
        int num = 0;
        while (num != 2) {
            System.out.println();
            System.out.println("Для проведения вычислений введите - 1.");
            System.out.println("Для завершения работы прогаммы введите любую другую цифру.");
            System.out.println();

            System.out.print("Введите номер задачи: ");
            num = userDataInt();

            switch (num) {
                case 1:
                    System.out.print("Введите первое число: ");
                    double x = userDataDouble();
                    System.out.print("Введите второе число: ");
                    double y = userDataDouble();
                    System.out.println("Введите название операции - сложение, вычитание, умножение, деление: ");
                    String oper = userDataString();
                    double res = CalculatorAppl.calculator(x, y, oper);
                    System.out.printf("Результат вычисления равен: %f", res);
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
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

    private static int userDataInt() {
        int num = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (int) num;
    }

    private static String userDataString() {
        String str = "";
        try {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return str;
    }
}
