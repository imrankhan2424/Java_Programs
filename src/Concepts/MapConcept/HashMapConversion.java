package Concepts.MapConcept;

import java.util.*;

public class HashMapConversion {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Imran",20);
        map.put("Khan",40);

        Iterator t=map.entrySet().iterator();
        while(t.hasNext()){
            Map.Entry k=(Map.Entry)t.next();
            System.out.println(k.getKey()+":"+k.getValue());
        }

        System.out.println("---------------");

        //Linked Hash Map for orderly storing
        LinkedHashMap<String,Integer> k=new LinkedHashMap<>();
        k.put("Imran",20);
        k.put("Khan",40);

        Iterator i1=k.entrySet().iterator();
        while (i1.hasNext()){
            Map.Entry k1=(Map.Entry)i1.next();
            System.out.println(k1.getKey()+":"+k1.getValue());
        }

        System.out.println("---------------");

        //To ArrayList - Key
        ArrayList<String> ar_key=new ArrayList<>(map.keySet());
        for(String i:ar_key)
            System.out.println(i);

        System.out.println("---------------");

        //To ArrayList - Values
        ArrayList<Integer> ar_val=new ArrayList<>(map.values());
        for(Integer i:ar_val)
            System.out.println(i);

        System.out.println("---------------");

    }
}
