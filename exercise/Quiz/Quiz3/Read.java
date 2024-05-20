package example;

public class Read {
  
  static final String string = "IamFinalString";
  private static char c = 'C';

  static{
    char[] chars = string.toCharArray();
    c = chars[2];
  }
  public static void main(String[] args) {
    Read read = new Read();
    System.out.println(read.c);
  }
}
