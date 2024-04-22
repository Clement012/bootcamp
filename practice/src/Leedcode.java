package practice.src;
public class Leedcode {
  public static void main(String[] args) {
    int x = 18;
    int y = x;
        int sum = 0;
        while (y > 0){
            sum = y % 10;
            y /= 10;
        }
         if (x % sum == 0){
            System.out.println(x/sum);
        } else if (x % sum != 0) { 
            System.out.println(-1);
         }

  }
}
