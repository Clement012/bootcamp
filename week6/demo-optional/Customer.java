import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Customer {
  private Optional<String> name;

  public Optional<String> getName(){  // getName -> well known method, getter/setter should not return Optional <T>
    return this.name;
  }
  
  // deserialzation/ serialization 序列化
  // {
  //   "name" : "John"
  // }

  // Java Object <-> JSON (deserialzation/ serialization)
  // Optional<T> g be supported by deserialzation/ serialization
  
  public static void main(String[] args) {
   // sum(null, Optional.of(Double.valueOf()));  // NPE
  
   Optional<String> result = null;
   result = Optional.of("hello");


   List<String> names = new ArrayList<>(List.of("Vincent","Jenny","Oscar"));
   // stream
   List<Optional<String>> result2 = names.stream()
       .map(e -> Optional.ofNullable(e) + "hi")
    // .map(Optional::ofNullable)  //method reference -> cant add things
     .collect(Collectors.toList());
   System.out.println(result2);


  public static int sum(int d1, int d2){
    if (d1.isPresent() && d2.isPresent()){
      return d1.getDoubleValue + d2.getDoubleValue
    }
   }
  }
}