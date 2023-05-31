package Homework;

import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1(){
        System.out.println("Задача 1. Задан массив целых чисел: \n" +
                "56, 73, 15, -10, 37, -14, 25, 65, 33, 38. \n" +
                "Найдите максимальный элемент массива и его индекс.");

        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Ответ:");
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Индекс максимального значения: " + maxIndex);
    }

    private static void task2(){
        System.out.println("Задача 2. Создайте массив из 20 случайных целых чисел \n" +
                "в интервале от 10 до 20. Выведите массив на печать. Поменяйте \n" +
                "местами первый и последний элементы массива и снова выведите массив на печать.");

        int b = 10;
        int a = 20;

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        System.out.println("Решение:");
        System.out.println("Выведим на печать созданный массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));

        int k = arr[0];
        arr[0] = arr[19];
        arr[19] = k;

        System.out.println("Выведим на печать массив после замены первого ипоследнего значения: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void task3(){
        System.out.println("Задача 3. (*) Заполнить двухмерный массив 8 х 8 элементами 0 и 1, \n" +
                "как на шахматной достке. 1 - черное поле, 0 - белое поле Вывести массив на печать.");

        int[][] arr = new int[8][8];
        int k = 0;
        int n = 0;

        System.out.println("Решение:");
        System.out.println("Создадим и выведем на печать полученный массив: ");

        for (int i = 0; i < 8; i++) {
            k = i % 2 == 0 ? 0 : 1;
            for (int j = 0; j < 8; j++) {
                if(k == 0){
                    n = j % 2 == 0 ? 0 : 1;
                }else {
                    n = j % 2 == 0 ? 1 : 0;
                }
                arr[i][j] = n;
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
