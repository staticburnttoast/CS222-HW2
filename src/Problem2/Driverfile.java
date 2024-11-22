package dllist;

public class Driverfile {

    // Where did these two methods come from?
    // There should only be a main method.

    // In the main method, define a new Deque that takes an Integer type.
    // Use the methods you created in the Deque file to satisfy the requirements in the README file.

    // I don't think outputs are necessary, but you could just print them to the console to make sure it's functional.

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
