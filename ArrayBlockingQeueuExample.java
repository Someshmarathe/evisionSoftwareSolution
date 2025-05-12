package com.java.collection;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQeueuExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(3);

        Thread t1 = new Thread(()->{
             for (int i=0;i<10;i++){
                 try {
                     abq.put(i);
                     System.out.println("Inserted Data is : "+i);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }

             }
        });

        Thread t2 = new Thread(()->{
            for (int i=0;i<6;i++){
                try {
                    Thread.sleep(5000);
                    abq.take();
                    System.out.println("Removed Data is : "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
