public class Node {  // Object

  private String str;  // object reference

  private Node next;  // object reference

  public Node(String str){
    this.str = str;
  }

  public Node(String str, Node next){
    this.str = str;
    this.next = next;
  }
  
  public void setNext (Node next){
    this.next = next;
  } 

  public void setStr (String str){
    this.str = str;
  }

  public Node getNext(){
    return this.next;
  }

  public String getStr(){
    return this.str;
  }
  public String toString(){
    return "Node("
      + "string=" + this.str
      + ")";
  }

  public static void main(String[] args) {
    // "hello","abc","def",
    Node head = new Node("hello", new Node("abc", new Node("def")));

    // check head contain "def"
    // for loop? while loop -> linkedlist
    Node temp = head;  // back up!! , if no 指針will go def 
    boolean result = false;
    while (temp != null){
      // find "def"
      if ("def".equals(temp.getStr())){  // must not空指針 
        result = true;
        break;
      }
      // move to the next node
      temp = temp.getNext();
    }
    System.out.println(temp.getStr());  //def
    System.out.println(result);  //true
    
    System.out.println("hello".equals(null)); //false
    System.out.println(head.toString());
  }
}
