
package javatest;

/**
 * Tight coupling 
 * @author Meher Khan
 */

class Car1 {

    public void travel() {// If we change something in travel method at car1 class then
                            // We have to change logic in move method in Journey1 that why it tight coupling
        System.out.println("Travel by Car");
    }
}
public class Journey1 {

     static void move(){
        Car1 car = new Car1();
    car.travel();
    }

public static void main(String[] args) {
    move();
    
    }
}
