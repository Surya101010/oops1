import java.io.*;

// Class 1
// Helper class extending Thread class
class Threadaming extends Thread {

    // run() method for thread which is called
    // as soon as start() is called over threads
    @Override public void run()
    {

        // Print statement when run() is called over thread
        System.out.println("Thread is running.....");
    }
}

// Class 2
// Main class
class thread2 {

    // Main driver method
    public static void main(String[] args)

    {

        // Creating two threads via above class
        // as it is extending Thread class
        Threadaming t1 = new Threadaming();
        Threadaming t2 = new Threadaming();

        // Fetching the above created threads names
        // using getName() method
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
        System.out.println(t1.threadId()+""+ t2.threadId());
        // Starting threads using start() method
        t1.start();
        t2.start();

        // Now changing the name of threads
        t1.setName("geeksforgeeks");
        t2.setName("geeksquiz");

        // Again getting the new names of threads
        System.out.println(
                "Thread names after changing the "
                        + "thread names");

        // Printing the above names
        System.out.println("New Thread 1 name:  "
                + t1.getName());
        System.out.println("New Thread 2 name: "
                + t2.getName());
    }
}