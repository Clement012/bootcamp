import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * sum         = 1 1 2 3 5 8 13 21 ...
   * sum+(sum-1) = 0 0 1 2 3 5 8 13
   *      i      = 1 2 3 4 5 6 7 8
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int sum = 0;
   int[]FS = new int[15];
     FS[0] = 1; //
   for (int i = 0; i < FS.length; i++){
    if (i < 2){
      FS[i] = 1; //
    }else {
      FS[i] = FS[i-1] + FS[i-2];
    
    }
   
  }
  System.out.println(Arrays.toString(FS));
 }
} 
