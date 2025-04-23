//The list interface in java is a part of the java.util package and is a sub-interface of the collection interface. It provides a way to store 
//an ordered collection of elements(known as sequence). List allow for precise control over where elements are inserted and can contain duplicate elements.
//The list interface is implemented by several classes in the java collection framework, such as Arraylist,linked list, vector and stack.
// key feature of the List interface
//  1. order preservation
//  2. Index-Based Access
//  3. Allows Duplicates

//An ArrayList is a resizable array implementation of the List interface. Unlike arrays in java, which have a fixed size, an ArrayList can change its size
// dynamically as elements are added or removed. This flexibility makes it a popular choice when the number of elements in a list isn't known n advance.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(50);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i=0; i<=list.size(); i++){      // I is used as a pointer 
            System.out.println(list.get(i));
        }
        for(int x: list){                      // x is itself the element of the collections and x is integer here. 
            System.out.println(x);
        }
        
        System.out.println(list.contains(4));       // we can check the existence of the elements.
        System.out.println(list.contains(500));

        list.remove(2);                     //we can remove the elements.
        for(int y: list){
            System.out.println(y);
        }
          list.remove(Integer.valueOf(4));   // remove by object
          System.out.println(list);

       // we can add the elements without replacing the element 
        list.add(2,90);
        for(int y: list){
            System.out.println(y);
        }
         
        list.set(2, 40);        //Here we are replacing the element by adding other elements using set method
        for(int y: list){
            System.out.println(y);
        } 

        // Internal Working
        //Unlike a regular array, which has fixed size, an Arraylist can grow and shrink as elements are added or removed. This dynamic resizing is 
        //acheived by creating a new array when the current array is full and copying the elements to the new array.

        //internally, the ArrayList is implemented as an array of object reference. When you add elements to an ArrayList, you're essentially storing
        //these elements in this internal array.

        //when you create an Arraylist, it has an initial capacity(default is 10). The capacity refers to the size of the internal array that can hold
        // elements before needing to resize.


        // CREATING AN ARRAYLIST
        //Default constructor, creates an empty ArrayList with an initial capacity of 10
        ArrayList<String> list1= new ArrayList<>();

        //creating an ArrayList with a specified initial capacity
        ArrayList <String> listwithcapacity = new ArrayList<>(20);

        //creating an ArrayList from another collection
        List<String> list2 = Arrays.asList("Apple","Banana","Orange");       //we cannot modify the list expect replace the element using set method.
        String arr[] = {"Apple","Banana","Orange"};
        ArrayList<String> list3 = new ArrayList<>(list2);                        //we can modify the element and we can also use the arr[].
        list3.add("CHERRY");
        System.out.println(list3);

        //In new version of java we can use List.of
        List<Integer> list5 = List.of(1,3,4,5,6,7);          //everything is fixed

        //Converting to Array
        ArrayList<Integer> list7 = new ArrayList<>();
        list7.add(1);
        list7.add(60);
        list7.add(50);
        Integer array[] = list7.toArray(new Integer[0]);            // it creates new array of type Integer with size 0.

        //Sorting an ArrayList
        Collections.sort(list7);   //sorts in natural order
        System.out.println(list7);

        //Comparator is a concept or Interface using this we can write own logic for Sorting.
        






        
        //TIME COMPLEXITY
        // 1. Acces by index (get) is 0(1).
        // 2. Adding an element is O(n) in the worst case when resizing occures.
        // 3. Removing element can be O(n) because it may involve shifting elements.
        // 4. Iteration is O(n).
          


    }
}
