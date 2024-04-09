public class Car {

    // Attributes
    // for example: 6W2H 
    // Driver and car: Who acc? Who step in acc?
    // Define who對應?

    private String color; //String: "RED","YELLOW", "BLACK"...

    private double speed;

    private int capacity;

    private boolean isOverSpeed; // default false; useless -> we should use speed to derive isOverSpeed()
    // ...

    // Behavior or instance methods
    // Setter (point to)
    public void setColor(String color) { // input parameter
        this.color = color; 
    }

    // Getter

    public String getColor(){
        return this.color;
    }

    //  
    public void setSpeed(double speed){
        this.speed = speed;
        if(speed > 90)
         this.isOverSpeed = true; 
    }
    public Double getSpeed(){
        return this.speed;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public Integer getCapacity(){
        return this.capacity;
    }

    // boolean example
    public boolean isOverSpeed(){
        return this.isOverSpeed;
    }

    // ...
    public String toString(){
        return "Car(" //
        +"color=" + this.color //
        +", speed=" + this.speed //
        +", capacity=" + this.capacity //
        +")"; 
    }
}
    



