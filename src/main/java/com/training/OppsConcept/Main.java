package com.training.OppsConcept;


class A2 {
    private void f1() {
        System.out.println("A1");
    }

}

class B1  extends A2{
//    private void f1() {
//        System.out.println("B1");
//    }
//    if we don't override parent class method then we can able access that via other func

//    public void f2() {
//        f1();
//    }

}
    public class Main {

        public static void main(String[] args) {
            B1 b = new B1();
//            b.f2();


        }


    }




