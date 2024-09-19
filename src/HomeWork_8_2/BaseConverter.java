//Напишите класс BaseConverter для конвертации градусов по Цельсию, Кельвину ,  и Фаренгейту между собой.
// У класса должен быть 1 публичный метод convert, который и делает конвертацию.
// Вводить данные и выводить результат операций с указанием шкалы градусов (F / K / C на конце). Использовать enum
//Соотношения температур:
//• <Температура по Цельсию>
//• <Температура по Цельсию> + 273.15 —-> по Кельвину
//• 1.8 * <Температура по Цельсию> + 32 —-> по Фаренгейту

package HomeWork_8_2;

public class BaseConverter {

    public void convert(double temperature, Scale inputScale) {
        double result;
        Scale outputScale;

        switch (inputScale) {
            case CELSIUS:
                result = temperature;
                outputScale = Scale.CELSIUS;
                System.out.println("Celsius temperature is : " + temperature + " C");
                break;
            case KELVIN:
                result = temperature - 273.15;
                outputScale = Scale.CELSIUS;
                System.out.println("Kelvin temperature: " + temperature + " K");
                break;
            case FAHRENHEIT:
                result = (temperature - 32) / 1.8;
                outputScale = Scale.CELSIUS;
                System.out.println("Fahrenheit temperature: " + temperature + " F");
                break;
            default:
                System.out.println("Invalid input scale");
                return;
        }

        System.out.println("Converted " + result + " " + outputScale);
    }
}
