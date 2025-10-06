package Main;

public class MyMain {
    public static void main(String[] args) {
        printNameAge();
        System.out.println("-".repeat(50));
        calculateWithFormula(4, 3);
        System.out.println("-".repeat(50));
        dividingInTwoNumbers(32);
        System.out.println("-".repeat(50));
        dividingInThreeNumbers(534);
        System.out.println("-".repeat(50));
        rounding(4.44681);
        System.out.println("-".repeat(50));
        dividingWithRemainder(21, 8);
        System.out.println("-".repeat(50));
        switchValues(3, 5);
    }


    public static void printNameAge() {
        System.out.println("Kovzik Andrei");
        int age = 25;
        System.out.println("Age= " + age);
    }

    //Задача 1:
    //Написать приложение, которое будет вычислять и выводить значение по формуле:
    //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void calculateWithFormula(int b, int c){
        int a = 4 * (b + c -1) / 2;
        System.out.println(a);
    }

    //Задача 2:
    //В переменной n хранится двузначное число. Создайте программу, вычисляющую и
    //выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
    //(2+6).
    public static void dividingInTwoNumbers(int n) {
        //Со строкой первое что пришло в голову
        /*String nStr = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < nStr.length(); i++) {
            sum += Character.getNumericValue(nStr.charAt(i));
        }
        //int a = Character.getNumericValue(nStr.charAt(0));
        //int b = Character.getNumericValue(nStr.charAt(1));
        System.out.println(sum);*/
        int firstDig = n / 10;
        int secondDig = n % 10;
        System.out.println(firstDig + secondDig);
    }

    //Задача 3:
    //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
    //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).
    public static void dividingInThreeNumbers(int n) {
        int firstDig = n / 100;
        int secondDig = n / 10 % 10;
        int thirdDig = n % 100 % 10;
        System.out.println(firstDig + secondDig + thirdDig);
    }

    //Задача 4:
    //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //программу, округляющую число n до ближайшего целого и выводящую результат на
    //экран.
    public static void rounding(double value){
        //int res = (int) Math.round(value);
        int res = (int) value;
        if (value % res > 0.5) {
            res++;
            System.out.println(res);
        } else {
            System.out.println(res);
        }

    }

    //Задача 5:
    //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    //на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    //когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
    public static void dividingWithRemainder(int q, int w) {
        System.out.println(q / w + " и " + q % w + " в остатке");
    }

    //Задача *:
    //Написать программу которая будет менять местами значение целочисленных
    //переменных.
    public static void switchValues(int a, int b) {
        int c =a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
