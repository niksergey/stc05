package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */

public class CollectionMaster {
    public static void main(String[] args) {
        LinkedArrayList<Integer> lst = new LinkedArrayList<>();

        // добавим 3 элемента
        lst.add(1);
        lst.add(2);
        lst.add(3);

        // попробуем извлечь
        System.out.println("Contains value 1 " + lst.contains(1));
        System.out.println("Contains value 4 " + lst.contains(4));

        lst.clear();

        System.out.println("Contains value 2 " + lst.contains(2));

        // добавим в очищенный список новые значения
        lst.add(49);
        lst.add(45);

        System.out.println("index element 45 " + lst.indexOf(45));
    }
}
