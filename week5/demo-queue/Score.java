
import java.util.PriorityQueue;

public class Score {
  public static void main(String[] args) {
    PriorityQueue<Integer> score = new PriorityQueue<>();  // by default ascending order
    score.add(100);
    score.add(89);
    score.add(72);
    score.add(43);
    score.add(55);
    score.add(12);
    score.add(10000);
    System.out.println(score);  //[10000, 89, 100, 43, 55, 12, 72]
    System.out.println(score.poll());
    System.out.println(score.poll());
    System.out.println(score.poll());
    System.out.println(score.poll());
    System.out.println(score.poll());
    System.out.println(score.poll());
    System.out.println(score.poll());

    PriorityQueue<Integer> score2 = new PriorityQueue<>(new SortByInteger()); // sortByInteger > change to decending order.
    score2.add(100);
    score2.add(89);
    score2.add(72);
    score2.add(43);
    score2.add(55);
    score2.add(12);
    score2.add(10000);
    System.out.println(score2);
    System.out.println(score2.poll());
    System.out.println(score2.poll());
    System.out.println(score2.poll());
    System.out.println(score2.poll());
    System.out.println(score2.poll());
    System.out.println(score2.poll());
    System.out.println(score2.poll());

  }
}
