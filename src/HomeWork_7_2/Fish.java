package HomeWork_7_2;

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
