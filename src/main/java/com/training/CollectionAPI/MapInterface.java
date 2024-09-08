package com.training.CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        //map interface contains key-value pair
        //Map<String, Integer> map = new HashMap<>();//insertion order is not preserved
        Map<String, Integer> map = new TreeMap<>();//it store key-value pair in sorted order based on key(it sort the data)

        //to add val
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map);
        map.put("three", 3);//key always be unique it will ignore this statement
        System.out.println(map);

        //to check key exist in map or not,if exists return true otherwise false
        System.out.println(map.containsKey("one"));//true
        System.out.println(map.containsKey("four"));//false

        // to check value exist in map or not,if exists return true otherwise false
        System.out.println(map.containsValue(1));//true
        System.out.println(map.containsValue(4));//false

//        if(!map.containsKey("two")){
//            map.put("two",23);//it override the val but we don't want to override if key exists so don't override it
//        }
//        System.out.println(map);

        //same as previous
        map.putIfAbsent("two", 23);//if key is absent then it will put/add otherwise it won't,
        System.out.println(map);


        //to iterate map values
        //entryset=> it contains all the entry of map
        //Entry<key,val>-> Entry it is a interface


        //interface Entry<K, V>->this is interface
        //Entry interface have some methods
        //K getKey(), V setValue(V value), V getValue();
        /*
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            //System.out.println(e);//key-value pair
            //System.out.println(e.getKey());//key
            System.out.println(e.getValue());
        }
         */


        //to iterate with only value we use values()
        /*
        for (Integer val : map.values()) {
            System.out.println(val);
        }
        //to iterate with only key we use KeySet()
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        */

        //treemap method remove()
        map.remove("three");
        System.out.println(map);

        map.remove("four",4);
        System.out.println(map);

        System.out.println(map.isEmpty());//false

        map.replace("five",5,23);
        System.out.println(map);

        map.replace("five",20);
        System.out.println(map); //it replace direct

    }
}
