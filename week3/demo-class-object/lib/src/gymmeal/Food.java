package gymmeal;

public class Food {
  
  private Food[] foods;

  private Double calories;

  private int quantities;

  public Food (String string,Double calories,int quantities){
    this.foods = new Food[0];
    this.calories = calories;
    this.quantities = quantities;
  }
  public Double subtotal(){
    return calories*quantities;
  }
  // public Double total(){}
}
