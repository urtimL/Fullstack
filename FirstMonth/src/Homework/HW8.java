package Homework;

import java.sql.Array;
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
                    System.out.println("Первоначальный массив: ");
                    printArr(arr);
                    System.out.println("Результат работы метода: ");
                    printArr(task1(arr)); ;
                    break;
                case 2:
                    System.out.println("Массив: ");
                    printArr(arr);
                    System.out.println("Сумма элементов массива равна: " + task2(arr));
                    break;
                case 3:
                    System.out.println("Массив: ");
                    printArr(arr);
                    System.out.println("Произведение элементов массива с четными индексами: " + task3(arr));
                    break;
                case 4:
                    break;
            }
        }
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] task1(int[] arr){
//        System.out.println("Задача 1. Написать метод, принимающий массив целых чисел, и печатающий\n" +
//                "его в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.");


        int[] arrRes = new int[arr.length];
        int k = 0;

        for (int i = arrLength - 1; i >= 0; i--) {
            arrRes[k] = arr[i];
            k++;
        }
        return arrRes;
    }

    private static int task2(int[] arr){
//        System.out.println("Задача 2. Написать метод, принимающий массив целых чисел,\n" +
//                "и возвращающий сумму всех его нечетных элементов");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int task3(int[] arr){
//        System.out.println("Задача 3. Написать метод, принимающий массив целых чисел,\n" +
//                "и возвращающий произведение всех его элементов, с четными индексами.");

        int res = 1;

        for (int i = 0; i < arr.length; i += 2) {
            res *= arr[i];
        }

        return res;
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
