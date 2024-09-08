package com.practice.java.CollectionFramework;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        //Map<String, Integer> m = new LinkedHashMap<>();
        //Map<String, Integer> m = new TreeMap<>();

        m.put("Java", 1);
        m.put("SQL", 2);
        m.put("PLSQL", 3);
        m.put("Servlet", 4);
        m.put("JSP", 5);
        System.out.println(m);

        m.put("Servlet", 5);
        System.out.println(m);

        Map<String, Integer> map = new HashMap<>();
        map.put("HTML", 2);
        map.put("CSS", 3);
        map.putAll(m);
        System.out.println(map);

        System.out.println(map.remove("HTML", 2));
        System.out.println(map);
        System.out.println(map.remove("SQL"));
        System.out.println(map);

        System.out.println(map.values());//it return all values
        System.out.println(map.keySet());//it return all keys

        //containsKey(),containsValues()
        if (map.containsKey("Java")) {
            System.out.println("Key is present");

        } else {
            System.out.println("Key is not present");
        }

        if (m.containsValue(2)) {
            System.out.println("val is present:");
        }
        System.out.println(m.putIfAbsent("Java", 1));
        System.out.println(m.putIfAbsent("JavaScript", 9));
        System.out.println(m);

        System.out.println(m.isEmpty());

        System.out.println(m.replace("JSP", 5, 10));
        System.out.println(m.replace("Java", 10));//key ,newval
        System.out.println(m.size());
        //m.clear();
        System.out.println(m);
        System.out.println(m.isEmpty());


        //merge(key,val,remappingfunction)
        // remappingfunction-> oldvalue,newvalue-> oldval+newval
        // merge() Return Value
        // returns the new value associated with the key

        int returnVal = map.merge("PHP", 6, (oldval, newval) -> oldval + newval);
        System.out.println("val of newVal: " + returnVal);
        System.out.println(map);

        //---------------------------------------ITERATION IN MAP-----------------------------------------------
        // Iterating over the elements of the Hash map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + "\t" + "Value: " + map.get(key));
        }

        // Using for-each loop to iterate over entrySet
        //Map.Entry<key,value>->it is a sub interface of map ,it provides two methods Object.getKey() or Object.getValue()
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key: "+entry.getKey()+"  "+"Value: "+entry.getValue());
        }

        // Using Iterator to iterate over entrySet
        Iterator<Map.Entry<String,Integer>> entryIterator=map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry=entryIterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // Using forEach method with a lambda expression
        map.forEach((key,val)->System.out.println(key+" "+val));//java 8

        //hashmap can store one null as a key and many null as a value
        System.out.println(map);
        map.put(null,null);
        System.out.println(map);
        map.put("df",null);
        System.out.println(map);



    }
}
