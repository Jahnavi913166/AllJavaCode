package com.DataStructure;

public class ImplementationOfArrayList {
    private Object[] array1 = new Object[10];
    private int idx = 0;

    //add method
    public void add(Object newVal) {
        if (idx >= array1.length) {
            increaseSize();
        }
        array1[idx++] = newVal;
    }

    private void increaseSize() {
        int newSize = array1.length + (array1.length / 2);
        Object[] array2 = new Object[newSize];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array1 = array2;
    }

    //get method
    public Object get(int index) {
        if (index >= array1.length) {
            throw new IndexOutOfBoundsException("Exception occur");
        }
        return array1[index];
    }

    public int size() {
        return idx;
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";//empty list
        }
        String s = "[" + get(0);
        for (int i = 1; i < size(); i++) {
            s = s + "," + get(i);
        }
        s += "]";
        return s;
    }

    //remove(idx)
    public void remove(int idx1) {
        for (int i = idx1; i < size(); i++) {
            array1[i] = array1[i + 1];
        }
        array1[size()] = 0;
        idx--;

    }

    //remove(Object)
    public void remove(Object val) {
        for (int i = 0; i < size(); i++) {
            if (val == array1[i]) {
                array1[i] = 0;
            }
            array1[i] = array1[i + 1];
        }
        array1[size()] = 0;
        idx--;
    }


    public void insertAt(int indexVal, Object val) {
        if (idx >= array1.length) {
            increaseSize();
        }
        for (int i = idx; i >= 0; i--) {
            array1[i + 1] = array1[i];
            if (indexVal == i) {
                array1[i] = val;
                break;
            }
        }
        idx++;
    }

    boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }


    public void set(int indexVal, Object val) {
        for (int i = 0; i < size(); i++) {
            if (indexVal == i) {
                array1[i] = val;
                break;
            }
        }
    }
    //contains(Object o)
    public boolean contains(Object o){
        for(int i=0;i<size();i++){
            if(o==array1[i]){
                return true;
            }
        }
        return false;
    }


}

class ArrayList {
    public static void main(String[] args) {
        ImplementationOfArrayList arrayList = new ImplementationOfArrayList();
        System.out.println(arrayList.isEmpty());
        arrayList.add(23);
        arrayList.add(25);
        arrayList.add("jaya");
        arrayList.add("Shubham");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        arrayList.insertAt(2, 90);
        System.out.println(arrayList);
        arrayList.insertAt(5, 90);
        System.out.println(arrayList);
        arrayList.insertAt(0, 90);
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());

        arrayList.set(4, "Neha");
        System.out.println(arrayList);

        arrayList.remove(4);//by idx
        System.out.println(arrayList);

        System.out.println(arrayList.contains("Shubham"));



    }
}

