package Homework.Ait.HW18.Model;

import java.util.Objects;

public class MilkFood extends Food {
    private String milkType;
    private double fat;

    public MilkFood(String name, double price, long barCode, String expDate, String milkType, double fat) {
        super(name, price, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", milkType = " + milkType +
                ", fat = " + fat;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MilkFood)) {
            return false;
        }
        MilkFood other = (MilkFood) obj;
        return super.equals(obj) && Objects.equals(milkType, other.milkType) && fat == other.fat;
    }
}
