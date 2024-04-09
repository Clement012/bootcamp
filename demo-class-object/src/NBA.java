public class NBA {

  private String firstName;

  private String lastName;

  private int averageScore;

  private boolean goodPlayer;

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public String getFirstName(){
   return this.firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public String getlastName(){
    return this.lastName;
  }
  public void setaverageScore(int averageScore){
    this.averageScore = averageScore;
    if ( averageScore > 20 ){
      this.goodPlayer = true;
     }
  }
  public int getaverageScore(){
    return this.averageScore;
    }
  

    public String toString(){
      return "NBA("
      +"Thefullname = " + this.firstName.concat(" ").concat(this.lastName)
      +" , AverageScore = " + this.averageScore
      +" , GoodPlayer: " + this.goodPlayer
      +")";
    }
  


  // determine player's name + average score + good player or not
  public static void main(String[] args){
    NBA player = new NBA();
    player.setFirstName("Luka");
    player.setLastName("Doncic");
    player.setaverageScore(32);
    System.out.println(player.toString());
  }
}