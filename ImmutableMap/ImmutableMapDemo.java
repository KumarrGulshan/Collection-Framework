import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // ImmutableMap is a part of Guava library, not Java standard library
        // It is a map that cannot be modified after it is created
        // It is useful for creating read-only maps that can be shared across multiple threads without synchronization issues
        // ImmutableMap is more memory efficient than regular HashMap or TreeMap
        // It is faster for read operations because it does not require locking or synchronization
        // It is thread-safe and can be safely shared between multiple threads without any additional synchronization
        // It is a good choice for creating constant maps or configuration settings that do not change at runtime
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);    // Create an immutable map using Collections.unmodifiableMap
        System.out.println(map2);    // Attempting to modify the immutable map will throw an exception
                                               // immutableMap.put("C", 3); // Uncommenting this line will throw UnsupportedOperationException
//        map2.put("C", 3); throws exception
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);  //only 10 entries are allowed
        map3.put("Akshit", 88);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99));  //you can add more than 10 entries
    }
    
}
