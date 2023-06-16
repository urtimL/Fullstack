package Homework.Ait.HW20Computer.Model;

public class ComputerStorage {
    private Computer[] computers;
    private int size;

    public ComputerStorage(int capacity) {
        computers = new Computer[capacity];
    }

    public boolean addComputer(Computer computer) {
        if (size == computers.length || findComputer(computer.getBarCode()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("=============================================");
    }

    public int getSize() {
        return size;
    }

    public Computer findComputer(int BarCode) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getBarCode() == BarCode) {
                return computers[i];
            }
        }
        return null;
    }

    public Computer removeComputer(int BarCode) {
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if (computers[i].getBarCode() == BarCode){
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }
}
