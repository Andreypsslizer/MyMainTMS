package StreamAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        streamInts();
    }

    //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    //Stream'ов:
    //- Удалить дубликаты
    //- Оставить только четные элементы
    //- Вывести сумму оставшихся элементов в стриме
    public static void streamInts() {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(4);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};
        System.out.println(list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
    }
}
