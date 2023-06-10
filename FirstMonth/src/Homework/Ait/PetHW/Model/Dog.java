package Homework.Ait.PetHW.Model;

public class Dog extends Pet{
    private String name;
    private String breed;
    private int age;

    public Dog(String type, double weight, boolean livesAtHome, String name, String breed, int age) {
        super(type, weight, livesAtHome);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void eat(){
        System.out.println("Dog: " + name + " eats.");
    }

    public void sleep(){
        System.out.println("Dog: " + name + " is sleeping.");
    }

    public void run(){
        System.out.println("Dog: " + name + " is running.");
    }

    public void voice(){
        System.out.println("Dog: " + name + " said - Гав-гав!");
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name = " + name +
                ", breed = " + breed +
                ", age = " + age +
                super.toString();
    }
}
