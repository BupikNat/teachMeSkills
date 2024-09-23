package HomeWork_9_1;

import HomeWork_9_1.Animals;

public class Cat extends Animals {

    private static int nextId;
    public Cat(String name, int age) {
        super(name, age);
        id = nextId++;

    }

    @Override
    public String getInfo() {
        return String.format("Cat [Id: %d, Name: %s, Age: %d]", nextId, name, age);
    }

}