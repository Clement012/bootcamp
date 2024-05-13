package practice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Test {
  String concat(List<String> strings);
  public static void main(String[] args) {
    Test tt = (strings) -> {
      StringBuilder sb = new StringBuilder();
      for (String str : strings){
        sb.append(str);
      }
      return sb.toString();
    };
    String result = tt.concat(new ArrayList<>(List.of("ABC","def")));
    System.out.println(result);
  }
}
