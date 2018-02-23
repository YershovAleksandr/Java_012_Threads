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

        //log.log(Level.INFO, "xxx {0} yyy", 42);
        //log.info("xxx {0} yyy" + 42);

/*        System.out.println("WWW");
        System.err.println("XXX");
        System.out.println("WWWW");
        System.err.println("XXXX");*/

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
        System.out.println("GetName " + th.getName());
        System.out.println("GetPriority " + th.getPriority());


        Thread th2 = new Thread(new Run());

        th2.start();

        System.out.println("Thread 2 " + th2);
        System.out.println("GetName2 " + th2.getName());
        System.out.println("GetPriority2 " + th2.getPriority());


        System.out.print("END");

        Thread t = Thread.currentThread();

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Currrent Thread " + t);
        System.out.println("GetName " + t.getName());

        t.setName("Fucker Fuck");

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Currrent Thread " + t);
        System.out.println("GetName " + t.getName());


        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            System.err.println("Wtf");
            ex.printStackTrace();
        }

        System.err.println("FUcker fuck motherfucka");

        if (th2.isAlive()){
            System.err.println("Kill Th");

            try{
                th2.join();
            } catch(InterruptedException ex){
                System.err.println("WTF");
                ex.printStackTrace();
            }
            System.err.println("FUKER FUCK MOTHRFUCKA");
            //th.interrupt();
        }

     /*   if (th2.isAlive()){
            System.err.println("Kill Th2");

            try{
                th2.join();
            } catch(InterruptedException ex){
                System.err.println("WTF");
                ex.printStackTrace();
            }

            //th2.interrupt();
        }*/

        //System.exit(42);
    }
}
