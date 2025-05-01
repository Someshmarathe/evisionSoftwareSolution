public class MethodRefference {
    public static void hello(){
          for(int i=0;i<3;i++){
              try {
                  Thread.sleep(1000);
                  System.out.println(Thread.currentThread().getName()); 
              } 
              catch (Exception e) {
                  e.printStackTrace();
              }
      }
}
    public static void main(String[] args) {
          Runnable rd = MethodRefference::hello;
          Thread t = new Thread(rd);
          t.start();
    }
}
