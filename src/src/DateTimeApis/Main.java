package DateTimeApis;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        whenAgeHund();
        printPositiveNumbs();
        getDollarsF();
        getDollarsC();
        reverseString();
    }


    //Задача 1:
    //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
    //когда пользователю исполнится 100 лет. Использовать Date/Time API.
    public static LocalDate whenAgeHund() {
        System.out.print("Please enter your birth date like 'year-month-date'");
        String sc = new Scanner(System.in).next();
        return LocalDate.parse(sc).plusYears(100);
    }


    //Задача 2:
    //Используя Predicate среди массива чисел вывести только те, которые являются
    //положительными.
    public static void printPositiveNumbs() {
        int[] numbers = new int[]{1, 5, -8, 11, 99, -51, -0, 0};
        Predicate<Integer> isPos = num -> num > 0;
        for (int num : numbers) {
            if (isPos.test(num)) {
                System.out.println(num);
            }
        }
    }


    //Задача 3:
    //Используя Function реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //возвращать сумму, переведенную сразу в доллары.
    public static Integer getDollarsF() {
        Function<String, Integer> dollarsConverter = x -> Integer.parseInt(x) / 3;
        return dollarsConverter.apply("500 BYN".replaceAll(" BYN", ""));
    }


    //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //выводить сумму, переведенную сразу в доллары
    public static void getDollarsC() {
        Consumer<String> dollarsConverter = x -> System.out.println(Integer.parseInt(x) / 3);
        dollarsConverter.accept("500 BYN".replaceAll(" BYN", ""));
    }

    //Задача 5:
    //Используя Supplier написать метод, который будет возвращать введенную с консоли
    //строку задом наперед.
    public static String reverseString() {
        String sc = new Scanner(System.in).nextLine();
        Supplier<String> reverse = () -> {
            StringBuilder reversed = new StringBuilder(sc);
            return String.valueOf(reversed.reverse());
        };
        return reverse.get();
    }
}
