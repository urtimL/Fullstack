package Homework;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        int[] arr = createArray(10, 1, 99);
        System.out.println("Задача 1. Написать метод, принимающий массив целых чисел, \n" +
                "и возвращающий индекс максимального элемента.");
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Индекс максимального элемента массива: " + task1(arr));
        System.out.println();

        arr = createArray(4, 1, 9);
        System.out.println("Задача 2. Написать метод, принимающий массив целых чисел, \n" +
                "и возвращающий среднее арифметическое всех его элементов");
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Среднее арифметическое всех его элементов: " + task2(arr));
        System.out.println();

        arr = createArray(10, 1, 99);
        System.out.println("адача 3. Написать метод, принимающий массив целых чисел, \n" +
                "и разворачивающий его. Последний элемент становится нулевым, предпоследний, \n" +
                "первым, и т. д. Подсказка: этот метод должен изменить полученный массив");
        System.out.println("Массив до разворота: " + Arrays.toString(arr));
        task3(arr);
        System.out.println("Массив после разворота: " + Arrays.toString(arr));
    }

    private static int[] createArray(int arrLengt, int b, int a){
        int[] arr = new int[arrLengt];
        for (int i = 0; i < arrLengt; i++) {
            arr[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        return arr;
    }
    private static int task1(int[] arr){
//        Задача 1. Написать метод, принимающий массив целых чисел, \n" +
//        "и возвращающий индекс максимального элемента.
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static double task2(int[] arr){
//        Задача 2. Написать метод, принимающий массив целых чисел,
//        и возвращающий среднее арифметическое всех его элементов

        int sum = 0;
        int count = arr.length;

        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        return  1.0 * sum / count;
    }

    private static void task3(int[] arr){
//        Задача 3. Написать метод, принимающий массив целых чисел,
//        и разворачивающий его. Последний элемент становится нулевым, предпоследний,
//        первым, и т. д. Подсказка: этот метод должен изменить полученный массив

        int arrLenght = arr.length;
        int halfLenght = arr.length / 2;
        int index = 0;
        int temp = 0;

        for (int i = arrLenght - 1; i >= halfLenght; i--) {
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
    }
}
