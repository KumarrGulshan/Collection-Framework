// it extends Abstractmap and implements Map. 
// whenever you are using the object/image again and again then you keep the image in the cach and the image that is not used for a long time 
// then you remove the image from cache

// An entry in a weakhashmap will automatically be removed when its key is no longer in ordinary use.
// only key will remove and value will remove only when there is no strong reference.Jvm will decide all of these


import java.util.WeakHashMap;

public class Weakhashmap {
    public static void main(String[] args) {
        WeakHashMap < String, Image> imageCache =new WeakHashMap<>();
        loadCache(imageCache);
        // String key1 = new String("img1");              // this is method 1 through this, we make the non-litrals keys from this garbage    
        // String key2 = new String("img2");              // collection is easy. we use the object key1 and key2 , we are not using String 
        // imageCache.put(key1,new Image("Image 1 "));    // litrals directly we put the value of key1 and key2 is equall to null before the garbage collector    
        // imageCache.put(key2,new Image("Image 2 "));    // then there is no reference of key 1 and key2

        //imageCache.put(new String("img1"),new Image("Image 1 "));  // method 2  In this method there is no strong reference ,
        //imageCache.put(new String("img2"),new Image("Image 2 "));//  reference hai hi nhi
        // And if you want to keep the variable then keep it in the another method

 





       // imageCache.put("img1",new Image("Image 1 "));               //img1 and img2 is not removing because these are string litralls.
       //imageCache.put("img2",new Image("Image 2 "));               //Both of all stored in the them are stored in the string pool thats 
        System.out.println(imageCache);                             // why both of them become strong reference     

        
        // key1 =null;             // we don't do this 
        // key2 = null ;

        System.gc();
        simulateApplicationRunning();
        System.out.println("cach after running (some entries may be cleared )" + imageCache);
        
    }
    public static void loadCache(Map<String,Image>imageCache){
        String k1= new String("img1");            // it will work because k1 and k2 does not have scope outiside the method.
        String k2 = new String("img2");
        imageCache.put(K1 ,new Image("Image 1 "));  
        imageCache.put(K2,new Image("Image 2 "));
    }

    private static void simulateApplicationRunning(){
        try{
            System.out.println("simulating application running..");
            Thread.sleep(10000);
         }
         catch(InterruptedException e){
            e.printStackTrace();

         }
    }
    
    
}

class Image{
    private String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
