
package javatest;

/**
 * It is example of Encapsulation where the mechanism is wrapping variables and methods acting together as a single unit. 
 * In encapsulation the variables of a class will be hidden from other classes
 * it can be accessed only through the methods of their current class.
 * As well as a example of toString method
 * @author Meher Khan
 */
public class Encap {

   // private variable to hide from defferent classes  
   private String idNum;
   private String name;
   private int age;
   
    //Implemention Getter methods
   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }
   
   //Implemention Setter methods
   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }

   
    
   public String toString() {
        return ("ID   : " + getIdNum() + "\n"
              + "Name : " + getName() + "\n"
              + "Age  : " + getAge() + "\n"
+ "*************************************************** " + "\n");

    }



}
