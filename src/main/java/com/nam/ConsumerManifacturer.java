package com.nam;

public class ConsumerManifacturer {
    public static void Run(){
        System.out.println("Hi");

        ConsumerManifacturer cm = new ConsumerManifacturer();

        cm.doIt();
    }

    public void doIt(){
        Q q = new Q();

        new Producer(q);
        new Consumer(q);

        System.out.println("Press Ctrl+C to stop application");
    }

    class Q{
        int n;
        boolean valueSet = false;

        synchronized int get(){
            while(!valueSet)
            try{
                wait();
            }catch(InterruptedException ex){
                System.err.println("WTF");
                ex.printStackTrace();
            }

            System.out.println("Get " + n);

            valueSet = false;

            notify();

            return n;
        }

        synchronized void put(int n) {
            while (valueSet)

            try{
                wait();
            }catch (InterruptedException ex){
                System.err.println("WTf'");
                ex.printStackTrace();
            }

            this.n = n;

            valueSet = true;

            System.out.println("Put " + n);

            notify();

        }
    }

    class Producer implements Runnable{
        Q q;

        Producer(Q q){
            this.q = q;

            new Thread(this, "XProducer").start();
        }

        public void run(){
            int i = 0;

            while(true){
                q.put(i++);
            }
        }
    }

    class Consumer implements Runnable{
        Q q;

        Consumer(Q q){
            this.q = q;
            new Thread(this, "XConsumer").start();
        }

        public void run(){
            while(true){
                q.get();
            }
        }
    }
}
