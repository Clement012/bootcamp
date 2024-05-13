public class DeadLock {  
  // method 1-> method 2-> method 1
  // deadlock.
  private Object lock1 = new Object();
  private Object lock2 = new Object();

  public void method1(){
    synchronized (lock1){
      System.out.println(1);
      method2();
    }
  }
  public void method2(){
    synchronized (lock2){
      System.out.println(2);
      method1();
    }
  }
  public static void main(String[] args) {
    DeadLock dl = new DeadLock();
    
    Thread th1 = new Thread(() -> dl.method1());
    Thread th2 = new Thread(() -> dl.method2());

    th1.start();
    th2.start();
    System.out.println("end");


  }
}

