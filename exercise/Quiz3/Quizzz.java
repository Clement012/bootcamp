package example;

interface Secret{
  String show();
}

class Password implements Secret{
  private String password;

  Password(String x){
    this.password = x;
  }

  @Override 
  public String show(){
    System.out.println("123");
    System.out.println("***");
    return this.password;
  }
}
public class Quizzz {
  public static void main(String[] args) {
    Password p1 = new Password("Start");
    p1.show();
  }
}
