package util;

public class MyLinkedListRepit <T> {

    private Node<T> first;

    private Node<T> last;

    private int size;


    public void add(T value){
        if (first==null){
            first= new Node<>(value,null , null);
        }


    }







    private static class Node<T>{






        T values;

        Node<T> previous;

        Node<T> next;

        public Node(T values, Node<T> previous, Node<T> next) {
            this.values = values;
            this.previous = previous;
            this.next = next;
        }
    }
}
