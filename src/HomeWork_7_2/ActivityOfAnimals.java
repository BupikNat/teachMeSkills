package HomeWork_7_2;

import HomeWork_7_1.CanSwim;

import java.util.Random;

public class ActivityOfAnimals {

    public static void main(String[] args) {
        Animals[] animals = new Animals[10];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int typeofAnimal = random.nextInt(5);
            int id = i + 1;
            String name = "Animal_" + id; //Можно было сделать массив имен и так же рандомно выбирать и подставлять. Но уже лень
            int age = random.nextInt(10) + 1;

            switch (typeofAnimal) {
                case 0:
                    animals[i] = new Dog(name, age, "Owner" + id);
                    break;
                case 1:
                    animals[i] = new Cat(name, age);
                    break;
                case 2:
                    animals[i] = new Raven(name, age, random.nextInt(1000) + 100);
                    break;
                case 3:
                    animals[i] = new Fish(name, age);
                    break;
                case 4:
                    animals[i] = new Parrot(name, age, random.nextInt(1000) + 100, "Color" + id);
                    break;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getInfo());

            if (animals[i] instanceof CanSpeak) {
                ((CanSpeak) animals[i]).speak();
            }
            if (animals[i] instanceof CanSwim) {
                ((CanSwim) animals[i]).swim();
            }
            if (animals[i] instanceof CanFly) {
                ((CanFly) animals[i]).fly();
            }
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).walk();
            }
            System.out.println();
        }
    }
}
