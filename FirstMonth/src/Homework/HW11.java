package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        task1();
        System.out.println("\n");
        task2();
        System.out.println("\n");
        task3();
    }

    private static void task1(){
        System.out.println("Задача 1. В задании про binary search оформить метод, \n" +
                "который ищет элемент в отсортированном массиве и возвращает индекс \n" +
                "найденного элемента и сам найденный элемент.");

        int[] numbers = {-4, 1, 10, 11, 13, 20, 35, 46, 56, 67}; // отсортированный массив
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Введите искомое число: ");
        int num = userDataInt();

        int index = binarySearch(numbers, num);
        if (index != 0){
            System.out.printf("Индекс элемента - %d равен - %d", num, index);
        }else{
            System.out.printf("В массиве нет элемента - %d", num);
        }
    }

    private static int binarySearch(int[] arr, int number){
        int left = 0;
        int right = arr.length - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (number < arr[middle]) {
                right = middle - 1;
            } else if (number > arr[middle]) {
                left = middle + 1;
            } else { // element found
                return middle;
            }
            middle = left + (right - left)/2; // new middle
        }

        return 0;
    }

    private static void task2(){
        System.out.println("Задача 2. Задача про поиск \"счастливого пельменя\". Хозяйка налепила для гостей 30 пельменей.\n" +
                "В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.\n" +
                "Напишите программу, которая ищет счастливый пельмень.");

        System.out.println("Налепим пельменей");
        int[] pelmeny = new int[30];
        for (int i = 0; i < 30; i++) {
            pelmeny[i] = 25;
        }
        System.out.println(Arrays.toString(pelmeny));

        System.out.println("Зделаем счастливый пельмень (добавим монетку)");
        int a = 1;
        int b = 30;
        int luckyPelmen = (int)(Math.random() * (b - a + 1) + a);
        pelmeny[luckyPelmen] += 15;
        System.out.println(Arrays.toString(pelmeny));
        int index = findIndexLuckyPelmen(40, pelmeny);
        if(index == 0){
            System.out.println("Нет счастливого пельменя ;(");
        } else {
            System.out.printf("Индекс счастливого пельменя: %d", index);
        }
    }

    private static int[] createArray(int length, int min, int max){
        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            res[i] = (int)(Math.random() * (max - min + 1) + min);
        }

        return res;
    }

    private static int findIndexLuckyPelmen(int num, int[] arr){
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return 0;
    }

    private static void task3(){
        System.out.println("Задача 3. ()* Найти алгоритм selection sort. https://www.geeksforgeeks.org/selection-sort/\n" +
                "Задать массив из произвольных целых чисел. Реализовать метод, получающий на вход массив и\n" +
                "сортирующий его по алгоритму selection sort.");

        System.out.println("Создадим массив из произвольных целых чисел: ");
        int[] arr = createArray(20, 1, 100);
        System.out.println(Arrays.toString(arr));
        System.out.println("Отсортируем массив по алгоритму selection sort.:");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
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
