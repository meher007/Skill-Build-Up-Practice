package MyJava;

import java.util.ArrayList;
import java.util.List;

/**
 *This program tell the user what is kids favorite snack
 *User have to pass number of snacks or foods into the system 
 * @author Meher Khan
 */
public class KidsFavoriteSnack {

    void Snack(String[] x) {//Receiving value (list of item) in an array

        String[] a = {"Burger", "Pizza", "Chocolate"}; //Declare and initialize an array according to coder favourite snack

        List<String> MyList = new ArrayList<>();

        System.out.println("Kids favourite snacks");

        for (int i = 0; i < x.length; i++) {//for loop will run until length of array x
            for (String aa : a) {// for each loop inserting array value into aa array until the length of array a

                if (x[i].equals(aa)) {//comparing both arrays index value 

                    MyList.add(x[i]);
                }
            }
        }
        for (int i = 0; i < MyList.size(); i++) {

            System.out.println("Item no:" + (i + 1) + " " + MyList.get(i));
        }
    }

    public static void main(String... args) {

        //Declare and initialize an array
        String z[] = {"Cookie", "Coffe", "Burger", "Peanut Butter", "Pizza", "Tea", "Cheese Cake", "Cola", "Curry", "Chocolate",};

        KidsFavoriteSnack t = new KidsFavoriteSnack();// Craete an object/ instance of BeverageList class
        t.Snack(z);//passing array value into snack method
    }

}
