//The ConcurrentSkipListMap is a thread-safe, scalable, and sorted map implementation in Java, part of the java.util.concurrent package.
// It is based on a skip list data structure, which provides efficient concurrent access and maintains the natural ordering of its keys
//  or a custom comparator-defined order.
//
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 2);
        System.out.println(map.get("Apple")); // 2

    }
} 
// A skip list is a probabilistic data structure that allows fast search, insertion, and deletion operations, 
// similar to a balanced tree, but it is simpler to implement. It is the underlying data structure used in ConcurrentSkipListMap.
// For a skip list containing the elements {1, 3, 5, 7, 9}:
// Level 3:       1       5       9
// Level 2:       1   3   5   7   9
// Level 1:       1   3   5   7   9
// Searching for 7 starts at Level 3, moves to 5, drops to Level 2, and finds 7.
//Fast Operations: Average time complexity for search, insert, and delete is O(log n).
//Simple Implementation: Easier to implement compared to balanced trees like AVL or Red-Black trees.
//Concurrency-Friendly: Skip lists are naturally suited for concurrent modifications, making them ideal for