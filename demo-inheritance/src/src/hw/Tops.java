package src.hw;

public class Tops  {

  private String variable;

  

 

  private Color1 colors;

  public void setVariable(String variable){
    this.variable = variable;
  }

  public String getVariable(){
    return this.variable;
  }

  public void setQuantities(int quantities){
    this.quantities = quantities;
  }
  public int getQuantites(){
    return this.quantities;
  } 
  public void setPrices(double prices){
    this.prices = prices;
  }
  public double getPrices(){
    return this.prices;
  }

  public Tops(String variable,int quantities,double prices){
    this.variable = variable;
    this.quantities = quantities;
    this.prices = prices;
  }
  
  public Tops(int quantities,double prices){
    this.quantities = quantities;
    this.prices = prices;
  }
  
  public Tops(String variable,Color1 colors){
    this.variable = variable;
    this.colors = colors;
  }

  public String toString(){
    return "(" +" quantities =" + this.quantities + " prices = " + this.prices + " length = " + this.length + ")";
  }

}
