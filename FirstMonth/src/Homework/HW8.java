package Homework;

import java.util.Scanner;

public class HW8 {
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int arrLength = arr.length;
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        int num = 0;
        while (num != 4) {
            System.out.println();
            System.out.println("Задача 1. Написать метод, принимающий массив целых чисел, и печатающий\n" +
                    "\tего в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.");
            System.out.println("Задача 2. Написать метод, принимающий массив целых чисел,\n" +
                    "\tи возвращающий сумму всех его нечетных элементов");
            System.out.println("Задача 3. Написать метод, принимающий массив целых чисел,\n" +
                    "\tи возвращающий произведение всех его элементов, с четными индексами.");
            System.out.println();
            System.out.print("Введите номер задачи: ");
            num = userDataInt();

            switch (num){
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
                    break;
            }
        }
    }

    private static void printArr(){
        System.out.println("Первоначальный массив: ");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void task1(){
        System.out.println("Задача 1. Написать метод, принимающий массив целых чисел, и печатающий\n" +
                "его в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.");
        printArr();

        System.out.println("Результат работы метода: ");
        for (int i = arrLength - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void task2(){
        System.out.println("Задача 2. Написать метод, принимающий массив целых чисел,\n" +
                "и возвращающий сумму всех его нечетных элементов");
        printArr();
        int sum = 0;
        for (int i = 0; i < arrLength; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

    private static void task3(){
        System.out.println("Задача 3. Написать метод, принимающий массив целых чисел,\n" +
                "и возвращающий произведение всех его элементов, с четными индексами.");

        int res = 1;

        printArr();

        for (int i = 0; i < arrLength; i += 2) {
            res *= arr[i];
        }

        System.out.println("Произведение элементов массива с четными индексами: " + res);

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
}
