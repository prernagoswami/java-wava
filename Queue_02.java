import java.util.Queue;
import java.util.LinkedList;

public class Queue_02{

     public static void main(String[] args) {
        // **************************************************************************

        // Queue = FIFO data structure (A line of people)
        //         A collection designed to hold elemtents prior to processing
        //         Linear Data stucture

        //         add    = enqueue, offer()
        //         remove = dequque, poll()

        // **************************************************************************
        Queue<String> q = new LinkedList<String>();
        
        q.offer("Orange");
        q.offer("Apple");
        q.offer("Grapes");
        q.offer("Banana");

      //  System.out.println(q.peek());

        q.poll(); //removes the last elemtn of the queue also 
      //  poll peek offer doesn't cause exception like stack

        System.out.println(q.isEmpty());
        System.out.println(q.size()); // checks size 
        System.out.println(q.contains("Apple"));// checks if the element is there
        System.out.println(q);

      //  Where can Queue can be used?

      // 1. Keyboard Buffer (Letters should appear on the screen in the order they're pressed)
      // 2. Printer Queue (Print jobs should be completed in order)
      // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

     }
}


