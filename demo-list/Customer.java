import java.util.Objects;

public class Customer {

  private String name;

  public Customer(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  // equals()
  @Override()
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Customer))
    return false;
    Customer c = (Customer) obj;
    return Objects.equals(this.name, c.getName());
  }

  // hashcode()
 // @Override
 // public int hashCode(){
 //   return Objects.hash(this.name);
//  }

}
