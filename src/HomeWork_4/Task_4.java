//Задача 4. Создать двумерный массив  m*n, где m,n вводятся с клавиатуры, оба >= 3.
// Заполнить случайными числами, отсортировать каждую строку отдельно по возрастанию с применением Arrays.sort()

package HomeWork_4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number 'n' starts from 3");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Wrong number");
            return;
        }

        System.out.println("Please, enter a number 'm' starts from  3");
        int m = scanner.nextInt();
        if (m < 3) {
            System.out.println("Wrong number");
            return;
        }

        int[][] multyArray = new int[n][m];

        Random random = new Random();

        for (int i = 0; i < multyArray.length; i++) {
            for (int j = 0; j < multyArray[i].length; j++) {

                int randomValuesInArray = random.nextInt(1, 10);
                multyArray[i][j] = randomValuesInArray;
                System.out.print(randomValuesInArray + " ");
            }
            Arrays.sort(multyArray[i]);
            System.out.println(Arrays.toString(multyArray[i]));
        }
    }
}
// Изменения для комита