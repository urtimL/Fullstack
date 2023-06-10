package Homework.Ait.PetHW.Model;

public class Pet {
    private String type;
    private double weight;
    private  boolean livesAtHome;

    public Pet(String type, double weight, boolean livesAtHome) {
        this.type = type;
        this.weight = weight;
        this.livesAtHome = livesAtHome;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isLivesAtHome() {
        return livesAtHome;
    }

    @Override
    public String toString() {
        return ", type = " + type +
                ", weight = " + weight +
                ", livesAtHome = " + livesAtHome;
    }
}
