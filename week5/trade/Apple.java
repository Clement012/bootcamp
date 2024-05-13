package week5.trade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;

public class Apple implements Transcation{
  
  // AppleMap name/quantities
  // price

  private double marketPrice;

  public double getMarketPrice(){
    return this.marketPrice;
  }

  public static void main(String[] args) {
    HashMap<Double, Integer> appleMap = new HashMap<>();
    appleMap.put(1.0d, 10);
    appleMap.put(1.2d, 15);
    appleMap.put(1.4d, 20);
    appleMap.put(1.6d, 10);
    appleMap.put(1.8d, 15);
    appleMap.put(2.0d, 20);

 //   int random = new Random().nextInt(20);
 //   marketPrice = 1 + (0.05d*random);
 //  System.out.println(marketPrice);
  }
  
}
