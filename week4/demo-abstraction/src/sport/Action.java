package sport;

  public interface Action {
    void run();
    void walk();
    // Java 8 
    default void swim(){  // instance method by inheritance
      System.out.println("Default method: Swim..");
    };
    static void sleep(){  // normal static method 
      System.out.println("Static method: Sleep..");
    }

    public static void main(String[] args) {
      Action.sleep();  // static method call: use class 
      Person p = new Person();
      p.swim();  // instance method
   // p.sleep();  // cant use new variable "p." to call static method
    }
  }

