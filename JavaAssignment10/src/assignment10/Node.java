package assignment10;

public class Node <T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data=data;
        this.next=null;
    }
    Node(T data, Node<T> np) {
        this.data = data;
        this.next = np; //np here is "next pointer"
    }
    public T getData(){
        return data;
    }
}
