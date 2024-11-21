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
}
