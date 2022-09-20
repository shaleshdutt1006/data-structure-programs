package com.bridgelabz;

import java.util.Scanner;

public class UnorderedList {
    /**
     * Finding element if it is present delete it othwerwise add it in the linked list
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
        create object of linked list class and split into words using regex and then adding the paragraph into
        linkedlist after taking user input to search for the word
         */
        LinkedList linkedList = new LinkedList();
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");
        /*
        using for enhance loop for adding the words of the paragraph
         */
        for (String word : words) {
            linkedList.append(word);
        }
        /*
        printing linked list after adding words in linked list
         */
        linkedList.printLinkedList();
        System.out.println();
        System.out.println("Enter word you want to search in paragraph ");
        Scanner scanner = new Scanner(System.in);
        /*
        taking user input and checking whether the input is present in the linked list if present remove it
        otherwise add it
         */
        String input = scanner.next();

        if (linkedList.search(input) == input) {
            linkedList.delete(input);

        } else {
            linkedList.append(input);
        }
        /*
        printing linked after operation is done
         */
        linkedList.printLinkedList();
    }

}

