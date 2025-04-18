import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHash {
    public static void main(String[] args) {
        // String key1 = new String("key"); //new key means address of both key will be diffrent if the class does not have hashcode then 
        // String key2 = new String("key");  //it will use the hashcode of object class , here string has own hash code(it is based on key )
        // Map<String,Integer> map = new HashMap<>();  // hashcode of object class will play with memory address
        // hashcode and equal
        // map.put(key1, 1);  // key,1
        // map.put(key2, 2);  //key,2
        // System.out.println(key1.equals(key2)); // true, because the content of both strings is the same
        // System.out.println("HashMap: " + map); //it will retur only one key with value 2 because it will use the hashcode of object class which is based on memory address
        // So, if we want to use the hashcode of string class then we need to use identityhashmap which will use the hashcode of string class




        String key1 = new String("key");  //let say hashcode is 1 for both key1,key2
        String key2 = new String("key");  
        System.out.println(System.identityHashCode(key1));  // identityhashcode will be diffrent
        System.out.println(System.identityHashCode(key1));
        System.out.println(key1.hashCode()); // it play with content so hashcode of both key will be same
        System.out.println(key2.hashCode());
        Map<String,Integer> map = new IdentityHashMap<>();  
        //IdentityHashMap and ==
        map.put(key1, 1);  // key,1
        map.put(key2, 2);  //key,2
        System.out.println("HashMap: " + map); //two value will be out




    }
    
}
