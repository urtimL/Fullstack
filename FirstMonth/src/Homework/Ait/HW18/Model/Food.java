package Homework.Ait.HW18.Model;

import java.util.Objects;

public class Food extends Product {
    private String expDate;

    public Food(String name, double price, long barCode, String expDate) {
        super(name, price, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", expDate = " + expDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) {
            return false;
        }
        Food other = (Food) obj;
        return super.equals(obj) && Objects.equals(expDate, other.expDate);
    }
}
