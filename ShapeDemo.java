
package javatest;


/**
 * Inheritance, polymorphism,interface override method
 * @author Meher Khan
 */

    
    interface Shape{/* Shape is a parent class that holding contain method signatures and fields.
                    this the best way we can have runtime refine polymorphism means use interface then we have to make
                   child method public. By defualt public void draw()that why child method will be public 
                    it is also a example of lose coupling but I have give a better example of lose coupling 
                    in journey class */
    void draw();
    }
                                
class Circle implements Shape{ // Circle class inherited shape class but here is no object to object Inheritance
     
    public void draw() { // override
        // because void draw() is public (by default) that why it has to be higher access or same access
        System.out.println("Draw a Circle");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Draw a rectangle");
    }
}

class Polygon implements Shape {

    public void draw() {
        System.out.println("Draw a Polygon");
    }
}
class Ovel extends Circle{ // Multiple inheritance
public void draw(){
    System.out.println("Draw a Ovel, it is inherited Circle and Circle is inherited Shape");
}
}


class Ellipse extends Ovel { // Multiple inheritance

public void draw(){

    System.out.println("Draw a Ellipse,it's inherited Ovel where Ovel is inherited Circle and Circle is inherited Shape"); // type sout then press TAB shortcut of System.out.prinyln("")
}
}
public class ShapeDemo {

    public static void main(String[] args) {
     
        Shape s;
        s = new Circle();//Polymorphic statement, it is runtime polymorphism
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Polygon();
        s.draw();
        
        s= new Ovel();
        s.draw();
        
        s=new Ellipse();
        s.draw();
     
    }
}
