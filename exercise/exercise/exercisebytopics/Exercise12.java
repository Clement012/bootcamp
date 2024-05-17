
/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {
    // Declare instance variables carYear and carModel
    private int year;
    
    private String carModel;

    public Exercise12(int year,String carModel){
        this.year = year;
        this.carModel = carModel;
    }

    public String toString(){ 
        return "("
        +"Car Year="  + this.year + 
        " Car Model=" + this.carModel +")";
    }
    // Constructor with variables carYear and carModel

    public static void main(String[] args) {
        Exercise12 myCar = new Exercise12(2020, "ModelY");
        System.out.println(myCar);
        // Create an instance of class Exercise12, with carYear 2020, and carModel "ModelY"
        // print the expected output
    }
}
