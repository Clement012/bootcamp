package src.objects;

import java.util.Objects;

public class Dog {

  private int id;

  private Color color;


  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.color);
  }

  public static void main(String[] args) {
    Dog d1 = new Dog(1, Color.BLACK);
    Dog d2 = new Dog(1, Color.BLACK);
    System.out.println(d1.hashCode()==d2.hashCode());

  }
  public Dog (int id,Color color){
    this.id = id;
    this.color = color;
  }

  public Dog(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public int getId() {
    return this.id;
  }

}
