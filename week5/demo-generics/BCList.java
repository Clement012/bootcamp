public class BCList <T, U>{  // Type T:1& U:2 

  // separate in instance method and static method
  private T data1;

  private U data2;

  public BCList(T data1,U data2){  
    this.data1 = data1;
    this.data2 = data2;
  }

  public T getData1(){
    return data1;
  }

  public U getData2(){
    return data2;
  }

  // in static method <T> is 獨立的
  // not belong to class
  public static <T extends Number> double sum(T number1 , T numbers){ // <T> no relationship to line 1 
    System.out.println(number1.getClass());  // integer
    System.out.println(numbers.getClass());  // long
    return number1.doubleValue() + numbers.doubleValue();
  }
  public static void main(String[] args) {
    BCList<String,Integer> bclist = new BCList<>("hello", 12);  //define String and integer
    System.out.println(bclist.getData1());
    System.out.println(bclist.getData2());

    // T and U can be same type
    BCList<String,String> bclist2 = new BCList<>("hello", "hi"); 
    System.out.println(bclist2.getData1());
    System.out.println(bclist2.getData2());

    // "public class BCList <T,T>" -> two attributes must be same type.
    sum(Integer.valueOf(13), Long.valueOf(20));

    // int -> Integer (autobox)
    // Integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast -> overflow)
    
    // Wrapper Class cannot ne converted between each others
    // Integer -> Long (No auto or direct relationship)
    // Long -> Integer (No auto or direct relationship)
  }
}
