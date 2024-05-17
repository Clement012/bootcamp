package vscode;

public class Typing {
  private String name;

  public Typing(String name, int taxId){
    this.name = name;
    this.taxId = taxId;
  }
  public static void main(String[] args) {
    Typing t = new Typing("name", 1);
    System.out.println(t);
  }
}
