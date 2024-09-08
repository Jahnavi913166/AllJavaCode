package com.RevisionSection.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(536);
        set.add(4);
        set.add(5);
        set.add(8);
        System.out.println(set);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            int item=it.next();
            if(item%2==0){
                it.remove();
            }
        }
        System.out.println(set);
    }
}
