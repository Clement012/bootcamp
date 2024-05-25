# Week 5
 # Compare
 - Comparable -> only in 自己 class
 -> itself implements itself
 -> @Override int 'compareTo'
 ->
 - Comparator -> can in other class
 -> can implementss other class
 -> @Override int 'compare'
 - Collections.sort? 
 # Data Storage
 - ArrayList <T> -> Type
 -> forEach
 -> Base in Array -> Fixed memory in HEAP
 // Function Syntax
 - LinkedList <T> -> Type
 -> forEach
 -> Base in Map -> Can adjust memory Size through add/addFirst/addLast
 // 
 - Hashmap <K,V> -> Key,Value (Use Key to search value)
 -> forEach (Map.Entry<>///.entrySet())
 -> No Ordering
 - Hashset
 -> Remove duplicate

 - instanceof? 
 - CLASS.of(?)
 # Exception/Error
 - Exception is a Class -> which can be extend 
 -> RunTimeException
 - Can create Exception mySelf inSide class AND method

 - RUNTIME exception(unchecked exception) -> OPTIONAL to handle
 - Main(Run)果陣先Error
 - -> 1.IllegalArgumentException (eg 負數in int[])
 - -> 2.ArithmeticException (eg /0 )
 - -> 3.ArratIndexOutOfBoundsException 
 - -> 4.NullPointerException (mySelf Syntax/指NULL object)
 - -> 5.StringIndexOutOfBoundsException 
 - -> 6.IllegalStateException (LET+ then insert-)
 - -> 7.NumberFormatException (String in int)
 - COMPILETIME exception(checked exception) -> MUST Handle
 - -> 

 - //KeyWord/Syntax
 - try{}
 - catch('Exception'){}
 - finallly{} -> 
 - throws Exception