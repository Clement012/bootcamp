public class Calculator {
  public static int x =17;

  public static synchronized void addOne(){  // syncchronized: provide thread safety. 
    x++;
  }

  public static void main(String[] args) {
    Runnable incrementOne = () -> {
      for (int i = 0; i< 1_000_000; i++){  // test to try thread safe
     // Calculator.x++;  //non thread-date
       addOne();
      }
    };
    Thread th1 = new Thread(incrementOne);
    Thread th2 = new Thread(incrementOne);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    }catch (InterruptedException e){

    }
    System.out.println(Calculator.x);  // main thread, 17 or 18 or 19
  }
  
}
