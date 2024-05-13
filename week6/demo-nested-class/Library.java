import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Library {
  //private List<Book> books = new LinkedList<>();
 // public Library(){
 //  this.books = new LinkedList<>();}
 private List<Book> books;

 public Library(){
  this.books = new LinkedList<>();
 }
  public void plus(Book book) {  //class methos .~~
    this.books.add(book);  // List method .add
  }
  public class BookIterator implements Iterator<Book>{  // inner class
    private int currentIdx = 0;

    @Override  // iterator method
    public boolean hasNext(){
      return this.currentIdx < books.size();
    }
    @Override
    public Book next(){
      if (!hasNext())
        throw new IllegalStateException("No more element in the list");
      return books.get(currentIdx++);
    }
    public void reset(){
      this.currentIdx = 0;
    }
  }
  public static class Book{  // static class
    private String isbn;
    private String author;
    public Book(String isbn,String author){
      this.isbn = isbn;
      this.author = author;
    }
    public String getIsbn(){
      return this.isbn;
    }
    public String getAuthor(){
      return this.author;
    }
  }
  public static void main(String[] args) {
    Library library = new Library();
    library.plus(new Library.Book("1234","John Smith"));
    library.plus(new Library.Book("2345","Peter Lau"));
    library.plus(new Library.Book("3456","Vincent Cheng"));

    Library.BookIterator lb = library.new BookIterator();  //list out all
    // while-loop
    while (lb.hasNext()){
      Library.Book book = lb.next();
      System.out.println(book.getIsbn() + " " + book.getAuthor());
    }
    
  }
}
