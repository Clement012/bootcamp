public class ABC {
  public static void main(String[] args) { //Java run到既意思
    System.out.println("hello");
    Car c = new Car();   // c -> object reference
    c.setColor("RED"); 
    c.setSpeed(80.0d);
    c.setCapacity(4);
    System.out.println(c.getColor()); //RED
    System.out.println(c.getSpeed()); //80.0
    System.out.println(c.getCapacity()); //4
    System.out.println(c.toString());
    Car c2 = new Car();   
    c.setColor("YELLOW"); 
    c.setSpeed(100.0d);
    c.setCapacity(5);

    c = new Car();
}
}