package src.hw;

public class Clothes {  // 17/4 14:16 add array later

  private String materials;

  private int length;

  private Color1 colors;

  private int quantities;

  private double prices;

  public void setMaterials(String materials) {  //setter
    this.materials = materials;
  }

  public String getMaterials() {  //getter
    return this.materials;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return this.length;
  }

  public Clothes(int quantities, double prices, int length){  // how to get constructor from other class?
    this.quantities = quantities;
    this.prices = prices;
    this.length = length;
  }

  public Clothes(String materials, Color1 color1) { 
    this.materials = materials;
    this.colors = color1;
  }

  public static double Total(int quantities, double prices, int length){ //static method
    return quantities*prices + (length/4);
  }

  public String toString(){
    return "Clothes(" +" quantities =" + this.quantities + " prices = " + this.prices + " length = " + this.length + ")";
  }

  public String toString2() {
    return "Clothes(" + " materials =" + this.materials + " colors = "
        + this.colors + ")";
  }

  public static void main(String[] args) {

    Clothes clothes = new Clothes(4, 90.0, 28);
    Clothes clothes2 = new Clothes("Cotton", Color1.STRIPED); // enum things output  
    double clothes3 = Total(3, 27, 14);  // static method ouput -> how use clothes1 to output this method?
    double clothes4 = Total(4, 109, 13);

    System.out.println(clothes.toString());
    System.out.println(clothes2.toString2());
    System.out.println(clothes3);
    System.out.println(clothes4);
  }
}