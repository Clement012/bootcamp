package practice.src;
public class week1DataTypeRe{
    public static void main(String[] args){
// Primitius basics
// byte/short/int/long  //boolean/char/float/double  //String
  int b1 = 2;
  short s1 = 16;
  int sum = s1 + b1;
  System.out.println(sum);
  int sum2 = 16 % 5;
  System.out.println(sum2);
  int i1 = 10;
  long il = 2l;
  System.out.println(il);
  boolean b2 = true;
  char c2 = 'r';
  float f2 = 10.6f;
  double d2 = 10.6;
  String s2 = "A1B2C3D40";
  System.out.println(d2+10);
  System.out.println(s1+40);
// Tools of String: 
// length()/charAt()/equals
  String s3 = "Clement loves Emma!";
  String s4 = "Clement loves Emma!";
  String s5 = "x3000";
  System.out.println(s3.length());
  System.out.println(s4.charAt(8));
  System.out.println(s5.charAt(4));
  Boolean isS3EqualsToS4 = s3.equals(s4);
  System.out.println(isS3EqualsToS4);
  System.out.println(s3+s5);

    }
}
