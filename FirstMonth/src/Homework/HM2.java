package Homework;

public class HM2 {
    public static void main(String[] args) {
        methods(1);
    }

    private static void methods(int nomber){
        if (nomber < 4) {
            System.out.println("method" + nomber + " started");
            methods(nomber + 1);
            System.out.println("method" + nomber + " finished");
        }
    }
}
