public class Driverfile {
    public static void main(String [] args) {
        Deque<Integer> integerDeque = new Deque<>(); 

    public static void addEvenNumbers (Deque<Integer> deque, int[] number){ 
        list.insert(new int [] {1,3,5,7,9}); 
    }

    public static void addOddNumbers (Deque<Integer> deque, int[] number){ 
        list.append(new int [] {2,4,6,8});

    public static void removeThird (Deque<Integer> deque){ 
        list.removeFront(list.size/3); 
        list.appendFront(list.size/3); 
    }
    } }
   
    /* public static void main(String [] args) {
        Deque<Integer> deque = new Deque<>(); 

        addNumbers(deque, new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    public static void addNumbers(Deque<Integer> deque, int[] number) {
        for (int number : numbers) {
            if (number% 2 == 0) {
                deque.addBack(number); 
            } else {
                deque.addFront(number); 
            }
        }
    }
public static void removeElements(Deque<Integer> deque) {
    int totalSize = 0; 

    while (!deque.isEmpty()) {
        deque.removeFront();
        totalSize++; 

    int removeBackCount = totalSize / 3;
    int removeFrontCount = totalSize - removeBackCount; 

    for (int i = 0; i < removeBackCount; i++){ 
        deque.removeBack(); 
    }
    for (int i = 0; i < removeFrontCount; i++){
        deque.removeFront();
    }

    }
}
} */ 
