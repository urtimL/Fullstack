package Homework.Ait.PetHW.Model;

public class Cat extends Pet{
    private String name;
    private String breed;
    private int age;

    public Cat(String type, double weight, boolean livesAtHome, String name, String breed, int age) {
        super(type, weight, livesAtHome);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

//------------------------------------------------------------//
// Можно ли так получить поля родителя
//или как это делать?
    public String getType() {
        return super.getType();
    }

    public double getWeight() {
        return super.getWeight();
    }

    public boolean isLivesAtHome() {
        return super.isLivesAtHome();
    }
//----------------------------------------------------------------//
    public void eat(){
        System.out.println("Cat: " + name + " eats.");
    }

    public void sleep() {
        System.out.println("Cat: " + name + " sleep.");
    }

    public void voice(){
        System.out.println("Cat: " + name + " said - Мяу!");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name = " + name +
                ", breed = " + breed +
                ", age = " + age +
                super.toString();
    }
}
