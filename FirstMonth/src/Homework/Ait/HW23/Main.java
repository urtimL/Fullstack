package Homework.Ait.HW23;

public class Main {
    public static void main(String[] args) {
        int length = args.length;
        if(length == 0) {
            printResult("empty");
        }

        for (int i = 0; i < length; i++) {
            printResult(args[i]);
        }
    }

    private static void printResult(String str) {
        switch (str) {
            case "empty" :
            case "byte" :
                System.out.println("byte max value: " + Byte.MAX_VALUE);
                System.out.println("byte min value: " + Byte.MIN_VALUE);
                if (str.equals("byte")) { break; }
            case "int" :
                System.out.println("int max value: " + Integer.MAX_VALUE);
                System.out.println("int min value: " + Integer.MIN_VALUE);
                if (str.equals("int")) { break; }
            case "short" :
                System.out.println("short max value: " + Short.MAX_VALUE);
                System.out.println("short min value: " + Short.MIN_VALUE);
                if (str.equals("short")) { break; }
            case "long" :
                System.out.println("long max value: " + Long.MAX_VALUE);
                System.out.println("long min value: " + Long.MIN_VALUE);
                if (str.equals("long")) { break; }
            case "char" :
                System.out.println("char max value: " + (int) Character.MAX_VALUE);
                System.out.println("char min value: " + (int) Character.MIN_VALUE);
                if (str.equals("char")) { break; }
            case "float" :
                System.out.println("float max value: " + Float.MAX_VALUE);
                System.out.println("float min value: " + Float.MIN_VALUE);
                if (str.equals("float")) { break; }
            case "double" :
                System.out.println("double max value: " + Double.MAX_VALUE);
                System.out.println("double min value: " + Double.MIN_VALUE);
                break;
            default:
                System.out.println("Wrong type - " + str);
        }
    }
}
