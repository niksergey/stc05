package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */
public class CollectionMaster {
    public static void main(String[] args) {
        LinkedArrayList lst = new LinkedArrayList();

        // добавим 3 элемента
        lst.add(1);
        lst.add(2);
        lst.add(3);

        // попробуем извлечь
        System.out.println(lst.contains(1));
        System.out.println(lst.contains(4));
    }
}
