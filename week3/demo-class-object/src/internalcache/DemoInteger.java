package internalcache;

public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1 == i2);  // true
    System.out.println(System.identityHashCode(i1)); //617901222
    System.out.println(System.identityHashCode(i2)); //617901222

    Integer i3 = Integer.valueOf(128); 
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3 == i4); // false
    System.out.println(System.identityHashCode(i3));  //1159190947
    System.out.println(System.identityHashCode(i4));  //925858445

    // byte, short, integer,long -> support Internal Cache
    // Float, Double -> do not support Internal Cache
    Float f1 = Float.valueOf(127); // int -> float : upcast
    Float f2 = Float.valueOf(127);
    System.out.println(f1 == f2); // false
    System.out.println(System.identityHashCode(f1));  //681842940
    System.out.println(System.identityHashCode(f2));  //1392838282

    // Char: some of them support
    Character c1 = Character.valueOf('z');
    Character c2 = Character.valueOf('z');
    System.out.println(c1 == c2); //true

    Character c3 = Character.valueOf('@');
    Character c4 = Character.valueOf('@');
    System.out.println(c3 == c4); //true  //chinese wording cant output
  }
  
}
