package HomeWork_9_2;

public class WrongPasswordException extends Exception {

    // Конструктор по умолчанию
    public WrongPasswordException() {
        super();
    }

    // Конструктор с сообщением
    public WrongPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
