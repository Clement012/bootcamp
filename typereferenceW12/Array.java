import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // Example 1
    int[] arr = new int[3];
    arr[0] = 100; // array in 3 size
    // Example 2
    String[] strings = new String[]{"abc","hello","AAA"}; // string in 3 size
    String[] backup = strings;  // backUp
    // Example 3
    String[] strings2 = new String[3]; // String array object
    strings2[0] = "abc";
    strings2[1] = "hello";
    strings2[2] = "xyz";
    strings2[0] += "def";
    // strings[0] -> an address pointing to a String object
    System.out.println(strings2[0]); // "abcdef"
    strings2[1] = strings2[2];
    System.out.println(strings2[1]); // "xyz"
    // Example 4 (replace)
    int max = Integer.MIN_VALUE; // the min. value of int
    int[] integers = new int[] {1, 2, 3, 4, 5, 6, 7};
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] > max) {
        max = integers[i];
      }
    }
    System.out.println("max=" + max); // 7
    // Example 5 (Searching)
    char[] characters = new char[] {'a', 'b', 'e', '2'};
    // check if the array contains char '!' -> true/ false
    boolean result = false;
    // break
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == '!') {
        result = true;
        break;
      }
    }
    System.out.println(result); //false

    // Example 6 (sort+rebuild Array)
    // Store all index of '!' in another array
    char[] characters2 = new char[] {'a', 'b', '!', 'e', '!'};
    int[] indexes = new int[characters2.length];
    int j = 0;
    for (int i = 0; i < characters2.length; i++) {
      if (characters2[i] == '!') { // condition
        indexes[j] = i;
        j++;
      }
    }
    System.out.println(Arrays.toString(indexes)); // [2, 4, 0, 0, 0]

    
    // KeyWord/Function
  }
}
