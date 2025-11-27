package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListOfAnimals {
    ArrayList<String> animals = new ArrayList<>();

    public void add(String s) {
        animals.addFirst(s);
    }

    public void delete() {
        animals.removeLast();
    }

    public void printList(){
        System.out.println(animals);
    }
}
