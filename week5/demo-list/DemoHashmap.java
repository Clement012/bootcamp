import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DemoHashmap {
  public static void main(String[] args) {
    // John 13
    // Vincent 18
    HashMap<String , Integer> mapper = new HashMap<>();  // Left hand side: KEY , right hand side: Method
    mapper.put("John", Integer.valueOf(13));
    mapper.put("Vincent", 18); // autobox
    
    // no ordering.
    // Get Value by key (We Cannot get key by value)
    System.out.println(mapper.get("John")); //13
    System.out.println(mapper.get("Vincent")); // 18
     

    // for-each
    for ( Map.Entry<String,Integer> m : mapper.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue()); //Vincent 18 John 13 // Sys.out no順序
    }
    // Key cannot be duplicated in a HashMap
    // put -> update   // ..put係for loop
    mapper.put("Vincent", 20);  // "Vincent" 's hashCode is equal to "Vincent", 18 --> so override
    System.out.println(mapper.get("Vincent"));  //20

    mapper.put("Jenny", 24);
    // Sum up all integer in the map
    int sum = 0;
    for ( Map.Entry<String,Integer> m2 : mapper.entrySet()){
      sum += m2.getValue();
    }
    System.out.println("sum="+ sum); //13+20+24
    
    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"),13);
    ageMap.put(new Customer("John"),17);
    System.out.println(ageMap.get(new Customer("John"))); //null
    System.out.println(ageMap.size()); //2

    // 
    HashMap<Customer,ArrayList<Order>> orderMap = new HashMap<>();
    // John -> order 1: 100,order 2 :250
    // Vincent -> order 1 : 1200, order 2:20 ,order 3: 88
    // totalOrderAmount = 1658
    ArrayList<Order> orders = new ArrayList<>();
    orders.add(new Order(100));
    orders.add(new Order(250));
    orderMap.put(new Customer("John"), orders);

    ArrayList<Order> orders2 = new ArrayList<>();
    orders2.add(new Order(1200));
    orders2.add(new Order(20));
    orders2.add(new Order(88));
    orderMap.put(new Customer("Vincent"), orders2);
    System.out.println(orderMap.size()); //2
    
    // Entry-set
    sum = 0;
    for (Map.Entry<Customer, ArrayList<Order>> entry : orderMap.entrySet()){  // entrySet() -> entry -> key
      for (Order o : entry.getValue()){
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);  //totalOrderAmount=1658

    // values()
    sum = 0;
    for (ArrayList<Order> orderList : orderMap.values()){  // 
      for (Order o : orderList){
        sum += o.getAmount();
      }
    }
    System.out.println("totalOrderAmount=" + sum);  //totalOrderAmount=1658

    // keySet()
    for (Customer customer : orderMap.keySet()){
      System.out.println("customer=" + customer.getName()); //customer=Vincent customer=John
    }

    // containsKey(), containsValue() --> boolean
    System.out.println(orderMap.containsKey(new Customer("Vincent")));  //true ->with same hashCode()

    // Conclusion:
    // 1. If they are Different Objects -> we can treat them as same thing (equals(), hashCode())
    // 2. If they are same Objects -> all the values inside the object are same

    orderMap.put(new Customer("Sally"), orders); // same array objects with John

    // orders -> add an order
    orders.add(new Order(300));
    orders.add(new Order(400));
    // print out John and Sally order
    
    HashMap<String, ArrayList<Order>> example1 = new HashMap<>();
    HashMap<Integer,ArrayList<Order>> example2 = new HashMap<>();

    orderMap.remove(new Customer("Vincent")); // without hashCode() cant remove bt custom object
    System.out.println(orderMap);

  }
}
