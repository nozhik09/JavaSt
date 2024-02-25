package lesson_28;

public class MyLinkedList {

    private static class Node<T>{

        T value;
        Node<T> previos;
        Node<T> next;

        public Node(T value, Node<T> previos, Node<T> next) {
            this.value = value;
            this.previos = previos;
            this.next = next;
        }
    }


}
