package com.training.OppsConcept;

class S2{

  void m(S2 obj,int a){
  System.out.println("method is invoked"+a);
  }  
  void p(){  
  m(this,23);
  }  
  public static void main(String args[]){  
  S2 s1 = new S2();  
  s1.p();  
  }  
}  