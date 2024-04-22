public class DemoWhileLoop {
    public static void main(String[] args){

      // initial value
      // continue condition
      // incremental / decremental
      for (int i = 0; i < 3;i++ ){

      }

      int[] arr = new int[]{2,3,10,-1};
      for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
      }

      // for-each
      // If you want to loop through all element from the beginning, you can use for-each
      for (int i : arr){
        System.out.println(i);
      }
      String[] strings = new String[]{"abc","def"};
      for (String str : strings){
        System.out.println(str);
      }
      // whileLoop (more flexable) (有條件,主要用ForLoop)
      // Step 1: count = 0
      // 2: determine strings(object)'s length = 2
      // 3: 0 < 2 -->printout abc
      // 4: ***count++*** ->count = 1  <--different wit =h forLoop
      // 5: 1 < 2 -->printout def
      // 6: count++ ->count = 2
      // 7: 2 < 2 X --> exit 
      int count = 0;
      while(count < strings.length){
        System.out.println(strings[count]);
        count++;
      }
      // infinite loop
      //byte b = 0;
      //while(b < 128){
      //  b++;
      //}

      // Target: int array[1,0,2,3]
      int a = 1023;
      int c = 1023 / 10;  // 102
      int d = 1023 % 10;  // 3 
      int copy = a;
      count = 0;
      while (copy > 0){
        copy /=10;
        count++;
      }
      System.out.println("count=" + count);
      int [] result = new int [count];
      

    // do-while (MUST做一次先)
    count = 0;
    do{
      if ( count == 1) {    // 0 not hit/"1"only hit-> only print out once
        break;
      }
      System.out.println("hello");
      count++;
    } while (count < 3);   //0-1-2
    }
}
