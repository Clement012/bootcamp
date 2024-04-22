package poker;

public enum Graphic {
  DIAMOND(1),
  CLUB(2),
  HEART(3),
  SPADE(4);

  private int value;

  private Graphic(int value){
    this.value = value;
  }
   public int getValue(){
      return this.value;
    }
  

}
