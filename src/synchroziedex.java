import java.io.*;
import java.util.*;
class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
    String ms;
    Sender  sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSend(String m,  Sender obj)
    {
        ms = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized(sender)
        {
            // synchronizing the send object
            sender.send(ms);
            sender.send("he");
        }
    }
}

// Driver class
class SyncDemo
{
    public static void main(String args[]) throws InterruptedException {
        Sender send1 = new Sender();
        ThreadedSend S1 =
                new ThreadedSend( " Hi " , send1);
        ThreadedSend S2 =
                new ThreadedSend( " hello " , send1 );
        ThreadedSend S3=new ThreadedSend("welcome", send1);
        // Start two threads of ThreadedSend type
        S1.start();
        S1.sleep(5000);
        S2.start();
        S2.sleep(4000);
        S3.start();
        S3.sleep(5000);
        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
            S3.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}