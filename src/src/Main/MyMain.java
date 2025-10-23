package Main;

import Animal.*;
import Bancomate.Bancomate;
import Clinic.Patient;
import CreditCard.CreditCard;

import java.util.Random;
import java.util.Scanner;

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
        System.out.println();
        System.out.println("-".repeat(50));

        System.out.println("HOMEWORK 3");
        System.out.println("-".repeat(50));
        checkEven(6);
        System.out.println("-".repeat(50));
        checkFeelTemp(20);
        System.out.println("-".repeat(50));
        printSquares();
        System.out.println("-".repeat(50));
        printArithmeticProgression(7);
        System.out.println("-".repeat(50));
        sumToEnteredNum();
        System.out.println("-".repeat(50));

        System.out.println("HOMEWORK 4");
        System.out.println("-".repeat(50));
        changeTheArray();
        System.out.println("-".repeat(50));

        System.out.println("HOMEWORK 5");
        System.out.println("-".repeat(50));
        createAddMultiArray();
        System.out.println("-".repeat(50));
        paintChessBoard();
        System.out.println("-".repeat(50));
        makeSnakeArray(4, 6);

        System.out.println("-".repeat(50));

        System.out.println("HOMEWORK 6");
        System.out.println("-".repeat(50));
        CreditCard bveb = new CreditCard();
        bveb.bankAccount = "8340958723";
        bveb.amountAcc = 3000;
        CreditCard bsb = new CreditCard();
        bsb.bankAccount = "5469515489";
        bsb.amountAcc = 1000;
        CreditCard prior = new CreditCard();
        prior.bankAccount = "1234567890";
        prior.amountAcc = 5000;
        bveb.addMoney(1056.5);
        bsb.addMoney(784);
        prior.withdrawMoney(4233);
        bveb.takeInformationCard();
        bsb.takeInformationCard();
        prior.takeInformationCard();

        System.out.println("-".repeat(50));

        Bancomate veb = new Bancomate(6,10,5);
        System.out.println("Can I withdraw? " + veb.withdrawMoney(960));
        System.out.println();
        System.out.println("Can I withdraw? " + veb.withdrawMoney(100));
        System.out.println();
        System.out.println("Can I withdraw? " + veb.withdrawMoney(100));

        System.out.println("-".repeat(50));

        Patient andrey = new Patient(2);
        andrey.assignTreatment();

        System.out.println("-".repeat(50));

        Rabbit bunny = new Rabbit();
        bunny.eat("grass");
        bunny.eat("meal");
        bunny.voice();
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
    //Написать программу, которая будет менять местами значение целочисленных
    //переменных.
    public static void switchValues(int a, int b) {
        int c =a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }

    //Задача 1:
    //Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выводить сообщение четное число или нет. Для определения четности числа
    //используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void checkEven(int n) {
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }

    //Задача 2:
    //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void checkFeelTemp(int t) {
        if ( t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void printSquares() {
        for (int i = 10; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    //Задача 4:
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void printArithmeticProgression(int n) {
        int sum = n;
        while (sum < 100) {
            System.out.print(sum + " ");
            sum += n;
        }
        System.out.println();
    }

    //Задача *:
    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные.
    public static void sumToEnteredNum() {
        System.out.println("Enter the number please");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("INCORRECT DATA!");
        } else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum of numbers from 1 to" + n + " equals: " + sum);
        }
    }

    //Задача 1:
    //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void changeTheArray() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter the length of array please");
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(10);
        }

        //Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + ": "+ intArray[i]);
        }
        System.out.println();
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println("Element " + i + ": "+ intArray[i]);
        }
        System.out.println();

        //Задача 2:
        //Найти минимальный-максимальный элементы и вывести в консоль.
        int min = intArray[0];
        int max = intArray[0];
        int minIndex = 0;
        int maxIndex = 0;
        /*for (int i : intArray) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }*/
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
                minIndex = i;
            } else if (intArray[i] > max) {
                max = intArray[i];
                maxIndex = i;
            }
        }
        System.out.println("Minimum value is " + min + "\nMaximum value is " + max);
        System.out.println();

        //Задача 3:
        //Найти индексы минимального и максимального элементов и вывести в консоль.
        System.out.println("Index of minimum value is " + minIndex + "\nIndex of maximum value is " + maxIndex);
        System.out.println();

        //Задача 4:
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.
        int sumOfZeroElements = 0;
        for (int i : intArray) {
            if (i == 0) sumOfZeroElements++;
        }
        System.out.println(sumOfZeroElements == 0 ? "There is no zero elements!" : "Number of zero elements is: "
                + sumOfZeroElements);
        System.out.println();

        //Задача 5:
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.
        int x;
        for (int i = 0, k = intArray.length - 1; i < k; i++, k--) {
            x = intArray[i];
            intArray[i] = intArray[k];
            intArray[k] = x;
        }
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 6:
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).
        boolean isIncreasing = false;
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                break;
            }
            if (i == intArray.length - 1){
                isIncreasing = true;
            }
        }
        System.out.println(isIncreasing ? "This array is an increasing sequence!" :
                "This array is not an increasing sequence!");
        System.out.println();

        //Задача *:
        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        System.out.println("How many digits in your number?");
        int[] arrayWithStar = new int[sc.nextInt()];
        int value;
        System.out.println("Enter the number digit by digit");
        for (int i = 0; i < arrayWithStar.length;) {
            if ((value = sc.nextInt()) < 0 || value > 9 || i == 0 && value == 0){
                System.out.println("You entered the wrong number! The first number can't be 0.");
                continue;
            }
            arrayWithStar[i] = value;
            i++;
        }
        if (arrayWithStar[arrayWithStar.length - 1] != 9) {
            arrayWithStar[arrayWithStar.length - 1] = arrayWithStar[arrayWithStar.length - 1] + 1;
        } else {
            int nmb = 0;
            for (int i = 0; i < arrayWithStar.length; i++) {
                nmb = nmb * 10 + arrayWithStar[i];
            }
            nmb++;
            String str = "" + nmb;
            int[] newArrWithStar = new int[str.length()];
            for (int i = 0; i < newArrWithStar.length; i++) {
                newArrWithStar[i] = Character.getNumericValue(str.charAt(i));
            }
            arrayWithStar = newArrWithStar;
        }

        for (int i : arrayWithStar) {
            System.out.print(i + " ");
        }
    }


    //Задача 1:
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void createAddMultiArray() {
        int[][] multiArray = new int[3][3];
        Random rnd = new Random();
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = rnd.nextInt(9);
            }
        }
        for (int[] col : multiArray) {
            for (int row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to add to each number in array");
        int numberToAdd = sc.nextInt();
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] += numberToAdd;
            }
        }

        for (int[] col : multiArray) {
            for (int row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }


    //Задача 2:
    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White).
    public static void paintChessBoard() {
        String[][] chessBoard = new String[8][8];
        String b = "B", w = "W";
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = w;
                    } else {
                        chessBoard[i][j] = b;
                    }
                } else {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = b;
                    } else {
                        chessBoard[i][j] = w;
                    }
                }
            }
        }
        for (String[] col : chessBoard) {
            for (String row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }


    //Задача *:
    //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
    //Формат входных данных:
    //Программа получает на вход два числа n и m.
    //Формат выходных данных:
    //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    //символа.
    public static void makeSnakeArray(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int [][] snakeArray = new int[a][b];
        int res = 0;
        for (int i = 0; i < snakeArray.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < snakeArray[i].length ; j++) {
                    snakeArray[i][j] = res;
                    res++;
                }
            } else {
                for (int j = snakeArray[i].length - 1; j >= 0 ; j--) {
                    snakeArray[i][j] = res;
                    res++;
                }
            }
        }
        for (int[] col : snakeArray) {
            for (int row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
