package animal;

public class SmallCat extends Cat{

  private double weight;
  
  public SmallCat(int age, String name, double weight){
    super(age, name);  // Construct a cat object -> construct animal object
    this.weight = weight;
  }
  public double getWeight(){
    return this.weight;
  }
  
  public static void main(String[] args) {
    SmallCat sc = new SmallCat(4, "Emma", 3.2); // super() -> Cat() 

    System.out.println(sc.getAge());  // 4
    System.out.println(sc.getAnimalName()); //Emma
    System.out.println(sc.getCatName()); // null
    System.out.println(sc.getName()); //Emma
    System.out.println(sc.getWeight()); //3.2
  }
}
