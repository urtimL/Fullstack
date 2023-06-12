package Homework.Ait.HW17;

import Homework.Ait.HW17.Model.Food;
import Homework.Ait.HW17.Model.MeatFood;
import Homework.Ait.HW17.Model.MilkFood;
import Homework.Ait.HW17.Model.Product;

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

        printProducts(products);

        System.out.println("Total price of product is: " + sum(products));
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
}
