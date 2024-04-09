public class DemoForLoop {
    public static void main(String[] args){
        int x = 2;
        x = x * x;
        x *= x;
        System.out.println(x);

        //推論/推理
        //for (initialzation; continue condition; incremental rule)
        //Usually in i++ case
        //if no continue condition:will be infinite
        // Step 1: int = 0
        // Step 2: i < 3 ? yes
        // Step 3: Print hello world
        // Step 4: i++ -> i become 1
        // Step 5: i < 3 ? yes
        // Step 6: Print hello world
        // Step 7: i++ -> i become 2
        // Step 8: i < 3 ? yes
        // Step 9: Print hello world
        // Step 10: i++ -> i become 3
        // Step 11: i < 3 ? no
        // Done: Exit program
        for (int i = 0; i < 3; i++ ){   //(<--0,1,2)
        // Never to re-assign value to i within the loop
            System.out.println("hello world" + i);
        }
        for (int i = 5; i >=0; i--){
        // 5>4>3>2>1>0 :6
            System.out.println("A");
        }
        //print out: 1 3 5 7 9
        for (int j = 1; j <= 9; j = j + 2 ){
            System.out.print(j + " ");
        }
        for (int i = 0; i < 10; i++){
            if ( i % 2 ==1 ) //pick odd number
            System.out.print(i + " ");
        }
        String s = "abcdefg";
        // print out aceg:
        String result = "";
        for (int i = 0; i < s.length(); i++ ){
            if ( i % 2 ==0 ){
                result += s.charAt(i);
            }
        }
              System.out.println(result);
        String pattern = "cd";
        // print true when "abcdefg" has "cd"
        for (int i = 0; i < s.length(); i++){

        };
        // 55 = 1+2...+10
        // print: 55
        int max = 10;
        int min = 1;
        int k = 0;
        //int = number function also ok
        for (int i = min;i <=max ; i++){
            k += i;
        }
            System.out.println(k);
        // sum up all even numbers
         k = 0;
        for (int i = min;i <=max ; i++){
            if (i % 2 == 0) {
                 k += i; 
        } 
    }
            System.out.println(k);
        //Counting
        String str="hello world";
        int b = 0;
        // count the number of 'l'
        for (int i = 0; i< str.length(); i++){
            //if +charAt
          if(str.charAt(i) == 'o'){
            b++;}
            }
        System.out.println(b);
        //Sum up all odd numbers, add minus all even numbers
        // 1-2...-10
        int q = 0;
          for (int i =min;i <= max; i++ ){
            if ( i % 2 == 1){
                q += q;
            } else {
                q -= q;
            }
        }
        System.out.println("q=" + q);

        String s4 = "abcd";

        for (int i = 0; i < s.length(); i++){
            
        }
    }
}
  // Primitius basic
  // cant --> tools
  // eg "abc".charAt -> OK! -->String
  // eg 1. -> not OK! -->Primitius basic
