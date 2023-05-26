package Homework;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        int num = 0;
        while (num != 6) {
            System.out.println();
            System.out.println("Задача 0. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n.\n" +
                    "\tn вводится с клавиатуры. Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 \n" +
                    "\tИспользовать цикл for.");
            System.out.println("Задача 1. Вводится n - натуральное число. Напишите метод,\n" +
                    "\tкоторый получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.\n" +
                    "\tВызовите полученный метод. При каком значении n происходит переполнение памяти,\n" +
                    "\tвыделяемой для n типа int? Использовать цикл for.");
            System.out.println("Задача 2. В сберкассу на трёхпроцентный вклад положили S евро.\n" +
                    "\tКакой станет сумма вклада через N лет. Использовать цикл for.");
            System.out.println("Задача 3. Ввести с клавиатуры 10 пар чисел. сравнить числа в\n" +
                    "\tкаждой паре и напечатать большие из них. Использовать цикл for.");
            System.out.println("Задача 4. (*) Найти произведение двузначных нечетных чисел кратных 13.");
            System.out.println("Задача 5. (*) Бизнесмен взял ссуду m тысяч евро в банке под 10% годовых.\n" +
                    "\tЧерез сколько лет его долг превысит s тысяч евро, если за это время он не будет отдавать долг.");
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
        System.out.println("Задача 0. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n.\n" +
                " n вводится с клавиатуры. Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 \n" +
                "Использовать цикл for.");

        System.out.print("Введите число: ");
        int n = userDataInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }

        System.out.println("Результат вычислений = " + sum);
    }

    private static void task1(){
        System.out.println("Задача 1. Вводится n - натуральное число. Напишите метод,\n" +
                "который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n. \n" +
                "Вызовите полученный метод. При каком значении n происходит переполнение памяти, \n" +
                "выделяемой для n типа int? Использовать цикл for.");

        System.out.print("Введите число: ");
        int n = userDataInt();

        long k = 1;
        int maxInt = 2147483647;
        for (int i = 1; i <= n; i++) {
            k *= i;
            if(k > maxInt) {
                System.out.println("Переполнение памяти происходит при n равном: " + i + "\n" +
                i + "! равен: " + k);
                return;
            }
        }
        System.out.println("Переполнение памяти не произошло, " + n + "! равен: " + k);
    }

    private static void task2(){
        System.out.println("Задача 2. В сберкассу на трёхпроцентный вклад положили S евро.\n" +
                "Какой станет сумма вклада через N лет. Использовать цикл for.");

        System.out.print("Введите число евро: ");
        double s = userDataDouble();

        System.out.print("Введите количество лет: ");
        int n = userDataInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum = s * 0.03;
            s += sum;
        }

        System.out.println("Через " + n + " лет, сумма вклада составит: " + s);
    }

    private static void task3(){
        System.out.println("Задача 3. Ввести с клавиатуры 10 пар чисел. сравнить числа в \n" +
                "каждой паре и напечатать большие из них. Использовать цикл for.");

        int num1, num2;

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите 1-ое число: ");
            num1 = userDataInt();

            System.out.print("Введите 2-ое число: ");
            num2 = userDataInt();

            System.out.println("Большим в этой паре является: " + (num1 > num2 ? num1 : num2));
        }
    }

    private static void task4(){
        System.out.println("Задача 4. (*) Найти произведение двузначных нечетных чисел кратных 13.");

        int res = 1;
        System.out.print("двузначные нечетные числа кратные 13: ");
        for (int i = 13; i < 100; i = i + 13) {
            if(i % 2 != 0) {
                System.out.print(i + ", ");
                res *= i;
            }
        }

        System.out.println();
        System.out.println("произведение двузначных нечетных чисел кратных 13, равно: " + res);
    }

    private static void task5(){
        System.out.println("Задача 5. (*) Бизнесмен взял ссуду m тысяч евро в банке под 10% годовых. \n" +
                "Через сколько лет его долг превысит s тысяч евро, если за это время он не будет отдавать долг.");

        System.out.print("Введите сумму ссуды: ");
        double n = userDataDouble();

        System.out.print("Введите сумму максимальной задолженности: ");
        double s = userDataDouble();

        int count = 0;
        for (double i = n; i < s; i = i * 1.1) {
            count++;
        }
        System.out.println("Долг привысил " + s + " тысяч евро, через " + count + " (год/года/лет).");
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
}
