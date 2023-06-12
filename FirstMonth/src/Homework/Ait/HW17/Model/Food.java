package Homework.Ait.HW17.Model;

public class Food extends Product{
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
}
