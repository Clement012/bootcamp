package shape;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface Shape {
  // attribute
  double area();

  // default method -> instance method

  // static method
  static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes){
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

    static <T extends Shape> double area2(List<T> shapes){  //List<Object>
      BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes){
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
    }

    // polymorphism -> Data Structure
    static <T extends Collection<Number>> double area3(T shape){  // T can get things inside collection
      //Queue<Number>
      //Set<Number>
      //List<Number>
      return -1;
    }

    // polymorphism -> Type 1
    static <T extends Number> double area4(Queue<T> shape){
      // Queue<Long>
      // Queue<Short>
       return -1;
    }

    // polymorphism -> Type 2
    static double area5(Queue<? extends Number> shape){  // ? means anything extend number
      // Queue<Long>
      // Queue<Short>
      return -1;
    }

    static double area6(Queue<? super Long> shape){
      return -1;
    }

    public static void main(String[] args) {
      Circle c = new Circle(3.0d);
      Square s = new Square(5.0d);
      List<Shape> shapes = new LinkedList<>();
      shapes.add(c);
      shapes.add(s);

      List<Object> shapes2 = new LinkedList<>();
      shapes2.add(c);
      shapes2.add(s);
      shapes2.add(new Object());

      for (Object o : shapes2){
        // o.area();
        // instanceof
      }

      List<Object> objects = new LinkedList<>();
      objects.add(new Circle(3.4d));
      // static < T extends Shape> double area2 (List <T> shapes)
      // Shape.area2(objects); // compile error, becuase Method Signature (<T> extends Shape) not compatible to List<Object>
      
      Queue<Number> qn = new LinkedList<>();
      qn.add(1l);
      Shape.area3(qn);

      Set<Number> sn = new HashSet<>();
      sn.add(2l);
      Shape.area3(sn);

      Queue<Long> ql = new LinkedList<>();
      ql.add(4l);
      Shape.area4(ql);

      Shape.area6(ql);

      Queue<Short> qs = new LinkedList<>();
      // Shape.area6(qs); // Compile error,<? super Long>
      Queue<Number> qn2 = new LinkedList<>();
      Shape.area6(qn2);
      
      Collections.sort(null);
    }
}
