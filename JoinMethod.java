package com.java.thread;
// here Deadlock Condition is occure
public class JoinMethod extends Thread
{
    static Thread mainThread;
    @Override
    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<3;i++){
            try{
                System.out.println("Thread-1");
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
         mainThread =  Thread.currentThread();
         JoinMethod threadOne = new JoinMethod();
         threadOne.start();
         threadOne.join();
        for(int i=0;i<3;i++){
            try{
                System.out.println("Thread-0");
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
