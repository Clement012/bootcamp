import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
// 自己implement自已 only one formula
public class Ball implements Comparable<Ball> {   //Comparable -> compareTo
  private Color color;
  private Double size;
  public Ball(Color color,double size){
    this.color = color;
    this.size = size;
  }

  public double getSize(){
    return this.size;
  }

  public Color getColor(){
    return this.color;
  }
  @Override 
  public int compareTo(Ball b){  // 
    // this, b -> int
    // -1 means (this) object move to left
    // return this.color == Color.YELLOW ? -1 : 1;
    // return this.size > b.getSize() ? -1 : 1;
    if (this.color == Color.YELLOW)
       return -1;
    if (this.color.name().charAt(0) > b.getColor().name().charAt(0))
    return -1;
    else if (this.color.name().charAt(0) < b.getColor().name().charAt(0))
    return 1;
    return this.size > b.getSize() ?-1:1;
    }
  
  @Override
    public String toString(){
      return "Ball("
         +"size = " + this.size
         +" , color = " + this.color
         + ")";
    }
  public static void main(String[] args) {
    List <Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3d));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add(new Ball(Color.YELLOW, 3.2d));
    balls.add(new Ball(Color.RED, 7.4d));
    balls.add(new Ball(Color.RED,2.4d));
    Collections.sort(balls);
    System.out.println(balls);
  }
}
