package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        groupInfo();
    }

    //Задача 1:
    //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    //только из прописных букв, без чисел.
    public static void abbreviations() {
        Scanner sc = new Scanner(System.in);
        String userStr = sc.nextLine();
        System.out.println("Entered string: " + userStr);
        Pattern pattern = Pattern.compile("(\\p{Lu}{2,6})");
        Matcher matcher = pattern.matcher(userStr);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Задача *:
    //Программа на вход получает произвольный текст. В этом тексте может быть номер
    //документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    //xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    //может содержать не всю информацию, т.е. например, может не содержать номер
    //телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    //формате:
    //email: teachmeskills@gmail.com
    //document number: 1423-1512-51
    //и т.д
    public static void groupInfo() {
        String info = "5465-6486-54 54661514-112 teachmeskills@gmail.com skdmv;skdmv +(29)5451542fojpfsod";
        Pattern numDoc = Pattern.compile("\\d{4}\\-\\d{4}\\-\\d{2}");
        Matcher num = numDoc.matcher(info);
        Pattern emailDoc = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*\\.\\w{2,4}");
        Matcher email = emailDoc.matcher(info);
        Pattern telefDoc = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher telef = telefDoc.matcher(info);
        if (email.find()) System.out.println("email: " + email.group());
        while (num.find()) {
            System.out.println("document number: " + num.group());
        }
        if (telef.find()) System.out.println("Telephone: " + telef.group());
    }
}
