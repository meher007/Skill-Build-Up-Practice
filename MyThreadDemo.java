package javatest;

/**
 *
 * @author Meher Khan
 */
class Thread {

    void run(){
        System.out.println("Two ways of defining a Thread");
}
}

class MyThreadDemo extends Thread {

    
    @Override //override method because run() define already in Thread class
    public void run() {
        
    for (int i=0; i<10; i++){
    System.out.println("Child Thread");
    }
    }
}

class ThreadDemo
{

public static void main(String[] args)
{
MyThreadDemo t= new MyThreadDemo();
t.run(); // child thread is execute here and it is not dependent by any other statement in main() 

for (int i=0; i<10; i++){/*this statement run by main thread and this point program will run multi thread
                            but which thread will run first it dependent by thread scheduler.
                            Thread scheduler behaviour are going to changes by JVM to JVM */
System.out.println("Main Thread");
}
}
}
