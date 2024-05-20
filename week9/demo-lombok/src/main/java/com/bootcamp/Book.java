package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data  // @RequiredArgsConstructor @ToString @EqualsAndHashCode @Getter @Setter
@AllArgsConstructor
// @NoArgsConstructor
public class Book {
  private final String name;
  @NonNull
  private Color color;

//  public static void main(String[] args) {
//    Book b1 = new Book("Vincent",Color.RED);
//    b1.setColor(Color.YELLOW);
//    b1.setName("ABC");
//    System.out.println(b1.toString());

//    Book b2 = new Book("Vincent",Color.RED);
//    b2.setColor(Color.YELLOW);
//    b2.setName("ABC");
//    System.out.println(b1.equals(b2));

//    System.out.println(b1.getName() + " " +b1.getColor());

//    Book b3 = new Book();
//  }
}
