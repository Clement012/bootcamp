public class BootcampException extends Exception {

  //  "extends Exception" implies "BootcampException" is a checked exception
  // because Exception.class is a checked exception
  
  public static void main(String[] args)  { // throw JWM  
    try{
     calculate(10, 0);
     System.out.println("End of Calculate() method");
    } catch (BootcampException e){
     System.out.println("Exception of Calculate() method , recovery step...");
    } finally{
      System.out.println("finally...");  // try/catch都好 會到finally // usage: record
    }
  }

  public static int divide(int x,int y){  
    return x / y;  // if y = 0, JWM will throw an object of ArithmeticException
  }
  
  public static void calculate(int x, int y) throws BootcampException { // method class //Solution 1  
    try{
      divide(10,0);
      // example... : IAE 
      // no and in this case 
      // or: syntax below
      } catch (ArithmeticException | IllegalArgumentException e){  // catch object
        throw new BootcampException();  // throw object
        // because it is a checked exception, so we have to handle it before compilation
      }
  }
}
