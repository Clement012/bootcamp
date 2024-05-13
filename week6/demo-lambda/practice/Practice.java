package practice;


// lambda 
public interface Practice {
  String concat(String x, String y);
  
  
  public static void main(String[] args){
    Practice pp = (s1,s2) -> {
      return s1.concat(s2);
    };
    System.out.println(pp.concat("hi"," u"));
    
  }
    
}

