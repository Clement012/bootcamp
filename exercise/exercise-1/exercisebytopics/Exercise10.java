

/**
 * Expected Output: 8
 */
public class Exercise10 {
    private int x; // Create an instance attribute

    public void setx(int x){
        this.x = x;
    }
    public int getx(){
        return this.x;
    }
    // Create a class constructor for the Main class
    public Exercise10(int x) { 
        this.x = x;
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
        Exercise10 x = new Exercise10(8);
        // Print the value of instance attribute
        x.setx(8);
        System.out.println(x.getx());
    }
}
