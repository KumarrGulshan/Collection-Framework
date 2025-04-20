
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); // not sorted
        while (!pq.isEmpty()){
            System.out.println(pq.poll()); // removes the head of the queue and returns it, returns null if empty
        }

        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)
    }   // min heap is a complete binary tree where the value of each node is less than or equal to the values of its children.
        // The root node (the first element in the array) is the smallest element in the heap.
        // The left child of a node at index i is at index 2*i + 1, and the right child is at index 2*i + 2.
        // The parent of a node at index i is at index (i - 1) / 2.
}