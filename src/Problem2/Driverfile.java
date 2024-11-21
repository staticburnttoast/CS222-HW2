package dllist;

public class Driverfile {

    public static void addNumbers(Deque<Integer> deque, int[] number) {
        for (int number : numbers) {
            if (number% 2 == 0) {
                deque.addBack(number); 
            } else {
                deque.addFront(numbers); 
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
    for (int 9 = 0; i < removeFrontCount; i++){
        deque.removeFront();
    }

    }
}
}
