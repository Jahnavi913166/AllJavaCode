package com.DataStructure;

public class ImplementationOfLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;//O(1)

        void insertAtEnd(int data) {//O(1)-> if tail is given  O(n)-> if head is given
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;

            }
            size++;
        }

        void insertAtFirst(int data) {// O(1)
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        void insertAtMid(int index, int data) {//O(n)
            if (index == 0) {
                insertAtFirst(data);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("wrong index");
                return;
            }

            Node temp = head;//0
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        void display() {//O(n)
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }


        int size() {//O(n)
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int getElementByIdx(int index) {
            if (index < 0 || index > size()) {
                System.out.println("wrong index");
                return -1;
            }
            //return data
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int getElementByObj(int obj) {
            //return idx
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == obj) {
                    return idx;
                }
                idx++;
                temp = temp.next;
            }
            return -1;//if value not found
        }

        boolean contains(int object) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == object) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }


        //   by index and by object
        void deleteAtIdx(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            if (idx >= size) {
                System.out.println("wrong index please choose right idx..");
                return;
            }

            temp.next = temp.next.next;
            if (idx == size - 1) {
                tail = temp;
            }
            size--;
        }

        int searchElement(int data) {
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == data) {
                    return idx;
                }
                temp = temp.next;
            }
            return -1;
        }

        void update(int idx, int data) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.data = data;
        }


    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(28);
        ll.insertAtEnd(29);
        //ll.display();

        //System.out.println(ll.head.data);
        //System.out.println(ll.tail.data);
        //System.out.println(ll.size());

        ll.insertAtFirst(90);
        //ll.display();
        //System.out.println(ll.head.data);

        ll.insertAtMid(0, 200);
        ll.display();
        //System.out.println(ll.head.data);
        ll.insertAtMid(4, 100);
        ll.display();
        ll.insertAtMid(5, 400);
        ll.display();
        //System.out.println(ll.tail.data);

        System.out.println(ll.getElementByIdx(2));
        System.out.println(ll.getElementByObj(100));
        System.out.println(ll.contains(1001));
        System.out.println(ll.size);
        System.out.println(ll.size());

        //delete element
//        System.out.println();
//        ll.display();
//        ll.deleteAtIdx(3);
//        ll.display();
//        ll.deleteAtIdx(6);
//        ll.display();
//        System.out.println(ll.size);
//        System.out.println();
//        ll.deleteAtIdx(5);
//        ll.display();
//        System.out.println(ll.tail.data);

        //search element
        System.out.println("------------------------------------------------------");
        ll.display();
        int element = ll.searchElement(1);
        if (element >= 0) {
            System.out.println("element is found at " + element + " index");
        }
        else{
            System.out.println("element is not found "+element);
        }

        //update element

        ll.update(2, 29);
        ll.display();

    }
}
