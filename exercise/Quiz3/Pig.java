package example;

public class Pig {
  public int method(int n){
    int[] arr = new int[]{1,3,5,7,9,11,13};

    int total = 0;
    for(int i = 0; i < n; i++){
      total += arr[i];
    }
    return total;
  }
  public static void main(String[] args) {
    System.out.println(Pig.method(4));
  }
}
