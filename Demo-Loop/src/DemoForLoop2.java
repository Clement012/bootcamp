public class DemoForLoop2{
  public static void main(String[] args){
    //Single loop
    for (int i = 0; i < 5;i++){
      System.out.print("0");
    }
    //Nested loop
    for(int i = 0; i < 3;i++){ // 0,1,2
      for(int j = 0; j < 2;j++ ){  // 0,1
        System.out.println("i= "+ i+" j= " + j); //i=?, j=?
      }
        System.out.println("hello");  //mention 括號關係
    }
    // ***** i=0 j=5
    // **** i=1 j=5-1
    // *** "
    // **
    // *
    int n = 5;
    for(int i = 0; i < n ;i++ ){  //直行
      for(int j = 0; j < n - i ;j++){  //橫行
      System.out.print("*");
      }
      System.out.println();
    }
    //     *
    //    ***
    //   *****
    //    ***
    //     *

    //Searching
    String str2="abcdefg hello world!";
    //Find the index of thr second of space character
    //If exists, print the index, If no, print N/A
    int spaceCount = 0;
    for (int i = 0; i < str2.length();i++) {
      if(str2.charAt(i) == ' '){
        spaceCount++;
      }
      if (++spaceCount == 2){
        System.out.println("index=" + i);
      }
    }

  

    //break;
    for (int i = 0; i < 10; i++){
      if (i > 3){
        break; //break the nearest loop
      }
      System.out.println("hello"); //hello x4
    }
    //continue;
    for (int i = 0; i < 6; i++){
      System.out.println("abc");
      if (i > 3){
        continue;  // skip the rest, go to next iteration

      }
      System.out.println("Hi");
    }
    // *
  }
}