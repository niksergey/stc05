package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */

public class LinkedArrayList<T> {
    class Node<T> {
        T value;
        Node(T value) {
            this.value = value;
        }
        Node prev = null;
        Node next = null;
    }

    Node vals = null;

    Node head = null;
    Node tail = null;

    // метод добавления элемента в список
    void add(T entry) {
        Node current = new Node(entry);

        if (vals == null) {
            // список пустой, поэтому просто присваиваем ссылку
            vals = head = tail = current;
        } else {
            // для новой ноды устанавливаем ссылку на предыдущую ноду
            current.prev = vals;
            // для предыдущей на новую ноду
            vals.next = current;
            // передвигаем ссылку вперед
            vals = tail = current;
        }
    }

    boolean contains(T elem) {
        Node current = head;
        // проходим по списку
        while(current.next != null) {
            if (current.value == elem) {
                return true;
            }
        }
        return false;
    }
}


