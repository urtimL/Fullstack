package Homework.Ait.Computer;

import Homework.Ait.Computer.Model.Computer;
import Homework.Ait.Computer.Model.Laptop;
import Homework.Ait.Computer.Model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 12, 512, "HP");
        Laptop lap1 = new Laptop("i7", 16, 512, "Asus", 2.5, 2.1);
        Smartphone smrt1 = new Smartphone("Snapdragon 8 Gen 2", 8,124, "Sumsung", 24, 0.125, 8888);
        comp1.display();
        System.out.println();
        lap1.display();
        System.out.println();
        smrt1.display();
        System.out.println();
    }
}
