 // A data structure that works on the FIfo (first in first out ) principle
// Elements are added to the end and removed from the front


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
       public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(); // LinkedList implements Queue interface
        linkedList.addLast(5); // enqueue element at the end of the queue , you can just add method it also act as same
        linkedList.addLast(2); // enqueue element at the end of the queue
        linkedList.addLast(7); // enqueue element at the end of the queue
        System.out.println(linkedList); // [5, 2, 7]
        linkedList.remove(); // remove element from the front of the queue
        linkedList.getFirst(); // peek, get the first element of the queue without removing it 
    
        // To remove this complexity we can use Queue interface and its implementation classes
        // enque = add =offer
        // dequeue = remove = poll
        // peek = peek = element
        // linked list , prority queue


        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove(1)); // throws exception if empty
        System.out.println(queue1.poll()); // null it better than remove 

//        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 =  new ArrayBlockingQueue<>(2);  // fixed capacity of size 2 
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

//         System.out.println(queue2.add(3)); // throws exception
        System.out.println(queue2.offer(3)); // false

    }
}
