package Homework.Ait.HW20Computer.Model;

import java.util.Objects;

public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;

    private int barCode;

    public Computer() {
        super();
    }

    public Computer(String cpu, int ram, int ssd, String brand, int barCode) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.barCode = barCode;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand = " + brand +
                ", barCode = " + barCode +
                ", cpu = " + cpu +
                ", ram = " + ram +
                ", ssd = " + ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return barCode == computer.barCode;
    }

    public void display() {
        System.out.print("Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd);
    }
}
