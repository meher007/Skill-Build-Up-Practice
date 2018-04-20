/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author home
 */
public class LargestInteger {

    public static int findLargest(int myArray[]) {// 2nd write
        int largest = myArray[0];

            for (int i = 0; i < myArray.length; i++) {
            
            if (myArray[i] > largest) {
                largest = myArray[i];
                myArray[0] = myArray[i];
                System.out.println(myArray[0]);

            }
           
        }

        return largest;
    }

    public static void main(String[] args) {
        int myArray[] = {10, 8, 12, 16, 14};

        int a = findLargest(myArray);

        System.out.println("Largest number of the series" + " " + a);

    }

}
