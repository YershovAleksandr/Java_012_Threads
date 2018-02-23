package com.nam;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    //private static final Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
/*
        Thread th = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.err.print("Wtf");
                        ex.printStackTrace();
                    }

                    System.out.print("-");
                }
            }
        });
        th.start();

        System.out.println("Thread 1 " + th);

        Thread th2 = new Thread(new Run());
        th2.start();

        System.out.println("Thread 2 " + th2);
        System.out.println("END");

        Thread t = Thread.currentThread();

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Currrent Thread " + t);

        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            System.err.println("Wtf");
            ex.printStackTrace();
        }
*/
        System.out.println("FUcker fuck motherfucka");

        //SimpleThread st = new SimpleThread();
        ConsumerManifacturer.Run();

        //System.exit(42);
    }
}
