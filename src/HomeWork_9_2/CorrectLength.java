//Создать класс, в котором будет статический метод.
//Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов (метод length()) и не должен содержать пробелы (метод contains(...)).
//Если login не соответствует этим требованиям, необходимо выбросить  WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру 1.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны или false в другом случае. Вывести на консоль причину, по которой вернулось false


package HomeWork_9_2;

public class CorrectLength {

    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            //Проверка логина
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Login должен быть меньше 20 символов и не содержать пробелы.");
            }

            //Проверка пароля
            if (password.length() >= 20 || password.contains(" ") || !password.contains("1")) {
                throw new WrongPasswordException("Password должен быть меньше 20 символов, не содержать пробелы и содержать хотя бы одну цифру '1'.");
            }

            //пароли совпадают
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password и confirmPassword должны совпадать.");
            }

            return true; // Если всё прошло успешно
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return false; // Если выброшен exception
        }
    }
}
