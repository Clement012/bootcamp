public class array {
    public static void main(String[] args)  {
        // 9 types = primitives + String
        //array:陣列 (Store a set of same type of values)
        //new: only right side 
        // must be same primitive in same array
    int x = 2;
    String s = "abc";
    int [] arr = new int[3]; // if 3 : means can store 3 value
    // Assign value to the int array
    // **point to the right position
    arr[0] = 100;
    arr[1] = 10012;
    arr[2] = 1001234;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // Create another int array to the original variable
    // cancel upside one * -> update data
    arr = new int[4];

    System.out.println(0);

    long[]arr2 = new long[10];
    String[] strings = new String[2];
    }
}
