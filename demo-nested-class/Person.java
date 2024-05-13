public class Person {
  void read(){
    System.out.println("Reading");
  }
  public static void main(String[] args) {
    Person p1 = new Person();

    p1.read();

    Person p2 = new Person(){
      @Override
      public void read(){
        System.out.println("READING2");
      }
    };
    p2.read();
  }
}
