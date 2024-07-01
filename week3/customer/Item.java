package customer;

public class Item {

  private String desc; //description

  private double price;

  private int quantity;

  public Item(String desc, double price, int quantity){
    this.desc = desc;
    this.price = price;
    this.quantity = quantity;
  }

  public Double subtotal(){
    return this.price*this.quantity;  // double * int
  }

  //public Double total(){
  //  return subtotal
  //}
  
  public String toString() {
    return "Item"
    + "description=" + this.desc
    + ", price=" + this.price
    + ", quantity=" + this.quantity
    + ")";
  }
}
