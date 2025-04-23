//In Java, the Iterable interface is part of the Java Collections Framework and is the root interface 
//for all collection classes that can be iterated over. It provides a way to traverse elements in a collection one by one.
//For-Each Loop Support: Classes that implement Iterable can be used in a for-each loop, making iteration simpler and more readable.
//The Iterable interface has a single abstract method, iterator(), which returns an Iterator object.
//This Iterator is used to traverse the elements of the collection.

// In itrable there is a method called itrator and return itrator(to traverse over the collection one by one)

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterable {
    public static void main(String[] args) {
        ArrayList< Integer> list = new ArrayList<>();
        for (int i : list){                             // we are applying the loop because of list implements iterator
            System.out.println(i);
        }
        Iterator < Integer> iterator = list. iterator();  // iterator is an interface and we are using the iterator method
        // of the list to get the iterator object
        // iterator is used to traverse over the collection one by one. it is the internal working of iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // hasNext() method is used to check if there are more elements in the collection.
        // next() method is used to get the next element in the collection.


         List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(numbers);
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
//            listIterator.set();
        }

    }
    
}
