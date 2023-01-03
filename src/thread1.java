class Threadnaming extends Thread {
    // Parameterized constructor
    Threadnaming(String name)
    {
        // Call to constructor of
        // the Thread class as super keyword
        // refers to parent class
        super(name);
    }
    // run() method for thread
    @Override public void run()
    {
        // Print statement when thread is called inside
        // main()
        System.out.println("Thread is running.....");
    }
}
// Class 2
// Main class
class thread1 {

    // main driver method
    public static void main(String[] args) {

        // Creating two threads
        Threadnaming t1 = new Threadnaming("geek1");
        Threadnaming t2 = new Threadnaming("geek2");

        // Getting the above created threads names.
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());

        // Starting threads using start() method
        t1.start();
        t2.start();
    }
}

