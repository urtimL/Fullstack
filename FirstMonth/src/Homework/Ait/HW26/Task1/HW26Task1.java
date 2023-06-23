package Homework.Ait.HW26.Task1;

public class HW26Task1 {
    public static void main(String[] args) {
        view();
    }

    public static void view() {
        /*
        Задача 1 Задайте массив на 10 элементов и заполните его случайными числами
        в интервале от -10 до 10. Распечатайте полученный массив. Создайте метод,
        который определяет наличие дубликатов в массиве. Разработайте соответсвующий
        тест (набор тестов).
         */

        int[] array = new int[10];

        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);
        System.out.println();

        int[] arrayRepeatingNumbers = repeatingNumbers(array);
        if(arrayRepeatingNumbers.length != 0) {
            System.out.println("Дубликаты: ");
            printArray(arrayRepeatingNumbers);
        } else {
            System.out.println("нет дубликатов.");
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    public static int[] repeatingNumbers(int[] arr){
        int length = arr.length;
        int currentNumber;
        int index = 0;

        int[] arrayOfRepeatingNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            arrayOfRepeatingNumbers[i] = 999;
        }

        for (int i = 0; i < length; i++) {
            currentNumber = arr[i];
            for (int j = i + 1; j < length; j++) {
                if(currentNumber == arr[j] && noSuchNumber(arrayOfRepeatingNumbers, currentNumber)) {
                    arrayOfRepeatingNumbers[index++] = currentNumber;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i]  = arrayOfRepeatingNumbers[i];
        }
        return result;
    }

    private static boolean noSuchNumber(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(number == arr[i]) { return false; }
        }

        return true;
    }
}
