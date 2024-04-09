import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args)  {
        // 9 types = primitives + String
        //array:陣列 (Store a set of same type of values)
        //new: only right side 
        // must be same primitive in same array
        // array 同一空格 佔兩次
    int x = 2;
    String s = "abc";
    int [] arr = new int[3]; // if 3 : means can store 3 value
    // Assign value to the int array
    // **point to the right position
    arr[0] = 100;
    arr[1] = 10012;
    arr[2] = 1001234;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // Create another int array to the original variable
    // cancel upside one * -> update data
    arr = new int[4];

    System.out.println(0);

    long[]arr2 = new long[10];
    String[] strings = new String[2];

    String[] strings2 = new String[3];
    strings2[0] = "abc";
    strings2[1] = "hello";
    strings2[2] = "hi";
    strings2[0] += "def";

    // string[0] -> an address pointing to a String object
    System.out.println(strings2[0]); // "abcdef"
    
    strings2[1] = strings2[2];
    System.out.println(strings2[1]); // "hi"
    String[] backup = strings2; // assign the address of original array to another array variable 
    // concept : the point of strings[1]-->change to strings[2]
    // Strings2[1]: will disappear

    // new : change point to another array
    // if nothing assigned in strings --> default name: null
    String[ ]str3 = new String[4]; //open new room and cancel the old point
    System.out.println(str3[0]); // null
    int[] integers = new int[3];
    System.out.println(integers[1]); //0
    // default value of double is 0.0
    // default value of boolean is false
    // default value of char is '\u0000'

    // ASCII code
    char c3 = 'a'; //97
    System.out.println(c3); //a
    System.out.println(c3 > 97); //false
    System.out.println(c3 > 96);

    if ( c3 == 97){
        System.out.println("c3 is 97 in ASCII");
    }
    if ( c3 == 'a'){
        System.out.println("c3 is char a");
    }
    if (c3 >= 'a'){
        System.out.println("c3 >= 97");
    }

    // convert bigger to smaller is a can
    long l = 8L;
    /// int x2 =l; //compile time error
    int x2 = (int) l; // You pick the risk
    System.out.println("x2=" + x2);

    short s2 = 128;
    byte b = (byte) s2;
    System.out.println("b=" + b);  //-128 (overflow) (not common sense)

    // The ways to declare and assign String value
    String s3 = "abc"; //"abc" is a string object in heap
    String s4 = new String("abc"); // this "abc" is another new string object in heap
    String s5 = "abc"; // same as s3
    String s6 = new String("abc"); // another another new object in heap

    // Array : Fixed address and fixed length
    //1
    String[] strings5 = new String[3];
    strings5[0] = "hello";
    strings5[1] = "hello";
    strings5[2] = "hello";
    //2
    String[] strings6 = new String[]{"Hello","Hello","Hello"}; // imply the length = 3 
    //3(not recommend)
    String[] strings7 = {"hello","hello","hello"}; // imply you have to assign a string array object

    // .length : no need 括號
    for (int i = 0;i < strings5.length;i++ ){ // 0,1,2 count line 90
        System.out.println(strings5[i]);
    }
    //Example 1
    int[] integers2 = new int[] {1,2,3,4,5,6,7};
    int result = ' ';
    // loop: print all odd number
    for (int i = 0; i < integers2.length ;i++){
        if (integers2[i] % 2 == 1){
    System.out.println(integers2[i]);}
    }
    // average value of even number
    int even = 0 ;
    int count1 = 0;
    for (int i = 0;i < integers2.length ;i++){
        if (integers2[i] % 2 == 0){
            even += integers2[i];
         count1++;
        } 
    }
    System.out.println(even/count1);
    // Find the max value within the int array
    int max = Integer.MIN_VALUE; // the min.value of int
    for ( int i = 0; i < integers2.length ; i++){
        if (integers2[i] > max){
            max = integers2[i];
        }
    }
    System.out.println("max = " + max);
    // Find the min value within the int array
    int min = Integer.MAX_VALUE;
    for ( int i = 0; i < integers2.length; i++){
        if (integers2[i] < min ){
            min = integers2[i];
        }
      }
      System.out.println("min = " + min);

      // Example2 -->Searching
      // !!!ANY SCERANIO!!
      char[] characters = new char [] {'a','b','e','!'};
      boolean result2 = false;
      // check if the array contains char '!' -> true/false
      for  ( int i = 0; i < characters.length; i++){
        if (characters[i] == '!'){
            result2 = true;
            break;
        }
    }
    System.out.println(result2);
      // Example2b
      // print out the first index of '!', if not found, print -1
      int index = -1;
      for (int i = 0; i < characters.length; i++ ){
        if (characters[i] == '!'){
       index = i; 
       break;
      } 
    } 
   System.out.println(index);
     // Example 2c
     // Store all index of '!' in another array
     char[] characters2 = new char[]{'a','b','!','e','!'};
     int[] indexes = new int[characters2.length];
     int j = 0;
     for (int i = 0; i < characters2.length; i++ ){
        if(characters2[i] == '!'){  // condition
        indexes[j++] = i;
        // j++;
        }
     }
     System.out.println(Arrays.toString(indexes));

    // Example 2d
    double total = 0;
    String[] balls = new String []{"RED", "YELLOW","BLACK","YELLOW"};
    double[] prices = new double[] {5.5,7.8,10.0,7.8};
    int[] quantities = new int[] {1,3,4,5};
    // Find the total amount of Yellow balls(price*quantity)
    for (int i = 0; i < balls.length; i++){
      if ("YELLOW".equals(balls[i])){
        total += prices[i] * quantities[i];
      } 
    }
    System.out.println(total);

    byte value = 127;

    for (int i = 0; i < 10; i++){ //0 - 9
        value++;
    }
    System.out.println(value); //-119

    // Swapping

    // Example
    int[] arr4 = new int []{10,3,9,4};
    //9,3,10,4
    int temp = arr4[0];
    arr4[0] = arr4[2];
    arr4[2] = temp;
    System.out.println(Arrays.toString(arr4));
    //3,10,4,9
    int temp2 = -1;
    for ( int i = 0; i < arr4.length - 1; i++){ // if no length -1 compile error
     temp2 = arr4[i];
     arr4[i] = arr4[i+1];
     arr4[i + 1]= temp2;
    }
    System.out.println(Arrays.toString(arr4));
    int max2 = Integer.MIN_VALUE;
    int idx = -1;
    //Now: {3,10,4,9}
    //Tatget {10,3,4,9}
    for ( int i = 0; i < arr.length; i++){
      if(arr4[i] > max2){
        max2 = arr4[i]; 
        idx = i;
        }
    } //idx = 1
    for ( int i = idx; i > 0; i--){  // when i>= 0, program explode
      temp2 = arr4[i];
      arr4[i] = arr4[i - 1];
      arr4[i - 1] = temp2;
    }
    System.out.println(Arrays.toString(arr4));

    // Sorting 

    // Example (bubble sort)
    int[] arr5 = new int[]{-10,-42,8,19,1};
    // Target [-42,-10,1,8,19]
    // Round1:
    // [-42,-10,8,19,1] : -10 > -42
    // [-42,-10,8,19,1] : 8 > -10
    // [-42,-10,8,19,1] : 19 > 8
    // [-42,-10,8,1,19] : 19 > 1
    // Round2: 
    // [-42,-10,8,1,19] : -10> -42
    // [-42,-10,8,1,19] : 8 > -10
    // [-42,-10,1,8,19] : 8 > 1
    // Round3:
    int t = -1;
    for ( int i = 0; i < arr5.length - 1; i++){  //0,1,2,3,4 --> i=Round
     for ( int k = 0; k < arr5.length - i - 1; k++){ //mainly use j is this case
        // Why -1? 因為交換的話,最尾既數 唔需要最尾重新交換
        if (arr5[k] > arr5[k + 1]){
          t = arr5[k];
          arr5[k] = arr5[k + 1];
          arr5[k + 1] = t;
          }
        }
      }
      System.out.println(Arrays.toString(arr5));
    // Example2
    int[]arr6 = new int[]{4,3,2,10,12,1,5,6};
    // {1,2,3,4,5,6,10,12}
    for ( int i = 0; i < arr6.length -1 ; i++){
        for  (int k = 0; k < arr6.length -i -1; k++){
        if (arr6[k] > arr6[k + 1]){  //if middle符號交換 成個CHAIN倒轉
            t = arr6[k];
            arr6[k] = arr6[k + 1];
            arr6[k + 1] = t;
        }
        }
    }
    System.out.println(Arrays.toString(arr6));
    // CHECK break

    // Example3 (Insertion sort)
    // logic thinking --> program become faster
    // need to think forloop's using place
    int[] arr7 = new int[]{-10, -5, -30, 9, 1, -100};
    for (int i = 1; i < arr7.length; i++){  
      int key = arr7[i];  ///backup
      int k;
      for (k = i - 1; k >= 0; k--){
        //if -> swap -> break
        //if (arr7[k] > key){arr7[k + 1] = arr7[k];
        if (arr7[k] <= key){
            break;
        }
        arr7[k + 1] = arr7[k];
      }
      arr7[k + 1] = key;
      // key -> position
    }
    System.out.println(Arrays.toString(arr7));
    }
  }
