
package MyJava;


/**
 *
 * @author Meher Khan
 */
public class ArrayClass{

public static void main(String[] args){

Employee e1= new Employee("Meher", 24);
Employee e2= new Employee("Mario", 5);
Employee e3= new Employee("Marina", 2);
//e.Emplyee("meher", 4);


// I have used Emplyee is a user define data type though is a class 
/*Emplyee[] e=new Emplyee[3];
e[0]=e1;
e[1]=e2;
e[2]=e3;

for (Emplyee ee:e){
    System.out.println(ee.Name+" "+ee.Age);
}
*/
int z=5;/*Array size can be declare in run time by user inputing integer
          Or Size may initiated by a object size (like CSV file object size)  */
Employee[] e = new Employee[z];
e[0]=e1;
e[2]=e2;
e[4]=e3;


for (Object o: e){
    if (o instanceof Employee){ 
    Employee ee= (Employee)o;
     
     System.out.println(ee.Name+" "+ee.Age);
}
    
    if (o==null){
        System.out.println(o);
    }
    
}


for (int i=0; i<e.length; i++){
if (e[i]==null){
    System.out.println("Null value is in "+i);//e[i] = show value but only i then show index number

}


}
/*for (Emplyee ee:e){
    System.out.println(ee.Name+" "+ee.Age);
}
*/

}
}


