public class Practice {
  private Exercise exercise;
  private Double duration;

  enum Exercise{
    RUNNING,BASKETBALL,SOCCER;
  }

  private Practice(PracticeBuilder practiceBuilder){
    this.exercise = practiceBuilder.exercise;
    this.duration = practiceBuilder.duration;
  }

  private Practice(Exercise exercise,Double duration){  // before constructor
    this.exercise = exercise;
    this.duration = duration;
  }

  public String toString(){
    return "Practice("
    + "Exercise : " + this.exercise
    + ", Duration : " + this.duration
    + ")";
  }
  private static class PracticeBuilder{
    private Exercise exercise;
    private Double duration;

  private PracticeBuilder setExercise(Exercise exercise){
    this.exercise = exercise;
    return this;
  }
  private PracticeBuilder setDuration(Double duration){
    this.duration = duration;
    return this;
  }
  private Practice construct(){
    return new Practice(this);
  }
  private static PracticeBuilder builder(){  
    return new PracticeBuilder();
  }
  }
  public static void main(String[] args) {
    Practice practice = new Practice(Exercise.SOCCER, 20.3d);
    Practice practice2 = new Practice(Exercise.RUNNING, 20.3d);
    Practice practice3 = new Practice(Exercise.BASKETBALL, 20.3d);
    System.out.println(practice);  // before method
    System.out.println(practice2);
    System.out.println(practice3);
  // Exercise practice4 = new Practice(null, null); polymorphism fail
    
    Practice practice4 = new Practice.PracticeBuilder()
      .setExercise(Practice.Exercise.BASKETBALL)
      .setDuration(60.0d)
      .construct();
    System.out.println(practice4);

    Practice practice5 = PracticeBuilder.builder()
      .setExercise(Practice.Exercise.SOCCER)
      .setDuration(30.0d)
      .construct();
    System.out.println(practice5);
  }
}
