package com.bridgelabz;

import java.util.Queue;

import java.util.Scanner;

public class BankingCashCounter {
    /*
    Node class for creating the nodes for the queue operation
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public int getSize() {

            return size;
        }

        int size = 0;
        static Node front = null;
        static Node rear = null;

        /*
        if queue is empty it will return the null value front and real are both null
         */
        public static boolean isEmpty() {

            return front == null && rear == null;
        }

        /*
        adding the values using Queue operation
        */
        public void queue(int data) {
            Node newNode = new Node(data);
            if (front == null) {                 //empty queue
                rear = front = newNode;         // front and rear are at same point at the same node
                return;
            }
            rear.next = newNode;
            rear = newNode;
            size++;
        }

        /*
        Substracting the ruppess which are withdrawal by the people in the node
         */
        public void dequeue(int data) {

            Node newNode = new Node(data);
            if (front == null) {
                System.out.println("Queue is empty ");

            }

            while (data > front.data) {
                front = front.next;
                data = data - front.data;
                size--;
            }
            front.data = front.data - data;


        }

        /*
        adding the result values of nodes and display it using display function
         */
        public void display() {
            int result = 0;
            Node temp = front;
            while (temp != null) {
                result = result + temp.data;

                temp = temp.next;
            }
            System.out.print(result + " ");
        }

        public static void main(String[] args) {

            Queue q = new Queue();
        /*
        we are taking 5 iteration or 5 people for the counter who will do transactions
        */
            int interation = 0;
            do {
                System.out.println();
                System.out.println("------------Banking Cash Counter-----------");
                System.out.println("1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Number of people in the Queue ");
                System.out.println("4.Exit");
                System.out.println();
                System.out.println("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                /*
                switch case for making choices by the user he want to deposit or withdrawal
                 */
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to Deposit");
                        int choice1 = scanner.nextInt();
                        q.queue(choice1);
                        System.out.println("Your Available Balance is: ");
                        q.display();
                        interation++;
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to Withdraw ");
                        int choice2 = scanner.nextInt();
                        q.dequeue(choice2);
                        System.out.println("Your Available Balance is: ");
                        q.display();
                        interation++;
                        break;
                    case 3:
                        int j = q.getSize();
                        System.out.println("The Number of People in Queue is: " + j);
                        interation++;
                    case 4:
                        System.exit(0);
                        interation++;
                    default:
                        System.out.println("You entered wrong choice");
                        interation++;
                        break;
                }
            }
            while (interation < 5);
        }
    }

}