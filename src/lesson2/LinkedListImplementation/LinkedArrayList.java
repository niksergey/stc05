package lesson2.LinkedListImplementation;

/**
 * Created by sergey on 04.04.17.
 */

import java.util.LinkedList;

class LinkedArrayList<T> {

    public LinkedArrayList() {}

    private static class Node<T> {
        T value;
        Node<T> prev = null;
        Node<T> next = null;

        Node(T value) {
            this.value = value;
        }

    }

    private Node<T> head = null;
    private Node<T> tail = null;

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
            tail.next = current;
            current.prev = tail;
            tail = current;
        }
    }

    public int indexOf(T elem) {
        int index = 0;
        if (elem != null) {
            for (Node<T> current = head; current != null; current = current.next) {
                if (elem.equals(current.value))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(T elem) {
        return indexOf(elem) != -1;
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


