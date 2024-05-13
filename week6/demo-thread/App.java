public class App{
  // not 確保 main run speed same and depends on行數 (有機會後START但先output)
  // running 4 thread in memory 
  public static void main(String[] args) {
     // 4 threads -> 
     //1. main thread
     //2. th1
     //3. th2
     //4. myThread

     // Approach 1: A class to implement Runnable interface(Thread constructor)
     Task task = new Task();

     // Approach 2: Lambda to create a runnable object(Thread constructor)
     Runnable task2 = () ->{
      System.out.println("task2 RUN");
     } ;

     // Approach 3: MyThread extends Thread
     MyThread myThread = new MyThread();
     myThread.start();

     Thread th1 = new Thread(task); // trigger run method()
     th1.start();  //task RUN

     Thread th2 = new Thread(task2);
     th2.start();  //task RUN

     System.out.println("main ends");
  }
}