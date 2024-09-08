package com.DataStructure;

public class LinkedListManualImplementation {
    public static class Node {
        //data ,nextNode
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }


    }

    // operation on linkedList
    // 1. displaying a linkedList (Iterative)
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.nextNode;
        }
        System.out.println();

    }

    public static void displayRecursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + "\t");
        displayRecursive(head.nextNode);

    }


    // 2. Find Length of a Linked List (Iterative)
    public static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.nextNode;
        }
        return count;
    }


    // 3.Linked List insertionAtEnd
    public static void insertionAtEnd(Node tail, int value) { //O(1) -> if tail is given
        Node newNode = new Node(value);
        tail.nextNode = newNode;
        newNode = tail;
        System.out.println("inserted successfully");

    }

    public static void insertAtEnd(Node head, int val) {
        Node temp = head;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        Node newNode = new Node(val);
        temp.nextNode = newNode;
        temp = newNode;

    }


    //Linked List insertionAtFirst
    public static void insertAtFirst(Node head, int value) {
        Node newNode = new Node(value);
        newNode.nextNode = head;
        newNode = head;
        System.out.println("inserted successfully");
    }


    //4.Reverse a linked list(Recursive)
    public static void reverseRecursive(Node head) {
        if (head == null) {
            return;
        }
        reverseRecursive(head.nextNode);
        System.out.print(head.data + "\t");

    }

    // 5. Write a function to get Nth node in a Linked List
    //Method 1
    public static int getNthNodeMethod1(Node head, int index) {

        if (index < 0 || index >= size(head)) {
            System.out.println("please kindly enter valid index");
            return -1;
        }
        Node temp = head;
        int val = 0;
        for (int i = 0; i <= index; i++) {
            if (temp == null) {
                System.out.println("Unexpected error: node is null.");
                return -1;
            }
            if (i == index) {
                val = temp.data;
                break;
            }
            if (temp != null) {
                temp = temp.nextNode;
            }
        }
        return val;
    }

    //Method 2
    public static int getNthNodeMethod2(Node head, int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            count++;
            temp = temp.nextNode;
        }
        return -1;
    }


    public static void main(String[] args) {
        Node head = new Node(23);
        Node n2 = new Node(24);
        Node n3 = new Node(25);
        Node n4 = new Node(26);
        Node n5 = new Node(27);
        Node tail = new Node(28);
        //now connect nodes to each other
        head.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        n5.nextNode = tail;

        //System.out.println(n1.nextNode);
        /*
        System.out.println(n1.nextNode.data);
        System.out.println(n1.nextNode.nextNode.data);
        System.out.println(n1.nextNode.nextNode.nextNode.data);
        System.out.println(n1.nextNode.nextNode.nextNode.nextNode.data);
        System.out.println(n1.nextNode.nextNode.nextNode.nextNode.nextNode.data);
        */


        //display(head);

        displayRecursive(head);
        System.out.println();

        //System.out.println(size(head));

        reverseRecursive(head);
        System.out.println();

        System.out.println("getNthNodeMethod1: " + getNthNodeMethod1(head, 4));
        System.out.println("getNthNodeMethod2: " + getNthNodeMethod2(head, 6));

        insertionAtEnd(tail, 29);
        display(head);
        insertAtFirst(head, 22);
        insertAtEnd(head, 1000);
        display(head);


    }
}
