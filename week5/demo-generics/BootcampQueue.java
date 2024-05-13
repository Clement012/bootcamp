import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQueue<T> {
  
  private Queue<T> data;

  private Object data2;

  public BootcampQueue (){
    this.data = new LinkedList<>();
  }

  //add()
  public void add(T data){  // T can be one thing only -> only compile check
    this.data2 = data;
  }
   public void add2(Object data2){  // Object can be anything -> Integer or String or maybe Coustomer
    this.data2 = data2;
   }

  //poll()
  public T poll(){
    return this.data.poll();
  }

  public String toString(){
    return "Bootcamp("
    + "data=" + this.data
    + ")";
  }

  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add("hello");
    bq.add2("hello");
    bq.add2(3L);
    bq.add2(3);
    // bq.add(3); compile time type check-> error 
    System.out.println(bq.toString());
   
  }
}
