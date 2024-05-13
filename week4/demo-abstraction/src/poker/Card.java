package poker;

import java.util.List;
import java.util.Random;

public class Card implements Draw {

  private final Graphic[] graphics =
      {Graphic.DIAMOND, Graphic.CLUB, Graphic.HEART, Graphic.SPADE};

  private final Point[] points = {Point.ACE, Point.TWO, Point.THREE, Point.FOUR,
      Point.FIVE, Point.SIX, Point.SEVEN, Point.EIGHT, Point.NINE, Point.TEN,
      Point.JACK, Point.QUEEN, Point.KING};


  private final List<Point> points2 = List.of(Point.values());

  public Output draw(){
    idx = new Random().nextInt(52);
     return new Output( , )
  } 
   
}
