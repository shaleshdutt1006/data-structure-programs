package com.bridgelabz;

import java.util.Scanner;


public class Calender2DArray {
    /*
    this 2 day Array take 5 rows because there is maximum 5 rows in a month of 31 days
     and 7 coloumns for the 7 days of a week
     */
    static int[][] calender = new int[5][7];
    static int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /*
    adding -10 value to every element of the 2-d array to initialize it
     */
    static void initCal() {
        for (int i = 0; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                calender[i][j] = -10;
            }
        }
    }

    /*
    printing the calender using two for loop
     */
    static void display(int m) {
        System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

        for (int i = 0; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                /*
                month[m-1] is the value of days in that month array for month m if we input value 6 for m
                then it goes to 5 element of array and if calender[i][j] is greater than 30 days of the month
                then it gives tab space only
                */
                if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) {
                    System.out.print("\t ");
                } else if (calender[i][j] > 0) {
                    System.out.print("\t" + calender[i][j] + " ");
                }
            }
            System.out.println("\t");
        }
    }

    /*
    putting values of days in 2 day array where d is day of week with month and year
     */
    static void putCalender(int d) {
        int d1 = 1;
/*
calender[0] is for first row printing where d is the day of the week from 1 to 7 and row start from
that d and goes upto 7 which is calender length
 */
        for (int i = d; i < calender[0].length; i++) {

            calender[0][i] = d1++;
        }
        /*
        i = 1 is for the first row and j is for coloumn putting values of days from 1-7 in that row
         */
        for (int i = 1; i < calender.length; i++) {
            for (int j = 0; j < calender[i].length; j++) {
                calender[i][j] = d1++;
            }
        }
    }

    /*
    calling the dispCalender function to display calender values where day of week is calculated
    by the formuala of gregorian calender after it call the function initcal.
     */
    static void dispCalender(int m, int y) {
        int d = dayOfWeek(m, y);
        initCal();
        putCalender(d);
        display(m);

    }

    static int dayOfWeek(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter month");
        int m = s.nextInt();
        System.out.println("enter year");
        int y = s.nextInt();
        dispCalender(m, y);
    }
}

