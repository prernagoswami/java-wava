import java.util.*;

public class Java4_Singly_LL {
    public static void main(String[] args){

        // Linked List(Singly) = Stores Node in 2 parts (data+address)
        //                       Nodes are in non-consecutive memory locations
        //                       Elements are linked using pointers
        
        //                                            Singly Linked List
        //                             Node                 Node                 Node
        //                        [data | address] ->  [data | address] ->  [data | address]  

        //                                            Doubly Linked List
        //                             Node                                       Node                
        //                        [address | data | address] <->  [address | data | address]  
        
        //                         Advantages?
        //                         1. Dynamic Data Structure (allocates needed memmory while running)
        //                         2. Insertion and Deletion of Nodes is easy. O(1).
        //                         3. No/Low memory waste.

        //                         Disadvantages?
        //                         1. Greater memory usage (Additional pointers)
        //                         2. No random access of elements (no index [i])
        //                         3. Accessing/Searching elements is more time consuming \. O(n)
        
        //                         Uses:
        //                         1. implement Stacks/Queue
        //                         2. GPS navigation
        //                         3. music playlist

        // ********************************************************************************************************

        LinkedList<String> linkedlist = new LinkedList<String>();
        
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        // linkedlist.poll();

        linkedlist.add(4 ,"E");
        linkedlist.remove("E");
        
        System.out.println("Index of F is " + linkedlist.indexOf("F"));

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("0"); // To add element at the head 
        linkedlist.addLast("G"); // To add element at the tail
        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(first);
        System.out.println(last);

        System.out.println(linkedlist);


    }
}