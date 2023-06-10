package Homework.Ait.PetHW;

import Homework.Ait.PetHW.Model.Cat;
import Homework.Ait.PetHW.Model.Dog;
import Homework.Ait.PetHW.Model.Pet;

public class HouseAppl {
    public static void main(String[] args) {
        view();
    }

    private static void view(){
        Pet[] pets = new Pet[5];

        pets[0] = new Dog("type 1", 25, true, "Mike", "Booldog", 5);
        pets[1] = new Dog("type 2", 2, true, "Beast", "Spitz", 3);
        pets[2] = new Cat("type 3", 15, true, "Tot", "Himalayan", 8);
        pets[3] = new Cat("type 4", 5, true, "Tom", "Foldex", 3);
        pets[4] = new Cat("type 5", 3, true, "Kitty", "Highlander", 5);

        System.out.println("Let's meet our animals: ");
        System.out.println();

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }
/*
       К сожалению вот так не получилось:
       pets[0].run();
       поэтому пришлось вытянуть объекты из массива
 */
        Dog dog1 = (Dog) pets[0];
        Dog dog2 = (Dog) pets[1];
        Cat cat1 = (Cat) pets[2];
        Cat cat2 = (Cat) pets[3];
        Cat cat3 = (Cat) pets[4];

        System.out.println();

        dog1.run();
        dog2.eat();
        cat1.sleep();
        cat2.eat();
        cat3.voice();
    }
}
