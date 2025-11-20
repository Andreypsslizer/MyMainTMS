package MyExeption;

public class MyMain {
    public static void main(String[] args) {
        // Please enter USERNAME & PASSWORD
        System.out.println(verification());
    }

    public static boolean verification(){
        boolean isCorrect = false;
        try{
//            System.out.print("Please, enter your USERNAME: ");
//            String username = new Scanner(System.in).nextLine();
//            System.out.print("Please, enter your PASSWORD: ");
//            String password = new Scanner(System.in).nextLine();
            initializeVerification(" Andrei", "741258", "741258");
            isCorrect = true;

            //initializeException(username, password);
            // Когда вы сделаете ПРАВИЛЬНЫЙ ВЫЗОВ СЛЕДУЮЩИЙ КОД ЗАРАБОТАЕТ
        } catch (WrongLoginException | WrongPasswordException e){
            // CODE
            System.out.println("Invalid input: " + e.getMessage());
        }
        return isCorrect;
    }

    public static void initializeVerification(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("INCORRECT LOGIN");
        } else if (password.length() > 20 || password.contains(" ") || !password.matches("\\d+") ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("INCORRECT PASSWORD");
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
