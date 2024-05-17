package DIY;
public interface ClothesFactory{
  
  enum Weather{
    SUMMER,WINTER,;
  }
  Tops createTops();

  Bottoms createBottoms();

  public static ClothesFactory create (Weather weather){
    return switch (weather){
      case SUMMER -> new SummerFactory();
      case WINTER -> new WinterFactory();
    };
  }
//  public static ClothesFactory create(Weather weather) throws Exception{
//     switch(weather){
//      case SUMMER:
//      return new SummerFactory();
//      case WINTER:
//      return new WinterFactory();
//     }
//     throw new Exception("unknown");
//  }
  
  public class SummerFactory implements ClothesFactory{
    @Override
    public Tops createTops(){
      System.out.println("Summer clothes have sleeves?");
      return new SummerTops();
    }
    @Override 
    public Bottoms createBottoms(){
      System.out.println("Summer bottom is long?");
      return new SummerBottoms();
    }
  }
    public class WinterFactory implements ClothesFactory{
      @Override
      public Tops createTops(){
        System.out.println("Wither clothes have sleeves?");
        return new WinterTops();
      }
      @Override 
      public Bottoms createBottoms(){
        System.out.println("Wither bottom is long?");
        return new WinterBottoms();
      }
    }

    public interface Tops {
      boolean hasSleeves();
        public static Tops create(ClothesFactory factory){
          return factory.createTops();
        }
    }
    public interface Bottoms{
      boolean isLong();
        public static Bottoms create(ClothesFactory factory){
           return factory.createBottoms();
    }
  }

    public class SummerTops implements Tops{
      @Override
      public boolean hasSleeves(){
        return false;
      }
    } 
    public class WinterTops implements Tops{
      @Override
      public boolean hasSleeves(){
        return true;
      }
    }

    public class SummerBottoms implements Bottoms{
      @Override
      public boolean isLong(){
        return false;
      }
    }
    public class WinterBottoms implements Bottoms{
      @Override
      public boolean isLong(){
        return true;
      }
    }
  public static void main(String[] args) throws Exception {
    ClothesFactory factory = ClothesFactory.create(Weather.SUMMER);
    Tops tops = factory.createTops();
    System.out.println(tops.hasSleeves());
    Bottoms bottoms = factory.createBottoms();
    System.out.println(bottoms.isLong());
    ClothesFactory factory2 = ClothesFactory.create(Weather.WINTER);
    Tops tops2 = factory2.createTops();
    System.out.println(tops2.hasSleeves());
    Bottoms bottoms2 = factory2.createBottoms();
    System.out.println(bottoms2.isLong());
  }
}