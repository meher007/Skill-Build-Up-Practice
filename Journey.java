
package javatest;



/**
 * Loose coupling example When there is no dependency on the object it call lose
 * coupling and we have to use interface.
 *
 * @author Meher Khan
 */
interface Vehicle {

    void start();
}

class Bike implements Vehicle {

    @Override // override start method
    public void start() { /* if we change any logic here it not going to effect other class and object 
                          therefore it is loose coupling*/
        System.out.println("Travel by Bike");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travel by Car");
    }
}



// create main class Journey
public class Journey {

 public static void main(String[] args) {
      Vehicle v = new Car();
        v.start();
        
}
}


 
    