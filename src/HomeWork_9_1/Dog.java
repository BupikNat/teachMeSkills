package HomeWork_9_1;

import HomeWork_9_1.Animals;

public class Dog extends Animals {

    private static int nextId;
    private String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        id = nextId++;
        this.ownerName = ownerName;
    }


    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public String getInfo() {
        return String.format("Dog [Id: %d, Name: %s, Age: %d, Owner: %s]", nextId, name, age, ownerName);
    }
}
