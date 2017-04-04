package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */
public class CollectionMaster {
    public static void main(String[] args) {
        LinkedArrayList lst = new LinkedArrayList();

        lst.add(1);
        lst.add(2);

        System.out.println(lst.contains(3));
        System.out.println(lst.contains(1));
    }
}
