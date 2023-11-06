
/// thread implementation using Runnable interface
import java.lang.Thread;

/// Crating the class which implements the Runnable interface 

public class Interface_implementation implements Runnable {

    /// Overriding(Redefining) the run method
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("number " + i);
        }
        System.out.println("thread created successfully");
    }



    public static void main(String[] args) {

        Interface_implementation t = new Interface_implementation();
        /// Creating the object of the class which implements the Runnable interface
        Thread t1 = new Thread(t);


        /// Staring the thread created using the start method
        t1.start();


        /// Testing the successful execution of the thread
        System.out.println("in main function (after thread starting)");
    }
}

/*
 * 
 * /////// implementation using thread class ///////
 * 
 * import java.lang.*;
 * 
 * public class thread_class_implemetation extends Thread{
 * // @override
 * public void run(){
 * System.out.println("thread created successfully");
 * }
 * 
 * public static void main(String [] args){
 * thread_class_implemetation t = new thread_class_implemetation();
 * t.start();
 * }
 * }
 * 
 */
