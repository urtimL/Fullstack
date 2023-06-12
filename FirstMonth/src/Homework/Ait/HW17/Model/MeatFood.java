package Homework.Ait.HW17.Model;

public class MeatFood extends Food{
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
}
