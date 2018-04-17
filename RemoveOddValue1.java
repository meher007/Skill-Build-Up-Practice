/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.ArrayList;

/**
 * RemoveOddValue1 class take some numbers from user then divided by 2 each number
 * If the remaining value zero after division by 2 then it is a even number 
 * otherwise it is a odd number
 * @author Meher Khan
 */
public class RemoveOddValue1 {

    public static void main(String[] args) {
        //final ArrayList asd = new ArrayList<>();
        int numbers[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 45};
        int num[] = null;
        //System.out.println(numbers[3]);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { //If the remaining value zero after division by 2 then it is even number 
                                            
                System.out.println(numbers[i] + " is even number");
                //asd.set(i, numbers[i]);
            } else { // else it is odd number
                System.out.println(numbers[i] + " is odd number");

            }
        }
        //System.out.println(num); 
    }

}
