package Homework.Ait.HW20Computer.Model;

public class Laptop extends Computer {
    private double hours;
    private double weight;

    public Laptop(String cpu, int ram, int ssd, String brand, double hours, double weight, int barCode) {
        super(cpu, ram, ssd, brand, barCode);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hours = " + hours +
                ", weight = " + weight;
    }

    public void display() {
        super.display();
        System.out.print(", Hours: " + hours + ", Weight: " + weight);
    }

}
