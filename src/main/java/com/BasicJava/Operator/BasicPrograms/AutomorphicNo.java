package com.BasicJava.Operator.BasicPrograms;

//Automorphic is a natural number where square ends with the same digit as the no itself
//5->25 last 5 ends
//25->625 last 25 ends
public class AutomorphicNo {
    public static void main(String[] args) {
        int num = 35;
        int sq = num * num;//625
        boolean flag = true;
        while (num > 0) {
            if (num % 10 != sq % 10) {
                flag = false;
                break;
            }
            num /= 10;
            sq /= 10;
        }
        if (flag) System.out.println("Automorphic");//25
        else System.out.println("not automorphic");//35


    }

}
