package com.nam;

public class SimpleThread {
    SimpleThread(){
        System.err.println("FUCKER FUCK YOU!!!");

        Synch ssdd = new Synch();

    }

    class Callme{
        synchronized void call(String msg){
            System.out.print("[" + msg);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.err.println("WTF");
                ex.printStackTrace();
            }

            System.out.print("]");
        }
    }

    class Caller implements Runnable{
        String msg;
        Callme target;
        Thread t;

        public Caller(Callme targ, String s){
            target = targ;
            msg = s;
            t = new Thread(this);
            t.start();
        }

        public void run(){
            target.call(msg);
        }
    }

    class Synch{
        Synch(){
            Callme target = new Callme();

            Caller obj1 = new Caller(target, "Hello you");
            Caller obj2 = new Caller(target, "In to syncronized");
            Caller obj3 = new Caller(target, "World");


            try{
                obj1.t.join();
                obj2.t.join();
                obj3.t.join();
            }catch (InterruptedException ex){
                System.err.println("Wtf");
                ex.printStackTrace();
            }
        }
    }
}
