import java.util.concurrent.ConcurrentHashMap;

public class ConcurerentHashDemo {
    public static void main(String[] args) {
        // ConcurrentHashMap is a thread-safe variant of HashMap
        // It allows concurrent access by multiple threads without locking the entire map
        // It is more efficient than Hashtable in multi-threaded environments
        // It allows null keys and values
        // It is part of the Java Collections Framework
        // it implements concurrent map interface and extends map
        // java 7 --> it is segment based locking --> default 16 segements --> smaller hashmaps
        // only the segment being written to or read from is locked
        // read: do not require locking unless there is a written operation happening on the same segment. 
        // write: only the segment being written to is locked, allowing other segments to be accessed concurrently


        

                 // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
       
    }
    
}
