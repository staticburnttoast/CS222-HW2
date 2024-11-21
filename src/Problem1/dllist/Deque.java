package deque;

public class Deque<string> {
    
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

    public boolean isEmpty() {
        return size == 0; 
    }

    public void makeEmpty() {
        head = tail = null;
        size = 0; 
    }

    public boolean equals(Object obj) { 
        if (this == obj) return true; 
        if (!(obj instanceof DLL<?>)) return false;
        DLL<?> other = (DLL<?>) obj; 
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
