package com.bridgelabz;

public class LinkedList {
    public static Node head;
    private static String empty;

    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(String data) {
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

    public static String search(String value) {
        Node currnode = head;
        while (currnode != null) {
            if (currnode.data.equals(value)) {
                return value;
            }
            currnode = currnode.next;
        }
        return empty;
    }

    public void delete(String value) {
        Node previous = head;
        Node currnode = previous.next;

        while (!currnode.data.equals(value)) {
            previous = previous.next;
        }

        previous.next = previous.next.next;
    }

    public static void printLinkedList() {
        if (head == null)
            System.out.println("LinkedList is empty");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " => ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }
}

