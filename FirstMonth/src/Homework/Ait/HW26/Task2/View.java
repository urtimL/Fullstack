package Homework.Ait.HW26.Task2;

import Homework.Ait.HW26.Task2.IPAddress;

public class View {

    public static void view() {
        /*
       Программа получает на вход IP-адрес в одну строку:
       например, 192.168.23.1 (четыре числа, разделённые
       точками). Каждое число должно быть в диапазоне от
       0 до 255. Программа должна вывести эти четыре
       числа по отдельности.
        */
        IPAddress[] arrIP = new IPAddress[5];
        String[] arrIPstring = new String[5];
        arrIPstring[0] = "192-168-23-1";
        arrIPstring[1] = "193-168-24-2";
        arrIPstring[2] = "194-168-25-3";
        arrIPstring[3] = "195-168-26-4";
        arrIPstring[4] = "196-168-27-5";

        System.out.println("Тестируемый массив адресов:");
        printArray(arrIPstring);

        System.out.println("На основании массива создадим объекты IP-адрес: ");
        for (int i = 0; i < arrIPstring.length; i++) {
            arrIP[i] = new IPAddress(arrIPstring[i]);
        }

        for (int i = 0; i < arrIP.length; i++) {
            System.out.println(arrIP[i].toString());
        }
    }


    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
