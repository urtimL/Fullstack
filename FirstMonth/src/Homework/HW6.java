package Homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        int num = 0;
        while (num != 6) {
            System.out.println();
            System.out.println("Задача 0. Задача о яблоках.");
            System.out.println("Задача 1. Программа получает на вход строку и число повторений этой строки.\n" +
                    "Программа должна вывести эту строку нужное количество раз.");
            System.out.println("Задача 2. Вводится положительное целое число, найдите сумму его цифр.");
            System.out.println("Задача 3. В первый день спортсмен пробежал s километров\n" +
                    "а затем он каждый день увеличивал пробег на 10 % от предыдущего значения\n" +
                    "Определите номер дня, на который пробег спортсмена составит не менее target\n" +
                    "километров. Программа получает на вход действительные числа s и target и\n" +
                    "должна вывести одно натуральное число.");
            System.out.println("Задача 4. (*) Вводится число, напечатайте это число в обратном порядке.");
            System.out.println("Задача 5. (*) Вводится шестизначное число (номер автобусного билета).\n" +
                    "Определите, является ли этот билет \"счастливым\" (сумма первых трех цифр равна\n" +
                    "сумме трех последних цифр).");
            System.out.println("6. Завершить работу прогаммы.");
            System.out.println();
            System.out.print("Введите номер задачи: ");
            num = userDataInt();

            switch (num){
                case 0:
                    task0();
                    break;
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    break;
            }
        }
    }

    private static void task0(){
        System.out.println("Задача 0. Задача о яблоках.");
        System.out.print("Введите количество яблок в корзине: ");

        int numberOfApples = userDataInt();
        int appleCount = 0;

        while (numberOfApples > 0){
            appleCount++;
            numberOfApples--;
            System.out.println("Взяли " + appleCount + "-ое яблоко из корзины, положили в пирог,");
            System.out.println("в корзине осталось " + numberOfApples + " яблок.");
        }
    }

    private static void task1(){
        System.out.println("Задача 1. Программа получает на вход строку и число повторений этой строки.\n" +
                "Программа должна вывести эту строку нужное количество раз.");
        System.out.print("Введите строку: ");
        String str = userDataString();

        System.out.print("Введите число повторений строки: ");
        int count = userDataInt();
        while (count > 0){
            System.out.println(str);
            count--;
        }
    }

    private static void task2(){
        System.out.println("Задача 2. Вводится положительное целое число, найдите сумму его цифр.");
        System.out.print("Введите число: ");
        int num = userDataInt();
        System.out.print("Сумма всех чисел входящих в число - " + num);

        int k = 0;
        while (num > 0){
            k += num % 10;
            num = num / 10;
        }
        System.out.println(" равно - " + k);
    }

    private static void task3(){
        System.out.println("Задача 3. В первый день спортсмен пробежал s километров\n" +
                "а затем он каждый день увеличивал пробег на 10 % от предыдущего значения\n" +
                "Определите номер дня, на который пробег спортсмена составит не менее target\n" +
                "километров. Программа получает на вход действительные числа s и target и\n" +
                "должна вывести одно натуральное число.");

        System.out.print("Введите количество километров\n" +
                "которые спортсмен пробежал в первый день (s): ");
        double s = userDataDouble();

        System.out.print("Введите величину общего пробега (target): ");
        int target = userDataInt();

        if (s > target){
            System.out.println("Номер дня - 1");
            return;
        }

        int dayNumber = 0;
        while (target > 0){
            target -= s;
            s *= 0.1;
            dayNumber++;
        }

        System.out.println("Номер дня - " + dayNumber);
    }

    private static void task4(){
        System.out.println("Задача 4. (*) Вводится число, напечатайте это число в обратном порядке.");
        System.out.print("Введите число: ");
        int num = userDataInt();

        while (num > 0){
            System.out.print(num % 10);
            num = num / 10;
        }
        System.out.println();
    }

    private static void task5(){
        System.out.println("Задача 5. (*) Вводится шестизначное число (номер автобусного билета).\n" +
                "Определите, является ли этот билет \"счастливым\" (сумма первых трех цифр равна\n" +
                "сумме трех последних цифр).");
        System.out.print("Введите число: ");
        int num = userDataInt();

        int count = 0;
        int k1 = 1;
        int k2 = 1000;
        int k3 = 1;

        int sum1 = 0;
        int sum2 = 0;

        while (count < 3){
            count++;

            sum1 += num/(k1*k3)%10;
            sum2 += num/(k2*k3)%10;

            k3 *= 10;
        }
        System.out.println(sum1 == sum2 ? "Билет счастливый" : "Не повезло");
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
            str = scanner.next();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (String) str;
    }
}
