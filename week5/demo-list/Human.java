import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Human {
  
  private String name;
  private int age;
  private int height;

  public Human(String name, int age , int height){
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String getName(){
    return this.name;
  }

  public double getAge(){
    return this.age;
  }

  public int getHeight(){
    return this.height;
  }

  @Override
  public String toString(){
    return "Human("
    + "Name =" + this.name
    + " , Age =" + this.age
    + " , Height =" + this.height
    + ")";
  }
  public static void main(String[] args) {
     Human human = new Human("Vincent",28, 170);
     System.out.println(human.toString());
     ArrayList<Human> humans = new ArrayList<>();
     humans.add(new Human("Tommy", 22, 175));
     humans.add(new Human("Alan", 24, 170));
     humans.add(new Human("Oscar", 26, 180));
     humans.add(new Human("Paul", 29, 190));
     humans.add(new Human("Clement", 26, 177));

     System.out.println(humans.size());
     System.out.println(humans.subList(1,4));

     for (Human h : humans){
       System.out.println(h.toString());
     }
     HashMap<String , Integer > mapper = new HashMap<>();
     mapper.put("Vincent", Integer.valueOf(24));
     mapper.put("John" ,30);
     mapper.put("Jacob", 28);
     int sum = 0;
     for( Map.Entry<String,Integer> map : mapper.entrySet()){
      System.out.println(map.getKey() + " "+ map.getValue());
       sum += map.getValue();
     }
     System.out.println("sum=" + sum);
    
    }
}
  