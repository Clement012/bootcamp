public class Outer {

  private int x = 10; // private int = x;
  private static int y = 100;

  public int getX(){
    return x;
  }

  public static int getY(){
    return y;
  }

  public void print(){
    class LocalInner{ // 2b. Local Inner Class
      int x;
      LocalInner(int x){
        this.x = x;
      }
      void print(){
        System.out.println("hello3" + this.x);
      }
    }
    LocalInner li = new LocalInner(20);
    li.print();
  }

  // 1.Static nested class (Static member of outer class)
  public static class StaticNested{  // 
    void print(){
      System.out.println("hello" + y );
       // System.out.println("hello" + x ); //cant access outer object instance variable x
    }
  }
  
  // 2.Inner Class (non-static) (Instance member of Outer Class)
  public class Inner{
    void print(){
      System.out.println("hello2" + x + y); //OK
      // System.out.println("hello2" + this.x); //not OK, because this -> Outer Object
    }
  }
  public static void main(String[] args) {
    Outer o1 = new Outer();
    System.out.println(o1.x); //10

    System.out.println(Outer.y); //100

    Outer.StaticNested o2 = new Outer.StaticNested();  // static
    o2.print(); // hello100

    Outer o3 = new Outer();  // new Object -> // new 
    Outer.Inner o4 = o3.new Inner();
    o4.print(); //hello210100

    Outer.Inner o5 = o3.new Inner();
    o5.print(); //hello210100

    Outer o6 = new Outer();
    o6.print();  //hello320

    // before Java 8 (before lambda) more than one method
    Drivable vincent = new Drivable() {
      @Override
      public void drive(){
        System.out.println("Driving");
       }
      @Override
      public void abc(){
        System.out.println("abc");
      }
     };
    
    vincent.drive();  //Driving
    vincent.abc();
  }
}
