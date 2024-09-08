//Задача 1. Создать трехмерный массив из целых чисел, заполнить случайными числами от -100 до 100.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
// Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.


package HomeWork_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        int[][][] array = new int[3][3][3];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    int randomeValuesInArray = random.nextInt(-100, 100);
                    array[i][j][k] = randomeValuesInArray;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number:");
        int numberForAdding = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    array[i][j][k] += numberForAdding;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        scanner.close();
    }
}
//Задача 1. Создать трехмерный массив из целых чисел, заполнить случайными числами от -100 до 100.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
// Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.