package com.DataStructure;

public class DoublyLinkedListManualImplementation {
    public static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }


    }

    public static void displayForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayBackward(Node tail) {
        //it will print in the reverse order
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static int count(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //insertion
    public static void insertAtBeg(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head.prev;
        head = newNode;
    }
    public static void insertAtEnd(Node tail,int data){

    }

//    public static void displayNthNode(Node nthNode){
//        //any node is given print all values
//        Node temp1=nthNode;
//        Node temp2=temp1.prev;
//        while(temp1!=null){
//            System.out.print(temp1.data+"\t");
//            temp1=temp1.next;
//
//        }
//        while(temp2!=null){
//            System.out.print(temp2.data+"\t");
//            temp2=temp2.prev;
//        }
//    }
    public static void displayRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }






    public static void main(String[] args) {
        Node n1 = new Node(23);
        Node n2 = new Node(28);
        Node n3 = new Node(20);
        Node n4 = new Node(26);
        Node n5 = new Node(28);
        n1.prev = null;
        n1.next = n2;//head
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;//tail
        n5.next = null;

        //Traversal
        displayForward(n1);
        displayBackward(n5);

        //count
        System.out.println("size: " + count(n1));
        //displayNthNode(n2);
        displayRandom(n3);
        //insertion
        //deletion

        //search
        //update

    }

}
