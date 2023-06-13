package Homework.Ait.HW18;

import Homework.Ait.HW18.Model.Food;
import Homework.Ait.HW18.Model.MeatFood;
import Homework.Ait.HW18.Model.MilkFood;
import Homework.Ait.HW18.Model.Product;

public class ProductAppl {
    public static void main(String[] args) {
        view();
    }

    private static void view() {
        Product[] products = new Product[4];
        products[0] = new Product("drink", 12.5, 555_555_555_555l);
        products[1] = new Food("fish", 15.5, 666_666_666_666l, "15.06.2023");
        products[2] = new MeatFood("pork", 20.5, 777_777_777_777l, "01.07.2023", "type 1");
        products[3] = new MilkFood("kefir", 2.5,888_888_888_888l, "25.06.2023", "type 2", 3.2);

        System.out.println("Print products:");
        printProducts(products);
        System.out.println();

        System.out.println("Total price of product is: " + sum(products));
        System.out.println();

        checkEquals(products);
        System.out.println();

        System.out.println("Print only Food products: ");
        printFoodProducts(products);
        System.out.println();

        System.out.println("Finde product by barCode: ");
        long barCode = 888_888_888_888l;
        System.out.println("If barCode = " + barCode);
        System.out.println("product is: " + findProduct(barCode, products));
        System.out.println();

        barCode = 666_999_999_666l;
        System.out.println("If barCode = " + barCode);
        System.out.println("product is: " + findProduct(barCode, products));
    }

    public static void printProducts(Product[] products){
        for (Product n : products) {
            System.out.println(n);
        }
    }

    public static double sum(Product[] products){
        double res = 0;
        for (Product n : products) {
            res += n.getPrice();
        }

        return res;
    }

    private static void checkEquals(Product[] products){
        System.out.println("Check equals: ");
        boolean checker = products[0].equals(new Product("drink", 12.5, 555_555_555_555l));
        System.out.println("0.1 checker is " + checker);

        checker = products[0].equals(new Product("drink1", 12.5, 555_555_555_555l));
        System.out.println("0.2 checker is " + checker);
        System.out.println();

        checker = products[1].equals(new Food("fish", 15.5, 666_666_666_666l, "15.06.2023"));
        System.out.println("1.1 checker is " + checker);

        checker = products[1].equals(new Food("fish", 16.5, 666_666_666_666l, "15.06.2023"));
        System.out.println("1.2 checker is " + checker);
        System.out.println();

        checker = products[2].equals(new MeatFood("pork", 20.5, 777_777_777_777l, "01.07.2023", "type 1"));
        System.out.println("2.1 checker is " + checker);

        checker = products[2].equals(new MeatFood("pork", 20.5, 777_888_777_777l, "01.07.2023", "type 1"));
        System.out.println("2.2 checker is " + checker);
        System.out.println();

        checker = products[3].equals(new MilkFood("kefir", 2.5,888_888_888_888l, "25.06.2023", "type 2", 3.2));
        System.out.println("3.1 checker is " + checker);

        checker = products[3].equals(new MilkFood("kefir", 2.5,888_888_888_888l, "25.06.2024", "type 2", 3.2));
        System.out.println("3.2 checker is " + checker);
    }

    private static void printFoodProducts(Product[] products){
        for (Product n : products) {
            if(n instanceof Food){
                System.out.println(n);
            }
        }
    }

    public static Product findProduct(long barCode, Product[] products){
        for (Product n : products) {
            if(n.getBarCode() == barCode){
                return n;
            }
        }

        return null;
    }
}
