//it is in the jdk 1 without even creation on collection framework
// it implement map . it is synchronized and thread safe. in hashtable the key and value both are not null.
// it is legacy class and it is replaced by concurrent hashmap. it is slower than hashmap because it is synchronized.
// only linked list in case of collision
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable< Integer, String>  hashtable = new Hashtable<>();
        // hashtable.put(1, "one");
        // hashtable.put(2,"Banana" );
        // hashtable.put(2,"cherry" );
        // System.out.println(hashtable);
        // System.out.println("value for key 2 " + hashtable.get(2));
        // System.out.println("After removing 1 "+ hashtable);
        // hashtable.put(4, null); // throws exception
        // hashtable.put(null, "value"); // throws exception
        // every method is synchronized including get key
        // only one thread can access the hashtable at a time, it is a limitation and a new hashmap is induced name is concurrent hashmap
        // some thread are just for reading but these threads are accessible to hashtable because limitation on one thread at a time

        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());

 



    }
}