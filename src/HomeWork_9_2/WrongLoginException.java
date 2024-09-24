package HomeWork_9_2;

public class WrongLoginException extends Exception {

    // Конструктор по умолчанию
    public WrongLoginException() {
        super();
    }

    // Конструктор с сообщением
    public WrongLoginException(String errorMessage) {
        super(errorMessage);
    }
}
