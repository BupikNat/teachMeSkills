package HomeWork_12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Documents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> documentNumbers = new HashSet<>();  // коллекция для уникальных номеров документов
        Set<String> processedDocuments = new HashSet<>();  // коллекция для хранения уже проверенных документов

        System.out.println("Введите номера документов. Номер документа должен иметь длину 15 символов и начинаться с docnum (далее любая последовательность букв/цифр) или kontract (далее любая последовательность букв/цифр).");
        System.out.println("Для завершения ввода введите 0.");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equals("0")) {
                break;
            }

            if (!documentNumbers.contains(input)) {
                documentNumbers.add(input);  // добавляем только уникальные номера
            }
        }

        System.out.println("\nОтчет о проверке номеров документов:");

        for (String docNumber : documentNumbers) {
            if (processedDocuments.contains(docNumber)) {
                continue;  // пропускаем уже проверенные документы
            }

            String result = validateDocumentNumber(docNumber);
            System.out.println(docNumber + " - " + result);

            processedDocuments.add(docNumber);  // добавляем документ в проверенные
        }

        scanner.close();
    }

    // Метод для проверки валидности документа
    public static String validateDocumentNumber(String docNumber) {
        if (docNumber.contains(" ")) {
            return "не валиден (содержит пробелы)";
        }

        if (docNumber.length() != 15) {
            return "не валиден (неверная длина)";
        }

        if (docNumber.startsWith("docnum") || docNumber.startsWith("kontract")) {
            return "валиден";
        } else {
            return "не валиден (неверный префикс)";
        }
    }
}
