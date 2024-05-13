import java.util.LinkedList;

public class Practice {

  private String string;

  private Practice follow;

  public Practice (String string, Practice follow){
    this.string = string;
    this.follow = follow;
  }
  public Practice (String string){
    this.string = string;
  }
  public String getString(){
    return this.string;
  }
  public Practice getFollow(){
    return this.follow;
  }
  
  @Override
  public String toString(){
    return "Practice("
    + "string = " + this.string
    + ")";
  }

  public static void main(String[] args) {
    LinkedList<Integer> in = new LinkedList<>();
    in.add(100);
    in.add(1000);
    in.add(10000);
    System.out.println(in.size());  //3

    System.out.println(in.contains(1000));
    for (int i = 0; i < in.size(); i++ ){
      System.out.println(in.get(i));
    }
    for (int im : in){
      System.out.println(im);
    }
    LinkedList<String> str = new LinkedList<>();
    str.add("Apple");
    str.addLast("Bottle");
    str.addFirst("Car");
    str.addFirst("Dog");
    System.out.println(str);

    // backup 
    // print all  24/4 1029
    Practice follow = new Practice("abc",new Practice("def",new Practice("ghi",new Practice("jkl"))));
    Practice backup = follow;
    boolean result = false;
    while ( backup != null){
      // find "jkl"
      if ("jkl".equals(backup.getString())){
        result = true;
      }
      backup = backup.getFollow();
    }
    System.out.println(follow); //abc
    System.out.println(result);


    LinkedList<String> str2 = new LinkedList<>();
    str2.add("hello");
    str2.add("world");
    
  }
}


  

