import java.util.*;

public class Three_PriorityQueue{
    public static void main(String[] args) {
        
        // Priority Queue = A FIFO data structure that servers elemnents
        //                  with the higest priorities first
        //                  before elemesnts with lower priority
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("E");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        // System.out.println(queue);

        // ******************************************************************************
        // For numbers it will print in the ascending order to reverse use the above method
        // For Alphabets it give output in Alphabetic order
    }
}