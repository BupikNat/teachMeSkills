package HomeWork_9_1;

import HomeWork_9_1.Animals;
import HomeWork_9_1.CanFly;
import HomeWork_9_1.CanSpeak;

public class Parrot extends Animals implements CanFly, CanSpeak {

    private static int nextId;
    private int heightOfFly;
    private String color;


    public Parrot(String name, int age,int heightOfFly,String color) {
        super(name, age);
        this.heightOfFly = heightOfFly;
        this.color = color;
        id = nextId++;
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly to " + heightOfFly + " meters of height.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Popka is an idiot!");
    }

    @Override
    public String getInfo() {
        return String.format("Parrot [Id: %d, Name: %s, Age: %d, Flight Height: %d, Feather Color: %s]", nextId, name, age, heightOfFly, color);
    }
}