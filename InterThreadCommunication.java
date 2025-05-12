package com.java.thread;

public class InterThreadCommunication extends Thread
{
    public void run(){

        synchronized (this) {
            try {
                Thread.sleep(1000);
                for (int i = 0; i < 4; i++) {
                    Thread.sleep(3000);
                    System.out.println(i);
                }
                notify();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        InterThreadCommunication thread = new InterThreadCommunication();
        thread.start();
        synchronized (thread) {
            try {
                thread.wait();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("called Notify method");
    }
}
