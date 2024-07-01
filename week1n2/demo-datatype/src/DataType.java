package datatype.src;

public class DataType {
  public static void main(String[] args){
    // variable
    // integer 
    int x = 3;
    int age = 18;
    System.out.println(x);
    x = 200;
    System.out.println("x");// x
    System.out.println(age);

    int y = -80;
    y = -96;

    // x, y, age
    int sum = x + y + age;
    System.out.println(sum);

    int price = 30;
    int quantity = 96;
    int total = price*quantity;
    System.out.println(total);

    int price2 = 3;
    int quantity2 = 27;
    int total2 = price-quantity2/price2;
    System.out.println(total2);

    double k = 0.1 + 0.2;
    System.out.println(k);//0.30000000000000004

    double k2 = 3.1415926372482312334; //
    System.out.println(k2); //have limit

    int u = 10 % 3; //1
    System.out.println(u); //remain

   int h; // declaration
   //System.out.orintln(h);//error
   h = 10; // initialzation
   System.out.println(h); // use variable

   //Conversion//
  byte b1 = 10;
  byte b2 = 122;    
  long b3 = 99999;
  int i1 = 1234; 
  long l1 = i1 + 1234; //int value -> long variable
  System.out.println(b3); 
  System.out.println(l1);
  int i2 = (int) b3; // b3: long -> int
  System.out.println(i2);
  // byte value remind
  // byte,short,int,long=8,16,32,64  in integer
  // byte=2^8 +127&-128
  // short=2^16 +32767&-32768
  // int=2^32(java default)  long=2^64
  // Java ensures type security eg: int>short NOTOK!
  int r1 = 10;
  byte b10 = 4;
  // For integer, Java will help check the value, 
  // If it is in range. int -> byte ok 
  long l4 = i1; // above int: -->change to long
  long l5 = 10000; // int value
  long l6 = 10000l; // long value by adding "l" at the last of value
  //sum= l4 + l5 + l6; cant coz not the same command
  //eg: int h1 = 10 + 300l; int value + long value --> 310 long value. long->int=error)
  long h2 = 10 + 300l; // turn out long value-->ok //
  System.out.println(h2);
  //.//
  float f4 = 10.2f; // fix like above : f4
  double f5 = 20.8;
  double f6 = 21.2d;
  // double is java default in . : eg:10.8
  // int -> float ok // float -> int not ok

  // char : any symbols //
  char c1 = 'a';
  char c4 = ' ';
  char c5 = '@';
  // char c2; char c3=aa;  cant: compile time error
  // remind to use ' '

  // boolean : only true and false//
  boolean b9 = true;
  boolean b16 = false;
  System.out.println(b9);

  }
}

