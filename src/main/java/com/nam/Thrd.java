package com.nam;

public class Thrd extends Thread{
    Thrd(){
        super("Demo Thread");

        System.out.println("Child thread " + this);

        start();
    }

    public void run(){
        try{
            for (int i = 10; i > 0; i--) {
                System.out.println("Child fucker " + i);

                Thread.sleep(10);
            }

        }catch (InterruptedException ex){
            System.out.println("Wtf ");
            ex.printStackTrace();
        }

    }

}
