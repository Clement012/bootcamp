

import java.util.Arrays;
import customer.Order;

public class Customer {
  
  private String userName;

  // One Customer has many orders
  private Order[] orders;

  public Customer(String userName, Order[] orders){
  this.userName = userName;
  this.orders = new Order[0];
 }

  public void add(Order order){
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length + 1];
    int idx = 0;
    for (int i = 0; i < this.orders.length; i++){
      this.orders[idx++] =  copyArr[i];
    }
    this.orders[idx++] = order;
  }
  public String toString(){
    return "Customer("
    +"userName=" + this.userName
    +", orders=" + Arrays.toString(this.orders)
    +")";
  }

  public static void main(String[] args) {
    Item item1 = new Item("APPLE", 5, 2);
    System.out.println(item1.subtotal());

    Item item2 = new Item("BANANA", 4, 6);
    System.out.println(item2.subtotal());
    //Item[] items = new Item[3];
    //items[0] = item1;
   // items[1] = item2;
   // items[2] = item3;

   
   // Order[] orders = new Order[];
    Order order1 = new Order("V0001");
    Order[] orders = new Order[2];
    orders[0] = order1;
    order1.add(item1);
    System.out.println(item1);
    order1.add(item2);
    System.out.println(item2);

   // System.out.println(order1.total());

    Customer c = new Customer("sallychan", orders);
    System.out.println(c);
  }
}

