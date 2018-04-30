package javatest;

import java.util.Scanner;
/**
 *Take number of element(integer) from user, then allow user to enter element (integer) one by one
 * Compare the integer into next integer if next integer is less then the first integer then swipe the value 
 * by using a extra memory 
 * This way make ascending order of all the element however, it does not remove duplicate integer
 * 
 * @author Meher Khan
 */

public class AscendingOrder
{
    public static void main(String... args) //Another way declare main method
    {
        ArrayConcatenation(); //ArrayConcatenation method to merge two arrays
        
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:"); //Takes user request number of elements
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) // for loop is using to store all the integer one by one
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) // if first integer value is greater compare to second intger    
                {
                    temp = a[i]; // then store first integer value in a new memory and
                    a[i] = a[j];// replace first integer value by second integer
                    a[j] = temp;// replace second integer value by second integer (new memory)
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]+" ");
           
    }
    
    
    public static void ArrayConcatenation() {
    
        String[] myArray = new String[3];
        myArray[0] = "Cat";
        myArray[1] = "Dog";
        myArray[2] = myArray[1].concat(myArray[0]);
        System.out.println("Two Arrays Concatenate  "+myArray[2]);
       
    }
    
}
