//Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа). Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
//- Вывести на экран в одну строку два первых блока по 4 цифры.
//- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
//- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
//- Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
//- Проверить начинается ли номер документа с последовательности 555.
//- Проверить заканчивается ли номер документа на последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.

package HomeWork_10;

import java.util.Scanner;

public class StringMethods extends Verification{

    // Метод для вывода первых двух блоков чисел
    public static void printFirstBlocks(String docNumber) {
        String[] parts = docNumber.split("-");
        System.out.println(parts[0] + " " + parts[2]);
    }

    // Метод для замены блоков букв на ***
    public static void replaceLettersWithStars(String docNumber) {
        String modifiedDocNumber = docNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedDocNumber);
    }

    // Метод для вывода только букв в формате yyy/yyy/y/y в нижнем регистре
    public static void printOnlyLetters(String docNumber) {
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String formattedLetters = letters.substring(0, 3) + "/" + letters.substring(3, 6) + "/"
                + letters.charAt(6) + "/" + letters.charAt(7);
        System.out.println(formattedLetters);
    }

    // Метод для вывода букв в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    public static void printLettersWithStringBuilder(String docNumber) {
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(letters.substring(0, 3)).append("/")
                .append(letters.substring(3, 6)).append("/")
                .append(letters.charAt(6)).append("/")
                .append(letters.charAt(7));
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа:");
        String docNumber = scanner.nextLine();


        printFirstBlocks(docNumber);              // вывости два первых блока цифр
        replaceLettersWithStars(docNumber);       // заменить буквы на ***
        printOnlyLetters(docNumber);              // вывести буквы в нижнем регистре
        printLettersWithStringBuilder(docNumber); // вывести буквы в верхнем регистре через StringBuilder


        Verification.checkIfContainsABC(docNumber);   // проверка содержит ли 'abc'
        Verification.checkIfStartsWith555(docNumber); // проверка начинается ли с '555'
        Verification.checkIfEndsWith1a2b(docNumber);  // проверка заканчивается ли на '1a2b'

        scanner.close();
    }
}

//Номер документа для проверки 1234-abc-5678-def-1a2b