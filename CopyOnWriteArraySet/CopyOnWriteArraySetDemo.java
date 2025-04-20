import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-Safe
        // Copy-On-Write Mechanism, if we add and remove element thn it creates a new copy of the array and then add or remove the element
        // from the new copy.
        // No Duplicate Elements
        // Iterators Do Not Reflect Modifications. if they are iterating over the array and if we add or remove elements from the 
        // array then it will not reflect in the iterator. if the loop is running and if we add or remove elements from the array 
        //then it will not reflect in the iterator. after the loop is completed then it will reflect in the iterator.

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet); // If read is more frequent than write, then use this beacause every
        //  write operation creates a new copy of the array. memory consumption is high. and if we want to iterate things then we need stability,
        // so use copyOnWriteSet.
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet); //if frequent read and write operations are expected then use 
        //this because balanced read and write operations. memory consumption is low.
        //  CopyOnWriteArraySet allows concurrent read and write operations without locking the entire set.

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }

        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            //if (num == 5){  // weakly consistent iterator
            concurrentSkipListSet.add(6);
        }
        }

    }
}