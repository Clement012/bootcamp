import java.util.Arrays;

public class Loop {
  public static void main(String[] args) {
    // ForLoop(SingleLoop) : 
    // Usually use index [i] to loop through. 
    // Example 1
    for (int i = 0; i < 3; i++){
      System.out.print(i);  // 0>1>2
    }
    // Example 2(sumUp)
    int max = 10;
    int min = 1;
    int k = 0;
    for (int i = min; i <= max; i++){
      k += i;
    }
      System.out.println(k); //55 (sum 1-10)
    // Example 3(sumUp in condition)
    int k2 = 0;
      for (int i = min; i <= max; i++) { 
          if (i % 2 == 0) {
              k2 -= i;
          } else {
              k2 += i;
          }
      }
      System.out.println("k2=" + k2); // -5 (1 + 3 + 5 + 7 + 9 - 2 - 4 - 6 - 8 - 10)
    // Example 4(counting)
    String str = "hello world";  // count the number of 'l' -> 3
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'l') {
            count++;
        }
    }
    System.out.println("count=" + count); // 3
    // Example 5(searching)
    String str2 = "abcdefg hello world!";  // index = 13
    // Find the index of the second of space character. If exists, print the index, if no, print N/A
    int spaceCount = 0;
    for (int i = 0; i < str2.length(); i++) {
      if (str2.charAt(i) == ' ' && ++spaceCount == 2) {
        System.out.println("index=" + i);
        break; // <- stop the function
      }
    }  
    // (NestedLoop)
    for (int i = 0; i < 3; i++) { // 0,1,2
      for (int j = 0; j < 2; j++) { // 0,1
        System.out.print("i=" + i + ",j=" + j); // i = ?, j = ?
      }
      System.out.println("hello");
    }
    //i=0,j=0  //i=0,j=1 //hello
    //i=1,j=0  //i=1,j=1 //hello
    //i=2,j=0  //i=2,j=1 //hello

    // ForEach
    // Loop through all element from beginning
    // Example 1
    int[] arr = new int[]{2,3,10,-1};
    for (int i : arr){
      System.out.print(i);
    }
    // Example 2
    String[] strings = new String[]{"abc","def"};
    for (String str6 : strings){
      System.out.println(str6);
    }

    // WhileLoop
    // WithCondition
    // Example 1
    int count2 = 0;  //loop once since strings length = 2
      while(count2 < strings.length){
        System.out.println(strings[count2]);
        count2++;
      }

    // Example 2
    int a = 1023;  // Target: int array [1, 0, 2, 3]
    int c = 1023 / 10; // 102
    int d = 1023 % 10; // 3
    int copy = a;
    count = 0;
    while (copy > 0) {
      copy /= 10;
      count++;
    }
    System.out.println("count=" + count); // 4
    int[] result = new int[count];
    System.out.println(Arrays.toString(result));
    
    // do-while (MUST做一次先)
    count = 0;
    do{
      if ( count == 1) {    // 0 not hit/"1"only hit-> only print out once
        break;
      }
      System.out.println("hello");
      count++;
    } while (count < 3);   //0-1-2

    
    // KeyWord/Function
  }
}
