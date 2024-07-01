

public enum Color {
  RED(1),
  YELLOW(2),
  BLUE(3),
  PINK(4),
  BLACK(5),
  WHITE(6);

    private Color(int value){
    this.value = value;
  }
  private int value;

 
  public int getValue(){
    return this.value;
  }
}
