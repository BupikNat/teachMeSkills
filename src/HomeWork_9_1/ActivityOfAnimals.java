package HomeWork_9_1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActivityOfAnimals {

    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < animals.length; i++) {
            int typeofAnimal = random.nextInt(5);
            int id = i + 1;
            String name = "Animal_" + id;
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

        //Вывести информацию обо всех животных на консоль
        System.out.println("Информация о животных:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println((i + 1) + ". " + animals[i].getInfo());
        }

        //Предложение выбрать действие для каждого конкретного животного
        boolean continueLoop = true;
        while (continueLoop) {
            for (int i = 0; i < animals.length; i++) {
                System.out.println("\nЖивотное: " + animals[i].getInfo());
                showAvailableActions(animals[i]);

                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.println("Выберите действие для этого животного (введите номер действия или 0 для пропуска): ");
                        int action = scanner.nextInt();

                        if (action == 0) {
                            System.out.println("Пропуск действия для этого животного.");
                            break;
                        }

                        executeAction(animals[i], action);
                        validInput = true;
                    } catch (Exception e) {
                        System.out.println("Ошибка: введите корректное число.");
                        scanner.next();
                    }
                }
            }

            //Вопрос хочет ли пользователь продолжить с другими животными (создать и заполнить ещё один массив животных)
            System.out.println("\nХотите продолжить выбирать действия для животных? (да/нет): ");
            String input = scanner.next().trim().toLowerCase();
            if (!input.equals("да")) {
                continueLoop = false;
            }
        }
        System.out.println("Программа завершена.");
        scanner.close();
    }

    //Метод - показать доступные для животного действия
    private static void showAvailableActions(Animals animal) {
        int actionNumber = 1;
        System.out.println("Доступные действия для этого животного:");
        if (animal instanceof CanSpeak) {
            System.out.println(actionNumber++ + ": Говорить");
        }
        if (animal instanceof CanSwim) {
            System.out.println(actionNumber++ + ": Плавать");
        }
        if (animal instanceof CanFly) {
            System.out.println(actionNumber++ + ": Летать");
        }
        if (animal instanceof Dog) {
            System.out.println(actionNumber + ": Гулять");
        }
    }

    //Метод - выполнить выбранное действия
    private static void executeAction(Animals animal, int action) {
        int actionNumber = 1;
        if (animal instanceof CanSpeak && action == actionNumber++) {
            ((CanSpeak) animal).speak();
        } else if (animal instanceof CanSwim && action == actionNumber++) {
            ((CanSwim) animal).swim();
        } else if (animal instanceof CanFly && action == actionNumber++) {
            ((CanFly) animal).fly();
        } else if (animal instanceof Dog && action == actionNumber) {
            ((Dog) animal).walk();
        } else {
            throw new IllegalArgumentException("Некорректный выбор действия. Попробуйте снова.");
        }
    }
}