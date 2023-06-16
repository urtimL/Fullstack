package Homework.Ait.HW20Computer.Model;

public class Smartfone extends Laptop {
    private long imei;

    public Smartfone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei, int barCode) {

        super(cpu, ram, ssd, brand, hours, weight, barCode);
        this.imei = imei;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", imei = " + imei;
    }
}
