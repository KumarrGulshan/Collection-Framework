// SortedMap is an interface that extends map and guartantees that the entries are sorted beased on the keys , 
// either in their natural ordering or by a spepecified comprarator.
//it extend map and implements the tree map and the tree set classes.

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {
    public static void main(String[] args) {             //new TreeMap<>((a,b)->b-a); // this is the custom comparator for reverse order.
        SortedMap<String, Integer> sortedMap = new TreeMap<>(); //you can also provide comparator in the constructor of the tree map class.
        // In String class, default natural ordering is used, which is lexicographical order.it is predefined the comparator in the string class or integer class.
        // In Integer class, default natural ordering is used, which is numerical order.
        sortedMap.put("John", 25);        // if there is any key is null then it will throw null pointer exception.
        sortedMap.put("Jane", 30);     // red black tree is used in the tree map class. it is a self balancing binary search tree.
        sortedMap.put("Jack", 20);       // time complexity of insertion is O(log n) and space complexity is O(n).
        sortedMap.put("Jill", 35);
        System.out.println(sortedMap); // {Jack=20, Jane=30, Jill=35, John=25}
        System.out.println(sortedMap.firstKey()); // Jack
        System.out.println(sortedMap.lastKey()); // John
        System.out.println(sortedMap.headMap("Jane")); // {Jack=20} exclusive of Jane
        System.out.println(sortedMap.tailMap("Jane")); // {Jane=30, Jill=35, John=25}
        System.out.println(sortedMap.subMap("Jack", "Jill")); // {Jack=20, Jane=30} exclusive of Jill
    }
    
} 
