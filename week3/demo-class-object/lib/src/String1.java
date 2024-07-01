public class String1 {

// Attributes

  private char[] characters;
  private int i;

// Constructors
// emptyConstructor& (implicitly exists)

 public String1(){
  this.characters = new char[0];
 } 

public  String1(String s){
  this.characters = new char[s.length()];
  for (int i = 0;i < s.length(); i++){
    this.characters[i] = s.charAt(i);
    }
 }

 public void clear(){
  this.characters = new char[0];
 }

 // no change original vallue
 public String concat(String s){
  char[] newArr = new char[this.characters.length + s.length()];
  int idx = 0;
  for (int i = 0 ; i < characters.length; i++){
    newArr[idx++] = characters[i];
  }
  for (int i  = 0 ; i < s.length(); i++){
    newArr[idx++] = s.charAt(i);
  }
  return String.valueOf(newArr);
 }
 // changed value
   public void concat2(String s){
    char[] copyArr = this.characters;  // copy first
    this.characters = new char[this.characters.length + s.length()];
    
    int idx = 0;
    for (int i = 0 ; i < copyArr.length; i++){
      this.characters[idx++] = copyArr[i];
    }
    for (int i  = 0 ; i < s.length(); i++){
      this.characters[idx++] = s.charAt(i);
    }
   //  return String.valueOf();
   }

   
    //instance method
    public void setValue(String s){
    this.characters = new char[s.length()];
    for (int i = 0;i < s.length(); i++){
    this.characters[i] = s.charAt(i);
    }
  }
  
  public String getValue(){
    String s = "";
    for (int i = 0; i < this.characters.length ; i++){
      // s = s + this.characters[i]; // String + char --> String + String
      s = s.concat(String.valueOf(this.characters[i]));
    }
    return s;
  }


  public static void main(String[] args) {
    String1 str = new String1();  //constructor
    
    char[] arr = new char[]{'c','d','e'};
    System.out.println("get=" + str.getValue());
    str.setValue("cde");
    System.out.println((str.getValue())); // .char[]

    // spot out concat2
    String1 str2 = new String1("hello");
    System.out.println(str2);

    String result = str2.concat("world");
    System.out.println(str2); //"world"
    System.out.println(result); //"helloworld"

    str2.concat2("world");
    System.out.println(str2); //"hello"
    
  }
    
}
