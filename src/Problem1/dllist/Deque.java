import java.util.Objects;

import org.w3c.dom.Node;

import DLL; 

public class Deque<T> {
    private DLL<T> list; 

// Zero Parameter 
    public Deque(){
        this.list = newDLL<>(); 
    }
    
    public void addFront(T data) { // adds data to the front of collection
           list.insert(0, data);
    }

    public void addBack(T data) { // adds data to the back of collection
        list.append(data); 
    } 
    

    public T removeFront() { // removes data from front of collection
       if (list.isEmpty()){ 
        throw new IllegalStateException("deque is empty");
       }
       DLL<T>.Node headNode = getHead().data;
       list.delete(headNode); 
        return data;
    }



    public void removeBack() { // removes data from the back of collection 
        if (list.isEmpty()){ 
            throw new IllegalStateException("deque is empty");
        } 
        DLL<T>.Node headNode = getNode(list.size()-1).data;
        list.delete(headNode); 
        }


    public boolean isEmpty() {  // checks if collection is empty, if size is 0 then collection is considered empty
       return size == 0;
    }


    public void makeEmpty() { // cancels out the data in the collection 
        head = tail = null;
        size = 0; 
    }

    public boolean equals(Object obj) { // checks if certain data in the collection are equal to each other
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        DLL<?> other = (DLL<?>) obj; 
        if (this.size != other.size) return false; 

        return this.list.equals(other.list); 
    }
}
