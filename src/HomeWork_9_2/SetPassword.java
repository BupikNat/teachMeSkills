package HomeWork_9_2;

public class SetPassword extends CorrectLength {

    public static void main(String[] args) {

        String login = "user1";
        String password = "pass1";
        String confirmPassword = "pass1";

        boolean result = validateLoginAndPassword(login, password, confirmPassword);
        System.out.println("Результат валидации: " + result);
    }
}