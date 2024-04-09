public class VIP {
  
  private double prices;

  private int quantities;

  private int times;

  public void setPrices(double prices){
    this.prices = prices;
  }
  public Double getPrices(){
    return this.prices;
  }

  public void setTimes(int times){
    this.times = times;
  }
  public Integer getTimes(){
    return this.times;
  }
  public void setQuantities(int quantities){
    this.quantities = quantities;
  }
  public Integer getQuantities(){
    return this.quantities;
  }
  public boolean setCustomerIsVIP(){
    return (this.quantities*this.times*this.prices > 2000);
    }
  public String toString(){
    return "VIP ("
    +"Transaction = " + this.prices*this.quantities
    +", Times = " + this.times
    +")";
  }

  

// output all transaction sumup
// Determine VIP or not
  public static void main(String[] args) {
    VIP customer = new VIP();
    customer.setPrices(28.8);
    customer.setQuantities(16);
    customer.setTimes(5);
    System.out.println(customer.toString());
    System.out.println(customer.setCustomerIsVIP());
    VIP customer2 = new VIP();
    customer2.setPrices(39.9);
    customer2.setQuantities(10);
    customer2.setTimes(5);
    System.out.println(customer2.toString());
    System.out.println(customer2.setCustomerIsVIP());
  }
   
}
