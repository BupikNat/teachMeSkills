//Задание 1.Создать класс CreditCard c полями номер счета (строка), текущая сумма на счету (вещественная).
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма (начальная сумма вводится с консоли и не может быть меньше 0)
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.


package HomeWork_6;

import java.util.Scanner;

public class CreditCard {

    public String accountNumber;
    public double moneyAmount;

    public CreditCard (String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double addingToCard (double adding) {
        this.moneyAmount += adding;
        return moneyAmount;
    }

    public double takingFromCard (double taking) {
        if (this.moneyAmount >= taking) {
            this.moneyAmount -= taking;
            return moneyAmount;
        } else {
            return moneyAmount;
        }
    }

    public void firstInfoCard() {
        System.out.println("Enter sum you want to add/take");
        this.moneyAmount = new Scanner(System.in).nextDouble();

        if (this.moneyAmount > 0) {
            System.out.println("Account number is " + this.accountNumber + ". Your balance is " + this.moneyAmount);
            System.out.println("Balance is " + this.moneyAmount);
        } else {
            System.out.println("Sum should be more than 0");
        }
    }

    public void currentInfoCard() {
        System.out.println("Account number is " + this.accountNumber + ". Balance is " + this.moneyAmount);
    }
}
