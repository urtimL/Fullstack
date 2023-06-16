package Homework.Ait.HW20Computer;

import Homework.Ait.HW20Computer.Model.Computer;
import Homework.Ait.HW20Computer.Model.ComputerStorage;
import Homework.Ait.HW20Computer.Model.Laptop;
import Homework.Ait.HW20Computer.Model.Smartfone;


public class ComputerAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 12, 512, "HP", 11111);
        Laptop lap1 = new Laptop("i7", 16, 512, "Asus", 2.5, 2.1, 22222);
        Smartfone smrt1 = new Smartfone("Snapdragon 8 Gen 2", 8,124, "Sumsung", 24, 0.125, 8888, 33333);

        System.out.println(comp1.toString());
        System.out.println(lap1.toString());
        System.out.println(smrt1.toString());
        System.out.println();

        ComputerStorage computerStorage = new ComputerStorage(5);
        computerStorage.addComputer(comp1);
        computerStorage.addComputer(lap1);
        computerStorage.addComputer(smrt1);

        showStorage(computerStorage);

        System.out.println("Remove computer with barcode: 11111");
        computerStorage.removeComputer(11111);

        showStorage(computerStorage);
    }

    private static void showStorage(ComputerStorage computerStorage){
        System.out.println("Size of computer storage: " + computerStorage.getSize());

        System.out.println("Computer storage contents:");
        computerStorage.printComputers();
    }
}
