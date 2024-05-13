import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class App {
  public static void main(String[] args) {
    System.out.println(upperName("Steven")); //Optional[STEVEN]
    System.out.println(upperName("Steven").get());  //STEVEN
    System.out.println(upperName(null));  //Optional.empty

    

    // 1. ifPresent  -> lambda
    Optional<String> result = upperName(null);

    result.ifPresent(e ->{  // ifPresent -> detect function wisely -> No risk on NPE
      System.out.println("hello" + e.charAt(0));  //e must be non-null value
    });

    upperName("Steven").ifPresent(e ->{
      System.out.println("hello" + e.charAt(0));  // helloS
    });


    // 2. isPresent  -> use if
    Optional<String> name = Optional.of("Vincent");
    if (name.isPresent()){
      System.out.println("Example" + name.get().charAt(0)); // No risk on NPE ->V
    } else {
      System.out.println("example" + name);  // Optional.empty -> you cannot call get()
    }
    // 3. orElse
    name = Optional.ofNullable(null);  // 
    String user = name.orElse("Jenny"); // T
    System.out.println("user" + user);  // userJenny

    // 4. orElseGet -> lambda  // prefer
    String user2 = name.orElseGet(() -> "Jenny"); // Supplier<T>
    System.out.println("user2" + user2); // user2Jenny

    // 5. orElseThrow 
   // String user3 = name.orElseThrow(() -> new RuntimeException());
   // System.out.println(user3); // RuntimeException

    // 6.stream and optional 
    Cat cat = 
      List.of(new Cat(3,"Vincent"),new Cat(6,"Oscar"),new Cat(10,"Vincent"),new Cat(4,"Tommy"))
      .stream()
      .filter(e -> "Vincent".equals(e.getName()))
      .findFirst() // Optional<Cat>
      .orElse(new Cat(0, "Vincent"));  //Cat

      System.out.println(cat.getAge());

    List.of(new Cat(3,"Vincent"),new Cat(6,"Oscar"),new Cat(10,"Vincent"),new Cat(4,"Tommy"))
       .stream()
       .filter(e -> "Vincent".equals(e.getName()))
       .findFirst() // Optional<Cat>
       .ifPresent(e ->{  //Cat
        System.out.println(e.getAge());
       });  

    // Method Reference 
    Function<String, Integer> stringToInteger = Integer::valueOf; // Integer::new
    Integer number = stringToInteger.apply("123");
    System.out.println(number);
  }

  public static Optional<String> upperName(String name){  // Optional can be other object
    // if (name == null)
    // throw new IllgealArgumentException();
     if (name != null)
       return Optional.of(name.toUpperCase());
     return Optional.empty();  // optional object, with null value
  }
}
