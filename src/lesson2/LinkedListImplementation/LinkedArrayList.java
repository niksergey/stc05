package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */


class LinkedArrayList<T> {

    public LinkedArrayList() {}

    class Node<T> {
        T value;
        Node(T value) {
            this.value = value;
        }
        Node prev = null;
        Node next = null;
    }

    Node<T> head = null;
    Node<T> tail = null;

    // метод добавления элемента в список
    public void add(T entry) {
        Node<T> current = new Node<>(entry);

        if (tail == null) {
            // список пустой, поэтому просто присваиваем ссылку
            head = tail = current;
            System.out.println("Head");
        } else {
            // для новой ноды устанавливаем ссылку на предыдущую ноду
            // для предыдущей на новую ноду
//            System.out.println(tail.prev.value);
            tail.next = current;
            current.prev = tail;
            tail = current;
        }
    }

    public boolean contains(T elem) {
        Node<T> current = head;
        // проходим по списку
        if (current == null)
            return false;

        do {
            System.out.println("current value " + current.value);
            if (current.value == elem)
                return true;
            current = current.next;
        } while(current != null);


        return false;
    }

    public void clear() {
        Node<T> current = head;
        if (current == null)
            return;
        Node<T> nextElem = null;
        do {
            nextElem = current.next;
            current.next = null;
            current.prev = null;
        } while (nextElem != null);

        head = tail = null;

    }
}


