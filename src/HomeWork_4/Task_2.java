//Задача 2. Шахматная доска
//Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив char'ов 8х8.
//С помощью циклов задать элементам массива значения B(Black) или W(White).
//Результат работы программы:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W

package HomeWork_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        char[][] boardForChess = new char[8][8];

        char white = 'W';
        char black = 'B';

        for (int i = 0; i < boardForChess.length; i++) {
            for (int j = 0; j < boardForChess[i].length; j++) {

                if ((i + j) % 2 == 0) {
                    boardForChess[i][j] = white;
                    System.out.print(boardForChess[i][j] + " ");
                } else {
                    boardForChess[i][j] = black;
                    System.out.print(boardForChess[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// Изменения для комита
