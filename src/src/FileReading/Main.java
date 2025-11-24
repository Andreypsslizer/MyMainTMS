package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        findBiggestWord();
    }

    public static void findBiggestWord() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\FileReading\\book.txt"));
        String biggestWord = "";
        String current;
        while (sc.hasNextLine()) {
//            String[] words = sc.nextLine().split("(_|\\s)+");
//            for (String word : words) {
//                if (biggestWord.length() < word.length()) {
//                    biggestWord = word;
//                }
//            }
            current = sc.next().replaceAll("[^A-Za-zА-Яа-я0-9]", "");
            if (current.length() > biggestWord.length()) {
                biggestWord = current;
            }
        }
        try (FileWriter writer = new FileWriter(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\FileReading\\longestword.txt")) {
            writer.write(biggestWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
