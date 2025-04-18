// It is sub-class of the hash map. It is used when the order matter


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedlistHash {
    public static void main(String[] args) {            // it gives output in order(just like you kept the element in input) unlike hashmap. 
        LinkedHashMap <String , Integer> linkedhashmap = new LinkedHashMap<>(11,0.3f,true); 
        linkedhashmap.put("Apple", 20);        // It also use doubly linked list 
        linkedhashmap.put("Banana", 15);   // it is slower than hash map due to doubly linked list and it also take more memory                                                       
        linkedhashmap.put("Orange", 16);          
        linkedhashmap.get("Apple");            //it depends on the accessOrder if it is false then it will gives the in the insertion 
                                                   //order other wise least used element is at the top of the output
        linkedhashmap.get("Orange");
        linkedhashmap.get(linkedhashmap);
        for (Map.Entry<String, Integer> entry : linkedhashmap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap<>(hashMap);

        hashMap.put("parmanand", 54);
        hashMap.put("Mayan", 56);
        hashMap.put("modi", 58);

        Integer res = hashMap.getOrDefault("Shubham", 0);
        hashMap.putIfAbsent("parmanand",43);           // it will not change because parmanand is already exist. if you want to replace the value use put.            
        System.out.println(hashMap);


    }
}
