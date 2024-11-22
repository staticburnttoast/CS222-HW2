package deque;

// This file should be importing DLL file from Problem 1.
// This class should be using a generic T parameter and not a string.

public class Deque<string> {

    // Deque should be using DLL<T> list.
        // Like this:   private DLL<T> list;
    // Without it, head and tail remain undefined.
    // Make a zero-parameter that defines "list" as a new DLL<> object.

    // This can be done using "insert" with index position 0.
    public void addFront(T data) { 
        if (isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head; 
            head.prev =newNode;
            head = newNode;
        }
        idx++; 
    }

    // This can be done using "append".
    public void addBack(T data) {
        Node newNode = new Node(data); 
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            tail.next = newNode; 
            newNode.prev = tail; 
            tail = newNode; 
        }
        idx++; 
        }

    }

    // This can be done using "getHead().data" and "delete".
    public T removeFront() {
        if (isEmpty()) throw new IllegalStateException("Deque is empty"); 
        T data = head.data; 
        head = head.next; 
        if (head != null) {
            head.prev = null; 
        } else {
            tail = null; 
        }
        idx--; 
        return data;
        }


    // This can be done using "getNode(list.size() -1).data" and "delete".
    public void removeBack() { 
        if (isEmpty()) throw new IllegalStateException("Deque is empty");
        T data = tail.data;
        tail = tail.prev; 
        if (tail != null) {
            tail.next = null; 
        } else {
            head = null; 
        }
        idx--;
        return data;
        }

    // This is fine, but can also be done using "list.isEmpty()".
        // That is a method created in the DLL file.
    public boolean isEmpty() {
        return size == 0; 
    }

    // This is fine, but can also be done usign "list.makeEmpty()".
        // That is a method created in the DLL file.
    public void makeEmpty() {
        head = tail = null;
        size = 0; 
    }

    public boolean equals(Object obj) { 
        if (this == obj) return true;

        // Change this to:
            // if (obj == null || getClass() != obj.getClass()) return false;
        if (!(obj instanceof DLL<?>)) return false;

        // This is good.
        DLL<?> other = (DLL<?>) obj; 

        // Everything below can be done using:
            // return this.list.equals(other.list);
        // This is a method that checks if lists are equal that was created in the DLL file.

        if (this.size != other.size) return false; 

        Node current1 = this.head; 
        Node current2 = other.head; 

        while (current1 != null) {
            if (!Objects.equals(current1.data, current2.data)) return false; 
            current1 = current1.next;
            current2 = current2.next; 
        }

        return true; 
    }
