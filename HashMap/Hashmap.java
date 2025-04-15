//Key Characteristic
// Unordered: Does not maintain any order of its elements.
// Allows null Keys and Values: Can have one null kay and multiple null values.
// Not Synchronized : Not thread-safe; requires external synchronization if used in a multi-threaded context
// Performance : Offers constant-time performance (O(1)) for basic operation like get and put, assuming the hash 
// funtion disperses elemets properly.

// Internal Structure of HashMap
// Basic Components of HashMap
// 1. Key : THE identifier used to retrival the value
// 2. Value : The data associated with the kay
// 3. Bucket : A place where Key-value pairs are stored. Think of buckets as cells in list (array).
// 4. Hash Fuction : Converts a key into an index (bucket location for storage).

// A hash funtion is an algorithm that takes an input (OR "Key") and returns a fixed-size string of byte , typically
// a numerical value. The output is known as hash code , hash value, or simply hash. The primary purpose of a hash 
// function is to map data of arbitrary size to data of fixed size.

// Deterministic : The same input will always produce the same output.
// Fixed Output Size : Regardless of the input size, the hash code has a consistent (eg. 32-bit,64-bits).
// Efficient Computation : The hash function should compute the hash quickly.

// How Data is Stored in HashMap

// step1: Hashing the Key
// First, the key is passed through a hash function to generate a unique hash code(an integer number).
// This hash code helps determine where the key-value pair will be stored in the array(called a "bucket array").

//step 2
// calculating the index
// the hash code is then used to calculate an index inthe array (bucket location ) using int index = hashCode % arraySize;
// the index decides which bucket will hold this key-value pair.
// for example, if the array size is 16, the key's hash code will be divided by 16, and the remainder will be the index.

// Step 3
// The key-value pair is stored in the bucket at the calculated index. each bucket can hold multiple key-value pairs
// (this is called a collision handling mechanism, discussed later).

// map.put("apple", 50);
// apple is the key
// 50 is the value
// THE hash code of apple is calculated
// the index is found using the hash code.
// the pair (apple,50) is stored in the corresponding buckt.


//HoW HASHMAP RETRIEVES DATA
// when we call get(Key), the hashmap follows these steps;
// Hashing the key: similar to insertion , the key is hshed using the same hash funciton to calculate its hash code.
// Finding the Index : the hash code is used to find the index of the bucket where the key-value pair is stored.
// Searching in the Bucket: Once th correct bucket is  found, it checks for the key in that bucket. if it finds the key, it returns the associated the associated value.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap <>();
        map.put(3, "shubham");
        map.put(33, "Ankita");
        map.put(4, "Modi");
        map.put(4, "Suman");   //it will replace modi
        map.put(5, "null");    // null can be used many times
        System.out.println(map);
        System.out.println(map.get(3));
        map.get(5);
        System.out.println(map.get(5));
        System.out.println(map.containsKey(2));
        Set<Integer> keys = map.keySet();
        for(int i: keys){

        //for(int i: map.keySet()){
            System.out.println(map.get(i));
        }
        // }
         Set<Map.Entry<Integer,String>> entries = map.entrySet();   // It behaves like list. it is also method for looping.
        for(Map.Entry<Integer , String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        map.remove(33);
        boolean res = map.remove(31, "nitin");
        System.out.println("Removed ?"+res);
        System.out.println(map);
    }
    
}
