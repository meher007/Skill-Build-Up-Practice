
package javatest;

/**
 *
 * @author Meher Khan
 */
public class StaticlVariableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticVariable qq = new StaticVariable();
       
        // constant final tested and not showing any local variable
        System.out.println("In Demo Class qq.Abc (Object.variable) " + qq.Abc); 
        
        
        /*static keyword(variable/method) does not need any specific instance of the class
        to use it. Static can be use directly  */
        System.out.println("In Demo Class StaticVariable.Abc (class.variable) " + StaticVariable.Abc);
        // main method is static hence it can be directly call
         StaticVariable.main(args);
    }

}
