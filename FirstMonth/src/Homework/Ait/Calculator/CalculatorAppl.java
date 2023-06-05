package Homework.Ait.Calculator;

public class CalculatorAppl {
    public static double calculator(double x, double y, String oper){
       double res = 0.0;

       switch(oper){
            case "сложение":
                res = (double) (x + y);
                break;
            case "вычитание":
                res = (double) (x - y);
                break;
            case "умножение":
                res = (double) (x * y);
                break;
            case "деление":
                res = (double) (x / y);
                break;
        }

        return res;
    }
}
