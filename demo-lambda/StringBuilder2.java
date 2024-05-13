// @FunctionInterface

import java.util.ArrayList;
import java.util.List;

public interface StringBuilder2 {
  String concat(List<String> strings);
  public static void main(String[] args) {
    // lambda
    StringBuilder2 sb2 = (strings) -> {
      StringBuilder sb = new StringBuilder();
        for (String str : strings){
        sb.append(str);
        }
        return sb.toString();
    };
    
    String result = sb2.concat(new ArrayList<>(List.of("ABC","def","gg"," ","hero")));
    System.out.println(result);
  }
}
