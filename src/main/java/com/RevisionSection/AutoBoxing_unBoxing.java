package com.RevisionSection;

import java.util.ArrayList;

class Demo {
    Object arg;

    public Object getArg() {
        return arg;
    }

    public void setArg(Object arg) {
        this.arg = arg;
    }
}

public class AutoBoxing_unBoxing {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //if we perform boxing manually
        //Integer in = new Integer(10);
        //arr.add(in);
        arr.add(10);
        arr.add(2);

        //if we perform unboxing manually
        // System.out.println(arr.get(0).intValue()+ arr.get(1).intValue());
        //System.out.println(arr.get(0) + arr.get(1));

        for (int i : arr) {
            //System.out.println(i);
        }

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.setArg(10);
        d2.setArg(20);
        //d1.setArg("Bebo");
        //downCasting(it is done in between object)->converting parent object to its child object reference
        Integer a = (Integer) d1.getArg();
        Integer b = (Integer) d2.getArg();
         //in this line first downCasting is performed and then unboxing is performed
        //int a = (int) d1.getArg();
        //int b = (int) d2.getArg();
        System.out.println(a + b);
        //Demo d2=new Demo();

    }

}
