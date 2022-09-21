package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberUsing2dArray {

    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        /*
        taking 2d array of result where in every single location one array of 10 prime numbers is stored and
        there are 10 different arrays so total 1000 elements stored
        where
         */
        int result[][] = new int[10][];

        for (int i = 0; i < 10; i++) {
            /*
            list is taken rather than array because we don't know how many prime numbers are there
             */
            List<Integer> list = new ArrayList<Integer>();

            for (int j = start; j <= end; j++) {
                boolean isPrime = true;
        /*
        checking the number is prime or not if it is prime adding it in the list
        */
                for (int p = 2; p < j; p++) {
                    if (j % p == 0) {
                        isPrime = false;
                    }
                }


                    if(isPrime) {
                        list.add(j);
                    }
                }

        /*
        taking temp array to store the elements of list and intialize it up to the list
         size and using for loop giving list values to temp array
         */
            int temp[] = new int[list.size()];
            for (int z = 0; z < list.size(); z++) {
                temp[z] = list.get(z);
            }
        /*
        putting the whole temp array at the result position 0 and so on up to 10th position and incrementing
        start and end by 100
         */
            result[i] = temp;
            start = start + 100;
            end = end + 100;

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("==================");
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[i][j]);


            }

        }

    }
}

