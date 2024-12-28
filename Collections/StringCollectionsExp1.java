import java.io.*;
import java.util.*;
  
class StringCollectionsExp1 {
    public static void main(String[] args)
    {
        // Defining collection
        Collection<String> fruits = new ArrayList<String>();
  
        // Appending elements 
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Kiwi");
  
        // Iterating via for loop
        for (String str : fruits)
            System.out.println(str);
        
        System.out.println("---------");
            
        // Iterating via Iterator
        Iterator itr = fruits.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());    
            
    }
}