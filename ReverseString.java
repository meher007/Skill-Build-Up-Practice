
package javatest;

import javax.swing.JOptionPane;

/**
 *ReverseString class take string by user then print out the string and length
 * 
 * @author Meher
 */
class Reverse {

    public void Reverse(String p) {// string p is holding/received user entered string
        int a = p.length();

        
        System.out.println("The string you have entered is "+ p);
        System.out.println("Your string length is " +a);

        
        System.out.println("***********************NORMAL STRING***************************");

        for (int j = 0; j < a; j++) {//for loop will run until the length of string
            char c = p.charAt(j);//c is taking the first character of string while "for loop" is running
            System.out.println(c);//print out one by one character of string while "for loop" is running
        }
        
        System.out.println("***********************REVERSED STRING************************");
        for (int i = a - 1; i >= 0; i--) {//For loop strat with length value - 1 and ending to zero

            //System.out.println(p.lastIndexOf(p));
            //char b = p.charAt(i);
            //System.out.println(b);
            System.out.println(p.charAt(i));
            //a[i] = s.nextInt();

        }
        

    }

}

public class ReverseString {

    public static void main(String[] args) {

        String myVarString = JOptionPane.showInputDialog("Enter a String please");
        Reverse q = new Reverse();
        q.Reverse(myVarString);
    }

}
