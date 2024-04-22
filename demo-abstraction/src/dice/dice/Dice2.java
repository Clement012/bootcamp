package dice;

import java.util.Arrays;
import java.util.Random;

public class Dice2 implements Roll{

  private final FCP[] fcps = {FCP.FISH, FCP.CRAB, FCP.PRAWN};

  public FCP[] getFcps(){
    return this.fcps;
  };
  
  @Override
  public int roll(){
    // Random 0 - 5 numbers -> array index 
    int idx = new Random().nextInt(3); // can get 0-5 randomly // needs util
    return fcps[idx].getValue();
  }

  public FCP roll2(){
    int idx = new Random().nextInt(3);
    return fcps[idx];
  }

  @Override
  public String toString(){
    return "Dice2("
    +"image=" + Arrays.toString(this.fcps)
    +")";
  }
  public static void main(String[] args) {
    Dice2 d = new Dice2();
    System.out.println(d.toString()); // Dice2(colors=[FISH, CRAB, PRAWN])
  }
}
