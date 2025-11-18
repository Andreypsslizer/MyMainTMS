package MyExeption;

public class UserPassExeption extends Exception{
    public UserPassExeption(String message){
        // Добавить что ХОТИТЕ
        // message - НАЗВАНИЕ ОШИБКИ
        super(message);
    }
}
