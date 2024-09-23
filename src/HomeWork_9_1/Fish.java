package HomeWork_9_1;

import HomeWork_9_1.Animals;
import HomeWork_9_1.CanSwim;

public class Fish extends Animals implements CanSwim {
    private static int nextId;

    public Fish(String name, int age) {
        super(name, age);
        id = nextId++;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public String getInfo() {
        return String.format("Fish [Id: %d, Name: %s, Age: %d]", nextId, name, age);
    }
}