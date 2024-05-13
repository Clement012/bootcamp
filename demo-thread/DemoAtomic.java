import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  static AtomicInteger x = new AtomicInteger(17);

  public static void main(String[] args) {
    
    int result = x.incrementAndGet();
    System.out.println(result); //18
  }
}
