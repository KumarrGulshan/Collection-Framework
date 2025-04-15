// A Vector in java is a part of the java.util package and is  one of the legacy classes in java that implements the List interface.
// It was introduced in JDK 1.0 before collection framework and is synchronized, making it thread-safe.
// Now it is a part of collection framework 
// However, due to its sysnchronization overhead, it's generally recommended to use other modern alternatives like ArrayList in single-threded
// scenarios. Despite this, Vector is still useful in certain situations, particularly in multi-threaded environment where safety is a cencern.

// KEY FEATURES OF VECTOR
// Dynamic Array: Like ArrayList, Vector is a dynamc array that grows automatically when more elements are added than its current capacity.
// Sychronization : All the methods in Vector are Synchronized, which makes it thread-safe. This means multiple threads can work on a vector 
// Without the risk of corrupting the data. However , this can introduce performance overhead in single-threaded environments.
// Legacy class : vector was part  of java's original release and is considered a legacy class. it's generally recommended t use Arraylist in
// Resizing Mechanism : When the current capacity of the vector is exceeded, it doubles its size by default (or increase by aspecific capacity
// increment if provided).
// Random Access: Similar to arrays and ArrayList, Vector allows random access to elements, making it efficient for accessing element using an index.

// Constructor of Vector
// Vector(): Creates a vector with an initial capaciy of 10.
// Vector(int initialCapacity) : Creates a Vector with a specified intial capacity.
// Vector (int initialCapacity, int capacityIncrement): Creates a vector with an initial capacity and capacity increament 
// (how much the vector should grow when its capacity is exceeded).

//  Vector (Collection <? extends E>c): Creates a Vector containing the elements of the specified collection.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
   public static void main(String[] args) {

    Vector<Integer> vector = new Vector<>(5,3);
    vector.add(1);
    vector.add(2);
    vector.add(2);
    vector.add(2);
    vector.add(2);
    System.out.println(vector.capacity());
    vector.add(1);
    System.out.println(vector.capacity());
    
    Vector<Integer> vector1 = new Vector<>(Arrays.asList(2,3,4));
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    Vector<Integer> vector2 = new Vector<>(linkedList);
    //System.out.println(vector2);
    for(int i=0; i<vector2.size(); i++){
        System.out.println(vector2.get(i));
    }
    vector2.clear();                                                //it works as linkedlist, arraylist,etc
    System.out.println(vector2);


    ArrayList<Integer> list = new ArrayList<>();
    Thread t1 = new Thread(()->{
        for(int i= 0; i<1000; i++){            //both thread element are adding in the list which is not synchronized.
            list.add(i);
        }
    });
    Thread t2 = new Thread(()->{
        for(int i= 0; i<1000; i++){
            list.add(i);
        }
    });

    t1.start();
    t2.start();

    try{
        t1.join();
        t2.join();
    } catch(InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("size of list " + list.size());  //output:2000  but it does not gives 2000 because arraylist is not synchronized. 
                                                          // Thread is not safe in arraylist(single thread can be used). Two are more thread can be 
   }                                                        // simplify by vector and in vector thread are safe.
}

// INTERNAL IMPLEMENTATION OF VECTOR
// internally, Vector uses an array to store its elements. This size of this array grows as needed when more elements are added. 
// the default behavior is to double the size of the array
// when it runs out of space. This resizing opearation is a costly one, as it requires copying the old elements to the new, larger array.


// SYNCHRONIZATION AND PERFORMANCE
// since vector methods are synchronized, it ensures that only one thread can access the vector at a time. THis makes it thread-safe 
// but can introduce performance overhead in single-threaded environment because synchronization adds locking and unlocking costs.
// In modern java application, ArrayList is generally preffered over vector when synchronization is't required. for thread-safe
// collections, the copyOnWriteArrayList or ConcurrentHashMap from the java.util.concurrent package is often recommend instead.


// summary
// 1. vector is a legacy synchronized collection class that implements thelist interface
// 2. it behaves like a dynamic array and grows as needed.
// 3. it provides thread safety but with a performance cost in single-threaded environments.
// 4. In modern applications, Arraylist or concurrent alternatives like CopyOnWriteArrayList are typically preferred over vector unless thread safety is priority.
// 5. use Arraylist if single threaded environments
