package com.java.thread;

class BusSeatsBook{

     private static int totalSeats = 20;

     public  synchronized  static void getSeats(int userWantSeats){
          if(userWantSeats < totalSeats){
              try{
                  System.out.println("Processing...");
                  Thread.sleep(3000);
                  System.out.println("Your Seats Is Booked "+userWantSeats);
                  totalSeats = totalSeats - userWantSeats;
                  System.out.println();
                  System.out.println("Total Available Seats is :"+totalSeats);
              }
              catch (Exception e){
                  System.out.println(e.toString());
              }
          }
          else{
              System.out.println(userWantSeats +" Are Not Available");
          }
     }
}
class Thread1 extends  Thread{
     private BusSeatsBook seatsBookObject;
     private int seatsWants;
     Thread1(BusSeatsBook seatsBookObject , int seatsWants){
         this.seatsBookObject = seatsBookObject;
         this.seatsWants = seatsWants;
     }
     public void run(){
         seatsBookObject.getSeats(seatsWants);
     }
}
class Thread2 extends  Thread{
    private BusSeatsBook seatsBookObject;
    private int seatsWants;
    Thread2(BusSeatsBook seatsBookObject , int seatsWants){
        this.seatsBookObject = seatsBookObject;
        this.seatsWants = seatsWants;
    }
    public void run(){
        seatsBookObject.getSeats(seatsWants);
    }
}

public class ClassLevelLock {
    public static void main(String[] args) {
          BusSeatsBook busSeatsBookObj = new BusSeatsBook();
          Thread1 t1 = new Thread1(busSeatsBookObj , 12);

          BusSeatsBook busSeatsBookObj2 = new BusSeatsBook();
          Thread2 t2 = new Thread2(busSeatsBookObj2 , 12);

          t1.run();
          t2.run();

    }
}
