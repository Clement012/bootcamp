public class DemoString {
  public static void main(String[] args){
    //isEmpty/isBlank
    String s = "hello";
    String s2 = "";
    String s3 = " ";
    String s4 = "   ";

    boolean isEmptyResult = s2.isEmpty(); //true
    System.out.println(isEmptyResult);

    System.out.print(s.isEmpty()); //false
    System.out.print(s3.isEmpty()); //false

    System.out.print(s.isBlank()); //false
    System.out.print(s2.isBlank()); // true
    System.out.print(s3.isBlank()); // true (different)

    System.out.print(s4.isBlank()); //true
    System.out.print(s4.isEmpty()); //false

    // substring()
    String result = s.substring(0, 3); //hel  ~end index-1
    System.out.println(result); 

    result = s.substring(2);
    System.out.println(result); // llo ~start from h/e/l(0/1/2)

    //lowercase()
    System.out.println("HELLo".toLowerCase());
    //uppercase()
    System.out.println("heLlo".toUpperCase());

    // contains
    System.out.println(s.contains("ll")); //true

    // startsWith()
    System.out.println(s.startsWith("he")); //true
    // endsWith()
    System.out.println(s.endsWith("lo")); //true

    // replace()
    String after = s.replace("l","z"); //replace "l" by "z"
    System.out.println(after); //hezzo

    // trim() -> remove the space at the beginning and the tail of the string
    String s5 = "   hello  ! world  ";
    System.out.println(s5.trim()); // "hello  ! world"
    System.out.println(s5.replace(" ","")); // remove all spaces

    // indexOf()
    char c = s.charAt(2); // l
    System.out.println(s.indexOf('l')); // 2-> the index of first matching character
    System.out.println(s.indexOf('!')); // -1 (default)
    System.out.println(s.lastIndexOf('l')); //3

    System.out.println(s.indexOf("ll")); //2
    System.out.println(s.lastIndexOf("ll")); //2

    //Ignore
    System.out.println("hello".equals("Hello")); //False
    System.out.println("hello".equalsIgnoreCase("Hello")); // true
    System.out.println("hello".equalsIgnoreCase("hello ")); //false
  }
}
