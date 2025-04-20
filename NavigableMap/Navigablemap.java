// Navigable Map extends sorted map, providing more powerfull navigation options such s
//finding the closest matching key or retrieving the map in reverse order.

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigablemap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>(); 
        navigableMap.put(3, "John");
        navigableMap.put(10, "Jane");
        navigableMap.put(25,"Jack");
        navigableMap.put(15,"Jill");
        System.out.println(navigableMap); // {3=John, 10=Jane, 15=Jill, 25=Jack}
        System.out.println(navigableMap.firstKey()); // 3
        System.out.println(navigableMap.lastKey()); // 25
        System.out.println(navigableMap.lowerKey(10)); // 3
        System.out.println(navigableMap.higherKey(15)); // 25
        System.out.println(navigableMap.ceilingKey(3)); //  it is inclusive of 3 . ceiling key is the least key greater than or equal to the given key. 
         
    
        
    }
    
}
