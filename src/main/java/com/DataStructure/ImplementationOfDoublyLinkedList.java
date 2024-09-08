package com.DataStructure;

public class ImplementationOfDoublyLinkedList {
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

    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        //insertion(beg,mid,end)
        void insertAtBeg(int data) {
            Node newNode = new Node(data);
            if (head == null && size == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;

        }

        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null || size == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        void insertAtMid(int idx, int data) {
            if (idx == 0) {
                insertAtBeg(data);
                return;
            } else if (idx == size - 1) {
                insertAtEnd(data);
                return;
            } else if (idx < -1 || idx >= size) {
                System.out.println("wrong idx");
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                return temp.data;
            } else if (idx < 0 || idx >= size) {
                System.out.println("wrong idx");
                return -1;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int getByObject(int data) {
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == data) {
                    return idx;//found
                }
                idx++;
                temp = temp.next;
            }
            return -1;//not found
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


        void displayForward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        void update(int idx, int updateData) {
            Node temp = head;
            if (idx == 0) {
                head.data = updateData;
                return;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.data = updateData;
        }

        int search(int searchElement) {
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == searchElement) {
                    return idx;
                }
                idx++;
                temp = temp.next;
            }
            return -1;
        }

        void deleteAt(int idx) {
            Node temp=head;
            if (idx == 0) {
                head = head.next;
                return;
            } else if (idx == size - 1) {
                tail = tail.prev;
                tail.next=null;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
            size--;
        }


    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println(dll.isEmpty());

        //insert at beg
        dll.insertAtBeg(100);
        dll.insertAtBeg(99);
        dll.displayForward();
//        System.out.println("head:"+dll.head.data);
//        System.out.println("tail:"+dll.tail.data);

        //insert at end
        dll.insertAtEnd(23);
        dll.insertAtEnd(24);
        dll.displayForward();
        System.out.println("head:" + dll.head.data);
        System.out.println("tail:" + dll.tail.data);

        //insert at mid
        dll.insertAtMid(2, 200);
        dll.displayForward();
        dll.insertAtMid(4, 500);
        dll.displayForward();
        dll.insertAtMid(0, 150);
        dll.displayForward();
        dll.insertAtMid(7, 220);
        dll.displayForward();

        //get the value using idx
        System.out.println(dll.getAt(7));

        //get the idx using object/val
        System.out.println(dll.getByObject(100));

        //check element is exist or not if yes it return true otherwise return false
        System.out.println(dll.contains(100));//true
        System.out.println(dll.contains(1001));//false

        System.out.println(dll.size);
        System.out.println(dll.isEmpty());

        //update the value of doublyLinkedList
        dll.update(2, 87);
        dll.displayForward();

        //search the element dll
        System.out.println(dll.search(500));

        //delete the node
        dll.deleteAt(0);
        dll.displayForward();
        dll.deleteAt(5);
        dll.displayForward();




    }
}
