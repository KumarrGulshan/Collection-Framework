//Lifo Structure : Stack follows the Last-In-First-Out(Lifo) principle, where the last element added is the first one to be removed.
// Inheritance : Stack is a subclass of vector, which means it inherits all the feature of a dynamic arrays but is constrained by the stack's LIFO nature.
// stack extends vector

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo { 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removeElement = stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(4);      // indexing start from 1 and from top to bottom.
        System.out.println(search);

        LinkedList<Integer> linkedList = new LinkedList<>();              //we can use linked list as stack.
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.getLast(); //peek
        linkedList.removeLast(); //pop
        linkedList.size();
        linkedList.isEmpty();

        // ARRAYLIST AS STACK
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); //peek
        arrayList.remove(arrayList.size() - 1); //pop


    }
}
