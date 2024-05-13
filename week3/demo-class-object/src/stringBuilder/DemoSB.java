package stringBuilder;

public class DemoSB {
  public static void main(String[] args) {

  String s1 = "abc";
  String s2 = "def";
    
  String result = s1+s2;
  String result2 = s1.concat(s2);

  StringBuilder sb1 = new StringBuilder();
  System.out.println(sb1.toString());

  StringBuilder sb2 = new StringBuilder("Hello");
  System.out.println(sb2.toString());

  StringBuilder sb3 = sb2.append("world");
  System.out.println("sb2="+sb2.toString());
  System.out.println("sb3="+sb3.toString());

  sb2.append("!!!");
  System.out.println(sb2.toString());

  String[] strings = new String[] {"aaa","bbb","ccc"};
  StringBuilder sb4 = new StringBuilder();
  for (String s : strings){
    sb4.append(s);
  }
  System.out.println(sb4.toString());

  // insert()
  sb4.insert(6, "ddd");
  System.out.println(sb4.toString());
  sb4.reverse();
  System.out.println(sb4.toString());

  sb4.insert(8, "x").append("zzz").reverse();
  System.out.println(sb4.toString());

  sb4.deleteCharAt(3);
  System.out.println(sb4.toString());

  sb4.setCharAt(3, 'c');
  System.out.println(sb4);

  sb4.replace(0, 3, "!!");
  System.out.println(sb4);

  String result10 = sb4.toString().replace("b","y");  // only this can use
  System.out.println(result10);
  System.out.println(sb4.toString());
  // now sb4 = line48

  System.out.println(sb4.charAt(0));
  System.out.println(sb4.isEmpty());
  System.out.println(sb4.substring(2,4));

  StringBuilder sb5 = new StringBuilder("mmm");
  StringBuilder sb6 = new StringBuilder("mmm");
  String s = "mmm";
  if (sb5.compareTo(sb6) == 0){
    System.out.println("they are equal");
  }

  if (sb5.toString().equals(s)){
    System.out.println("they are equal");
  }

  System.out.println(sb5.length());

  sb5.setLength(100);
  System.out.println(sb5.toString());
  sb5.append("zzz");
  System.out.println(sb5.toString());
  // main point is: change sb at the moment-> have to know changing sb is which shape 
  // concept:  adjust in Strimng but not taking its original String out!!!!!
  }
}