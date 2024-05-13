import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iphone {
  private List<Phone> phones;
  
  private Iphone(){
    this.phones = new LinkedList<>();
  }
  private void plus(Phone phone){
    this.phones.add(phone);
  }
  public class PhoneIterator implements Iterator<Phone>{
    private int currentIdx = 0;

    @Override
    public boolean hasNext(){
      return this.currentIdx < phones.size();
    }
    @Override 
    public Phone next(){
      if (!hasNext())
        throw new IllegalStateException("Finish");
      return phones.get(currentIdx++);
    }
  } 
  enum Color{
    RED, BLUE, WHITE, BLACK,;
  }
  public static class Phone{
    private int model;
    private Color color;

    private Phone(int model, Color color){
      this.model = model;
      this.color = color;
    }

    private int getModel(){
      return this.model;
    }
    private Color getColor(){
      return this.color;
    }
    
    public String toString(){  // if private: cant call from main
      return "Phone("
      + "Model = " + this.model
      + ", Color = " + this.color
      + ")";
    }
  }
    public static void main(String[] args) {
      Iphone iphone = new Iphone();
      iphone.plus(new Phone(15, Color.RED));
      iphone.plus(new Iphone.Phone(16, Color.WHITE));
      System.out.println(iphone.toString());  
    // add from Phone class ,so only object reference in iphone object

      Iphone.PhoneIterator pi = iphone.new PhoneIterator();
      while(pi.hasNext()){
        Iphone.Phone phones = pi.next();
        System.out.println(phones.getModel() + " " + phones.getColor());
      }
    }
  }

