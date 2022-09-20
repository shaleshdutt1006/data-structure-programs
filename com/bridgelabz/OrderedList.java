package com.bridgelabz;

import java.util.Scanner;

public class OrderedList {
    /**
     * linked class for adding and sorting the operation
     */
    public static class LinkedList {
        /*
        make a node class for linked list where data and next is the pointer of next node
        */
        public Node head;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        /*
        add method is adding the data in the linked list if head null then make new node and taking
        a current node and doing it next and next for adding the data in linked list
        */
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = newNode;
        }
    /*
    this size method tell the size of the linked list up to the last node shows null by taking a
    variable head
    */

        public int size() {
            int count = 0;
            Node currnode = head;
            while (currnode != null) {
                currnode = currnode.next;
                count++;
            }
            return count;
        }

        /**
         * Sorting is done  by taking a variable temp is current node greater move it to right node otherwise
         * traversing using for loop
         */
        public void sorting() {
            for (int i = 0; i < size(); i++) {
                Node currnode = head;
                Node nextnode = currnode.next;
                int temp;
                for (int j = 0; j < size() - 1; j++) {
                    if (currnode.data > nextnode.data) {
                        temp = currnode.data;
                        currnode.data = nextnode.data;
                        nextnode.data = temp;
                    }
                    currnode = nextnode;
                    nextnode = nextnode.next;
                }
            }
    /*
    printing method to show linked list element while head or a variable node!= null shows all elements
    */
            System.out.println("Sorted Linkedlist is this : ");
            Node node = head;
            while (node != null) {
                System.out.println(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add(16);
            list.add(30);
            list.add(40);
            list.add(70);
            list.add(20);
            list.add(25);
            list.sorting();
        }
    }
}