package com.bridgelabz;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeChecker {
    /**
     * Purpose: This program takes a input string from user,
     * and use a deque to store the characters of the string.
     * We will process the string from left to right and add
     * each character to the rear of the deque
     *
     * @param str
     */

    public static void checkPalindrome(String str) {

        String reverseString = "";

        ArrayDeque<Character> arrayDeque = new ArrayDeque<Character>();

        for (int i = str.length() - 1; i >= 0; i--) {
            /*
             add method to add elements one by one  using charAt position
             */
            arrayDeque.add(str.charAt(i));
        }

        /*
         * add elements to arraydeque while it is not empty to reverse string Variable
         * which are in deque in reverse order when empty return false
         */
        while (!arrayDeque.isEmpty()) {
            reverseString = reverseString + arrayDeque.remove();
        }
        /*
        if reverse String is equals to the enter string then it is palindrome
         */
        if (str.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a String to check for palindrome or not");

        String str = scanner.next();

        str = str.toLowerCase();
        checkPalindrome(str);

    }
}
