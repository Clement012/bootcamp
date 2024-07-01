
public class Person implements Exercise, Work {

  @Override
  public void run(){
    System.out.println("run");
  }
  @Override
  public void walk(){
    System.out.println("walk");
  }
  @Override
  public void swim(){
    System.out.println("swim");
  }
  @Override
  public void work(){
    System.out.println("work");
  }
  public static void main(String[] args) {
    Run vincent = new Person();
    vincent.run();

    Walk vincent2 = new Person();
    vincent2.walk();
    Person p = (Person) vincent2;  // 上番最頂 -> call番Person method
    p.run();
    p.walk();
    p.swim();
    p.work();

    Exercise vincent3 = new Person();
    vincent.run();
    vincent2.walk();
    vincent3.swim();
  //  vincent3.work();
  }
}
