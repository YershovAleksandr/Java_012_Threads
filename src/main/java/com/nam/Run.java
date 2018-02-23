package com.nam;

public class Run implements Runnable{
    private int tick = 0;
    private int livetime = 0;
    public void run() {
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print("*");
            if (tick++ > 10){
                tick = 0;
                System.out.println();

                Thrd t = new Thrd();
            }

         }while(true);
    }
}
