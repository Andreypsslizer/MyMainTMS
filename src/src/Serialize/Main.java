package Serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\Serialize\\arguments.txt"));
        ArrayList<String> arguments = new ArrayList<String>();
        while (sc.hasNextLine()) {
            arguments.add(sc.next());
        }
        Terminal wideParams = new Terminal(arguments.toArray(new String[0]));

        FileOutputStream fileOutputStream = new FileOutputStream(
                "D:\\old hdd\\DEV\\javaIntellij\\MyMainTMS\\src\\src\\Serialize\\serialized_object");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(wideParams);

        objectOutputStream.close();
    }
}
