package HomeWork_7_2;

public class Raven extends Animals implements CanFly {
    private static int nextId;

    private int maxHeight;

    public Raven (String name, int age,int maxHeight) {
        super(name, age);
        this.maxHeight = maxHeight;
        id = nextId++;
    }


    @Override
    public void fly() {
        System.out.println(name + " can fly to " + maxHeight + " meters. It is higher than parrot can.");
    }

    @Override
    public String getInfo() {
        return String.format("Raven [Id: %d, Name: %s, Age: %d, Max Flight Height: %d]", nextId, name, age, maxHeight);
    }
}
