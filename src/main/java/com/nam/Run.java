package com.nam;

public class Run implements Runnable{
    public void run() {
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print("*");
        }while(true);
    }
}
