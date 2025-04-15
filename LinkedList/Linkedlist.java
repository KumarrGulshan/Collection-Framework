// The LinkedList class in java is a part of the Collection framework and implements the List interface. Unlike an ArrayList,
// which uses a dynamic array to store the elements, a Linked list stores its elements as nodes in a doubly linked list.
//  This provides diffrent performance characteristics and usage scenarios compared to ArrayList.
// A Linked list is a linear data structure where each element is a separete object called a node. Each node contains two parts:
// Data: The value stored in the node.
// Pointers : Two pointers, one pointing to the next node (next) and the other pointing to the previous node (previous).
// In java doubly linked linked list is used.

// PERFORMANCE CONSIDERATIONS
// Linked list has different performance characteristic campared to Arraylist:
// Insertion and Deltion : linked list is better for frequent insertions and deletions in the middle of the list because it does not
// require shifting elements, as in Arraylist.
// Random Acess : Linked list has slower random access  (get(int index)) compared tO ArrayList because it has to travel the list
//  from the beginning t reach the desired index.
// Memory Overhead : Linked list requres more memory than Arraylist because each node in a linked list require extra memory to store
// reference to the next and previous nodes.


import java.util.Arrays;
import java.util.LinkedList;


public class Linkedlist {
    public static void main(String[] args) {

        // Node node1 = new Node(); // singly linked list. we need class for this because in java doubly linked list is defined or used.                        
        // Node node2 = new Node();
        // node2.value = 2;
        // node1.value = 1;
        // node1.next = node2;
        // node2.next = null;


        // class Node{
            // public int value;
            // public Node next;
            // }
            


        // Doubly Linked LIST
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);                     //we can also add in b/t the linked list.
        linkedlist.get(2);                // O(n)
        linkedlist.addLast(4);               // O(1)
        linkedlist.addFirst(0);             // O(1)
        linkedlist.getFirst();
        linkedlist.getLast();
        System.out.println(linkedlist);
        System.out.println(linkedlist.getLast());
        linkedlist.removeIf(x -> x % 2 ==0);              //remove the element which is divisible by 2. we can remove the element by diffrent ways
        System.out.println(linkedlist);



        LinkedList <String> animals = new LinkedList<>(Arrays.asList("cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalsToRemove);                                // remove the element from animals which is in the animalsToRemove.
        System.out.println(animals);
        
    }
}
