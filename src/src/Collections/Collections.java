package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
//        deleteDuplicates();
//        ListOfAnimals anim = new ListOfAnimals();
//        anim.add("Cat");
//        anim.add("Dog");
//        anim.add("Bird");
//        anim.add("Parrot");
//        anim.printList();
//        anim.delete();
//        anim.delete();
//        anim.printList();
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Andrei", 3, "182", new int[]{3, 4, 1, 1, 5}));
//        students.add(new Student("Aleksei", 3, "182", new int[]{3, 4, 3, 3, 5}));
//        students.add(new Student("Gleb", 2, "172", new int[]{2, 2, 2, 2, 5}));
//        students.add(new Student("Nikita", 2, "172", new int[]{5, 5, 5, 1, 1}));
//
//        printStudents(students, 3);
//        expelStudent(students);
//        printStudents(students, 3);

    }

    public static void deleteDuplicates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String numbers = sc.nextLine();
        String[] numbMas = numbers.split(", ");
        HashSet<String> numbersNoDuplicates = new HashSet<>();
        java.util.Collections.addAll(numbersNoDuplicates, numbMas);
        System.out.println(numbersNoDuplicates);
    }

    public static void expelStudent(ArrayList<Student> std) {
        for (int i = 0; i < std.size(); i++) {
            if (std.get(i).getAvgMark() < 3) {
                std.remove(i);
            } else {
                std.get(i).hireCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }


    //Задача 1:
    //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
    //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
    //2 или более раз.

    public static Map<String, Boolean> wordMultiple(String [] mas) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : mas) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }
        return result;
    }

    //На вход поступает массив непустых строк, создайте и верните Map<String,
    //String> следующим образом: для каждой строки добавьте ее первый символ в
    //качестве ключа с последним символом в качестве значения.

    public static Map<Character, Character> pairs(String[] mas) {
        Map<Character, Character> strMaped = new HashMap<>();
        for (String s : mas) {
            strMaped.put(s.charAt(0), s.charAt(s.length() - 1));
        }

        return strMaped;
    }
}
