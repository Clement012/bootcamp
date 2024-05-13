public class Father implements Swim{
  @Override
  public void swim(){
     System.out.println("I'm Swimming");
     System.out.println("Bye");
  }
  public static void main(String[] args) {
  //Before Lambda
    Father father = new Father();
    father.swim();

  // After Lambda  **Syntax below
  // can no need create other class below method.
    Swim father2 = () -> {
      System.out.println("I'm Swimming");
      System.out.println("Bye");
    };
    father2.swim();

     Swim mother = () -> {
      System.out.println("I'm Mother");
      System.out.println("Hi");
     };
     mother.swim();
  }
}
