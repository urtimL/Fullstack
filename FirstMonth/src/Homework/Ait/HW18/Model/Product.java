package Homework.Ait.HW18.Model;

import java.util.Objects;

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(String name, double price, long barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", price = " + price +
                ", barCode = " + barCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return price == other.price && barCode == other.barCode && Objects.equals(name, other.name);
    }

}
