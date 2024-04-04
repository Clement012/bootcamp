

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";
    int count = 0;
    // prints J
    // prints e (the 1st e)
    for (int i = 0; i< str.length(); i++){
    if ( str.charAt(i) == 'J' ){
      System.out.println("J");
      }
    }
    for (int i =0; i < str.length(); i++){
    if ( str.charAt(i) == 'e');
    if ( i >= 1);
    break;
  }
    System.out.println("e");
    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));
    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());
    // Use String replace() method
    // prints VenturenixLAB, Coding
    String after = str.replace("Java","Coding");
    System.out.println(after);

    // int length()
    // prints 19

    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == ' ');
      count++;
    }
        
    System.out.println(count);
    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println("VenturenixLAB, Java".toUpperCase());
    System.out.println("VenturenixLAB, Java".toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    String after2 = str.replace("e","*");
    System.out.println(after2.toUpperCase()+"!!!");

  }
}