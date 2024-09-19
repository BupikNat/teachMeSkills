//Напишите класс BaseConverter для конвертации градусов по Цельсию, Кельвину ,  и Фаренгейту между собой.
// У класса должен быть 1 публичный метод convert, который и делает конвертацию.
// Вводить данные и выводить результат операций с указанием шкалы градусов (F / K / C на конце). Использовать enum
//Соотношения температур:
//• <Температура по Цельсию>
//• <Температура по Цельсию> + 273.15 —-> по Кельвину
//• 1.8 * <Температура по Цельсию> + 32 —-> по Фаренгейту

package HomeWork_8_2;

public class BaseConverter {

    // Метод для конвертации температуры
    public double convert(double value, Scale fromScale, Scale toScale) {
        // Если шкалы одинаковые, возвращаем исходное значение
        if (fromScale == toScale) {
            return value;
        }

        double celsiusValue = value;

        // Преобразование к Цельсию, если шкала не Цельсий
        if (fromScale == Scale.FAHRENHEIT) {
            celsiusValue = (value - 32) / 1.8; // Фаренгейт в Цельсий
        } else if (fromScale == Scale.KELVIN) {
            celsiusValue = value - 273.15; // Кельвин в Цельсий
        }

        // Преобразование из Цельсия в целевую шкалу
        if (toScale == Scale.FAHRENHEIT) {
            return celsiusValue * 1.8 + 32; // Цельсий в Фаренгейт
        } else if (toScale == Scale.KELVIN) {
            return celsiusValue + 273.15; // Цельсий в Кельвин
        }

        return celsiusValue; // Если цель Цельсий, просто вернуть значение
    }
}
