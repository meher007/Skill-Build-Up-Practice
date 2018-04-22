package javatest;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * A class with public static methods
 * @author Meher Khan
 */
public class Transport {

    /**
     * Runs when class is run all it does is to invoke the getItems() method
     * @param args not used
     */
    public static void main(String[] args) {
        getItems();
    }

    /**
     * Obtains number of routes from user For each item, then it obtains how many miles user like to travel
     * According to the miles, it suggest to user which type of vehicle user be should use for the journey.
     * For example, if user like like travel only 5 miles then it suggest Bike. 
     * Here Journey class has been used to guide user for vehicle selection where I previously used Loose coupling,
     * Inheritance,Polymorphism,Interface, Override Method in Journey class
     */
    public static void getItems() {
        String loopCounter = JOptionPane.showInputDialog("How many routes do you want to travel?");
        if (loopCounter.isEmpty()) {
            System.exit(1);
        }
        int loopCount = Integer.parseInt(loopCounter);
        if (loopCount > 3) {
            loopCount = 3;
        }

        Vehicle v; // Creates an instance of Journey class

        /*     //Same example can be done by ArryList
        
        final List<String> listArray = new ArrayList<>();
        listArray.add("Bicycle");
        listArray.add("Car");
        listArray.add("Plane");*/
        
        for (int i = 0; i < loopCount; i++) {
            String numString = JOptionPane.showInputDialog("How many miles do you want to travel");
            int mile = Integer.parseInt(numString);

            if (numString.isEmpty()) {
                System.exit(1);
            }

            if (mile <= 10) {
                //System.out.println("Your preferable transport is " + listArray.get(0)); // If ArrayList usage

                System.out.print("You should ");
                v = new Bike();
                v.start();
            } else if (mile <= 500) {

                //System.out.println("Your preferable transport is " + listArray.get(1)); // If ArrayList usage
                System.out.print("You should ");
                v = new Car();
                v.start();

            } else if (mile > 500) {
                //System.out.println("Your preferable transport is " + listArray.get(2)); // If ArrayList usage
                System.out.print("You should ");
                v = new Plane();
                v.start();

            }

        }

    }
}
