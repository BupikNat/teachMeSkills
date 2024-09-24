package HomeWork_10;

public class Verification {

    // Метод для проверки наличия последовательности abc (без учета регистра)
    public static void checkIfContainsABC(String docNumber) {
        if (docNumber.toLowerCase().contains("abc")) {
            System.out.println("Документ содержит последовательность 'abc'.");
        } else {
            System.out.println("Документ не содержит последовательность 'abc'.");
        }
    }

    // Метод для проверки, начинается ли документ с "555"
    public static void checkIfStartsWith555(String docNumber) {
        if (docNumber.startsWith("555")) {
            System.out.println("Документ начинается с '555'.");
        } else {
            System.out.println("Документ не начинается с '555'.");
        }
    }

    // Метод для проверки, заканчивается ли документ на "1a2b"
    public static void checkIfEndsWith1a2b(String docNumber) {
        if (docNumber.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на '1a2b'.");
        } else {
            System.out.println("Документ не заканчивается на '1a2b'.");
        }
    }
}
