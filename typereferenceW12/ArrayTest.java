import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] args) {
  int[] myArray = new int[]{1,2,3,4,5};
  int[] myArray2 = new int[5];
  int[] newArray = new int[myArray.length + 1];

// Add an item to the array
System.arraycopy(myArray, 0, newArray, 0, myArray.length);
newArray[newArray.length - 1] = 60;

// Assign the new array to the original variable
myArray = newArray;
System.out.println(Arrays.toString(myArray));
 }
}