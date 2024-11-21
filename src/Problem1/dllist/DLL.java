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
        if (idx < 0 || idx > size) throw new IndexOutOfBoundsException("Invalid index");
        DLNode<T> newNode = new DLNode<>(data);

        if (idx == 0) { // Insert at head
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
            if (tail == null) tail = newNode; // First element
        } else if (idx == size) { // Insert at tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else { // Insert in the middle
            DLNode<T> current = getNode(idx);
            newNode.next = current;
            newNode.prev = current.prev;
            if (current.prev != null) current.prev.next = newNode;
            current.prev = newNode;
        }
        size++;
    }

    public void delete(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("Invalid index");
        if (idx == 0) { // Remove head
            head = head.next;
            if (head != null) head.prev = null;
            if (head == null) tail = null; // List is now empty
        } else if (idx == size - 1) { // Remove tail
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else { // Remove from the middle
            DLNode<T> current = getNode(idx);
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public void remove(T data) {
        DLNode<T> current = head;
        while (current != null) {
            if ((current.data == null && data == null) || (current.data != null && current.data.equals(data))) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void append(T data) {
        insert(size, data);
    }

    public DLNode<T> getHead() {
        return head;
    }

    public int hashCode() {
        int hash = 1;
        DLNode<T> current = head;   // Make temp
        while (current != null) {
            hash = 31 * hash + (current.data == null ? 0 : current.data.hashCode());    // Create a hash code.
            current = current.next; // Iterate through the next data.
        }
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;   // If this list is equal to whatever is input in the parameter, return true.
        if (obj == null || getClass() != obj.getClass()) return false;  // If list in param is null or does not equal this, return false.
        DLL<?> other = (DLL<?>) obj;

        if (size != other.size) return false;   // If compared lists are not the same size, return false.

        // make temp vars for comparing heads
        DLNode<?> current1 = this.head;
        DLNode<?> current2 = other.head;

        while (current1 != null) {
            // Return false if data is not equal.
            if (!current1.data.equals(current2.data)) return false;

            // Iterate through the data.
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }
}
