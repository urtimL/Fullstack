package Homework.Ait;

public class Coin {
    public static void main(String[] args) {
        long coin = Math.round(Math.random());
        String res = coin == 1 ? "Орел" : "Решка";
        System.out.println(res);
    }
}
