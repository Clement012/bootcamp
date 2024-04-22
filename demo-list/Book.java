import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
  
  private double price;
  private String author;

  public Book(double price , String author){
    this.price = price;
    this.author = author;
  }
    public String getAuthor() {
      return this.author;
    }
    public double getPrice(){
      return this.price;
    }
  @Override 
  public boolean equals(Object obj) {
    if ( this == obj )                                                                                                                                                                                    
    return true;
    if (!(obj instanceof Book))
    return false;
    Book book = (Book) obj;
    return Objects.equals(this.price, book.getPrice()) 
      &&  Objects.equals(this.author, book.getAuthor());  
  }
  @Override 
  public int hashCode(){
    return Objects.hash(this.price, this,author);
  }

  @Override
   public String toString(){
    return "Book("
    + "Price = " + this.price
    + " Author = " + this.author
    + ")";
   }
  public static void main(String[] args){
    // Book array
    // array: given data to use
    Book[] books = new Book[2];
    books[0] = new Book(10.2d, "Vincent");
    books[1] = new Book(8.4d, "Jenny");

    // "Vincent"
    System.out.println(books[0].getAuthor());

    // ArrayList : can use data to adjust
    ArrayList<Book> books2 = new ArrayList<>();

    // add()  
    books2.add(new Book(3.4d, "Sally"));
    books2.add(new Book(3.6d, "Vincent"));
    books2.add(new Book(10.2d, "Tommy"));

    System.out.println(books2.size());  // 3
    books2.add(new Book(100.2d, "Kelvin"));  
    System.out.println(books2.size());  //4
    books2.add(new Book(50.2d, "Vincent"));  //5

    // contains() -> equals,hashCode()
    System.out.println(books2.contains(new Book(3.6d, "Vincent")));  //true
    System.out.println(books2.contains(new Book(100.6d, "Vincent")));  //false ->  if Override only chk author -> then true

    // remove() -> remove one object ONLY
    books2.remove(new Book(50.2d, "Vincent")); 
    System.out.println(books2.size()); //4
    System.out.println(books2); // 

    // ArrayList has Ordering
    books2.remove(0);
    System.out.println(books2.size()); //3
    System.out.println(books2);

    books2.set(0, new Book(20.3d, "Oscar"));
    System.out.println(books2);

    System.out.println(books2.isEmpty()); //false

    System.out.println(books2.subList(1,3));  // endIdx - 1

    System.out.println(books2.get(0));  //

    books2.clear();   
    // books2 = new ArrayList<>();  -->different array object
    System.out.println(books2); //[]

    // Initialize with objects
    ArrayList<Book> books3 = new ArrayList<>(
      List.of(new Book(10.3, "Katie"), new Book(20.1, "Vincent")));
         List<Book> books4 = 
         List.of(new Book(10.3, "Katie"), new Book(20.1, "Vincent"));

      System.out.println(books3.size()); //2
      System.out.println(books4.size()); //2

      books3.add(new Book(10.9, "Cherry"));
   // books4.add(new Book(10.9, "Oscar"));  java.lang.UnsupportedOperationException

      for (Book b : books4){
        System.out.println(b.getPrice() + " " + b.getAuthor());
      } 
  }
}
