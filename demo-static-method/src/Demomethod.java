public class Demomethod {

    // static method
    // void is a return type, representing it should not return anything.
    public static void main(String[] args) {
    // 1 + 3 = ?
    // 2 + 5 = ?
    int result = 1 + 3;
    int result2 = 2 + 5;

    // call method
    result = sum(1 , 3);
    result2 = sum(2 , 5);

    sum(1.3, 1.4);
    System.out.println(sum(1,3)); //4

    Integer m = 3; // autobox
    Integer n = 4; // autobox
    if (m > n){}  //wrong
    if (m.compareTo(n) > 0){} //correct
    

    // radius -> Circle area
    double area = area(3.2d);
    double area2 = area("Circle", 3.2d);
    double area3 = area("Square", 3.2d);
    double area4 = calculate("Circle","area", 3.2d);
    double area5 = calculate("Square","area", 3.2d);
    double perimeter = calculate("Circle","perimeter", 3.2d);
    double perimeter2 = calculate("Square","perimeter", 3.2d);

    // Adult
    int age = 18;
    if (age>= 18){

    }
    boolean isAdult = isAdult(age);

    double pi = Math.PI; 
    }
    // static method
    // "sum" is a method name
    // "(int x, int y)" is declaration of input parameters for methods
    // "int" is also a return type.
    // keyword"return" : for all non-void scenario
    public static int sum(int x,int y){
    // public static short not ok-->maybe overflow
    // public static long ok-->upcast
        int z = x + y;
        return z;
    }
    
    // subtraction
    public static int subtract(int x,int y){
        int z = x - y;
        return x - y; // int value - int value -> int value
    }

    // Method Definition: Method Name + Input Parameter (type & no. of parameter)
    public static double sum(double x, double y){
        return x + y; // double+double-> double
    }
    public static double sum(int x, double y){
        return x + y; // int +double-> double
    }
    //public static int sum(double x, int y){ // int sum not ok
    //    return x + y; // double+ int -> double
    
    public static int sum(String x,String y){
        ///Integer z = Integer.valueOf(x).intValue() + Integer.valueOf(y).intValue(); //convert String to Integer
        // Integer Object -> int value
        return Integer.valueOf(x) + Integer.valueOf(y); // unbox Int+Int -> int+int->int
    }
    public static double area(double r){
        return r * r * Math.PI; // bug ->double cant define in multipucation
    }

    public static double area(String s, double x){
    // if (...) return diiferent formula
    double area = -1.0;
    if ("Circle".equals(s)){
        return x*x*Math.PI;
    }else if ("Square".equals(s)){
        return x * x;
    }
    return -1.0;
    }

      public static double calculate(String shape,String target, double x)
        
     //   cant cover all--> define target first
     //   if ("Circle".equals(shape) && "area".equals(target)){
     //       return x*x*Math.PI;
     //   }else if ("Square".equals(shape) && "area".equals(target)){
     //       return x*x;}
     //   else if ("Circle".equals(shape) && "perimeter".equals(target)){
     //       return x*2*Math.PI;}
     //   else if ("Square".equals(shape) && "perimeter".equals(target)){
     //       return x*4;}
     //   return -1.0d;

     public static boolean isAdult(int age){
     //1)   if (age>= 18)
     // return true;
     // return false;
     //2)  return age 18>= 18 ? true : false;
     //3)
     return age>= 18;
    }
     
}