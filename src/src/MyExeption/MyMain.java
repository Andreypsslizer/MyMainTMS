package MyExeption;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Please enter USERNAME & PASSWORD
        verification();
    }

    public static void verification(){
        try{
            System.out.print("Please, enter your USERNAME: ");
            String username = new Scanner(System.in).nextLine();
            System.out.print("Please, enter your PASSWORD: ");
            String password = new Scanner(System.in).nextLine();

            initializeException(username, password);
            // Когда вы сделаете ПРАВИЛЬНЫЙ ВЫЗОВ СЛЕДУЮЩИЙ КОД ЗАРАБОТАЕТ
        } catch (UserPassExeption e){
            // CODE
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    // Должен быть МЕТОД, который проинициализирует вас собственный КЛАСС ИСКЛЮЧЕНИЕ
    public static void initializeException(String login, String pssword) throws UserPassExeption{
        String goodName = "Andrei";
        String goodPassword = "963258741";
        // КОД
        // ЕСЛИ что-то
        // throw UserPassException("Your username is WRONG!");
        // Если что-то
        // throw UserPassException("Your password is WRONG!");
        if (!login.equals(goodName)) throw new UserPassExeption("INCORRECT LOGIN!");
        if (!pssword.equals(goodPassword)) throw new UserPassExeption("INCORRECT PASSWORD!");

    }
}
