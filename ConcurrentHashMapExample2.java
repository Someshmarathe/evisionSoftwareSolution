package com.java.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample2
{
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer , String> cms = new ConcurrentHashMap<>();
         Thread t1 = new Thread(()->{
              cms.put(1,"somesh");
             try {
                 Thread.sleep(1000);
                 System.out.println(cms);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         });
        Thread t2 = new Thread(()->{
            cms.putIfAbsent(1,"somu");
            try {
                Thread.sleep(1000);
                System.out.println(cms);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();;

    }
}
