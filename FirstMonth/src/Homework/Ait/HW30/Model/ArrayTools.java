package Homework.Ait.HW30.Model;

public class ArrayTools {
    public static void printArray(Integer[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
