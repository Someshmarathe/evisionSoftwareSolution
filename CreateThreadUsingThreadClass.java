package com.java.thread;

public class CreateThreadUsingThreadClass extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args){
         CreateThreadUsingThreadClass thread = new CreateThreadUsingThreadClass();
         thread.setPriority(8);
         thread.start();
        System.out.println(Thread.currentThread().getPriority());
         for(int i=0;i<3;i++){
             System.out.println(Thread.currentThread().getName());
         }
    }
}
