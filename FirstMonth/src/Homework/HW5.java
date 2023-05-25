package Homework;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        view();
    }

    private static void view(){
        System.out.println("Calculator");
        System.out.print("Введите первое число: ");
        double num1 = userDataDouble();
        System.out.println();

        System.out.print("Введите второе число: ");
        double num2 = userDataDouble();
        System.out.println("");

        System.out.println("Коды операций:\n" +
                "1. + ;\n" +
                "2. - ;\n" +
                "3. * ;\n" +
                "4. / ;\n");
        System.out.print("Введите код операции: ");
        int oper = userDataInt();
        System.out.println();

        calculate(num1, num2, oper);
    }

    private static void calculate(double x, double y, int oper){
        switch(oper){
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;
            default:
                System.out.println("Введен не верный оператор");
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

    private static Integer userDataInt() {
        int num = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (int) num;
    }
}
