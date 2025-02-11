package day07.collection.linkedlistmpl;

public class Node <T>{
    T data;
    Node<T> next = null;


    public Node(T data) {
        this.data = data;
    }
}
