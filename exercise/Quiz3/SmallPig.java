 package example;
 interface V{
  default public String eat(){
    return "v";
  }
 }
  interface R{
  default public String eat(){
    return "r";
  }
 }
  class Pig extends Animal{
    public String eat(){
      return "p";
  }
}
  class Animal{
    public String eat(){
      return "a";
  }
  }
 public class SmallPig extends Pig implements V,R{ 

  public static void main(String[] args) {
    SmallPig sp = new SmallPig();
    System.out.println(sp.eat());
  }

  
}