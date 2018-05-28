package myjavanew;

/**
 *
 * @author home
 */
public class StringBufferExm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        StringBuffer strBuffer = new StringBuffer("Meher");
        strBuffer.append(" Khan");
        strBuffer.append(" Mario");
        strBuffer.append(" Khan");

        System.out.println("************************ StringBuffer ***********************************");
        
        System.out.println("1st string 2nd character " + strBuffer.charAt(1)); // 1st string 2nd character 'e' from meher.
        System.out.println("All append "+strBuffer);
        System.out.println("Reverse method applied in all string "+strBuffer.reverse());

        System.out.println("************************ String **************************************");
        String st = new String("meher");//different memory location
        System.out.println("String output " + st);
        st = "khan";//different memory location
        System.out.println("String output " + st);
        
        System.out.println("************************ StringBuilder ***********************************");
        StringBuilder strBuilder = new StringBuilder("Meher");
        strBuilder.insert(5, " khan");
        System.out.println("Insert Method StringBuilder " +strBuilder);
        System.out.println("Replace Method StringBuilder " +strBuilder.replace(1, 4, "a"));//Mar khan
        System.out.println("Delete Method StringBuilder "+strBuilder.delete(1, 4));//Mkhan
    }

}
