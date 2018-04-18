
package javatest;

import java.util.ArrayList;
import java.util.List;

/**
 * ReverseArray class add multiple array into the system
 * At the beginning print out all the arrays
 * then Print out the reverse array in a column and a row
 * @author Meher Khan
 */
public class ReverseArray {
   
    
    public static void main(String[] args) {

        final List<String> myArray = new ArrayList<>();
        final List<String> storeArray = new ArrayList<>();
        
        myArray.add("Meher");
        myArray.add("Michael");
        myArray.add("Daniel");
        myArray.add("Tracy");
        myArray.add("Fillipa");
        
        System.out.println("Print out array "+myArray);
             
        //System.out.println(abcd.get(3));
        // System.out.println(abcd.size());
    System.out.println("Print out the reverse array in a column at below:");
    for (int i=myArray.size()-1; i>=0; i--){/*index i value start with last string form the array and it continue 
                                            until index i value zero */
        System.out.println(myArray.get(i));//printing last string of  myArray List
        storeArray.add(myArray.get(i));// Last string of myArray are adding in storeArray as first string  
    
    }
        System.out.println("Print out the reverse array in a row "+storeArray);
    }
}
