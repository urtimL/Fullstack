package Homework.Ait.Computer.Model;

public class Smartphone extends Laptop{
    private long isbn;
    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long isbn) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.isbn = isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public void display() {
        super.display();
        System.out.print(", isbn: " + isbn);
    }
}
