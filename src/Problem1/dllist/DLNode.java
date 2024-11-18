package dllist;

public class DLNode<T> {
    T data;
    DLNode<T> prev;
    DLNode<T> next;

    public DLNode(T data) {
        this.data = data;
        this.prev = null;   // empty
        this.next = null;   // empty
    }
}
