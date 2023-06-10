 package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ArrrrayList
 */
public class ArrrrayList {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 40);
        System.out.println(map.get("Alice"));
         ArrayList<Integer> al = new ArrayList<>();
            HashMap<Integer,String> hm=new HashMap<Integer,String>();    
    System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");  
      hm.remove(100); 
      hm.remove("Rahul");
        System.out.println(hm); 

        // al.add(null);
        al.add(10);
        System.out.println(al);
        for(int i : al){
            System.out.println(i);
        }
    }
}