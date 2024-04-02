
// Java : compile language: java file(eg.java)
//-->compilation(javac)->class file (byte code - eg.class)
//Runtime: byte code--> machine code

//"String" is a keyword in Java.
public class String1{
  public static void main(String[] args){
    char c2 = 's';
    String y = "hello world!"; //h   e   llo w  orld! combine
    String z = ""; // empty string ok!+infinity character :""//
    // char only one :'' //

    // Tool for String
    // length() // charAt() // equals() //
    int lengthOfY = y.length(); // count in character
    char character = y.charAt(2); // count start at '0'
    // no minus and overlimit case //
    System.out.println(lengthOfY);
    System.out.println(y.charAt(2));
    System.out.println(y.charAt(0));

    String s1 = "hello";
    String s2 = "hello";
    boolean isS1EqualsToS2 = s1.equals(s2);
    System.out.println(isS1EqualsToS2);
    // concat (string only plus in Java)
    String s5 = s1 + s2;
    System.out.println(s5);
    System.out.println(s5+20); 
    // all string + primitius basic(eg int)=string+string ok
    // Xeg String j2 = 10 + 10; coz int+int cant convert to string
  }
}