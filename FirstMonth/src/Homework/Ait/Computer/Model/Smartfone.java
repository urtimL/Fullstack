package Homework.Ait.Computer.Model;

public class Smartfone extends Laptop{
    private long imei;

    public Smartfone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {

        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }
}
