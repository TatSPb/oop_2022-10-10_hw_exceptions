public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean success = Data.validate("Hobot", "hobot_263245", "hobot_263245");
        if (success) {
            System.out.println("Данные введены корректно");
        } else {
            System.out.println("Данные введены некорректно");
        }
    }
}