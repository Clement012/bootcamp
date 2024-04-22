package practice.src;
public class QuizW2 {
  public static void main(String[] args){
    String[] Strings = new String[3];
    String sum = "";

    for (int i = 0; i <4; i++){
      Strings[i] = String.valueOf(i);
       sum += Strings[i];
      }
      
    
    System.out.println(sum);
  }
}
