package NameGame;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        // Угадай Слово - ПОЛЕ ЧУДЕС
        startGame();
    }

    public static void startGame(){
        // ВСЕ ВЫЗОВЫ И ОСНОВНАЯ ЛОГИКА
        System.out.println("Добро пожаловать в игру - УГАДАЙ СЛОВО!");
        System.out.println("Я загадал какое-то слово, которое вы можете отгадать по буквам или полностью.");
        System.out.println("Как только вы буквы будут отгаданы - ВЫ ПОБЕДИТЕ. Если же отгадает полностью слово" +
                ". Также, будете объявлены победителем.");
        System.out.println("Давайте начнем игру!");
        Scanner sc = new Scanner(System.in);
        String word = "Батарея";

        // 1. APPLE - a..., r...., e...
        while(true){
            System.out.println("Если Вы введёте слово целиком— нажмите 1. Если вы введёте букву— нажмите 2" +
                    "Чтобы выйти из игры нажмите 3");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Введите предполагаемое слово");
                if (word.equalsIgnoreCase(sc.next())) {
                    System.out.println("Вы угадали слово!");
                    break;
                } else {
                    System.out.println("Вы не угадали слово.. Попробуйте ещё раз.");
                }
            } else if (choice == 2) {
                System.out.println("Введите предполагаемую букву");
                if (word.indexOf(sc.next()) == -1) {
                    System.out.println("Такой буквы в слове нет!");
                } else {
                    System.out.println("Такая буква есть в этом слове!");
                }
            } else if (choice == 3) {
                System.out.println("Вы захотели выйти из игры!");
                break;
            }
            // Если вы откажетесь дальше играть
            // Если вы угадаете все буквы
            // Если вы внезапно все слово разом отгадали
        }
    }
}
