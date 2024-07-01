package literalpool;

public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";

    System.out.println(System.identityHashCode(s));  //1159190947, hashcode -> object address
    System.out.println(System.identityHashCode(s2));  //1159190947

    String s3 = "hello ";
    System.out.println(System.identityHashCode(s3));  //925858445

    String s4 = new String("hello");
    System.out.println(System.identityHashCode(s4));  // 798154996

    String s5 = String.valueOf("hello");
    System.out.println(System.identityHashCode(s5));  // 1159190947 same as s&s2

    System.out.println(s == s2);  // true
    System.out.println(s2 == s5);  // true
    System.out.println(s == s4);  //false

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb1 == sb2); // false

    String str = "aaa";
    System.out.println(System.identityHashCode(str)); // 681842940
    str = str + "bbb";
    System.out.println(System.identityHashCode(str)); // 1670782018 
    // ==: same object address
    // .equalsTo: same 文字
  }
}
