public class Test {
  public static void main(String[] args) {
    Car car = new Car(); // stil work, coz class "Car" is public
    car.setSpeed(100.d);
    System.out.println(car.getColor()); // ->空指針 String default:null
    System.out.println(car.getCapacity()); // -> 0 default: 0

    if ( car.isOverSpeed()){  // car.isOverSpeed() == true

    }
    // 17 types : null

    // int integers = null;
    // integers[0] = 1; // null pointer exception

    // int x =null;
    Integer x2 = null;
    String s2 = "hello"; // char[] -> 'h' 'e' 'l' 'l' 'o'

    boolean b1 = false;

  }
}
