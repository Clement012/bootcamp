public class DemoWrapper {
    public static void main(String[] args) {

    // 8 primitive basic only
    int x = 1;   // value(part of stack)
    Integer x2 = 1; // Integer wrapper class -> object (i.e String.class -> String Object)
    Integer x3 = new Integer("1"); 
    Byte b = new Byte("1");
    Short s = new Short("1");
    Long l = new Long("1");
    Boolean b4 = new Boolean("false");
    Character c = new Character('o');
    Float f = new Float("1.2");
    Double d = new Double("10.0");

    if (x2.equals(1)){   // x2 more function
        System.out.println("x2=1");
    }

    if (x2 == 1){
        System.out.println("x2=1");
    }
    x2 =128;
    if (x2 == 128){
        System.out.println("x2=128");
    }
    
    // "==" is checking if they are same object
    // ".equals()" is checking if they are same value

    Integer num1 = Integer.valueOf(127); //valueOf -->"new" a Integer object
    Integer num2 = Integer.valueOf(127); 
    System.out.println(num1 == num2); // true
    System.out.println(num1.equals(num2)); // true

    Integer num5 = new Integer("127");
    System.out.println(num1 == num5);  //false

    Integer num3 = Integer.valueOf(128);
    Integer num4 = Integer.valueOf(128);
    System.out.println(num3 == num4); //false
    System.out.println(num3.equals(num4)); //true

    String str2 = "hello";
    String str3 = "hello";
    String str4 = new String("hello");
    String str5 = String.valueOf("hello");  // most common
    // "==" is checking if they are same object
    System.out.println(str2 == str3); //true //String&Char default at all heap are same 
    System.out.println(str2 == str4); //false //reason: new string generated ->not same string 
    System.out.println(str2.equals(str3)); //true
    System.out.println(str2.equals(str4)); //true

    Double d2 = 1.0;  
    Double d3 = 1.0;
    Double d4 = Double.valueOf(1);
    Double d5 = 3.0;
    System.out.println(d2 == d3);  // false  // only integer and string have this 機制
    System.out.println(d2 == d4);  // false
    System.out.println(d2.equals(d3));  //true
    System.out.println(d2.equals(d3));  //true

    System.out.println(d2.compareTo(d3)); // 0
    System.out.println(d2.compareTo(d5)); // -1 ( >:1 =:0 <:-1)

    // 17 Types + array
    // wrapper class-> primitive
    Integer i1 = 3; // 3 (int value)--> Integer Object with value 2 -> auto-box
    int i2 = i1; // unbox

    Character c2 = 'c'; // autobox
    char c3 = c2;  // unbox

    Integer i3 = 10;
    long s4 = i3;  // Integer --> int(unbox) --> long(upcast)
 // short s4 = i3; // Integer --> int(unbox) --> short(un-secure) 

    // primitive -> wrapper class
    int i5 = 12;
    Long l5 = (long) i5; // int -> long(upcast) -> long(autobox)X
    // (long) have to be added because cant have autobox in this case

    //Float.valueOf()
    Float f2 = Float.valueOf("1.0");
    // f2.compareTo(...) ->0,-1,1
    // f2.equals(...) ->true,false
   }
}
