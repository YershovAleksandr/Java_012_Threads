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

        synchronized int get(){
            System.out.println("Get " + n);

            return n;
        }

        synchronized void put(int n){
            this.n = n;

            System.out.println("Put " + n);
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
