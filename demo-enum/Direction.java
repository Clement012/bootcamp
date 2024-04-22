 // Finite number of values
public enum Direction {  // class: run java program,[JWM] new 4 objects of Direction
  EAST(1, 'E'),
  SOUTH(2, 'S'),
  WEST(-1, 'W'),
  NORTH(-2, 'N'),
  ;

  private int value;   // private final int value--> cant use setter
  private char c;
  // private Direction(){}  <-- no need 
  private Direction(int value, char c){
    this.value = value;
    this.c = c;
  }
  public int getValue(){
    return this.value;
  }
  public void setValue(int value){  //wont set after "final"
   this.value = value;
   } 

   public static Direction opposite(Direction direction){ //<-static
    if ( direction == null)
     return null;
    for (Direction d : Direction.values()){  // values-> implicit static method
      if(direction.getValue() * -1 == d.getValue())
      return d;
    }
    return null;
   }
   public Direction opposite(){
    for (Direction d : Direction.values()){
      if (this.value* -1 ==d.getValue())
      return d;
    }
    return null;
   }

  // Cant create Direction "object" yourself
  public static void main(String[] args) {
    // check if the direction is EAST?
    House house = new House(Direction.EAST); // set an address of enum object
    house.setDirection(Direction.NORTH);

    System.out.println((house.getDirection() == Direction.EAST));

    System.out.println(Direction.NORTH.getValue()); // 4
    //Direction.NORTH.setValue(5); //wont do this after "final"
    System.out.println(Direction.NORTH.getValue()); //5

    System.out.println(Direction.opposite(Direction.WEST)); // Direction.EAST

    System.out.println(Direction.EAST.opposite().name()); //"WEST"

    Direction direction = Direction.NORTH;
    int degree = getDirectionDegree(direction);
    System.out.println("degree=" + degree);
  }
  

  // enum -> switch because controlled variable is only little!
  public static int getDirectionDegree(Direction direction){
    switch (direction){
      case NORTH:
        return 360;
      case EAST:
        return 90;
      case SOUTH:
        return 180;
      case WEST:
        return 270;
      default:
        return -1;
    }
  }
}
