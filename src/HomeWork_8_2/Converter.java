package HomeWork_8_2;

public class Converter {
    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter();
        converter.convert(25, Scale.CELSIUS); // Пример вызова метода для преобразования температуры
        converter.convert(298, Scale.KELVIN);
        converter.convert(77, Scale.FAHRENHEIT);
    }
}
