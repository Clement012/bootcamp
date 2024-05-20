public class ArraySorting {
  public static void main(String[] args) {
    // Swapping
  int[] arr3 = new int[] {10, 3, 9, 4};
  int temp = arr3[0];
  arr3[0] = arr3[2];
  arr3[2] = temp;
  System.out.println(Arrays.toString(arr3)); // [9,3,10,4]

  // Now: [9, 3, 10, 4]
  // Target: [3, 10, 4, 9]
  // Move the first element to the tail: loop + swap
  int t = -1;
  for (int i = 0; i < arr3.length - 1; i++) {
    t = arr3[i];
    arr3[i] = arr3[i + 1];
    arr3[i + 1] = t;
  }
  System.out.println(Arrays.toString(arr3));

  // Now: [3, 10, 4, 9]
  // Target: [10, 3, 4, 9]
  // Move the max value to the head of the array
  int max2 = Integer.MIN_VALUE;
  int idx = -1;
  for (int i = 0; i < arr3.length; i++) {
    if (arr3[i] > max2) {
      max2 = arr3[i];
      idx = i;
    }
  }
  // idx -> 1
  for (int i = idx; i > 0; i--) {
    t = arr3[i];
    arr3[i] = arr3[i - 1];
    arr3[i - 1] = t;
  }
  System.out.println(Arrays.toString(arr3)); // [10, 3, 4, 9]

  // Sorting - Bubble Sort
  int[] arr4 = new int[] {-10, -42, 8, 19, 1};
  // Round 1:
  // [-42, -10, 8, 19, 1] : -10 > -42
  // [-42, -10, 8, 19, 1] : 8 > -10
  // [-42, -10, 8, 19, 1] : 19 > 8
  // [-42, -10, 8, 1, 19] : 19 > 1
  // Round 2:
  // [-42, -10, 8, 1, 19] : -10 > -42
  // [-42, -10, 8, 1, 19] : 8 > -10
  // [-42, -10, 1, 8, 19]: 8 > 1
  // Round 3:

  // Target: [-42, -10, 1, 8, 19]
  for (int i = 0; i < arr4.length - 1; i++) { // 0,1,2,3,4
    for (int k = 0; k < arr4.length - i - 1; k++) {
      if (arr4[k] > arr4[k + 1]) {
        t = arr4[k];
        arr4[k] = arr4[k + 1];
        arr4[k + 1] = t;
      }
    }
  }
  System.out.println(Arrays.toString(arr4));

  // Sorting - Insertion sort
  int[] arr5 = new int[] {100, -1, -5, 10};
  for (int i = 1; i < arr5.length; i++) { // 1
    int key = arr5[i]; // 10
    int k;
    for (k = i - 1; k >= 0; k--) { // OK
      if (arr5[k] <= key) {
        break;
      }
      // 1000 lines of code ...
      arr5[k + 1] = arr5[k];
    }
    arr5[k + 1] = key;
  }
  System.out.println(Arrays.toString(arr5)); // [-5, -1, 10, 100]

  }
}
  

