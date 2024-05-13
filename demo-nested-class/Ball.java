public class Ball {
  private Color color;
  private double weight;

  enum Color{
    RED, YELLOW, BLACK,
  }
   public Ball(Color color,double weight){
   this.color = color;
   this.weight = weight;
  }
  private Ball(BallBuilder ballBuilder){
    this.color = ballBuilder.color;
    this.weight = ballBuilder.weight;
  }

  public String toString(){
    return "Ball("
    + "Color=" + this.color
    + ", Weight=" + this.weight
    + ")"; 
  }
    // Bulider Pattern (Coding Pattern)
    // 1. avoid setter, so that i can create ball object with all attribute values
    // 2. avoid all-args constructor() 
    public static class BallBuilder{
      private Color color;
      private double weight;

    public BallBuilder setColor(Color color){ // chain method
      this.color = color;
      return this;
    }
    public BallBuilder setWeight(double weight){ // chain method
      this.weight = weight;
      return this;
    }
    public Ball build(){
      return new Ball(this);
      }
    }
    public static BallBuilder builder(){
        return new BallBuilder();
      }
  
    public static void main(String[] args) {
      // Builder Pattern is an alterative for creating objects.
      // We are not longer to use all-arg constructor
      Ball ball = new Ball.BallBuilder()  // empty conctructor of BallBuilder
      .setColor(Ball.Color.RED)
      .setWeight(20.0d)
      .build();
      System.out.println(ball);  //  Ball(Color=RED, Weight=30.0)

      Ball ball2 = Ball.builder()
      .setWeight(40.0d)
      .setColor(Ball.Color.RED)
      .build();
      System.out.println(ball2); 

      Ball ball3 = new Ball(Color.YELLOW, 3.0d);  // all-arg constructor
      System.out.println(ball3);
    }

    
  }

