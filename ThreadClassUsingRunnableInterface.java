package com.java.thread;

public class ThreadClassUsingRunnableInterface
{

    public static void main(String[] args){
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        Thread threadOne = new Thread(runnableRef);
        threadOne.start();
    }
}
