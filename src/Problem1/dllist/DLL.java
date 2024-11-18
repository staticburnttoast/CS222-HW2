package dllist;

public class DLL<T> {
    private int size;
    private DLNode<T> head;
    private DLNode<T> tail;

    // Zero Parameter
    public DLL() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public DLL(DLNode<T> node) {
        this();
        copyOver(node);
    }

    public void copyOver(DLNode<T> node) {
        makeEmpty();

        // As long as the current node is NOT EMPTY,
        // takes all data and appends it to a new node.
        while (node != null) {
            append(node.data);
            node = node.next;
        }
    }

    public DLNode<T> getNode(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Invalid Index");   // ERROR CHECKER
        DLNode<T> current = head;
        for (int i = 0; i < idx; i++)
            current = current.next; // Iterates through all nodes beginning from the head to find the idx.

        return current; // Returns whatever was pulled from above iteration loop.
    }

    public boolean isEmpty() {
        return size == 0;   // If size is 0, return true. Else, return false.
    }

    // This literally just resets everything.
    public void makeEmpty() {
        head = null;
        tail = null;
        size = 0;
    }

    // Self Explanatory
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");  // Starts a new string with an open square bracket.
        DLNode<T> current = head;   // Starts with the head.
        while (current != null) {   // While nodes are not empty.
            sb.append(current.data);    // Append each data.
            if (current.next != null) { // While the data appended is not null, add a comma as a spacer between data appended.
                sb.append(", ");
            }
            current = current.next; // Then get the next data.
        }
        sb.append("]"); // Finally, end the string with a closed square bracket.
        return sb.toString();   // Return the new string created above.
    }

    public int find(T x) {
        DLNode<T> current = head;
        int idx = 0;
        while (current != null) {
            if ((current.data == null && x == null) || (current.data != null && current.data.equals(x))) {
                return idx;
            }
            current = current.next;
            idx++;
        }
        return -1;  // Data not found.
    }

    public void insert(int idx, T data) {
        // TODO: Implement
    }

    public void delete(int idx) {
        // TODO: Implement
    }

    public void remove(T data) {
        // TODO: Implement
    }

    public void append(T data) {
        insert(size, data);
    }

    public DLNode<T> getHead() {
        return head;
    }

    public int hashCode() {
        return 0;   // TODO: Implement
    }

    public boolean equals(Object obj) {
        return false;   // TODO: Implement
    }
}
