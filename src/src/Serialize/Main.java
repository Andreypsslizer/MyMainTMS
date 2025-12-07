package Serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\Serialize\\arguments.txt"));
//        Scanner sc = new Scanner(System.in);
        ArrayList<String> arguments = new ArrayList<>();

        while (sc.hasNextLine()) {
            arguments.add(sc.next());
        }

//        while (arguments.size() < 5) {
//            arguments.add(sc.next());
//        }

        Terminal wideParams = new Terminal(arguments.toArray(new String[0]));
        //Terminal wideParams = new Terminal(args);

        FileOutputStream fileOutputStream = new FileOutputStream(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\Serialize\\serialized_object");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(wideParams);

        objectOutputStream.close();
    }
}
