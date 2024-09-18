package HomeWork_7_2;

public class Parrot extends Animals implements CanFly,CanSpeak {

    private static int nextId;
    private int heightMax;
    private String color;

    public Parrot(String name, int age,int heightMax,String color) {
        super(name, age);
        this.heightMax = heightMax;
        this.color = color;
        id = nextId++;
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly to " + heightMax + " meters of height.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Popka is an idiot!");
    }

    @Override
    public String getInfo() {
        return String.format("Parrot [Id: %d, Name: %s, Age: %d, Flight Height: %d, Feather Color: %s]", nextId, name, age, heightMax, color);
    }
}
