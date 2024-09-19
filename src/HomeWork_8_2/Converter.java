package HomeWork_8_2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();

        // Ввод температуры и шкал
        System.out.println("Введите значение температуры: ");
        double value = scanner.nextDouble();
        System.out.println("Введите исходную шкалу (C/F/K): (конвертировать из) ");
        String fromSymbol = scanner.next();
        System.out.println("Введите целевую шкалу (C/F/K): (конвертировать в) ");
        String toSymbol = scanner.next();

        // Получение шкал из строки
        Scale fromScale = Scale.fromSymbol(fromSymbol);
        Scale toScale = Scale.fromSymbol(toSymbol);

        // Конвертация температуры
        double result = converter.convert(value, fromScale, toScale);

        // Вывод результата
        System.out.printf("Результат конвертации: %.2f%s%n", result, toScale.getSymbol());
    }
}
