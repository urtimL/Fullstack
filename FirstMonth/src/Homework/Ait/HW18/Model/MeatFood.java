package Homework.Ait.HW18.Model;

import java.util.Objects;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(String name, double price, long barCode, String expDate, String meatType) {
        super(name, price, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return super.toString() + ", meatType = " + meatType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MeatFood)) {
            return false;
        }
        MeatFood other = (MeatFood) obj;
        return super.equals(obj) && Objects.equals(meatType, other.meatType);
    }
}
