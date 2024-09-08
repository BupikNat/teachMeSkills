//Задача 3. Создайте двумерный массив размера n*n, n вводится с консоли от 2 до 6, после чего заполняется случайными элементами от -100 до 100.
// Выведите на консоль сумму  элементов диагоналей массива.

package HomeWork_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number from 2 to 6");
        int n = scanner.nextInt();
        if (n < 2 || n > 6) {
            System.out.println("Wrong number");
            return;
        }

        int[][] multyArray = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < multyArray.length; i++) {
            for (int j = 0; j < multyArray[i].length; j++) {

                int randomValuesInArray = random.nextInt(-100, 100);
                multyArray[i][j] = randomValuesInArray;
                System.out.print(randomValuesInArray + " ");
            }
            System.out.println();
        }

        int straightDiagonal = 0;
        int reversDiagonal = 0;

        for (int i = 0; i < multyArray.length; i++) {
            for (int j = 0; j < multyArray[i].length; j++) {
                if (i == j) {
                    straightDiagonal += multyArray[i][j];
                } else if (n - i - 1 == j) {
                    reversDiagonal += multyArray[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of elements for straight diagonal is: " + straightDiagonal);
        System.out.println("Sum of elements for revers diagonal is: " + reversDiagonal);
    }
}

// Изменения для комита