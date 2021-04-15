package com.company;

import java.util.*;
/* TODO: Write a program that does the following:
        Asks the user for 5 numbers
        Stores them in an array list
        Finds the sum, product, largest, and smallest of those numbers
*/

public class NumList {


    public static void getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input five whole numbers: ");
        ArrayList<Integer> userNums = new ArrayList<Integer>();
        int userSum = 0;
        int userProduct = 1;
        int userLargest;
        int userSmallest;


        for (int i =0; i < 5; i++) {
            // Assign input value to an integer variable
           int userNum = scanner.nextInt();

           //Add input value to ArrayList
           userNums.add(userNum);

           //Add input value to sum
           userSum += userNum;

           //multiply our product by input value
           userProduct *= userNum;
        }

        // Sorts our list from least to greatest
        Collections.sort(userNums);

        // Since our list is sorted, the first item in it will be the smallest,
        // while our last item will be the largest.
        userSmallest = userNums.get(0);
        userLargest = userNums.get(userNums.size()-1);


        //Print each of the calculated values.
        System.out.println("The sum of your numbers is: " + userSum);
        System.out.println("The product of your numbers is: " + userProduct);
        System.out.println("The largest of your numbers is: " + userLargest);
        System.out.println("The smallest of your numbers is: " + userSmallest);

    }

}
