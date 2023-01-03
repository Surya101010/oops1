import java.io.*;

// Class 1
// Helper class extending to Thread class
class hreadNaming extends Thread {

    // run() method for this thread
    @Override public void run()
    {
        // Display message
        System.out.println(
                "Fetching current thread name..");

        // Getting the current thread name
        // using getname() method
        System.out.println(
                Thread.currentThread().getName());
    }
}

// Class 2
// Main class
class GFG {

    // Main method driver
    public static void main(String[] args)
    {

        // Creating two threads inside main() method
        hreadNaming t1 = new hreadNaming();
        hreadNaming t2 = new hreadNaming();

        // Starting threads using start() method which
        // automatically calls run() method
        t1.start();
        t2.start();
    }
}