import java.util.Arrays;

public class DemoMethodArray {
  public static void main(String[] args) {
    double []prices = new double[]{2.0,9.8,5.6};
    int []quantities = new int[]{2,4,5};

    double totalAmount = total(prices, quantities);
    System.out.println("totalAmount" +  totalAmount);

    // 
    double amount = DemoMethodArray.total(prices, quantities); //better then line 6<--choose from any java program

    // System.out.println(ABC.hello()); //"hello"  -->Find out why cant print
    // print out from other workspace 

    String[] ss = new String[]{"a aa ","b  b b  "};
    String[] ss2 = trimSpace(ss);
    System.out.println(Arrays.toString(ss2)); 

    // pass by reference example  -->find out why red line
    String []mm =new String[]{"a aa ","b  b b"};
    trimSpace2(mm);
    System.out.println(Arrays.toString(mm));
  }

  public static Integer sum(Integer x, Integer y){ //pass by value
    return x + y; // int + int -> int ->autobox
  }

  public static String trimSpace(String s){     //pass by value  (a copy of the original string object)
    return s.replace(" ","");
  }

    // return {"aaa","bbb"}
  public static String[] trimSpace(String[] ss){  // pass by reference (address)
    String[] strings = new String[ss.length];
    for ( int i = 0; i < strings.length; i++){
      strings[i] = ss[i].replace(" ","");  //<-important step
    }
    return strings;  //returning string array object address
  }
  public static void trimSpace2(String[] ss , String s){
    for (int i = 0; i <ss.length; i++){
      ss[i] = ss[i].replace(" ","").concat(s);
    }
  }
  // Method: totalAmount -> call subTotal
  public static double total(double[] prices,int[] quantities){
    double totalAmount = 0.0d;
    for ( int i  = 0; i < prices.length; i++){
      totalAmount += subTotal(prices[i],quantities[i]);
    }
    return totalAmount;
  }
  // Method: subTotal(double price,int quantity)
  public static double subTotal(double prices,int quantities){
    return prices * quantities;
  }
 
   
  
}