//we are going to make LRUCach to linkedhashmap. 

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
         studentMap.put("raushan", 50);             // it will atomatically remove by put method because it is least recently used.
         studentMap.put("rahil", 60);
         studentMap.put("kumar", 90);
         studentMap.put("mohini", 70);
         System.out.println(studentMap);
       
        
    }
    
}
